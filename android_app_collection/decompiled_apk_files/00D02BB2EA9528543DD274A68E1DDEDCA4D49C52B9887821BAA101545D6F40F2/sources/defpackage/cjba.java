package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjba  reason: default package */
/* loaded from: classes4.dex */
public final class cjba extends cjal {
    public cjbg aj;
    private cjbf ak;
    private didr al = didr.f;

    @Override // defpackage.ges
    protected final void Nv() {
        ((cjbb) btsx.b(cjbb.class, this)).ds(this);
    }

    @Override // defpackage.cjal
    protected final void bn() {
        cjbf cjbfVar = this.ak;
        dbsk.s(cjbfVar);
        didr didrVar = this.al;
        String str = didrVar.b;
        int a = didq.a(didrVar.c);
        if (a == 0) {
            a = 1;
        }
        didu diduVar = this.al.d;
        if (diduVar == null) {
            diduVar = didu.d;
        }
        final bvqg bvqgVar = new bvqg(this) { // from class: cjaz
            private final cjba a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.ag = dbsg.i((dlno) obj);
            }
        };
        didl bZ = diea.c.bZ();
        dido bZ2 = didr.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        didr didrVar2 = (didr) bZ2.b;
        str.getClass();
        int i = 1 | didrVar2.a;
        didrVar2.a = i;
        didrVar2.b = str;
        didrVar2.c = a - 1;
        int i2 = i | 2;
        didrVar2.a = i2;
        diduVar.getClass();
        didrVar2.d = diduVar;
        didrVar2.a = i2 | 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diea dieaVar = (diea) bZ.b;
        didr bK = bZ2.bK();
        bK.getClass();
        dieaVar.b = bK;
        dieaVar.a = 7;
        cjbfVar.c.b(bZ.bK(), cedl.a(new bvqg(bvqgVar) { // from class: cjbc
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bvqg bvqgVar2 = this.a;
                int i3 = cjbf.e;
                dlno dlnoVar = ((dier) obj).c;
                if (dlnoVar == null) {
                    dlnoVar = dlno.f;
                }
                bvqgVar2.NU(dlnoVar);
            }
        }), cjbfVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjal
    public final dddi bo(dspd dspdVar) {
        return cjbf.a(dspdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjal
    public final List<cfgf> bp(dlno dlnoVar, final dspd dspdVar) {
        dbsk.s(this.ak);
        return dcbg.b(dlnoVar.c).o(cjbd.a).s(new dbrn(dspdVar) { // from class: cjbe
            private final dspd a;

            {
                this.a = dspdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dspd dspdVar2 = this.a;
                dlnm dlnmVar = (dlnm) obj;
                int i = cjbf.e;
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
        cjbf cjbfVar = this.ak;
        dbsk.s(cjbfVar);
        didr didrVar = this.al;
        String str = didrVar.b;
        int a = didq.a(didrVar.c);
        if (a == 0) {
            a = 1;
        }
        int a2 = dgoz.a(a - 1);
        didu diduVar = this.al.d;
        if (diduVar == null) {
            diduVar = didu.d;
        }
        dsrj<String> dsrjVar = this.al.e;
        dgpf bZ = dgpg.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpg dgpgVar = (dgpg) bZ.b;
        int i = a2 - 1;
        if (a2 != 0) {
            dgpgVar.e = i;
            dgpgVar.a |= 128;
            dgpg dgpgVar2 = (dgpg) bZ.b;
            dsrj<String> dsrjVar2 = dgpgVar2.f;
            if (!dsrjVar2.a()) {
                dgpgVar2.f = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, dgpgVar2.f);
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
                dgpg dgpgVar3 = (dgpg) bZ.b;
                ddybVar.getClass();
                dgpgVar3.c = ddybVar;
                dgpgVar3.a |= 32;
            }
            akqi f = akqi.f(diduVar.c);
            if (f != null) {
                dgrh h = f.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgpg dgpgVar4 = (dgpg) bZ.b;
                h.getClass();
                dgpgVar4.i = h;
                dgpgVar4.a |= 8388608;
            }
            dkfc bZ2 = dkfh.k.bZ();
            dspd dspdVar2 = cjbf.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkfh dkfhVar = (dkfh) bZ2.b;
            dspdVar2.getClass();
            int i2 = 1 | dkfhVar.a;
            dkfhVar.a = i2;
            dkfhVar.b = dspdVar2;
            dspdVar.getClass();
            dkfhVar.a = i2 | 4;
            dkfhVar.d = dspdVar;
            dspd c = dgmr.c(cjbf.e, cjbf.f);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkfh dkfhVar2 = (dkfh) bZ2.b;
            c.getClass();
            dkfhVar2.a |= 2;
            dkfhVar2.c = c;
            dspd a3 = dgmr.a(bZ.bK());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkfh dkfhVar3 = (dkfh) bZ2.b;
            a3.getClass();
            dkfhVar3.a |= 64;
            dkfhVar3.j = a3;
            cjbfVar.d.b(bZ2.bK(), cedl.b(), cjbfVar.b);
            return;
        }
        throw null;
    }

    @Override // defpackage.cjal, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        this.al = (didr) dsuv.c(this.o, "DEPARTURE_BOARD_CONTEXT_KEY", didr.f, dsqa.c());
        cjbg cjbgVar = this.aj;
        dbsk.s(cjbgVar);
        buqz a = cjbgVar.a.a();
        cjbg.a(a, 1);
        bvax a2 = cjbgVar.b.a();
        cjbg.a(a2, 2);
        Executor a3 = cjbgVar.c.a();
        cjbg.a(a3, 3);
        this.ak = new cjbf(a, a2, a3);
        super.l(bundle);
    }

    @Override // defpackage.cjal
    protected final CharSequence w() {
        return Rn().getString(R.string.DEPARTURE_BOARD_FEEDBACK_SATISFACTION_QUESTION);
    }
}
