package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyc  reason: default package */
/* loaded from: classes2.dex */
public final class ahyc {
    public static boolean a(Intent intent) {
        return intent.hasExtra("account_name");
    }

    public static void b(Intent intent, String str) {
        intent.putExtra("account_name", str);
    }
}
