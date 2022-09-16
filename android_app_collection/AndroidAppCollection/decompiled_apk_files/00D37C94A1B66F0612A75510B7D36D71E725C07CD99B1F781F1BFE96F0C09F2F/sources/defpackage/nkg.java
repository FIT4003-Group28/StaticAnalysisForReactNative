package defpackage;
/* compiled from: PG */
/* renamed from: nkg  reason: default package */
/* loaded from: classes3.dex */
public abstract class nkg implements nmc {
    public final acti a;
    public aqvq b;
    protected asjj c;
    private final aadd d;

    public nkg(acti actiVar, aadd aaddVar) {
        this.a = actiVar;
        this.d = aaddVar;
    }

    @Override // defpackage.nmc
    public final acti j() {
        return this.a;
    }

    @Override // defpackage.nmc
    public final amvn k() {
        aqvq aqvqVar = this.b;
        if (aqvqVar == null || aqvqVar.l.size() <= 0) {
            return ntp.a;
        }
        return amvn.p(new aops(aqvqVar.l, aqvq.a));
    }

    @Override // defpackage.nmc
    public final aqvq l() {
        return this.b;
    }

    @Override // defpackage.nmc
    public void m() {
    }

    @Override // defpackage.nmc
    public void p(aqvq aqvqVar, asjj asjjVar) {
        this.b = aqvqVar;
        this.c = asjjVar;
    }

    @Override // defpackage.nmc
    public void q(boolean z) {
    }

    @Override // defpackage.nmc
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // defpackage.nmc
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // defpackage.nmc
    public final boolean t() {
        int z;
        arhd a;
        int z2;
        aqvq aqvqVar = this.b;
        if (aqvqVar != null && (aqvqVar.c & 64) != 0) {
            aqvn aqvnVar = aqvqVar.i;
            if (aqvnVar == null) {
                aqvnVar = aqvn.a;
            }
            if ((aqvnVar.b & 1) != 0) {
                aqvn aqvnVar2 = aqvqVar.i;
                if (aqvnVar2 == null) {
                    aqvnVar2 = aqvn.a;
                }
                int x = amnt.x(aqvnVar2.c);
                if (x != 0 && x == 3) {
                    return false;
                }
            }
        }
        aadd aaddVar = this.d;
        if (aaddVar != null && (a = aaddVar.a()) != null && (a.b & 64) != 0) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.bb) {
                aqvq aqvqVar2 = this.b;
                return aqvqVar2 == null || (z2 = amnt.z(aqvqVar2.k)) == 0 || z2 != 3;
            }
        }
        aqvq aqvqVar3 = this.b;
        return (aqvqVar3 == null || (z = amnt.z(aqvqVar3.k)) == 0 || z != 2) ? false : true;
    }

    @Override // defpackage.nmc
    public /* synthetic */ boolean u(aqvq aqvqVar, apzg apzgVar) {
        return false;
    }

    @Override // defpackage.nmc
    public boolean v() {
        int B;
        aqvq aqvqVar = this.b;
        return aqvqVar == null || (B = amnt.B(aqvqVar.n)) == 0 || B != 4;
    }

    @Override // defpackage.nmc
    public boolean w() {
        return false;
    }

    @Override // defpackage.nmc
    public /* synthetic */ void x(aqvq aqvqVar, apzg apzgVar, boolean z) {
        u(aqvqVar, null);
    }
}
