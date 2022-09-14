package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: delp  reason: default package */
/* loaded from: classes6.dex */
public abstract class delp {
    private static WeakReference<delp> a;

    private static delp d() {
        WeakReference<delp> weakReference = a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private static delp e(Context context) {
        deoa deoaVar = new deoa(context);
        a = new WeakReference<>(deoaVar);
        return deoaVar;
    }

    public static synchronized delp getInstance() {
        synchronized (delp.class) {
            delp d = d();
            if (d == null) {
                return e(dela.getInstance().a());
            }
            return d;
        }
    }

    public static synchronized void setInstanceForTest(delp delpVar) {
        synchronized (delp.class) {
            a = new WeakReference<>(delpVar);
        }
    }

    public abstract cpcq<Void> a(deme... demeVarArr);

    public abstract cpcq<Void> b(String... strArr);

    public abstract cpcq<Void> c(String... strArr);

    public static synchronized delp getInstance(Context context) {
        synchronized (delp.class) {
            cnwc.a(context);
            delp d = d();
            if (d == null) {
                return e(context.getApplicationContext());
            }
            return d;
        }
    }
}
