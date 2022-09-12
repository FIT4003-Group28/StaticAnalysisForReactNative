package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: akgt  reason: default package */
/* loaded from: classes.dex */
public final class akgt implements akgn<aklg> {
    public static final cqtv a = cqrp.d(224.0d);
    public static final cqtv b = cqrp.d(186.0d);
    public static final cqtv c = cqrp.d(248.0d);
    public static final cqtv d = cqrp.d(200.0d);
    public final int e;
    @dzsi
    private final cqtv f;
    @dzsi
    private final cqtv g;
    @dzsi
    private final cqtv h;
    private final cqtv i;
    private final cqtv j;

    public akgt(@dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2, @dzsi cqtv cqtvVar3, @dzsi cqtv cqtvVar4, @dzsi cqtv cqtvVar5, int i) {
        this.f = cqtvVar;
        this.g = cqtvVar2;
        this.h = cqtvVar3;
        cqtv[] cqtvVarArr = new cqtv[2];
        cqtvVarArr[0] = cqrp.d(4.0d);
        cqtvVarArr[1] = cqtvVar4 == null ? cqrp.d(dcyn.a) : cqtvVar4;
        this.i = cqsg.d(cqtvVarArr);
        cqtv[] cqtvVarArr2 = new cqtv[2];
        cqtvVarArr2[0] = cqrp.d(4.0d);
        cqtvVarArr2[1] = cqtvVar5 == null ? cqrp.d(dcyn.a) : cqtvVar5;
        this.j = cqsg.d(cqtvVarArr2);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akgt)) {
            return false;
        }
        akgt akgtVar = (akgt) obj;
        if (!this.i.equals(akgtVar.i) || !this.j.equals(akgtVar.j) || this.e != akgtVar.e) {
            return false;
        }
        cqtv cqtvVar = this.f;
        if (cqtvVar == null ? akgtVar.f != null : !cqtvVar.equals(akgtVar.f)) {
            return false;
        }
        cqtv cqtvVar2 = this.g;
        if (cqtvVar2 == null ? akgtVar.g != null : !cqtvVar2.equals(akgtVar.g)) {
            return false;
        }
        cqtv cqtvVar3 = this.h;
        if (cqtvVar3 != null) {
            return cqtvVar3.equals(akgtVar.h);
        }
        return akgtVar.h == null;
    }

    public final int hashCode() {
        cqtv cqtvVar = this.f;
        int i = 0;
        int i2 = (cqtvVar != null ? ((cqrp) cqtvVar).a : 0) * 31;
        cqtv cqtvVar2 = this.g;
        int i3 = (i2 + (cqtvVar2 != null ? ((cqrp) cqtvVar2).a : 0)) * 31;
        cqtv cqtvVar3 = this.h;
        if (cqtvVar3 != null) {
            i = ((cqrp) cqtvVar3).a;
        }
        return ((((((i3 + i) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.e;
    }

    @Override // defpackage.akgn
    public final cqmj<aklg> a(cqmp<aklg>... cqmpVarArr) {
        cqnf cd;
        cqmp cqmpVar;
        cqmp[] cqmpVarArr2 = new cqmp[8];
        cqtv cqtvVar = this.f;
        if (cqtvVar != null) {
            cd = cqgr.ce(cqtvVar);
        } else {
            cd = cqgr.cd(-1);
        }
        cqmpVarArr2[0] = cd;
        cqtv cqtvVar2 = this.g;
        cqmpVarArr2[1] = cqtvVar2 != null ? cqgr.bq(cqtvVar2) : cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.bR(this.i);
        cqmpVarArr2[3] = cqgr.bG(this.j);
        cqmpVarArr2[4] = cqgr.bD(cqrp.d(8.0d));
        cqtv cqtvVar3 = this.h;
        if (cqtvVar3 != null) {
            cqmpVar = cqgr.bV(cqtvVar3);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr2[5] = cqmpVar;
        cqmpVarArr2[6] = cqqx.g(cqrp.d(10.0d));
        cqmpVarArr2[7] = cqqx.i(cqrp.d((this.e & 2) != 0 ? 4.0d : dcyn.a));
        cqmj<aklg> E = cqqx.E(cqmpVarArr2);
        E.f(cqmpVarArr);
        E.f(cqgr.fY(cqgr.aH(new cqjb(this) { // from class: akgs
            private final akgt a;

            {
                this.a = this;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                akgt akgtVar = this.a;
                aklg aklgVar = (aklg) cqkpVar;
                boolean z = false;
                if ((akgtVar.e & 2) != 0) {
                    return false;
                }
                cqss f = aklgVar.f();
                if (f != null) {
                    if ((f.b(context) & 15790320) == 15790320) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                if (1 == ((akgtVar.e & 1) ^ 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), cqgr.cd(-1), cqgr.bp(-1), cqgr.x(cqui.c(cquh.f(cqta.f()), cquh.g(cqrp.d(10.0d)), cquh.a(0), cquh.e(cqrp.d(1.0d), ibm.i())))));
        return E;
    }
}
