package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
/* compiled from: PG */
/* renamed from: byo  reason: default package */
/* loaded from: classes2.dex */
public final class byo implements byt, byk, bym {
    private final String c;
    private final boolean d;
    private final bxn e;
    private final byy f;
    private final byy g;
    private final byy h;
    private boolean i;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final aaoa j = new aaoa();

    public byo(bxn bxnVar, cbd cbdVar, cau cauVar) {
        this.c = cauVar.a;
        this.d = cauVar.e;
        this.e = bxnVar;
        byy a = cauVar.b.a();
        this.f = a;
        byy a2 = cauVar.c.a();
        this.g = a2;
        byy a3 = cauVar.d.a();
        this.h = a3;
        cbdVar.h(a);
        cbdVar.h(a2);
        cbdVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        byy byyVar;
        if (obj == bxs.j) {
            byyVar = this.g;
        } else if (obj == bxs.l) {
            byyVar = this.f;
        } else if (obj != bxs.k) {
            return;
        } else {
            byyVar = this.h;
        }
        byyVar.d = cdjVar;
    }

    @Override // defpackage.byt
    public final void d() {
        this.i = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cdc.h(bzuVar, i, list, bzuVar2, this);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            byc bycVar = (byc) list.get(i);
            if (bycVar instanceof bys) {
                bys bysVar = (bys) bycVar;
                if (bysVar.e == 1) {
                    this.j.b(bysVar);
                    bysVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        return this.c;
    }

    @Override // defpackage.bym
    public final Path i() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.i = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((bza) this.h).k();
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.j.c(this.a);
        this.i = true;
        return this.a;
    }
}
