package com.google.firebase.auth.v0.a;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class k2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return a("firebase-auth");
    }

    private static String a(String str) {
        String a2 = com.google.android.gms.common.internal.q.a().a(str);
        return (TextUtils.isEmpty(a2) || a2.equals("UNKNOWN")) ? "-1" : a2;
    }
}
