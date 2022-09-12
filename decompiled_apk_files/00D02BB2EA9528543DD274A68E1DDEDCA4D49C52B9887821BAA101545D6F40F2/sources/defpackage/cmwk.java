package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: cmwk  reason: default package */
/* loaded from: classes.dex */
public final class cmwk {
    public static volatile boolean a;
    private static volatile boolean b;

    public static final boolean a(String str, int i) {
        if (a) {
            if (i >= 3) {
                return true;
            }
            i = 2;
        }
        return Log.isLoggable(str, i);
    }
}
