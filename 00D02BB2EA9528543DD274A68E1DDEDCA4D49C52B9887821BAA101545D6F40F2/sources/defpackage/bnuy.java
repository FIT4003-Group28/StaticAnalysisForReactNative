package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: bnuy  reason: default package */
/* loaded from: classes.dex */
public final class bnuy implements bnsa {
    private static final bnvo a = new bnvo(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private final bnsn b;
    private final int c;
    private final int d;
    private final int e;
    private final bnrz f;
    private final int g;
    private int h = 0;
    private boolean i = false;

    public bnuy(bnsn bnsnVar, int i, int i2, int i3, bnrz bnrzVar) {
        this.b = bnsnVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = bnrzVar;
        this.g = bnuz.a(i, i2, i3);
    }

    @Override // defpackage.bnsa
    public final bnuo B() {
        return this.f.a();
    }

    @Override // defpackage.bnsa
    public final boolean C() {
        return true;
    }

    @Override // defpackage.bnsa
    @dzsi
    public final bnvl D(int i) {
        throw null;
    }

    @Override // defpackage.bnsa
    public final void E(boolean z) {
        this.h--;
    }

    @Override // defpackage.bnsa
    public final boolean F() {
        return this.h > 0;
    }

    @Override // defpackage.bnsa
    public final bnvo G() {
        return a;
    }

    @Override // defpackage.bnsa
    public final void a(long j) {
    }

    @Override // defpackage.bnsa
    public final void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
        bnuz bnuzVar = this.b.o;
        if (bnuzVar == null) {
            return;
        }
        if (!(bnsaVar instanceof bnuy)) {
            bnuzVar.a.h(bnuzVar.c);
            bnuzVar.a.n(0, 1);
            bnuzVar.a.o(519);
            bnuzVar.a.q(0.0f, 0.0f);
            bnuzVar.a.v(bnuzVar.b);
            bnuzVar.a.z(0);
            int i = bnta.a().f;
            for (int i2 = 1; i2 < i; i2++) {
                bnuzVar.a.A(i2);
            }
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        }
        if (this.i) {
            int i3 = this.c;
            int i4 = this.d;
            int i5 = this.e;
            bnuzVar.a.r(true, 519, this.g, 56);
            float[] fArr = bnuzVar.e;
            bnrs bnrsVar = bnrrVar.g.get();
            int i6 = 1073741824 >> i5;
            int i7 = bnrsVar.h;
            int i8 = bnrsVar.i;
            float f = bnrsVar.t;
            float f2 = i6 * f;
            fArr[0] = f2;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f2;
            fArr[11] = 0.0f;
            fArr[12] = akra.N(((i3 * i6) - 536870912) - i7) * f;
            fArr[13] = ((-((i6 * (i4 + 1)) - 536870912)) - i8) * f;
            fArr[14] = 0.0f;
            fArr[15] = 1.0f;
            Matrix.multiplyMM(fArr, 0, bnrsVar.w, 0, fArr, 0);
            bntb.T(bnuzVar.d, bnuzVar.e);
            bntb.Q(5, 4);
        }
        if (bnsaVar2 instanceof bnuy) {
            return;
        }
        bnuzVar.a.A(0);
        bnuzVar.a.w();
    }

    @Override // defpackage.bnsa
    public final int h() {
        return this.e;
    }

    @Override // defpackage.bnsa
    public final bnrz i() {
        return this.f;
    }

    @Override // defpackage.bnsa
    public final void n(boolean z) {
        this.i = z;
    }

    @Override // defpackage.bnsa
    public final bnrw o() {
        return bnrw.e;
    }

    @Override // defpackage.bnsa
    public final void p() {
    }

    @Override // defpackage.bnsa
    public final String q() {
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Tile stencil [");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.bnsa
    @dzsi
    public final bnuk x() {
        return null;
    }

    @Override // defpackage.bnsa
    public final boolean y() {
        return true;
    }

    @Override // defpackage.bnsa
    public final void z(bntb bntbVar) {
        this.h++;
    }
}
