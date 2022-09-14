package com.baidu.platform.comapi.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2122a = false;

    /* renamed from: b  reason: collision with root package name */
    public static String f2123b = "";

    /* renamed from: c  reason: collision with root package name */
    public static int f2124c;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
        if ("10.0.0.200".equals(r7.trim()) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r7) {
        /*
            android.net.NetworkInfo r7 = b(r7)
            if (r7 == 0) goto Lde
            boolean r0 = r7.isAvailable()
            if (r0 == 0) goto Lde
            java.lang.String r0 = r7.getTypeName()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "wifi"
            boolean r1 = r0.equals(r1)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L2a
            boolean r1 = r7.isConnected()
            if (r1 == 0) goto L2a
            com.baidu.platform.comjni.engine.AppEngine.SetProxyInfo(r2, r3)
            com.baidu.platform.comapi.util.c.f2122a = r3
            return
        L2a:
            java.lang.String r1 = "mobile"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L40
            java.lang.String r1 = "wifi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lde
            boolean r0 = a(r7)
            if (r0 != 0) goto Lde
        L40:
            java.lang.String r7 = r7.getExtraInfo()
            com.baidu.platform.comapi.util.c.f2122a = r3
            r0 = 80
            r1 = 1
            if (r7 == 0) goto L97
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r4 = "cmwap"
            boolean r4 = r7.startsWith(r4)
            if (r4 != 0) goto L94
            java.lang.String r4 = "uniwap"
            boolean r4 = r7.startsWith(r4)
            if (r4 != 0) goto L94
            java.lang.String r4 = "3gwap"
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto L68
            goto L94
        L68:
            java.lang.String r4 = "ctwap"
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto L71
            goto Lc8
        L71:
            java.lang.String r0 = "cmnet"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L91
            java.lang.String r0 = "uninet"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L91
            java.lang.String r0 = "ctnet"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L91
            java.lang.String r0 = "3gnet"
            boolean r7 = r7.startsWith(r0)
            if (r7 == 0) goto Lcf
        L91:
            com.baidu.platform.comapi.util.c.f2122a = r3
            goto Lcf
        L94:
            java.lang.String r7 = "10.0.0.172"
            goto Lca
        L97:
            java.lang.String r7 = android.net.Proxy.getDefaultHost()
            int r4 = android.net.Proxy.getDefaultPort()
            if (r7 == 0) goto Lcf
            int r5 = r7.length()
            if (r5 <= 0) goto Lcf
            java.lang.String r5 = "10.0.0.172"
            java.lang.String r6 = r7.trim()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lbc
            java.lang.String r7 = "10.0.0.172"
            com.baidu.platform.comapi.util.c.f2123b = r7
            com.baidu.platform.comapi.util.c.f2124c = r4
        Lb9:
            com.baidu.platform.comapi.util.c.f2122a = r1
            goto Lcf
        Lbc:
            java.lang.String r4 = "10.0.0.200"
            java.lang.String r7 = r7.trim()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto Lcf
        Lc8:
            java.lang.String r7 = "10.0.0.200"
        Lca:
            com.baidu.platform.comapi.util.c.f2123b = r7
            com.baidu.platform.comapi.util.c.f2124c = r0
            goto Lb9
        Lcf:
            boolean r7 = com.baidu.platform.comapi.util.c.f2122a
            if (r7 != r1) goto Ldb
            java.lang.String r7 = com.baidu.platform.comapi.util.c.f2123b
            int r0 = com.baidu.platform.comapi.util.c.f2124c
            com.baidu.platform.comjni.engine.AppEngine.SetProxyInfo(r7, r0)
            return
        Ldb:
            com.baidu.platform.comjni.engine.AppEngine.SetProxyInfo(r2, r3)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.util.c.a(android.content.Context):void");
    }

    private static boolean a(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            try {
                if (1 == networkInfo.getType()) {
                    if (networkInfo.isConnected()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static NetworkInfo b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(Context context) {
        NetworkInfo b2 = b(context);
        int i = 1;
        if (b2 != null) {
            if (b2.getType() != 1) {
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 1:
                    case 2:
                        i = 6;
                        break;
                    case 3:
                    case 9:
                    case 10:
                    case 15:
                        i = 9;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 12:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 11:
                        i = 2;
                        break;
                    case 13:
                        i = 4;
                        break;
                    case 14:
                        i = 10;
                        break;
                }
            }
            return Integer.toString(i);
        }
        i = 0;
        return Integer.toString(i);
    }
}
