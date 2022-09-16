package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: byf  reason: default package */
/* loaded from: classes2.dex */
public final class byf implements bym, byt, byk {
    private final String b;
    private final bxn c;
    private final byy d;
    private final byy e;
    private final cam f;
    private boolean g;
    private final Path a = new Path();
    private final aaoa h = new aaoa();

    public byf(bxn bxnVar, cbd cbdVar, cam camVar) {
        this.b = camVar.a;
        this.c = bxnVar;
        byy a = camVar.c.a();
        this.d = a;
        byy a2 = camVar.b.a();
        this.e = a2;
        this.f = camVar;
        cbdVar.h(a);
        cbdVar.h(a2);
        a.g(this);
        a2.g(this);
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        byy byyVar;
        if (obj == bxs.i) {
            byyVar = this.d;
        } else if (obj != bxs.l) {
            return;
        } else {
            byyVar = this.e;
        }
        byyVar.d = cdjVar;
    }

    @Override // defpackage.byt
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
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
                    this.h.b(bysVar);
                    bysVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        return this.b;
    }

    @Override // defpackage.bym
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = -f3;
            float f7 = -f;
            float f8 = -f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = -f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = -f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.c(this.a);
        this.g = true;
        return this.a;
    }
}
