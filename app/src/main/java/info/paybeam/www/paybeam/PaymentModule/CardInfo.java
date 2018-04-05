package info.paybeam.www.paybeam.PaymentModule;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Dai Wei on 28/3/2018.
 */

public class CardInfo {

    /**
     * Utility class for persisting account numbers to disk.
     *
     * <p>The default SharedPreferences instance is used as the backing storage. Values are cached
     * in memory for performance.
     *
     * <p>This class is thread-safe.
     */


     private static final String PREF_ACCOUNT_NUMBER = "account_number";
     private static final String DEFAULT_ACCOUNT_NUMBER = "00000000";
     private static final String TAG = "AccountStorage";
     private static String sAccount = null;
     private static final Object sAccountLock = new Object();

     public static void SetAccount(Context c, String s) {
         sAccount = "DaiWei's MasterCard Number";
         /*
         synchronized(sAccountLock) {
             Log.i(TAG, "Setting account number: " + s);
             SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(c);
             prefs.edit().putString(PREF_ACCOUNT_NUMBER, s).commit();
             sAccount = s;
         }
         */
     }

     public static String GetAccount(Context c) {
         if(sAccount == null) {
             sAccount = "Default Account test";
         }
         /*
         synchronized (sAccountLock) {
             if (sAccount == null) {
                 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(c);
                 String account = prefs.getString(PREF_ACCOUNT_NUMBER, DEFAULT_ACCOUNT_NUMBER);
                 sAccount = account;
             }
             return sAccount;
         }
         */
         return sAccount;
     }
}
