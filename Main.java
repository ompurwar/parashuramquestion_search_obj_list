
import bank.Account;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(43, "bqhqoho", 799.0, 1);
        Account account2 = new Account(95, "pbuyhuk", 931.0, 73);
        Account account3 = new Account(74, "jkmxefn", 799.0, 18);
        Account account4 = new Account(43, "rnoebjc", 799.0, 39);
        Account account5 = new Account(17, "czwgofn", 372.0, 15);
        // ArrayList<Account> objArray = new ArrayList<Account>();
        Account[] objArray = { account1, account2, account3, account4, account5 };
        Account[] objResultArray1 = searchAccountByBalance(objArray, 799.0);
        // Account[] objResultArray2 = searchAccountByBalance(objArray, 372);
        System.out.println("========================[printing Inputs]===================\n");
        PrintAccountArray(objArray);
        System.out.println("\n========================[printing result]===================\n");
        PrintAccountArray(objResultArray1);
        // PrintAccountArray(objResultArray2);

    }

    private static Account[] searchAccountByBalance(Account[] objArray, double d) {
        Account[] filtered_account_list = new Account[objArray.length + 1];
        int filtered_account_list_length = 0;

        for (int i = 0; i < objArray.length; i++) {

            if (objArray[i].getBalance() == d) {
                filtered_account_list[filtered_account_list_length] = objArray[i];
                filtered_account_list_length++;
            }

        }

        if (filtered_account_list_length > 0)

            filtered_account_list = Slice(filtered_account_list, 0, filtered_account_list_length);
        else
            filtered_account_list = null;



        return filtered_account_list;
    }

    // function to slice an array
    public static Account[] Slice(Account[] arr, int start, int end) {

        // Get the slice of the Array
        Account[] slice = new Account[end - start];

        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        // return the slice
        return slice;
    }

    // function to print account array
    private static void PrintAccountArray(Account[] AccountArray) {
        if (AccountArray == null) {

            System.out.println("Output after first search is null. ");

        } else {

            System.out.println("Displaying contents of array: ");

            for (Account account : AccountArray) {
                System.out.println(account.getNumber() + " " + account.getAcType() + " " + account.getBalance() + " "
                        + account.getNoOfAccountHolders() + " ");
            }
        }
    }

}
