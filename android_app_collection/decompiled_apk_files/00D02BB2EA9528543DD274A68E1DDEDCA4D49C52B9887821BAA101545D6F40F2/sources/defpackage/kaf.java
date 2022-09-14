package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.io.PrintWriter;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: kaf  reason: default package */
/* loaded from: classes7.dex */
public final class kaf extends nor {
    @dzsi
    private ldm A;
    @dzsi
    private kxs B;
    private final ksu C;
    private final kae D;
    private final kcj E;
    private final kci F;
    @dzsi
    private hwb G;
    public final ldm a;
    public final not b;
    public final nop c;
    public final noo d;
    public final kdi e;
    @dzsi
    public final ksr f;
    final kck g;
    public final akfa h;
    public final crzm<Boolean> i;
    @dzsi
    public final nte j;
    public final kaj k;
    @dzsi
    public final btlu l;
    public final crzp<btlu> m;
    public final crzp<Boolean> n;
    private final ncm o;
    private final cjsz p;
    private final kxu q;
    private final hwe r;
    private final asmp s;
    private final btrm t;
    private final afwo u;
    private final bvrb v;
    private final dehq w;
    @dzsi
    private final nsq x;
    private final View y;
    private final cqkf<kcf> z;

    public kaf(crmw crmwVar, ldm ldmVar, ncm ncmVar, cqkj cqkjVar, bvsl bvslVar, @dzsi dowa dowaVar, not notVar, nop nopVar, noo nooVar, kdi kdiVar, @dzsi ksr ksrVar, cjqy cjqyVar, cjqq cjqqVar, kxu kxuVar, hwe hweVar, asmp asmpVar, btrm btrmVar, afwo afwoVar, bvrb bvrbVar, dehq dehqVar, akfa akfaVar, crzm<Boolean> crzmVar, kaj kajVar, kcl kclVar) {
        super(cjqyVar, cjqqVar);
        this.p = new cjsz(dtxm.b);
        this.m = new jzy(this);
        this.n = new jzz(this);
        this.C = new kab(this);
        this.D = new kae(this);
        kac kacVar = new kac(this);
        this.E = kacVar;
        kad kadVar = new kad(this);
        this.F = kadVar;
        crmwVar.g();
        this.a = ldmVar;
        this.o = ncmVar;
        this.b = notVar;
        this.c = nopVar;
        this.d = nooVar;
        this.e = kdiVar;
        this.f = ksrVar;
        this.t = btrmVar;
        this.u = afwoVar;
        this.v = bvrbVar;
        this.w = dehqVar;
        this.h = akfaVar;
        this.i = crzmVar;
        this.k = kajVar;
        Context context = cqkjVar.d;
        Resources resources = context.getResources();
        kcu a = kclVar.a.a();
        kcl.a(a, 1);
        kce a2 = kclVar.b.a();
        kcl.a(a2, 2);
        kcl.a(crmwVar, 3);
        kcl.a(ldmVar, 4);
        kcl.a(bvslVar, 6);
        kcl.a(resources, 7);
        kcl.a(kacVar, 8);
        kcl.a(kadVar, 9);
        kcl.a(context, 10);
        this.g = new kck(a, a2, crmwVar, ldmVar, dowaVar, bvslVar, resources, kacVar, kadVar, context);
        this.q = kxuVar;
        this.r = hweVar;
        this.s = asmpVar;
        l(context);
        cqkf<kcf> d = cqkjVar.d(new kbp(), notVar.a(), false);
        this.z = d;
        View c = d.c();
        this.y = c.findViewById(kbp.a);
        l(context);
        this.j = (nte) c.findViewById(kbp.b);
        l(context);
        this.x = (nsq) c.findViewById(kbp.c);
        this.l = akfaVar.j();
    }

    private static void l(Context context) {
        cqsz.d().a(context);
        cqrp.d(690.0d).a(context);
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("ArrivalOverlay:"));
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        nsq nsqVar;
        this.o.a(this.a, this.C, false);
        this.z.e(this.g);
        nte nteVar = this.j;
        if (nteVar != null && (nsqVar = this.x) != null) {
            nteVar.setPagedScrollBarView(nsqVar);
        }
        btrm btrmVar = this.t;
        kae kaeVar = this.D;
        dceq a = dcet.a();
        a.b(afwq.class, new kah(afwq.class, kaeVar, bvrj.UI_THREAD));
        btrmVar.g(kaeVar, a.a());
        k();
        View findViewById = d().findViewById(kbp.d);
        if (findViewById != null && this.j != null) {
            findViewById.setOnFocusChangeListener(new kaa(this));
        }
        this.h.C().d(this.m, this.w);
        this.i.d(this.n, this.w);
    }

    @Override // defpackage.non
    public final noq b() {
        akqq o = this.a.o();
        if (o != null && !Objects.equals(this.r.f(), o)) {
            ldm ldmVar = this.A;
            ldm ldmVar2 = this.a;
            boolean z = ldmVar != ldmVar2;
            this.A = ldmVar2;
            this.G = this.r.i(akpp.o(o), z);
            this.s.p(dcdc.f(akra.f(o)), false, false, 1, true);
            View view = this.y;
            kxn k = kxo.k();
            k.k();
            kxs kxsVar = new kxs(view, k, this.q);
            this.B = kxsVar;
            kxsVar.a();
        }
        s(this.p);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.z.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        kxs kxsVar = this.B;
        if (kxsVar != null) {
            kxsVar.b();
            this.B = null;
        }
        this.s.q();
        hwb hwbVar = this.G;
        if (hwbVar != null) {
            this.r.j(hwbVar);
            this.G = null;
        }
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.t.a(this.D);
        this.z.h();
        this.v.b(new Runnable(this) { // from class: jzx
            private final kaf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kaf kafVar = this.a;
                kafVar.h.C().c(kafVar.m);
                kafVar.i.c(kafVar.n);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.non
    public final String g() {
        return "ArrivalOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.b.b(noeVar, d());
    }

    public final void k() {
        boolean d = this.u.d(afwm.SATELLITE);
        nsq nsqVar = this.x;
        if (nsqVar != null) {
            nsqVar.setForceNightMode(d);
        }
        this.g.l(d);
        this.z.e(this.g);
    }
}
