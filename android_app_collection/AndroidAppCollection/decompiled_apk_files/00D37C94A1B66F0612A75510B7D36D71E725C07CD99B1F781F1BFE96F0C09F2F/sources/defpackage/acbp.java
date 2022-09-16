package defpackage;

import android.os.Handler;
import android.util.Log;
/* compiled from: PG */
/* renamed from: acbp  reason: default package */
/* loaded from: classes.dex */
public final class acbp {
    private static acbp a;

    private acbp() {
    }

    public static final acbo a(accg accgVar, accj accjVar, int i, int i2, acbq acbqVar, Handler handler) {
        try {
            return new acbo(accgVar, accjVar, i, i2, acbqVar, handler);
        } catch (Exception e) {
            Log.e("FrcFactory", "Could not create FRC", e);
            return null;
        }
    }

    public static void b() {
        if (a == null) {
            a = new acbp();
        }
    }
}
