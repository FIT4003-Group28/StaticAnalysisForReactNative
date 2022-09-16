package defpackage;

import android.graphics.PointF;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bzk  reason: default package */
/* loaded from: classes2.dex */
public final class bzk extends byy {
    protected cdj e;
    protected cdj f;
    private final PointF g;
    private final PointF h;
    private final byy i;
    private final byy j;

    public bzk(byy byyVar, byy byyVar2) {
        super(Collections.emptyList());
        this.g = new PointF();
        this.h = new PointF();
        this.i = byyVar;
        this.j = byyVar2;
        i(this.c);
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        return e();
    }

    @Override // defpackage.byy
    public final void i(float f) {
        this.i.i(f);
        this.j.i(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((byt) this.a.get(i)).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.byy
    /* renamed from: k */
    public final PointF e() {
        Float f;
        cdi d;
        cdi d2;
        Float f2 = null;
        if (this.e == null || (d2 = this.i.d()) == null) {
            f = null;
        } else {
            this.i.b();
            Float f3 = d2.h;
            cdj cdjVar = this.e;
            if (f3 != null) {
                f3.floatValue();
            }
            Float f4 = (Float) d2.b;
            Float f5 = (Float) d2.c;
            f = (Float) cdjVar.a();
        }
        if (this.f != null && (d = this.j.d()) != null) {
            this.j.b();
            Float f6 = d.h;
            cdj cdjVar2 = this.f;
            if (f6 != null) {
                f6.floatValue();
            }
            Float f7 = (Float) d.b;
            Float f8 = (Float) d.c;
            f2 = (Float) cdjVar2.a();
        }
        if (f == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.h;
    }
}
