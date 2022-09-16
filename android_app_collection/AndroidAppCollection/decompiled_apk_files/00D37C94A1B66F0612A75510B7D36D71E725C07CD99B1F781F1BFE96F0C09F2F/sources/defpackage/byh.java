package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: byh  reason: default package */
/* loaded from: classes2.dex */
public final class byh implements bye, byt, byk {
    private final String a;
    private final boolean b;
    private final cbd c;
    private final agb d = new agb();
    private final agb e = new agb();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List i;
    private final byy j;
    private final byy k;
    private final byy l;
    private final byy m;
    private byy n;
    private bzn o;
    private final bxn p;
    private final int q;
    private final int r;

    public byh(bxn bxnVar, cbd cbdVar, cap capVar) {
        Path path = new Path();
        this.f = path;
        this.g = new bxz(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = cbdVar;
        this.a = capVar.f;
        this.b = capVar.g;
        this.p = bxnVar;
        this.r = capVar.h;
        path.setFillType(capVar.a);
        this.q = (int) (bxnVar.a.a() / 32.0f);
        byy a = capVar.b.a();
        this.j = a;
        a.g(this);
        cbdVar.h(a);
        byy a2 = capVar.c.a();
        this.k = a2;
        a2.g(this);
        cbdVar.h(a2);
        byy a3 = capVar.d.a();
        this.l = a3;
        a3.g(this);
        cbdVar.h(a3);
        byy a4 = capVar.e.a();
        this.m = a4;
        a4.g(this);
        cbdVar.h(a4);
    }

    private final int h() {
        int round = Math.round(this.l.c * this.q);
        int round2 = Math.round(this.m.c * this.q);
        int round3 = Math.round(this.j.c * this.q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        bzn bznVar = this.o;
        if (bznVar != null) {
            Integer[] numArr = (Integer[]) bznVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        if (obj == bxs.d) {
            this.k.d = cdjVar;
        } else if (obj == bxs.E) {
            byy byyVar = this.n;
            if (byyVar != null) {
                this.c.j(byyVar);
            }
            bzn bznVar = new bzn(cdjVar);
            this.n = bznVar;
            bznVar.g(this);
            this.c.h(this.n);
        } else if (obj != bxs.F) {
        } else {
            bzn bznVar2 = this.o;
            if (bznVar2 != null) {
                this.c.j(bznVar2);
            }
            this.d.j();
            this.e.j();
            bzn bznVar3 = new bzn(cdjVar);
            this.o = bznVar3;
            bznVar3.g(this);
            this.c.h(this.o);
        }
    }

    @Override // defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((bym) this.i.get(i2)).i(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.r != 1) {
            long h = h();
            shader = (RadialGradient) this.e.f(h);
            if (shader == null) {
                PointF pointF = (PointF) this.l.e();
                PointF pointF2 = (PointF) this.m.e();
                cao caoVar = (cao) this.j.e();
                int[] i3 = i(caoVar.b);
                float[] fArr = caoVar.a;
                float f = pointF.x;
                float f2 = pointF.y;
                float hypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
                shader = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, i3, fArr, Shader.TileMode.CLAMP);
                this.e.k(h, shader);
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.d.f(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.l.e();
                PointF pointF4 = (PointF) this.m.e();
                cao caoVar2 = (cao) this.j.e();
                LinearGradient linearGradient = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(caoVar2.b), caoVar2.a, Shader.TileMode.CLAMP);
                this.d.k(h2, linearGradient);
                shader = linearGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.g.setShader(shader);
        byy byyVar = this.n;
        if (byyVar != null) {
            this.g.setColorFilter((ColorFilter) byyVar.e());
        }
        this.g.setAlpha(cdc.k((int) ((((i / 255.0f) * ((Integer) this.k.e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f, this.g);
        bwr.a();
    }

    @Override // defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(((bym) this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.byt
    public final void d() {
        this.p.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cdc.h(bzuVar, i, list, bzuVar2, this);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            byc bycVar = (byc) list2.get(i);
            if (bycVar instanceof bym) {
                this.i.add((bym) bycVar);
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        return this.a;
    }
}
