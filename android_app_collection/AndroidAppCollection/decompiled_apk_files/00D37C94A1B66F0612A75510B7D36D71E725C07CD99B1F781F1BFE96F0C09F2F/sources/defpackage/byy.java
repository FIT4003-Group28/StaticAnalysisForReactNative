package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: byy  reason: default package */
/* loaded from: classes2.dex */
public abstract class byy {
    public cdj d;
    private final byv e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public byy(List list) {
        byv bywVar;
        byv byvVar;
        if (list.isEmpty()) {
            byvVar = new byu();
        } else {
            if (list.size() == 1) {
                bywVar = new byx(list);
            } else {
                bywVar = new byw(list);
            }
            byvVar = bywVar;
        }
        this.e = byvVar;
    }

    private final float k() {
        float f = this.g;
        if (f == -1.0f) {
            float b = this.e.b();
            this.g = b;
            return b;
        }
        return f;
    }

    public float a() {
        float f = this.h;
        if (f == -1.0f) {
            float a = this.e.a();
            this.h = a;
            return a;
        }
        return f;
    }

    public final float b() {
        cdi d = d();
        if (d.e()) {
            return 0.0f;
        }
        return d.d.getInterpolation(c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        cdi d = d();
        if (!d.e()) {
            return (this.c - d.c()) / (d.b() - d.c());
        }
        return 0.0f;
    }

    public final cdi d() {
        cdi c = this.e.c();
        bwr.a();
        return c;
    }

    public Object e() {
        Object f;
        float c = c();
        if (this.d != null || !this.e.d(c)) {
            cdi d = d();
            Interpolator interpolator = d.e;
            if (interpolator == null || d.f == null) {
                f = f(d, b());
            } else {
                f = j(d, interpolator.getInterpolation(c), d.f.getInterpolation(c));
            }
            this.f = f;
            return f;
        }
        return this.f;
    }

    public abstract Object f(cdi cdiVar, float f);

    public final void g(byt bytVar) {
        this.a.add(bytVar);
    }

    public void h() {
        for (int i = 0; i < this.a.size(); i++) {
            ((byt) this.a.get(i)).d();
        }
    }

    public void i(float f) {
        if (this.e.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f == this.c) {
            return;
        }
        this.c = f;
        if (!this.e.f(f)) {
            return;
        }
        h();
    }

    protected Object j(cdi cdiVar, float f, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
