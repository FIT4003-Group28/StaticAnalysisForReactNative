package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cbm  reason: default package */
/* loaded from: classes2.dex */
public final class cbm extends cbd {
    private byy A;
    private final StringBuilder h;
    private final RectF i;
    private final Matrix j;
    private final Paint k;
    private final Paint l;
    private final Map m;
    private final agb n;
    private final bzl o;
    private final bxn p;
    private final bwx q;
    private byy r;
    private byy s;
    private byy t;
    private byy u;
    private byy v;
    private byy w;
    private byy x;
    private byy y;
    private byy z;

    public cbm(bxn bxnVar, cbg cbgVar) {
        super(bxnVar, cbgVar);
        bzz bzzVar;
        bzz bzzVar2;
        bzy bzyVar;
        bzy bzyVar2;
        this.h = new StringBuilder(2);
        this.i = new RectF();
        this.j = new Matrix();
        this.k = new cbk();
        this.l = new cbl();
        this.m = new HashMap();
        this.n = new agb();
        this.p = bxnVar;
        this.q = cbgVar.b;
        bzl a = cbgVar.p.a();
        this.o = a;
        a.g(this);
        h(a);
        cai caiVar = cbgVar.q;
        if (caiVar != null && (bzyVar2 = caiVar.a) != null) {
            byy a2 = bzyVar2.a();
            this.r = a2;
            a2.g(this);
            h(this.r);
        }
        if (caiVar != null && (bzyVar = caiVar.b) != null) {
            byy a3 = bzyVar.a();
            this.t = a3;
            a3.g(this);
            h(this.t);
        }
        if (caiVar != null && (bzzVar2 = caiVar.c) != null) {
            byy a4 = bzzVar2.a();
            this.v = a4;
            a4.g(this);
            h(this.v);
        }
        if (caiVar == null || (bzzVar = caiVar.d) == null) {
            return;
        }
        byy a5 = bzzVar.a();
        this.x = a5;
        a5.g(this);
        h(this.x);
    }

    private static final void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List s(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // defpackage.cbd, defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        super.a(obj, cdjVar);
        if (obj == bxs.a) {
            byy byyVar = this.s;
            if (byyVar != null) {
                j(byyVar);
            }
            bzn bznVar = new bzn(cdjVar);
            this.s = bznVar;
            bznVar.g(this);
            h(this.s);
        } else if (obj == bxs.b) {
            byy byyVar2 = this.u;
            if (byyVar2 != null) {
                j(byyVar2);
            }
            bzn bznVar2 = new bzn(cdjVar);
            this.u = bznVar2;
            bznVar2.g(this);
            h(this.u);
        } else if (obj == bxs.q) {
            byy byyVar3 = this.w;
            if (byyVar3 != null) {
                j(byyVar3);
            }
            bzn bznVar3 = new bzn(cdjVar);
            this.w = bznVar3;
            bznVar3.g(this);
            h(this.w);
        } else if (obj == bxs.r) {
            byy byyVar4 = this.y;
            if (byyVar4 != null) {
                j(byyVar4);
            }
            bzn bznVar4 = new bzn(cdjVar);
            this.y = bznVar4;
            bznVar4.g(this);
            h(this.y);
        } else if (obj == bxs.D) {
            byy byyVar5 = this.z;
            if (byyVar5 != null) {
                j(byyVar5);
            }
            bzn bznVar5 = new bzn(cdjVar);
            this.z = bznVar5;
            bznVar5.g(this);
            h(this.z);
        } else if (obj != bxs.G) {
        } else {
            byy byyVar6 = this.A;
            if (byyVar6 != null) {
                j(byyVar6);
            }
            bzn bznVar6 = new bzn(cdjVar);
            this.A = bznVar6;
            bznVar6.g(this);
            h(this.A);
        }
    }

    @Override // defpackage.cbd, defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.q.g.width(), this.q.g.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03cd  */
    @Override // defpackage.cbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.i(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private static final void p(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                canvas.translate(-f, 0.0f);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                canvas.translate((-f) / 2.0f, 0.0f);
                return;
            }
        }
        throw null;
    }
}
