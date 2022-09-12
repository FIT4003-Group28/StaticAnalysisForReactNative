package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnxn  reason: default package */
/* loaded from: classes3.dex */
public class bnxn extends ivn implements bnyn<dwgz, dwhd> {
    public final cjqy a;
    ProgressDialog b;
    private final gga c;
    private final dxio<boxa> d;
    private final bnxb e;
    private final dnqb f;
    private bmcn g;
    private dniu h;
    private boolean i;

    public bnxn(dnqb dnqbVar, bnxb bnxbVar, gga ggaVar, dxio<boxa> dxioVar, cjqy cjqyVar) {
        super(ggaVar.getString(bmcq.a()), 1, null, ggaVar.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtxo.Y), cjtd.a(dtxo.ac), true, true, false, true);
        this.g = null;
        this.h = null;
        this.i = false;
        this.c = ggaVar;
        this.d = dxioVar;
        this.e = bnxbVar;
        this.f = dnqbVar;
        this.a = cjqyVar;
    }

    @Override // defpackage.ivn
    protected final void a() {
        this.d.a().M(null);
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        dniu dniuVar;
        bmcn bmcnVar = this.g;
        if (bmcnVar == null || (dniuVar = this.h) == null || this.i) {
            return;
        }
        this.i = true;
        bnxb bnxbVar = this.e;
        dnqb dnqbVar = this.f;
        dwgy bZ = dwgz.h.bZ();
        dniw bZ2 = dniz.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniz dnizVar = (dniz) bZ2.b;
        dniuVar.getClass();
        dnizVar.b = dniuVar;
        dnizVar.a |= 1;
        for (dnfd dnfdVar : bmcnVar.a().a) {
            dner bZ3 = dnet.h.bZ();
            dglu dgluVar = dnfdVar.c;
            if (dgluVar == null) {
                dgluVar = dglu.e;
            }
            if (bnxb.a(dgluVar)) {
                dneu bZ4 = dnfe.p.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dnfe dnfeVar = (dnfe) bZ4.b;
                dnfdVar.getClass();
                dnfeVar.m = dnfdVar;
                dnfeVar.a |= 8192;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnet dnetVar = (dnet) bZ3.b;
                dnfe bK = bZ4.bK();
                bK.getClass();
                dnetVar.d = bK;
                dnetVar.a |= 4;
            }
            dnfd c = bmcnVar.c(dnfdVar.b);
            if (c != null) {
                dglu dgluVar2 = c.c;
                if (dgluVar2 == null) {
                    dgluVar2 = dglu.e;
                }
                if (bnxb.a(dgluVar2)) {
                    dneu bZ5 = dnfe.p.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnfe dnfeVar2 = (dnfe) bZ5.b;
                    c.getClass();
                    dnfeVar2.m = c;
                    dnfeVar2.a |= 8192;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnet dnetVar2 = (dnet) bZ3.b;
                    dnfe bK2 = bZ5.bK();
                    bK2.getClass();
                    dnetVar2.c = bK2;
                    dnetVar2.a |= 2;
                }
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnet dnetVar3 = (dnet) bZ3.b;
            dnetVar3.a |= 1;
            dnetVar3.b = 34;
            bZ2.b(bZ3);
        }
        dnps bZ6 = dnqe.i.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ6.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwgz dwgzVar = (dwgz) bZ.b;
        dnqe bK3 = bZ6.bK();
        bK3.getClass();
        dwgzVar.c = bK3;
        dwgzVar.a |= 2;
        djgw a = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwgz dwgzVar2 = (dwgz) bZ.b;
        a.getClass();
        dwgzVar2.e = a;
        dwgzVar2.a |= 8;
        doaq bZ7 = doar.c.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        doar doarVar = (doar) bZ7.b;
        dniz bK4 = bZ2.bK();
        bK4.getClass();
        doarVar.b = bK4;
        doarVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwgz dwgzVar3 = (dwgz) bZ.b;
        doar bK5 = bZ7.bK();
        bK5.getClass();
        dwgzVar3.b = bK5;
        dwgzVar3.a |= 1;
        bnxbVar.a.a(bZ.bK(), this);
        if (this.b == null) {
            ProgressDialog progressDialog = new ProgressDialog(this.c, 0);
            this.b = progressDialog;
            progressDialog.setMessage(this.c.getString(R.string.EDIT_SCALABLE_ATTRIBUTES_SENDING));
        }
        this.b.show();
    }

    public void c(bmcn bmcnVar, dniu dniuVar, String str) {
        this.g = bmcnVar;
        this.h = dniuVar;
        f(str);
    }

    @Override // defpackage.bnyn
    /* renamed from: j */
    public void Rb(dwgz dwgzVar, dwhd dwhdVar) {
        int a;
        this.i = false;
        if (this.c.K() != null) {
            fd K = this.c.K();
            dbsk.s(K);
            if (!K.U()) {
                return;
            }
        }
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.b = null;
        }
        if (dwhdVar == null || (a = dwhc.a(dwhdVar.b)) == 0 || a != 2) {
            ppw.b(this.c, new bnxl(this), new bnxm());
        } else {
            this.d.a().M(this.d.a().R(dwhdVar));
        }
    }
}
