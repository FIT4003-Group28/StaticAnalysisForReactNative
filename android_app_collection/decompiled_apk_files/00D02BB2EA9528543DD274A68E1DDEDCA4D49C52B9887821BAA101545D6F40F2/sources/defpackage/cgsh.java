package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgsh  reason: default package */
/* loaded from: classes4.dex */
public final class cgsh {
    private final cgrp A;
    private final cgrn B;
    private final cgrl C;
    private final cgse D;
    private final boolean E;
    @dzsi
    private ProgressDialog F;
    public final cgen a;
    public final cjqy b;
    public final ges c;
    @dzsi
    public String e;
    private final Activity q;
    private final bvrb r;
    private final akfa s;
    private final bbul t;
    private final bbtk u;
    private final bqji v;
    private final buke w;
    private final cjqq x;
    private final bwrs<ilo> y;
    private final cgrr z;
    public final List<dnet> f = new ArrayList();
    public final Map<dqgh, cgvw> g = new HashMap();
    public final List<dnet> h = new ArrayList();
    public final List<cgvv> i = new ArrayList();
    public final cgsg j = new cgsg();
    public cgsf k = cgsf.NOT_TRACKED;
    public cgsf l = cgsf.NOT_TRACKED;
    public dwpc m = dwpc.e;
    public dwpc n = dwpc.e;
    public dwpc o = dwpc.e;
    public final List<dwpc> p = new ArrayList();
    public final cjtd d = cjtd.a(dtyd.ag);

    public cgsh(Activity activity, bvrb bvrbVar, akfa akfaVar, cgen cgenVar, bbul bbulVar, bbtk bbtkVar, bqji bqjiVar, buke bukeVar, cjqy cjqyVar, cjqq cjqqVar, bwrs<ilo> bwrsVar, cgrr cgrrVar, cgrp cgrpVar, cgrn cgrnVar, cgrl cgrlVar, ges gesVar, cgse cgseVar, boolean z) {
        this.q = activity;
        this.r = bvrbVar;
        this.s = akfaVar;
        this.a = cgenVar;
        this.t = bbulVar;
        this.u = bbtkVar;
        this.v = bqjiVar;
        this.w = bukeVar;
        this.b = cjqyVar;
        this.x = cjqqVar;
        this.y = bwrsVar;
        this.z = cgrrVar;
        this.A = cgrpVar;
        this.B = cgrnVar;
        this.C = cgrlVar;
        this.c = gesVar;
        this.D = cgseVar;
        this.E = z;
    }

    public static dosk k(cgva cgvaVar) {
        return cgvaVar.h();
    }

    private final void l(cgvr cgvrVar, bqlb bqlbVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.KF.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (!dbsj.d(this.e)) {
            String str = this.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            str.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = str;
        }
        docg d = cgvrVar.d();
        dbsk.s(d);
        bqji bqjiVar = this.v;
        bqku c = bqla.c();
        bqkw k = bqkx.k();
        ilo c2 = this.y.c();
        dbsk.s(c2);
        k.c(c2.ai());
        k.f(d.q);
        k.e(d.r);
        k.d(dqgr.PUBLISHED);
        c.b(k.h());
        bqky h = bqkz.h();
        h.d(bZ.bK());
        c.c(h.a());
        bqjiVar.c(c.d(), this.y, bqlbVar);
    }

    private final dwgz m(List<dnet> list, int i) {
        ilo c = this.y.c();
        dbsk.s(c);
        dhjx ak = c.ak();
        akqq aj = c.aj();
        String o = c.ai().o();
        dngl bZ = dngm.d.bZ();
        dnip bZ2 = dniu.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniu dniuVar = (dniu) bZ2.b;
        o.getClass();
        dniuVar.a |= 1;
        dniuVar.b = o;
        if (ak != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dngm dngmVar = (dngm) bZ.b;
            ak.getClass();
            dngmVar.c = ak;
            dngmVar.a |= 4;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dniu dniuVar2 = (dniu) bZ2.b;
            ak.getClass();
            dniuVar2.e = ak;
            dniuVar2.a |= 16;
        }
        if (aj != null) {
            dnoh g = aj.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dngm dngmVar2 = (dngm) bZ.b;
            g.getClass();
            dngmVar2.b = g;
            dngmVar2.a |= 2;
        }
        dwgy bZ3 = dwgz.h.bZ();
        doaq bZ4 = doar.c.bZ();
        dniw bZ5 = dniz.f.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dniz dnizVar = (dniz) bZ5.b;
        dniu bK = bZ2.bK();
        bK.getClass();
        dnizVar.b = bK;
        dnizVar.a |= 1;
        bZ5.a(list);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        doar doarVar = (doar) bZ4.b;
        dniz bK2 = bZ5.bK();
        bK2.getClass();
        doarVar.b = bK2;
        doarVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwgz dwgzVar = (dwgz) bZ3.b;
        doar bK3 = bZ4.bK();
        bK3.getClass();
        dwgzVar.b = bK3;
        dwgzVar.a |= 1;
        dnps bZ6 = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.UGC_TASK_SETS;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ6.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnpy bZ7 = dnpz.d.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dnpz dnpzVar = (dnpz) bZ7.b;
        dnpzVar.a |= 1;
        dnpzVar.b = 10433;
        deaf deafVar = deaf.UNKNOWN_ACTION;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dnpz dnpzVar2 = (dnpz) bZ7.b;
        dnpzVar2.c = deafVar.Q;
        dnpzVar2.a |= 2;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqe dnqeVar2 = (dnqe) bZ6.b;
        dnpz bK4 = bZ7.bK();
        bK4.getClass();
        dnqeVar2.f = bK4;
        dnqeVar2.a |= 32;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqe dnqeVar3 = (dnqe) bZ6.b;
        dnqeVar3.c = 1;
        dnqeVar3.a |= 2;
        dnqe dnqeVar4 = (dnqe) bZ6.b;
        dnqeVar4.d = 1;
        int i2 = dnqeVar4.a | 4;
        dnqeVar4.a = i2;
        dnqeVar4.a = i2 | 64;
        dnqeVar4.g = i;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwgz dwgzVar2 = (dwgz) bZ3.b;
        dnqe bK5 = bZ6.bK();
        bK5.getClass();
        dwgzVar2.c = bK5;
        dwgzVar2.a |= 2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwgz dwgzVar3 = (dwgz) bZ3.b;
        dngm bK6 = bZ.bK();
        bK6.getClass();
        dwgzVar3.d = bK6;
        dwgzVar3.a |= 4;
        String str = this.e;
        if (!dbsj.d(str)) {
            dnqg bZ8 = dnqh.p.bZ();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ8.b;
            str.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = str;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwgz dwgzVar4 = (dwgz) bZ3.b;
            dnqh bK7 = bZ8.bK();
            bK7.getClass();
            dwgzVar4.g = bK7;
            dwgzVar4.a |= 64;
        }
        return bZ3.bK();
    }

    private final void n(cgwg cgwgVar) {
        this.b.m(new cjte(deaf.AUTOMATED), cgwgVar.S());
    }

    public final void a(final cgvv cgvvVar, final String str) {
        dcdc z = dcbg.b(cgvvVar.RB(dcdc.f(str))).o(cgrv.a).z();
        if (z.isEmpty()) {
            return;
        }
        dwgz m = m(z, 0);
        cgrn cgrnVar = this.B;
        cgrnVar.d = this;
        if (!cgrnVar.a.i()) {
            final cgsh cgshVar = cgrnVar.d;
            if (cgshVar != null) {
                final cjtd a = cjtd.a(dtyd.ag);
                cgshVar.j(new DialogInterface.OnClickListener(cgshVar, a, cgvvVar, str) { // from class: cgrt
                    private final cgsh a;
                    private final cjtd b;
                    private final cgvv c;
                    private final String d;

                    {
                        this.a = cgshVar;
                        this.b = a;
                        this.c = cgvvVar;
                        this.d = str;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cgsh cgshVar2 = this.a;
                        cjtd cjtdVar = this.b;
                        cgvv cgvvVar2 = this.c;
                        String str2 = this.d;
                        if (!cgshVar2.c.aD) {
                            return;
                        }
                        if (i == -1) {
                            cgshVar2.b.i(cjtdVar);
                            cgshVar2.a(cgvvVar2, str2);
                        } else if (i != -2) {
                        } else {
                            cgvvVar2.e(str2);
                        }
                    }
                }, new DialogInterface.OnCancelListener(cgvvVar, str) { // from class: cgru
                    private final cgvv a;
                    private final String b;

                    {
                        this.a = cgvvVar;
                        this.b = str;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.a.e(this.b);
                    }
                });
            }
        } else {
            cgre.m(cgrnVar.c, cgrnVar.e, m, cgrnVar.e());
        }
        n(cgvvVar);
    }

    public final void b(cgwg cgwgVar) {
        cgvm cgvmVar;
        dwpk b;
        n(cgwgVar);
        if (cgwgVar instanceof cgvv) {
            throw new UnsupportedOperationException("sendRequestFromImmediateSubmission(UgcTaskViewModel) method should not be used for sending Scalable Attributes. Use sendRequestForScalableAttribute(UgcScalableAttributesTaskViewModel, String) instead to send request per single attribute.");
        }
        if (cgwgVar instanceof cgvw) {
            cgvw cgvwVar = (cgvw) cgwgVar;
            dnet m = cgvwVar.m();
            dwgz m2 = m(m != null ? dcdc.f(m) : dcdc.e(), cgvwVar.o().intValue());
            cgrr cgrrVar = this.z;
            cgrrVar.d = this;
            if (!cgrrVar.a.i()) {
                c(cgvwVar);
            } else {
                cgre.m(cgrrVar.c, cgrrVar.e, m2, cgrrVar.e());
            }
        } else if (cgwgVar instanceof cgvp) {
            cgvp cgvpVar = (cgvp) cgwgVar;
            cgsb cgsbVar = new cgsb(this, cgvpVar);
            bbul bbulVar = this.t;
            btlu j = this.s.j();
            dbsk.s(j);
            String str = j.s().name;
            dwyd dwydVar = dwyd.UGC_TASK_SETS;
            ilo c = this.y.c();
            dbsk.s(c);
            bbulVar.c(str, dwydVar, bbvh.e(c).f(dgpu.LOCAL), cgvpVar.b(), cjqm.a, cgsbVar);
        } else if (cgwgVar instanceof cgvr) {
            cgvr cgvrVar = (cgvr) cgwgVar;
            l(cgvrVar, new cgsc(this, cgvrVar));
        } else if (cgwgVar instanceof cgva) {
            cgva cgvaVar = (cgva) cgwgVar;
            dosk k = k(cgvaVar);
            dwju bZ = dwjv.e.bZ();
            bZ.a(k);
            dnpr bZ2 = dnqf.c.bZ();
            dnps bZ3 = dnqe.i.bZ();
            dnqb dnqbVar = dnqb.UGC_TASK_SETS;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ3.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqf dnqfVar = (dnqf) bZ2.b;
            dnqe bK = bZ3.bK();
            bK.getClass();
            dnqfVar.b = bK;
            dnqfVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjv dwjvVar = (dwjv) bZ.b;
            dnqf bK2 = bZ2.bK();
            bK2.getClass();
            dwjvVar.c = bK2;
            dwjvVar.a |= 1;
            dwjv bK3 = bZ.bK();
            cgrl cgrlVar = this.C;
            cgrlVar.d = this;
            if (!cgrlVar.a.i()) {
                c(cgvaVar);
            } else {
                cgre.i(cgrlVar.c, cgrlVar.e, bK3);
            }
        } else if ((cgwgVar instanceof cgvm) && (b = (cgvmVar = (cgvm) cgwgVar).b()) != null) {
            djzl bZ4 = djzm.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djzm djzmVar = (djzm) bZ4.b;
            b.getClass();
            djzmVar.b = b;
            djzmVar.a |= 1;
            this.w.b(bZ4.bK(), new cgrz(this, cgvmVar), this.r.h());
        }
        cgwgVar.u(cgwf.POSTED);
    }

    public final void c(final cgwg cgwgVar) {
        j(new DialogInterface.OnClickListener(this, cgwgVar) { // from class: cgrw
            private final cgsh a;
            private final cgwg b;

            {
                this.a = this;
                this.b = cgwgVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cgsh cgshVar = this.a;
                cgwg cgwgVar2 = this.b;
                if (!cgshVar.c.aD) {
                    return;
                }
                if (i == -1) {
                    cgshVar.b.i(cgshVar.d);
                    cgshVar.b(cgwgVar2);
                } else if (i != -2) {
                } else {
                    cgwgVar2.B();
                    cgwgVar2.u(cgwf.EDITABLE);
                }
            }
        }, new DialogInterface.OnCancelListener(cgwgVar) { // from class: cgrx
            private final cgwg a;

            {
                this.a = cgwgVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                cgwg cgwgVar2 = this.a;
                cgwgVar2.B();
                cgwgVar2.u(cgwf.EDITABLE);
            }
        });
    }

    @Deprecated
    public final void d(boolean z) {
        dwjv bK;
        if (z) {
            ProgressDialog progressDialog = new ProgressDialog(this.q, 0);
            this.F = progressDialog;
            progressDialog.setMessage(this.q.getString(R.string.SENDING));
            this.F.show();
        }
        if (!this.f.isEmpty() && this.k.b()) {
            this.k = cgsf.SENT;
            cgrr cgrrVar = this.z;
            int i = 0;
            for (cgvw cgvwVar : this.g.values()) {
                i += cgvwVar.o().intValue();
            }
            cgrrVar.d(this, m(this.f, i));
            for (cgwg cgwgVar : this.g.values()) {
                n(cgwgVar);
            }
        }
        if (this.l.b()) {
            if (!this.h.isEmpty()) {
                this.l = cgsf.SENT;
                this.A.d(this, m(dcep.K(this.h).v(), 0));
                for (cgwg cgwgVar2 : this.i) {
                    n(cgwgVar2);
                }
            } else {
                for (cgvv cgvvVar : this.i) {
                    cgvvVar.u(cgwf.POSTED);
                }
                this.l = cgsf.COMPLETED;
                h();
            }
        }
        if (this.j.e(this.m).b()) {
            cgvp cgvpVar = (cgvp) this.j.f(this.m);
            if (cgvpVar == null || cgvpVar.b().isEmpty()) {
                this.j.d(this.m);
            } else {
                this.j.b(this.m, cgsf.SENT);
                bbul bbulVar = this.t;
                btlu j = this.s.j();
                dbsk.s(j);
                String str = j.s().name;
                dwyd dwydVar = dwyd.UGC_TASK_SETS;
                ilo c = this.y.c();
                dbsk.s(c);
                bbulVar.h(str, dwydVar, bbvh.e(c).f(dgpu.LOCAL), cgvpVar.b(), cjqm.a);
                this.j.c(this.m);
                h();
                n(cgvpVar);
            }
        }
        if (this.j.e(this.n).b()) {
            cgvr cgvrVar = (cgvr) this.j.f(this.n);
            if (cgvrVar == null || cgvrVar.d() == null) {
                this.j.d(this.n);
            } else {
                this.j.b(this.n, cgsf.SENT);
                l(cgvrVar, new cgsd(this));
                n(cgvrVar);
            }
        }
        if (this.j.e(this.o).b()) {
            cgwg cgwgVar3 = (cgva) this.j.f(this.o);
            if (cgwgVar3 != null) {
                this.j.b(this.o, cgsf.SENT);
                cgrl cgrlVar = this.C;
                cgrlVar.d = this;
                if (!cgrlVar.a.i()) {
                    i();
                    jmw.g(cgrlVar.b, R.string.AAP_TITLE, R.string.AAP_NOT_AVAILABLE_OFFLINE);
                } else {
                    cgrc cgrcVar = cgrlVar.c;
                    bvam bvamVar = cgrlVar.e;
                    cgva cgvaVar = (cgva) this.j.f(this.o);
                    if (cgvaVar == null) {
                        bK = dwjv.e;
                    } else {
                        dosk k = k(cgvaVar);
                        dwju bZ = dwjv.e.bZ();
                        bZ.a(k);
                        dnpr bZ2 = dnqf.c.bZ();
                        dnps bZ3 = dnqe.i.bZ();
                        dnqb dnqbVar = dnqb.UGC_TASK_SETS;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dnqe dnqeVar = (dnqe) bZ3.b;
                        dnqeVar.b = dnqbVar.ah;
                        dnqeVar.a |= 1;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dnqf dnqfVar = (dnqf) bZ2.b;
                        dnqe bK2 = bZ3.bK();
                        bK2.getClass();
                        dnqfVar.b = bK2;
                        dnqfVar.a |= 1;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwjv dwjvVar = (dwjv) bZ.b;
                        dnqf bK3 = bZ2.bK();
                        bK3.getClass();
                        dwjvVar.c = bK3;
                        dwjvVar.a |= 1;
                        bK = bZ.bK();
                    }
                    cgre.i(cgrcVar, bvamVar, bK);
                }
                n(cgwgVar3);
            } else {
                this.j.d(this.o);
            }
        }
        for (dwpc dwpcVar : this.p) {
            if (this.j.e(dwpcVar).b()) {
                cgvm cgvmVar = (cgvm) this.j.f(dwpcVar);
                if (cgvmVar != null) {
                    dwpk b = cgvmVar.b();
                    if (b != null) {
                        buke bukeVar = this.w;
                        djzl bZ4 = djzm.c.bZ();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        djzm djzmVar = (djzm) bZ4.b;
                        b.getClass();
                        djzmVar.b = b;
                        djzmVar.a |= 1;
                        bukeVar.b(bZ4.bK(), new cgsa(this, dwpcVar), this.r.h());
                        n(cgvmVar);
                    } else {
                        dwpcVar.d.J();
                        this.j.d(dwpcVar);
                    }
                } else {
                    dwpcVar.d.J();
                    this.j.d(dwpcVar);
                }
            }
        }
    }

    public final void h() {
        if (!this.j.a.containsValue(cgsf.SENT) && this.k != cgsf.SENT && this.l != cgsf.SENT) {
            i();
        }
        if (this.j.a.containsValue(cgsf.SERVER_ERROR) || this.k == cgsf.SERVER_ERROR || this.l == cgsf.SERVER_ERROR) {
            final cjtd a = cjtd.a(dtyd.ag);
            j(new DialogInterface.OnClickListener(this, a) { // from class: cgry
                private final cgsh a;
                private final cjtd b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cgsh cgshVar = this.a;
                    cjtd cjtdVar = this.b;
                    if (cgshVar.c.aD && i == -1) {
                        cgshVar.b.i(cjtdVar);
                        cgshVar.d(true);
                    }
                }
            }, null);
            this.x.g().d(a);
            return;
        }
        for (cgsf cgsfVar : this.j.a.values()) {
            if (cgsfVar != cgsf.COMPLETED) {
                return;
            }
        }
        if (!this.k.a() || !this.l.a()) {
            return;
        }
        int size = this.j.a.size();
        cgsg cgsgVar = this.j;
        cgsgVar.a.clear();
        cgsgVar.b.clear();
        this.p.clear();
        if (this.k == cgsf.COMPLETED) {
            size += this.g.size();
            this.f.clear();
            this.g.clear();
            this.k = cgsf.NOT_TRACKED;
        }
        if (this.l == cgsf.COMPLETED) {
            size += this.i.size();
            this.h.clear();
            this.i.clear();
            this.l = cgsf.NOT_TRACKED;
        }
        this.D.a(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        ProgressDialog progressDialog = this.F;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public final void j(DialogInterface.OnClickListener onClickListener, @dzsi DialogInterface.OnCancelListener onCancelListener) {
        ppw.b(this.q, onClickListener, onCancelListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(@dzsi dwjx dwjxVar) {
        int a;
        if (dwjxVar == null || (a = dosm.a(dwjxVar.b)) == 0 || a != 2) {
            this.j.b(this.o, cgsf.SERVER_ERROR);
        } else {
            this.j.c(this.o);
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(@dzsi dwhd dwhdVar) {
        int a;
        btlu j;
        if (this.E) {
            return;
        }
        if (dwhdVar == null || ((a = dwhc.a(dwhdVar.b)) != 0 && a == 3)) {
            this.k = cgsf.SERVER_ERROR;
        } else {
            int a2 = dwhc.a(dwhdVar.b);
            if (a2 != 0 && a2 == 2) {
                this.k = cgsf.COMPLETED;
                for (cgvw cgvwVar : this.g.values()) {
                    cgvwVar.u(cgwf.POSTED);
                    if (cgvwVar.o().intValue() > 0 && (j = this.s.j()) != null) {
                        String str = j.s().name;
                        String str2 = dwhdVar.e;
                        ily ilyVar = new ily();
                        ilyVar.k(str2);
                        ArrayList arrayList = new ArrayList(cgvwVar.o().intValue());
                        List<bbtm> p = cgvwVar.p();
                        if (p != null) {
                            for (bbtm bbtmVar : p) {
                                bbtj b = this.u.b(bbtmVar);
                                String q = cgvwVar.q();
                                if (q != null) {
                                    b.f(q);
                                }
                                if ((dwhdVar.a & 4) != 0) {
                                    b.h(dwhdVar.d);
                                }
                                arrayList.add(b);
                            }
                            this.t.h(str, dwyd.UGC_TASK_SETS, bbvh.e(ilyVar.d()).f(dgpu.LOCAL), arrayList, cjqm.a);
                        }
                    }
                }
            } else {
                int a3 = dwhc.a(dwhdVar.b);
                if (a3 != 0 && a3 == 4) {
                    this.k = cgsf.CLIENT_ERROR;
                    dnof dnofVar = dwhdVar.c;
                    if (dnofVar == null) {
                        dnofVar = dnof.b;
                    }
                    for (dneq dneqVar : dnofVar.a) {
                        cgvw cgvwVar2 = this.g.get(dqgh.b(dneqVar.a));
                        if (cgvwVar2 != null) {
                            cgvwVar2.n(dneqVar);
                        }
                    }
                }
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(@dzsi dwhd dwhdVar) {
        int a;
        if (this.E) {
            return;
        }
        if (dwhdVar == null || ((a = dwhc.a(dwhdVar.b)) != 0 && a == 3)) {
            this.l = cgsf.SERVER_ERROR;
        } else {
            int a2 = dwhc.a(dwhdVar.b);
            if (a2 != 0 && a2 == 2) {
                this.l = cgsf.COMPLETED;
                for (cgvv cgvvVar : this.i) {
                    cgvvVar.u(cgwf.POSTED);
                }
            } else {
                int a3 = dwhc.a(dwhdVar.b);
                if (a3 != 0 && a3 == 4) {
                    this.l = cgsf.CLIENT_ERROR;
                    dnof dnofVar = dwhdVar.c;
                    if (dnofVar == null) {
                        dnofVar = dnof.b;
                    }
                    for (dneq dneqVar : dnofVar.a) {
                        if (dqgh.b(dneqVar.a) == dqgh.SCALABLE_ATTRIBUTE) {
                            for (cgvv cgvvVar2 : this.i) {
                            }
                        }
                    }
                }
            }
        }
        h();
    }
}
