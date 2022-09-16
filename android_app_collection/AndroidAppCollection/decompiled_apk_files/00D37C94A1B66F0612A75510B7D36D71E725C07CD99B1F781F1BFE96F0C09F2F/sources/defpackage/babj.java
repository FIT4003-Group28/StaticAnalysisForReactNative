package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: babj  reason: default package */
/* loaded from: classes2.dex */
public final class babj {
    static babi a;
    static long b;
    public static Context c;

    private babj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static babi a() {
        synchronized (babj.class) {
            babi babiVar = a;
            if (babiVar != null) {
                a = babiVar.f;
                babiVar.f = null;
                b -= 8192;
                return babiVar;
            }
            return new babi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(babi babiVar) {
        if (babiVar.f != null || babiVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (babiVar.d) {
            return;
        }
        synchronized (babj.class) {
            long j = b;
            if (j + 8192 > 65536) {
                return;
            }
            b = j + 8192;
            babiVar.f = a;
            babiVar.c = 0;
            babiVar.b = 0;
            a = babiVar;
        }
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static Context d(Context context, String str) {
        bach a2 = bach.a();
        try {
            Context createContextForSplit = context.createContextForSplit(str);
            a2.close();
            return createContextForSplit;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
