package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.ActionImpl;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: demb  reason: default package */
/* loaded from: classes6.dex */
public abstract class demb {
    private static WeakReference<demb> a;

    private static demb b() {
        WeakReference<demb> weakReference = a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private static demb c(Context context) {
        deoe deoeVar = new deoe(context);
        a = new WeakReference<>(deoeVar);
        return deoeVar;
    }

    public static synchronized demb getInstance() {
        synchronized (demb.class) {
            demb b = b();
            if (b == null) {
                return c(dela.getInstance().a());
            }
            return b;
        }
    }

    public abstract cpcq<Void> a(ActionImpl actionImpl);

    public static synchronized demb getInstance(Context context) {
        synchronized (demb.class) {
            cnwc.a(context);
            demb b = b();
            if (b == null) {
                return c(context.getApplicationContext());
            }
            return b;
        }
    }
}
