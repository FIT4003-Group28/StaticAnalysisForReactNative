package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        try {
            return ((TelephonyManager) babj.c.getSystemService("phone")).getDataActivity();
        } catch (SecurityException unused) {
            return -1;
        }
    }

    private static int getCellSignalLevel() {
        try {
            SignalStrength signalStrength = ((TelephonyManager) babj.c.getSystemService("phone")).getSignalStrength();
            if (signalStrength == null) {
                return -1;
            }
            return signalStrength.getLevel();
        } catch (SecurityException unused) {
            return -1;
        }
    }

    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (a == null) {
                a = Boolean.valueOf(babq.a(babj.c, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
            }
            if (a.booleanValue()) {
                if (b == null) {
                    b = Boolean.valueOf(babq.a(babj.c, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) babj.c.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1);
    }
}
