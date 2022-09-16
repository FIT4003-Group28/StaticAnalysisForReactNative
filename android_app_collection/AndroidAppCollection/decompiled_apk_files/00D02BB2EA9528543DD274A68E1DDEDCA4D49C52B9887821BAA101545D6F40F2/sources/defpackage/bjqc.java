package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjqc  reason: default package */
/* loaded from: classes3.dex */
public class bjqc implements bjpx, crzp {
    private final bjln b;
    private final gga c;
    private final Resources d;
    private final bjnh e;
    private final bjph f;
    private final cchz g;
    private final dxio<cqhu> h;
    private cqix<bjpf> i;
    @dzsi
    private bjoo j;
    @dzsi
    private String n;
    private boolean o;
    public String a = "";
    private dcdc<cqix<?>> k = dcdc.e();
    private dcdc<jho> l = dcdc.e();
    private String m = "";
    private boolean p = false;
    private boolean q = false;

    public bjqc(bjln bjlnVar, crzm<bjml> crzmVar, gga ggaVar, Resources resources, dxio<cqhu> dxioVar, bjph bjphVar, bjnh bjnhVar, cchz cchzVar, Executor executor) {
        this.b = bjlnVar;
        this.c = ggaVar;
        this.d = resources;
        this.h = dxioVar;
        this.f = bjphVar;
        this.e = bjnhVar;
        this.g = cchzVar;
        crzmVar.d(this, executor);
    }

    public static CharSequence q(Context context) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(context.getResources().getString(R.string.ugc_disclosure_posting_publicly));
        valueOf.append((CharSequence) " ");
        Drawable a = cqrt.g(2131232726, ibm.n()).a(context);
        int a2 = jmj.a(context, 18);
        a.setBounds(0, 0, a2, a2);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(" ");
        valueOf2.setSpan(new ImageSpan(a), 0, 1, 33);
        valueOf.append((CharSequence) valueOf2);
        return valueOf;
    }

    @Override // defpackage.crzp
    public void On(crzm<bjml> crzmVar) {
        cqix fT;
        bjml l = crzmVar.l();
        dbsk.s(l);
        ilo a = l.a();
        boolean d = l.d();
        this.p = d;
        if (!d) {
            cqkx.p(this);
        }
        bjpe bjpeVar = new bjpe();
        bjph bjphVar = this.f;
        bjfw bjfwVar = l.b().b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        bjln bjlnVar = this.b;
        bjph.a(bjfwVar, 1);
        bjph.a(a, 2);
        bjph.a(bjlnVar, 3);
        Resources a2 = bjphVar.a.a();
        bjph.a(a2, 4);
        this.i = cqgr.fT(bjpeVar, new bjpg(bjfwVar, a, bjlnVar, a2));
        dccx F = dcdc.F();
        for (bjfo bjfoVar : l.b().c) {
            if (bjfoVar.j) {
                bjnn bjnnVar = new bjnn();
                bjln bjlnVar2 = this.b;
                bjnr.a(bjfoVar, 1);
                bjnr.a(bjlnVar2, 2);
                fT = cqgr.fT(bjnnVar, new bjnq(bjfoVar, bjlnVar2));
            } else {
                bjnd bjndVar = new bjnd();
                bjnh bjnhVar = this.e;
                bjln bjlnVar3 = this.b;
                bjnh.a(bjfoVar, 1);
                bjnh.a(a, 2);
                bjnh.a(bjlnVar3, 3);
                Resources a3 = bjnhVar.a.a();
                bjnh.a(a3, 4);
                fT = cqgr.fT(bjndVar, new bjng(bjfoVar, a, bjlnVar3, a3));
            }
            F.g(fT);
        }
        this.k = F.f();
        if (l.e().d) {
            bjln bjlnVar4 = this.b;
            bjoq.a(a, 1);
            bjoq.a(bjlnVar4, 2);
            this.j = new bjop(a, bjlnVar4);
        } else {
            this.j = null;
        }
        this.m = this.d.getString(R.string.PLACE_QA_QUESTION_PAGE_TITLE, a.n());
        final bjfw bjfwVar2 = l.b().b;
        if (bjfwVar2 == null) {
            bjfwVar2 = bjfw.l;
        }
        final bjln bjlnVar5 = this.b;
        cjta c = cjtd.c(a.bZ());
        dccx F2 = dcdc.F();
        bjfq bjfqVar = bjfwVar2.c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        if (bjfqVar.c) {
            jhm b = jhm.b(R.string.PLACE_QA_EDIT_QUESTION);
            b.d(new View.OnClickListener(bjlnVar5, bjfwVar2) { // from class: bjpz
                private final bjln a;
                private final bjfw b;

                {
                    this.a = bjlnVar5;
                    this.b = bjfwVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bjln bjlnVar6 = this.a;
                    bjfw bjfwVar3 = this.b;
                    bjmi bjmiVar = (bjmi) bjlnVar6;
                    bwqv bwqvVar = bjmiVar.c;
                    bwrs a4 = bwrs.a(bjmiVar.p);
                    String str = bjfwVar3.d;
                    Bundle bundle = new Bundle();
                    bundle.putString("key_preset_text", str);
                    bwqvVar.c(bundle, "key_placemark_ref", a4);
                    bjle bjleVar = new bjle();
                    bjleVar.B(bundle);
                    bjmiVar.g.aZ(bjleVar);
                }
            });
            b.f = c.b(dtxy.gv);
            F2.g(b.c());
            jhm b2 = jhm.b(R.string.PLACE_QA_DELETE_QUESTION);
            b2.d(new View.OnClickListener(bjlnVar5, bjfwVar2) { // from class: bjqa
                private final bjln a;
                private final bjfw b;

                {
                    this.a = bjlnVar5;
                    this.b = bjfwVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bjln bjlnVar6 = this.a;
                    bjfw bjfwVar3 = this.b;
                    cjkp B = cjkr.B();
                    B.t("Delete your question?");
                    bjmi bjmiVar = (bjmi) bjlnVar6;
                    B.z(bjmiVar.e.getString(R.string.DELETE_BUTTON), new View.OnClickListener(bjmiVar, bjfwVar3) { // from class: bjlt
                        private final bjmi a;
                        private final bjfw b;

                        {
                            this.a = bjmiVar;
                            this.b = bjfwVar3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.a.l(this.b);
                        }
                    }, null);
                    B.y(bjmiVar.e.getString(R.string.CANCEL_BUTTON), bjlu.a, null);
                    B.u(bjmiVar.f).q().show();
                }
            });
            b2.f = c.b(dtxy.gu);
            F2.g(b2.c());
        } else {
            jhm b3 = jhm.b(R.string.PLACE_QA_REPORT_QUESTION);
            b3.d(new View.OnClickListener(bjlnVar5, bjfwVar2) { // from class: bjqb
                private final bjln a;
                private final bjfw b;

                {
                    this.a = bjlnVar5;
                    this.b = bjfwVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bjln bjlnVar6 = this.a;
                    bjfw bjfwVar3 = this.b;
                    if (!bjfwVar3.g.isEmpty()) {
                        bjgy a4 = ((bjmi) bjlnVar6).k.a();
                        bjfu bjfuVar = bjfwVar3.b;
                        if (bjfuVar == null) {
                            bjfuVar = bjfu.c;
                        }
                        a4.a(1, bjfuVar.b, bjfwVar3.g);
                    } else if (bjfwVar3.h.isEmpty()) {
                    } else {
                        bjmi bjmiVar = (bjmi) bjlnVar6;
                        Context H = bjmiVar.g.H();
                        ahr ahrVar = new ahr();
                        ahrVar.d();
                        bjmiVar.j.a().q(H, ahrVar, bjfwVar3.h, 4);
                    }
                }
            });
            b3.f = c.b(dtxy.gx);
            F2.g(b3.c());
        }
        this.l = F2.f();
        this.o = l.c().l();
        bjfw bjfwVar3 = l.b().b;
        if (bjfwVar3 == null) {
            bjfwVar3 = bjfw.l;
        }
        this.q = bjfwVar3.i;
        if (!l.c().l() || !a.bf().r) {
            if (l.c().l()) {
                this.n = this.g.c(l.c());
            } else {
                this.n = null;
            }
        } else {
            this.n = a.cP();
        }
        cqkx.p(this);
    }

    @Override // defpackage.bjpx
    @dzsi
    public cqix<bjpf> b() {
        return this.i;
    }

    @Override // defpackage.bjpx
    @dzsi
    public bjoo c() {
        return this.j;
    }

    @Override // defpackage.bjpx
    public List<cqix<?>> d() {
        return this.k;
    }

    @Override // defpackage.bjpx
    public jic e() {
        return new jic(this.n, ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.bjpx
    public List<jho> f() {
        return this.l;
    }

    @Override // defpackage.bjpx
    public CharSequence g() {
        return this.m;
    }

    @Override // defpackage.bjpx
    public CharSequence h() {
        return q(this.c.getApplicationContext());
    }

    @Override // defpackage.bjpx
    public cqkl i() {
        View view;
        View o = cqkx.o(this);
        if (o != null) {
            this.h.a();
            view = cqhu.a(o, bjpw.a);
        } else {
            view = null;
        }
        if (view != null) {
            ((bjmi) this.b).i.b.b(view, true);
        }
        return cqkl.a;
    }

    @Override // defpackage.bjpx
    public cqkl j() {
        this.b.f();
        return cqkl.a;
    }

    @Override // defpackage.bjpx
    public String k() {
        return "";
    }

    @Override // defpackage.bjpx
    public boolean l() {
        return this.o;
    }

    @Override // defpackage.bjpx
    public cqgl m() {
        return new cqgl(this) { // from class: bjpy
            private final bjqc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.a = charSequence.toString();
            }
        };
    }

    @Override // defpackage.bjpx
    public cqkl n() {
        bjln bjlnVar = this.b;
        String str = this.a;
        bjmi bjmiVar = (bjmi) bjlnVar;
        if (!bjmiVar.r.a()) {
            if (!bjmiVar.p()) {
                bjmiVar.m();
            } else {
                bjll bjllVar = bjmiVar.i;
                caxn caxnVar = bjllVar.c;
                caxa caxaVar = bjll.a;
                dzvx.c(caxaVar, "contributionType");
                if (caxnVar.a(caxaVar)) {
                    dizy q = bjmiVar.q();
                    if (q.c) {
                        q.bF();
                        q.c = false;
                    }
                    djaa djaaVar = (djaa) q.b;
                    djaa djaaVar2 = djaa.l;
                    str.getClass();
                    djaaVar.a |= 32;
                    djaaVar.g = str;
                    bjfw bjfwVar = bjmiVar.o.b;
                    if (bjfwVar == null) {
                        bjfwVar = bjfw.l;
                    }
                    boolean z = bjfwVar.i;
                    if (!z && !bjmiVar.s.a) {
                        djgw a = chiw.a();
                        if (q.c) {
                            q.bF();
                            q.c = false;
                        }
                        djaa djaaVar3 = (djaa) q.b;
                        a.getClass();
                        djaaVar3.j = a;
                        djaaVar3.a |= 512;
                    }
                    bjmiVar.r = dbsg.i(bjmiVar.a.c(q.bK()));
                    deha.q(bjmiVar.r.b(), new bjlx(bjmiVar, z), bjmiVar.d);
                } else {
                    bjllVar.b.c(true);
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bjpx
    public boolean o() {
        return this.p;
    }

    @Override // defpackage.bjpx
    public boolean p() {
        return this.q;
    }
}
