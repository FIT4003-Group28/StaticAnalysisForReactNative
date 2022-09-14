package com.reactnativecommunity.netinfo;

import android.content.Context;
/* loaded from: classes.dex */
public class e {
    public static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b2;
        }
    }

    public static boolean a(Context context) {
        return a.g.e.b.a(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }
}
