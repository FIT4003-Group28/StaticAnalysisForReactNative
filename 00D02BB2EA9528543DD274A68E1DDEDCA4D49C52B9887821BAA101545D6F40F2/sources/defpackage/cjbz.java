package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjbz  reason: default package */
/* loaded from: classes4.dex */
public final class cjbz extends cjal {
    @dzsi
    public cjcf aj;
    @dzsi
    public ckcw ak;
    @dzsi
    private cjce al;
    private int am;
    @dzsi
    private String an;
    @dzsi
    private didv ao;

    @Override // defpackage.ges
    protected final void Nv() {
        ((cjca) btsx.b(cjca.class, this)).dt(this);
    }

    @Override // defpackage.cjal
    protected final void bn() {
        cjce cjceVar = this.al;
        dbsk.s(cjceVar);
        String str = this.an;
        dbsk.s(str);
        int i = this.am;
        didv didvVar = this.ao;
        dbsk.s(didvVar);
        final bvqg bvqgVar = new bvqg(this) { // from class: cjby
            private final cjbz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.ag = dbsg.i((dlno) obj);
            }
        };
        didl bZ = diea.c.bZ();
        didy bZ2 = didz.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        didz didzVar = (didz) bZ2.b;
        str.getClass();
        int i2 = didzVar.a | 1;
        didzVar.a = i2;
        didzVar.b = str;
        int i3 = i2 | 2;
        didzVar.a = i3;
        didzVar.c = i;
        didvVar.getClass();
        didzVar.d = didvVar;
        didzVar.a = i3 | 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diea dieaVar = (diea) bZ.b;
        didz bK = bZ2.bK();
        bK.getClass();
        dieaVar.b = bK;
        dieaVar.a = 5;
        cjceVar.c.b(bZ.bK(), cedl.a(new bvqg(bvqgVar) { // from class: cjcb
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bvqg bvqgVar2 = this.a;
                dspd dspdVar = cjce.a;
                dlno dlnoVar = ((dier) obj).c;
                if (dlnoVar == null) {
                    dlnoVar = dlno.f;
                }
                bvqgVar2.NU(dlnoVar);
            }
        }), cjceVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjal
    public final dddi bo(dspd dspdVar) {
        return cjce.a(dspdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjal
    public final List<cfgf> bp(dlno dlnoVar, final dspd dspdVar) {
        dbsk.s(this.al);
        return dcbg.b(dlnoVar.c).o(cjcc.a).s(new dbrn(dspdVar) { // from class: cjcd
            private final dspd a;

            {
                this.a = dspdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dspd dspdVar2 = this.a;
                dlnm dlnmVar = (dlnm) obj;
                dspd dspdVar3 = cjce.a;
                cfge bZ = cfgf.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf cfgfVar = (cfgf) bZ.b;
                dlnmVar.getClass();
                cfgfVar.b = dlnmVar;
                cfgfVar.a |= 1;
                cfga bZ2 = cfgd.h.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ2.b;
                dspdVar2.getClass();
                cfgdVar.a |= 1;
                cfgdVar.b = dspdVar2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf cfgfVar2 = (cfgf) bZ.b;
                cfgd bK = bZ2.bK();
                bK.getClass();
                cfgfVar2.c = bK;
                cfgfVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf.b((cfgf) bZ.b);
                return bZ.bK();
            }
        }).z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjal
    public final void bq(dspd dspdVar) {
        cjce cjceVar = this.al;
        dbsk.s(cjceVar);
        String str = this.an;
        dbsk.s(str);
        int i = this.am;
        didv didvVar = this.ao;
        dbsk.s(didvVar);
        dgpf bZ = dgpg.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpg dgpgVar = (dgpg) bZ.b;
        dgpgVar.a |= 64;
        dgpgVar.d = i;
        ddxz e = cjra.e(str);
        if (e != null) {
            ddyb ddybVar = e.b;
            if (ddybVar == null) {
                ddybVar = ddyb.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar2 = (dgpg) bZ.b;
            ddybVar.getClass();
            dgpgVar2.c = ddybVar;
            dgpgVar2.a |= 32;
        }
        didu diduVar = didvVar.b;
        if (diduVar == null) {
            diduVar = didu.d;
        }
        akqi f = akqi.f(diduVar.c);
        if (f != null) {
            dgrh h = f.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar3 = (dgpg) bZ.b;
            h.getClass();
            dgpgVar3.i = h;
            dgpgVar3.a |= 8388608;
        }
        didu diduVar2 = didvVar.c;
        if (diduVar2 == null) {
            diduVar2 = didu.d;
        }
        akqi f2 = akqi.f(diduVar2.c);
        if (f2 != null) {
            dgrh h2 = f2.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar4 = (dgpg) bZ.b;
            h2.getClass();
            dgpgVar4.j = h2;
            dgpgVar4.a |= 16777216;
        }
        dkfc bZ2 = dkfh.k.bZ();
        dspd dspdVar2 = cjce.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar = (dkfh) bZ2.b;
        dspdVar2.getClass();
        int i2 = dkfhVar.a | 1;
        dkfhVar.a = i2;
        dkfhVar.b = dspdVar2;
        dspdVar.getClass();
        dkfhVar.a = i2 | 4;
        dkfhVar.d = dspdVar;
        dspd c = dgmr.c(cjce.e, cjce.f);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar2 = (dkfh) bZ2.b;
        c.getClass();
        dkfhVar2.a |= 2;
        dkfhVar2.c = c;
        dspd a = dgmr.a(bZ.bK());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar3 = (dkfh) bZ2.b;
        a.getClass();
        dkfhVar3.a |= 64;
        dkfhVar3.j = a;
        cjceVar.d.b(bZ2.bK(), cedl.b(), cjceVar.b);
    }

    @Override // defpackage.cjal, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        cjcf cjcfVar = this.aj;
        dbsk.s(cjcfVar);
        buqz a = cjcfVar.a.a();
        cjcf.a(a, 1);
        bvax a2 = cjcfVar.b.a();
        cjcf.a(a2, 2);
        Executor a3 = cjcfVar.c.a();
        cjcf.a(a3, 3);
        this.al = new cjce(a, a2, a3);
        Bundle bundle2 = this.o;
        this.am = bundle2.getInt("TRIP_INDEX_KEY");
        this.an = bundle2.getString("DIRECTIONS_EI_KEY");
        this.ao = (didv) dsuv.c(bundle2, "TRANSIT_DETAILS_KEY", didv.d, dsqa.c());
        ckcw ckcwVar = this.ak;
        dbsk.s(ckcwVar);
        this.ah = dbsg.i((ckcn) ckcwVar.a(ckkm.s));
        ckcw ckcwVar2 = this.ak;
        dbsk.s(ckcwVar2);
        this.ai = dbsg.i((ckcn) ckcwVar2.a(ckkm.t));
        super.l(bundle);
    }

    @Override // defpackage.cjal
    protected final CharSequence w() {
        return Rn().getString(R.string.TRIP_DETAILS_FEEDBACK_SATISFACTION_QUESTION);
    }
}
