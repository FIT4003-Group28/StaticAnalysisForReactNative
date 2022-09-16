package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: anwy  reason: default package */
/* loaded from: classes.dex */
public final class anwy {
    private static WeakReference b;
    public qst a;

    public anwy() {
    }

    public static synchronized anwy a(Context context) {
        synchronized (anwy.class) {
            WeakReference weakReference = b;
            anwy anwyVar = weakReference == null ? null : (anwy) weakReference.get();
            if (anwyVar == null) {
                anwy anwyVar2 = new anwy(context.getApplicationContext());
                b = new WeakReference(anwyVar2);
                return anwyVar2;
            }
            return anwyVar;
        }
    }

    public anwy(Context context) {
        this.a = new qst(context, qhg.a, qsm.f, new anwi());
    }
}
