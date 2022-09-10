package defpackage;

import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: amye  reason: default package */
/* loaded from: classes.dex */
public class amye extends amxg {
    private static final bnvo a = new bnvo(0, 0, 0);
    private final amyi b;
    private final bnvr c;
    private final bnvo e;

    public amye(bnrz bnrzVar, alyh alyhVar, amyi amyiVar, @dzsi bnvo bnvoVar, boolean z) {
        super(bnrzVar, alyhVar.a);
        this.c = new bnvr();
        this.b = amyiVar;
        this.e = bnvoVar == null ? a : bnvoVar;
        if (bnvoVar != null || !(bnrzVar instanceof bntg)) {
            if (!z) {
                return;
            }
            v(bnuz.a(alyhVar.b, alyhVar.c, alyhVar.a), 56);
            return;
        }
        throw new IllegalArgumentException("GmmTileEntity in BaseTileDrawOrder does not specify sort values.");
    }

    public static bnvo k(alvz alvzVar, alxo alxoVar) {
        return new bnvo(alxoVar.E, alvzVar.b(), alvzVar.c());
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final bnvo G() {
        return this.e;
    }

    public final void j(float f) {
        bnvr bnvrVar = new bnvr();
        bnvrVar.g();
        bnvrVar.i(0.0f, 0.0f, f);
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        this.c.f(bnvrVar);
        this.p = true;
    }

    @Override // defpackage.bnsc
    protected final float[] A(bnrr bnrrVar) {
        bnvr bnvrVar = this.c.b ? this.b.d : this.q;
        if (this.p || bnrrVar.f() != this.r) {
            if (this.c.b) {
                this.o.f(this.b.a(bnrrVar));
                amyi amyiVar = this.b;
                if (bnrrVar.f() != amyiVar.b) {
                    amyiVar.a(bnrrVar);
                    Matrix.multiplyMM(amyiVar.d.a, 0, bnrrVar.x(), 0, amyiVar.c.a, 0);
                    amyiVar.d.a();
                    amyiVar.b = bnrrVar.f();
                }
                bnvrVar = amyiVar.d;
            } else {
                this.b.a(bnrrVar).b(this.o, this.c);
                Matrix.multiplyMM(this.q.a, 0, bnrrVar.x(), 0, this.o.a, 0);
                this.q.a();
                bnvrVar = this.q;
            }
            this.p = false;
            this.r = bnrrVar.f();
        }
        return bnvrVar.a;
    }
}
