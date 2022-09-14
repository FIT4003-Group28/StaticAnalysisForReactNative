package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nhf  reason: default package */
/* loaded from: classes7.dex */
public final class nhf extends nor {
    private final astg A;
    private final kxs B;
    @dzsi
    private nte C;
    @dzsi
    private nsq D;
    private final lze E;
    private final jtp F;
    private final nhe G;
    public final Context a;
    public final bvsl b;
    public final noo c;
    public final lzf d;
    public final mor e;
    public final crzp<Boolean> f;
    public final nkv g;
    public boolean h;
    final ksu i;
    private final not j;
    private final ksr k;
    private final dcdc<ldm> l;
    private final amte m;
    private final ncf n;
    private final vzg o;
    private final boolean p;
    private final bvjj q;
    private final asmp r;
    private final Executor s;
    private final kdg t;
    private final cjsz u;
    private final cjsz v;
    private final cjsz w;
    private final cjsz x;
    private final mog y;
    private final cqkf<nkv> z;

    public nhf(Context context, bvsl bvslVar, bvjj bvjjVar, cqat cqatVar, noo nooVar, jzp jzpVar, not notVar, cqkj cqkjVar, kxu kxuVar, qbo qboVar, ksr ksrVar, lzf lzfVar, ahjq ahjqVar, dcdc dcdcVar, amte amteVar, cjqy cjqyVar, cjqq cjqqVar, boolean z, jtp jtpVar, jzv jzvVar, dxio dxioVar, asmp asmpVar, noj nojVar, Executor executor, kdg kdgVar) {
        super(cjqyVar, cjqqVar);
        cqtd I;
        int i;
        cqiw nkuVar;
        cqiw nkfVar;
        this.u = new cjsz(dtxm.em);
        this.v = new cjsz(dtxm.ep);
        this.w = new cjsz(dtxm.bw);
        this.x = new cjsz(dtxm.bx);
        ngz ngzVar = new ngz(this);
        this.y = ngzVar;
        this.f = new nha(this);
        nhc nhcVar = new nhc();
        this.i = nhcVar;
        nhd nhdVar = new nhd(this);
        this.E = nhdVar;
        this.G = new nhe(this);
        this.a = context;
        this.b = bvslVar;
        this.c = nooVar;
        this.q = bvjjVar;
        this.j = notVar;
        this.k = ksrVar;
        this.d = lzfVar;
        dbsk.l(dcdcVar.size() >= 2);
        this.l = dcdcVar;
        amte a = yyt.a(amteVar);
        this.m = a;
        this.p = z;
        this.F = jtpVar;
        this.r = asmpVar;
        this.s = executor;
        this.t = kdgVar;
        ncf ncfVar = new ncf(context, (ldm) dcdcVar.get(1));
        this.n = ncfVar;
        dcdc subList = dcdcVar.subList(1, dcdcVar.size());
        lzc lzcVar = new lzc(lzb.STOP_OVER_OVERLAY);
        kdk kdkVar = kdk.NOTHING;
        if (nojVar.a() == noi.DEFAULT) {
            I = nqu.I();
        } else {
            I = nqu.H();
        }
        mor morVar = new mor(qboVar, lzfVar, ksrVar, subList, lzcVar, ncfVar, nhdVar, nhcVar, ngzVar, kdkVar, true, I, R.string.CONTINUE_NAVIGATION_SHORT, null, false, new mof());
        this.e = morVar;
        this.o = new vzg(context, cqatVar, jzvVar, dxioVar);
        if (z) {
            if (nojVar.a() == noi.DEFAULT) {
                nkfVar = new nkf();
            } else {
                nkfVar = new njn();
            }
            i = 0;
            this.z = cqkjVar.d(nkfVar, notVar.a(), false);
        } else {
            i = 0;
            if (k(context, nojVar)) {
                nkuVar = new njn();
            } else {
                nkuVar = new nku();
            }
            cqkf<nkv> d = cqkjVar.d(nkuVar, notVar.a(), false);
            this.z = d;
            if (k(context, nojVar)) {
                this.C = (nte) d.c().findViewById(njn.a);
                this.D = (nsq) d.c().findViewById(njn.b);
            }
        }
        this.g = new nkw(context, jzpVar, morVar, (ldm) dcdcVar.get(i), (ldm) dcdcVar.get(1), z, nojVar, lzfVar);
        ksrVar.f((ldm) dcdcVar.get(1), ahjqVar.a(), a);
        amuh k = ncfVar.k();
        dbsk.s(k);
        astf f = astg.f();
        f.e(k);
        f.d(alfa.SHOW_NONE);
        this.A = f.a();
        View c = this.z.c();
        kxn k2 = kxo.k();
        k2.k();
        this.B = new kxs(c, k2, kxuVar);
    }

    private static boolean k(Context context, noj nojVar) {
        cqsz.d().a(context);
        cqrp.d(445.0d).a(context);
        return nojVar.a() != noi.DEFAULT;
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("StopOverOverlay:"));
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        nsq nsqVar;
        this.k.a();
        this.e.l();
        this.F.a.aa.add(this.G);
        this.z.e(this.g);
        nte nteVar = this.C;
        if (nteVar == null || (nsqVar = this.D) == null) {
            return;
        }
        nteVar.setPagedScrollBarView(nsqVar);
        this.D.setOnVisibilityChangeListener(new nsp(this) { // from class: ngx
            private final nhf a;

            {
                this.a = this;
            }

            @Override // defpackage.nsp
            public final void a(int i) {
                nhf nhfVar = this.a;
                nhfVar.g.u(i == 0);
                cqkx.p(nhfVar.g);
            }
        });
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.B.a();
        this.r.D(this.A);
        akqq o = this.l.get(0).o();
        if (o != null) {
            this.r.p(dcdc.f(akra.f(o)), false, false, 1, true);
        }
        this.h = false;
        this.d.k().d(this.f, this.s);
        vzg vzgVar = this.o;
        amte amteVar = this.m;
        int i = this.n.c;
        String z = vyb.z(this.a.getResources(), this.l.get(1).n(this.n.c));
        String str = this.l.get(1).b;
        String str2 = true != z.isEmpty() ? "  •  " : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + str2.length() + String.valueOf(z).length());
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        vzgVar.b(amteVar, i, sb.toString());
        if (!this.t.o()) {
            s(this.p ? this.v : this.u);
        } else {
            s(this.p ? this.x : this.w);
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.z.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        if (!this.h) {
            this.o.a();
            this.s.execute(new Runnable(this) { // from class: ngy
                private final nhf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nhf nhfVar = this.a;
                    nhfVar.d.k().c(nhfVar.f);
                }
            });
            this.q.Z(bvjk.eg, Math.max(this.q.w(bvjk.eg, 0L), this.m.g));
        }
        this.r.q();
        this.r.D(null);
        this.B.b();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.z.e(null);
        jtp jtpVar = this.F;
        jtpVar.a.aa.remove(this.G);
        this.k.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "StopOverOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.j.b(noeVar, this.z.c());
    }
}
