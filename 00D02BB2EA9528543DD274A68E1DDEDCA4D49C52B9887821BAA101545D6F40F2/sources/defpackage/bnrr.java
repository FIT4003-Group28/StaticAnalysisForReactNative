package defpackage;

import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: bnrr  reason: default package */
/* loaded from: classes.dex */
public class bnrr {
    private static final float a = ((float) Math.cos(1.3962634015954636d)) * 262144.0f;
    public final AtomicReference<bnrs> g;
    @dzsi
    public final Runnable h;
    public boolean i;
    protected final bnrq j;

    public bnrr(alad aladVar, int i, int i2, float f, float f2, float f3, float f4, @dzsi Runnable runnable) {
        boolean z = false;
        this.i = false;
        this.j = new bnrq();
        dbsk.h(i > 0 && i2 > 0, "target=%sx%s", i, i2);
        dbsk.g(f > 0.0f, "screenDensity=%s", Float.valueOf(f));
        dbsk.g(f2 > 0.0f, "nearClip=%s", Float.valueOf(f2));
        dbsk.g(f3 > 0.0f, "farClip=%s", Float.valueOf(f3));
        dbsk.g(f4 > 0.0f ? true : z, "filedOfViewDegrees=%s", Float.valueOf(f4));
        this.g = new AtomicReference<>(u(aladVar, i, i2, f, f2, f3, f4));
        this.h = runnable;
    }

    private static boolean b(float f, float f2, int i, int i2, int i3, int i4, int i5, float[] fArr, akra akraVar, float[] fArr2) {
        dbsk.l(fArr2.length >= 8);
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV(fArr2, 4, fArr, 0, fArr2, 0);
        float f3 = 1.0f / fArr2[7];
        double d = fArr2[4] * f3;
        double d2 = fArr2[5] * f3;
        double d3 = (fArr2[6] * f3) / i5;
        if (d3 >= 1.0d) {
            return false;
        }
        Double.isNaN(d3);
        double d4 = 1.0d / (1.0d - d3);
        double d5 = i3;
        double d6 = i4;
        double d7 = i;
        Double.isNaN(d);
        Double.isNaN(d7);
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d8 = i2;
        Double.isNaN(d2);
        Double.isNaN(d8);
        Double.isNaN(d6);
        Double.isNaN(d6);
        akraVar.t((int) ((((d + d7) - d5) * d4) + d5), (int) ((((d2 + d8) - d6) * d4) + d6));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0323 A[LOOP:0: B:21:0x0321->B:22:0x0323, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bnrs u(defpackage.alad r60, int r61, int r62, float r63, float r64, float r65, float r66) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnrr.u(alad, int, int, float, float, float, float):bnrs");
    }

    public final bnuw A() {
        bnrs bnrsVar = this.g.get();
        return bnuw.c(bnrsVar.b, bnrsVar.c);
    }

    public final float B() {
        return this.g.get().d;
    }

    public final float C() {
        return this.g.get().g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        if (this.i && !bnuq.b()) {
            bvoo.j(new IllegalStateException("Camera method called from wrong thread."));
        }
    }

    public void a(int i, int i2) {
        bnrs bnrsVar = this.g.get();
        if (bnrsVar.b == i && bnrsVar.c == i2) {
            return;
        }
        l(i, i2);
    }

    public final boolean equals(@dzsi Object obj) {
        D();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnrr)) {
            return false;
        }
        return this.g.get().equals(((bnrr) obj).g.get());
    }

    public final bnrs f() {
        return this.g.get();
    }

    public final akra g() {
        bnrs bnrsVar = this.g.get();
        return new akra(bnrsVar.h, bnrsVar.i, bnrsVar.j);
    }

    public final void h(akra akraVar) {
        bnrs bnrsVar = this.g.get();
        int i = bnrsVar.h;
        int i2 = bnrsVar.i;
        int i3 = bnrsVar.j;
        akraVar.a = i;
        akraVar.b = i2;
        akraVar.c = i3;
    }

    public final int hashCode() {
        return this.g.get().hashCode();
    }

    public final int i() {
        return this.g.get().h;
    }

    public final int j() {
        return this.g.get().i;
    }

    public final float k() {
        return this.g.get().a.k;
    }

    public final void l(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        D();
        bnrs bnrsVar = this.g.get();
        if (bnrsVar.b == i && bnrsVar.c == i2) {
            return;
        }
        this.g.set(u(bnrsVar.a, i, i2, bnrsVar.d, bnrsVar.e, bnrsVar.f, bnrsVar.g));
        Runnable runnable = this.h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public final float m() {
        return this.g.get().q;
    }

    public final float n() {
        return this.g.get().r;
    }

    public final void o(@dzsi alad aladVar) {
        if (aladVar == null) {
            return;
        }
        D();
        bnrs bnrsVar = this.g.get();
        if (bnrsVar.a.equals(aladVar)) {
            return;
        }
        this.g.set(u(aladVar, bnrsVar.b, bnrsVar.c, bnrsVar.d, bnrsVar.e, bnrsVar.f, bnrsVar.g));
        Runnable runnable = this.h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public final alad p() {
        return this.g.get().a;
    }

    public final akra q() {
        D();
        bnrs bnrsVar = this.g.get();
        return new akra(bnrsVar.k, bnrsVar.l, bnrsVar.m);
    }

    public final aksi r() {
        D();
        return this.g.get().u;
    }

    public final float s() {
        return this.g.get().t;
    }

    public final float t(akra akraVar, boolean z) {
        float f;
        D();
        synchronized (this.j) {
            bnrs bnrsVar = this.g.get();
            akra akraVar2 = this.j.a;
            akraVar2.a = akraVar.a - bnrsVar.h;
            akraVar2.b = akraVar.b - bnrsVar.i;
            akraVar2.c = akraVar.c - bnrsVar.j;
            if (z) {
                akraVar2.P(akraVar2);
            }
            int i = bnrsVar.h - bnrsVar.k;
            int i2 = bnrsVar.i - bnrsVar.l;
            int i3 = bnrsVar.j - bnrsVar.m;
            int i4 = akraVar2.a + i;
            akraVar2.a = i4;
            int i5 = akraVar2.b + i2;
            akraVar2.b = i5;
            int i6 = akraVar2.c + i3;
            akraVar2.c = i6;
            double d = i4;
            double d2 = bnrsVar.n;
            Double.isNaN(d);
            double d3 = d * d2;
            double d4 = i5;
            double d5 = bnrsVar.o;
            Double.isNaN(d4);
            double d6 = d3 + (d4 * d5);
            double d7 = i6;
            double d8 = bnrsVar.p;
            Double.isNaN(d7);
            f = (float) (d6 + (d7 * d8));
        }
        return f;
    }

    public final String toString() {
        bnrs bnrsVar = this.g.get();
        String valueOf = String.valueOf(new akra(bnrsVar.h, bnrsVar.i, bnrsVar.j));
        float f = bnrsVar.q;
        alad aladVar = bnrsVar.a;
        float f2 = aladVar.m;
        float f3 = aladVar.l;
        float f4 = bnrsVar.g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        sb.append(", ");
        sb.append(f4);
        sb.append("]");
        return sb.toString();
    }

    public final float[] v() {
        D();
        return this.g.get().x;
    }

    public final float[] w() {
        D();
        return this.g.get().y;
    }

    public final float[] x() {
        return this.g.get().w;
    }

    public final int y() {
        return this.g.get().b;
    }

    public final int z() {
        return this.g.get().c;
    }

    public bnrr(bnrr bnrrVar) {
        this.i = false;
        this.j = new bnrq();
        this.g = new AtomicReference<>(bnrrVar.g.get());
        this.h = null;
    }
}
