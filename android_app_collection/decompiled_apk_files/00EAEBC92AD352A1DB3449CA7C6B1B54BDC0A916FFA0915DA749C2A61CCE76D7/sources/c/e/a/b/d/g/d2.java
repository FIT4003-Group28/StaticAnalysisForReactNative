package c.e.a.b.d.g;

import android.os.Binder;
/* loaded from: classes.dex */
public final /* synthetic */ class d2 {
    public static <V> V a(c2<V> c2Var) {
        try {
            return c2Var.f();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return c2Var.f();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
