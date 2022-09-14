package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bntx  reason: default package */
/* loaded from: classes.dex */
public final class bntx extends bnsc {
    public final ArrayList<bntw> a;
    public bntc b;
    public bntc c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final bnrz h;

    public bntx(bnrz bnrzVar) {
        super(bnrzVar.a(), bnrw.e);
        this.a = new ArrayList<>();
        this.h = bnrzVar;
        this.b = bntc.a;
        this.c = bntc.a;
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final boolean C() {
        return true;
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
        bntb bntbVar = this.l;
        dbsk.s(bntbVar);
        if (!(bnsaVar instanceof bntx)) {
            bntbVar.n(1, 771);
            bntbVar.r(false, 0, 0, 0);
            bntbVar.o(519);
            bntbVar.p(0);
            bntbVar.h(this.d);
            GLES20.glUniform1i(this.e, 0);
            GLES20.glUniform2f(this.g, bnrrVar.y(), bnrrVar.z());
            bntbVar.v(this.b);
            bntbVar.x(this.c);
            bntbVar.z(0);
            GLES20.glVertexAttribPointer(0, 3, 5126, false, 20, 0);
            bntbVar.z(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 20, 12);
            int i = bnta.a().f;
            for (int i2 = 2; i2 < i; i2++) {
                bntbVar.A(i2);
            }
        }
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            bntw bntwVar = this.a.get(i3);
            bnvb bnvbVar = bntwVar.a;
            if (bnvbVar != null) {
                bntc a = bnvbVar.a();
                int d = bntwVar.a.d();
                int e = bntwVar.a.e();
                if (a != null && a.a()) {
                    bntbVar.D(1, a);
                    GLES20.glUniform2f(this.f, 1.0f / d, 1.0f / e);
                    bntb.R(4, bntwVar.b, bntwVar.c);
                }
            }
        }
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final bnrz i() {
        return this.h;
    }
}
