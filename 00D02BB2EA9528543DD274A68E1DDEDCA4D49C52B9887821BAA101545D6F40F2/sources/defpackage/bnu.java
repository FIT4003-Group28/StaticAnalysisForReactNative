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
/* renamed from: bnu  reason: default package */
/* loaded from: classes3.dex */
public final class bnu extends bnl {
    private final StringBuilder g;
    private final RectF h;
    private final Matrix i;
    private final Paint j;
    private final Paint k;
    private final Map<blx, List<bkl>> l;
    private final aik<String> m;
    private final blp n;
    private final bjr o;
    private final bis p;
    private blc<Integer, Integer> q;
    private blc<Integer, Integer> r;
    private blc<Float, Float> s;
    private blc<Float, Float> t;

    public bnu(bjr bjrVar, bno bnoVar) {
        super(bjrVar, bnoVar);
        bme bmeVar;
        bme bmeVar2;
        bmd bmdVar;
        bmd bmdVar2;
        this.g = new StringBuilder(2);
        this.h = new RectF();
        this.i = new Matrix();
        this.j = new bns();
        this.k = new bnt();
        this.l = new HashMap();
        this.m = new aik<>();
        this.o = bjrVar;
        this.p = bnoVar.b;
        blp a = bnoVar.p.a();
        this.n = a;
        a.a(this);
        i(a);
        bmn bmnVar = bnoVar.q;
        if (bmnVar != null && (bmdVar2 = bmnVar.a) != null) {
            blc<Integer, Integer> a2 = bmdVar2.a();
            this.q = a2;
            a2.a(this);
            i(this.q);
        }
        if (bmnVar != null && (bmdVar = bmnVar.b) != null) {
            blc<Integer, Integer> a3 = bmdVar.a();
            this.r = a3;
            a3.a(this);
            i(this.r);
        }
        if (bmnVar != null && (bmeVar2 = bmnVar.c) != null) {
            blc<Float, Float> a4 = bmeVar2.a();
            this.s = a4;
            a4.a(this);
            i(this.s);
        }
        if (bmnVar == null || (bmeVar = bmnVar.d) == null) {
            return;
        }
        blc<Float, Float> a5 = bmeVar.a();
        this.t = a5;
        a5.a(this);
        i(this.t);
    }

    private static final void p(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List<String> r(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // defpackage.bnl, defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.p.i.width(), this.p.i.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bnl, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.a) {
            blc<Integer, Integer> blcVar = this.q;
            if (blcVar != null) {
                blcVar.d = bpvVar;
                return;
            }
            blr blrVar = new blr(bpvVar);
            this.q = blrVar;
            blrVar.a(this);
            i(this.q);
        } else if (t == bjv.b) {
            blc<Integer, Integer> blcVar2 = this.r;
            if (blcVar2 != null) {
                blcVar2.d = bpvVar;
                return;
            }
            blr blrVar2 = new blr(bpvVar);
            this.r = blrVar2;
            blrVar2.a(this);
            i(this.r);
        } else if (t == bjv.o) {
            blc<Float, Float> blcVar3 = this.s;
            if (blcVar3 != null) {
                blcVar3.d = bpvVar;
                return;
            }
            blr blrVar3 = new blr(bpvVar);
            this.s = blrVar3;
            blrVar3.a(this);
            i(this.s);
        } else if (t != bjv.p) {
        } else {
            blc<Float, Float> blcVar4 = this.t;
            if (blcVar4 != null) {
                blcVar4.d = bpvVar;
                return;
            }
            blr blrVar4 = new blr(bpvVar);
            this.t = blrVar4;
            blrVar4.a(this);
            i(this.t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ec  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object, java.lang.String] */
    @Override // defpackage.bnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnu.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private static final void o(int i, Canvas canvas, float f) {
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
