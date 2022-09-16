package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dff  reason: default package */
/* loaded from: classes3.dex */
public final class dff extends dgp {
    private final dfe e;
    private final dda f = new dda();

    public dff(dda ddaVar, dfe dfeVar) {
        b(ddaVar);
        this.e = dfeVar;
    }

    private static Object i(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    @Override // defpackage.dgp
    public final float a(long j) {
        if (d() <= 1) {
            Map map = this.a;
            boolean containsKey = map == null ? false : map.containsKey("default_input");
            Object i = i((WeakReference) this.f.d());
            if (i == null) {
                return containsKey ? e().c : this.c;
            } else if (!containsKey) {
                return this.e.a(i);
            } else {
                float f = e().c;
                c(f);
                return f;
            }
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }

    public final void b(dda ddaVar) {
        dda ddaVar2 = this.f;
        for (int i = 0; i < 5; i++) {
            ddaVar2.a[i] = null;
        }
        ddaVar2.b = (short) 0;
        if (ddaVar == null) {
            return;
        }
        short s = ddaVar.b;
        for (int i2 = 0; i2 < s; i2++) {
            this.f.e(ddaVar.a(i2), new WeakReference(ddaVar.c(i2)));
        }
    }

    public final void c(float f) {
        short s = this.f.b;
        for (int i = 0; i < s; i++) {
            Object i2 = i((WeakReference) this.f.c(i));
            if (i2 != null) {
                this.e.d(i2, f);
            }
        }
    }
}
