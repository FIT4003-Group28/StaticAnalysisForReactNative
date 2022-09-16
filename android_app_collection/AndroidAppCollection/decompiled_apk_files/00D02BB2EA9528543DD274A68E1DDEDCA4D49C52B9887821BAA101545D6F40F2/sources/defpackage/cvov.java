package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvov  reason: default package */
/* loaded from: classes5.dex */
public final class cvov {
    public static void a(Intent intent, @dzsi cvkj cvkjVar) {
        String a;
        if (cvkjVar == null || (a = cvkjVar.a()) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", a);
    }

    public static void b(Intent intent, @dzsi cvkc cvkcVar) {
        String b;
        if (cvkcVar == null || (b = cvkcVar.b()) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", b);
    }

    public static void c(Intent intent, int i) {
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
    }

    public static void d(Intent intent, @dzsi String str) {
        if (str != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
        }
    }

    public static void e(Intent intent, @dzsi dsef dsefVar) {
        if (dsefVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", dsefVar.bS());
        }
    }

    public static void f(Intent intent, @dzsi cvte cvteVar) {
        if (cvteVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", cvteVar.bS());
        }
    }

    public static void g(Intent intent, @dzsi cvkj cvkjVar) {
        String j;
        if (cvkjVar == null || (j = cvkjVar.j()) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", j);
    }

    public static void h(Intent intent, int i) {
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", i - 1);
    }
}
