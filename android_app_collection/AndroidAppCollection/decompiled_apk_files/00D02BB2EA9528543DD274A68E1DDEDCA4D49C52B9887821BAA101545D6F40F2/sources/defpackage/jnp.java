package defpackage;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: jnp  reason: default package */
/* loaded from: classes7.dex */
public final class jnp extends bas {
    @dzsi
    jnq a;
    public final bas b;
    @dzsi
    DataSetObserver c;
    boolean d;
    private int g;
    private boolean h;
    private final HashMap<Object, Integer> f = new HashMap<>();
    public WeakReference<Object> e = new WeakReference<>(null);

    public jnp(jnq jnqVar, bas basVar) {
        this.a = jnqVar;
        this.b = basVar;
        jno jnoVar = new jno(jnqVar);
        this.c = jnoVar;
        basVar.n(jnoVar);
        this.g = basVar.OV();
        this.h = jnqVar.r;
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.g;
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return this.b.OW(view, obj);
    }

    @Override // defpackage.bas
    public final int OX(Object obj) {
        if (this.d) {
            return a(this.f.get(obj).intValue());
        }
        int OX = this.b.OX(obj);
        if (OX == -1) {
            return a(this.f.get(obj).intValue());
        }
        if (OX != -2) {
            return a(OX);
        }
        return -2;
    }

    @Override // defpackage.bas
    public final void OY(ViewGroup viewGroup) {
        this.b.OY(viewGroup);
    }

    @Override // defpackage.bas
    public final Parcelable OZ() {
        return this.b.OZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        int i2;
        return (!this.h || (i2 = this.g) <= i) ? i : (i2 - i) - 1;
    }

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        int a = a(i);
        Object c = this.b.c(viewGroup, a);
        this.f.put(c, Integer.valueOf(a));
        return c;
    }

    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        if (obj == this.e.get()) {
            this.e = new WeakReference<>(null);
        }
        this.f.remove(obj);
        this.b.d(viewGroup, a(i), obj);
    }

    @Override // defpackage.bas
    public final void e(ViewGroup viewGroup, int i, Object obj) {
        int a = a(i);
        this.e = new WeakReference<>(obj);
        this.b.e(viewGroup, a, obj);
    }

    @Override // defpackage.bas
    public final void f(ViewGroup viewGroup) {
        this.b.f(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        boolean z = true;
        this.d = i == 1;
        try {
            int e = this.a.e();
            Object obj = this.e.get();
            if (obj != null && OX(obj) != -2) {
                z = false;
            }
            this.h = this.a.r;
            this.g = this.b.OV();
            Pa();
            if (z) {
                this.a.setCurrentItem(Math.max(0, Math.min(this.g - 1, e)), false);
            }
            jnq jnqVar = this.a;
            jnqVar.E(jnqVar.e());
        } finally {
            this.d = false;
        }
    }

    @Override // defpackage.bas
    public final void j() {
    }

    @Override // defpackage.bas
    public final CharSequence q(int i) {
        return this.b.q(a(i));
    }

    @Override // defpackage.bas
    public final float r(int i) {
        return this.b.r(a(i));
    }
}
