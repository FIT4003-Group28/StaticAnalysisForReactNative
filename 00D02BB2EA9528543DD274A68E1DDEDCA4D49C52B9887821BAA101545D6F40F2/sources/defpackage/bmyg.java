package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmyg  reason: default package */
/* loaded from: classes3.dex */
public class bmyg extends bmys {
    public final cjqy a;
    public final aesb b;
    public final brba c;
    public final bwft d;
    public final cklf e;
    private final bmzc k;
    private final boolean l;
    private final bhat m;

    public bmyg(boolean z, cqhn cqhnVar, gga ggaVar, cjqy cjqyVar, btvo btvoVar, aesb aesbVar, brba brbaVar, bwft bwftVar, bhtr bhtrVar, dzsj<bmyp> dzsjVar, bmzc bmzcVar, bmza bmzaVar, bhat bhatVar, cklf cklfVar) {
        super(ggaVar, btvoVar, bhtrVar, dzsjVar, bmzaVar, bhatVar);
        this.a = cjqyVar;
        this.b = aesbVar;
        this.c = brbaVar;
        this.d = bwftVar;
        this.k = bmzcVar;
        this.l = z;
        this.m = bhatVar;
        this.e = cklfVar;
        n();
        j();
    }

    private static boolean o(@dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        return iloVar != null && iloVar.j();
    }

    @Override // defpackage.bmys, defpackage.jbk
    public /* bridge */ /* synthetic */ jib NC() {
        return super.NC();
    }

    @Override // defpackage.bmys
    public final void b(jhz jhzVar, Context context, @dzsi final bwrs<ilo> bwrsVar) {
        bmyp bmypVar;
        String string;
        if (!this.l) {
            jhm jhmVar = new jhm();
            jhmVar.a = context.getString(R.string.SEARCH);
            jhmVar.c = cqrt.f(2131231736);
            jhmVar.h = 2;
            jhmVar.b = context.getString(R.string.SEARCH);
            jhmVar.f = cjtd.a(dtxy.mj);
            jhmVar.d(new View.OnClickListener(this) { // from class: bmyb
                private final bmyg a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c.e("");
                }
            });
            jhzVar.c(jhmVar.c());
        }
        if (!o(bwrsVar)) {
            this.i.d(jhzVar);
            final bmza bmzaVar = this.i;
            final ilo iloVar = (ilo) bwrs.b(bmzaVar.s);
            if (iloVar != null && iloVar.aY()) {
                jhm jhmVar2 = new jhm();
                if (iloVar.bf() == null || !iloVar.bf().r) {
                    string = bmzaVar.a.getString(R.string.PLACE_SUGGEST_AN_EDIT);
                } else {
                    string = bmzaVar.a.getString(R.string.PLACE_SUGGEST_AN_EDIT_MERCHANT_LABEL);
                }
                jhmVar2.a = string;
                jhmVar2.f = cjtd.a(dtxy.jV);
                jhmVar2.d(new View.OnClickListener(bmzaVar, iloVar) { // from class: bmyw
                    private final bmza a;
                    private final ilo b;

                    {
                        this.a = bmzaVar;
                        this.b = iloVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bmza bmzaVar2 = this.a;
                        bmzaVar2.m.D(this.b, 8, dtxy.lK);
                        dnps bZ = dnqe.i.bZ();
                        dnqb dnqbVar = dnqb.OVERFLOW_MENU;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqe dnqeVar = (dnqe) bZ.b;
                        dnqeVar.b = dnqbVar.ah;
                        dnqeVar.a |= 1;
                        dnqe dnqeVar2 = (dnqe) bZ.b;
                        dnqeVar2.c = 1;
                        dnqeVar2.a |= 2;
                        boxa boxaVar = bmzaVar2.n;
                        bwrs<ilo> bwrsVar2 = bmzaVar2.s;
                        dbsk.s(bwrsVar2);
                        boxaVar.B(bwrsVar2, bZ.bK(), null);
                    }
                });
                jhzVar.c(jhmVar2.c());
            }
        }
        ilo iloVar2 = (ilo) bwrs.b(this.i.s);
        jhm jhmVar3 = new jhm();
        jhmVar3.a = context.getString(R.string.SHARE_PLACE_LABEL);
        jhmVar3.d(new View.OnClickListener(this, bwrsVar) { // from class: bmyc
            private final bmyg a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bmyg bmygVar = this.a;
                bwrs<ilo> bwrsVar2 = this.b;
                ilo iloVar3 = (ilo) bwrs.b(bwrsVar2);
                if (iloVar3 != null) {
                    cjta c = cjtd.c(iloVar3.a());
                    c.d = dtxy.mq;
                    String bK = iloVar3.bK();
                    if (bK != null) {
                        ddji bZ = ddjj.c.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ddjj ddjjVar = (ddjj) bZ.b;
                        bK.getClass();
                        ddjjVar.a |= 1;
                        ddjjVar.b = bK;
                        c.k(bZ.bK());
                    }
                    bmygVar.a.i(c.a());
                    bmygVar.b.D(iloVar3, 8, dtxy.mq);
                    bmygVar.d.a(bwrsVar2, dtxy.mq);
                }
            }
        });
        jhzVar.c(jhmVar3.c());
        jho a = this.k.a(bwrsVar);
        if (a != null) {
            jhzVar.c(a);
        }
        ilo iloVar3 = (ilo) bwrs.b(bwrsVar);
        if (iloVar3 != null && iloVar3.aS() && !o(bwrsVar)) {
            jhm jhmVar4 = new jhm();
            jhmVar4.a = context.getString(R.string.OFFLINE_CACHE_START_SELECTION_BUTTON_IN_MENU);
            jhmVar4.d(new View.OnClickListener(this) { // from class: bmyd
                private final bmyg a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.g.b();
                }
            });
            jhzVar.c(jhmVar4.c());
        }
        this.i.e(jhzVar);
        if (bwrs.b(bwrsVar) != null && (bmypVar = this.h) != null && bmypVar.b()) {
            jhm jhmVar5 = new jhm();
            jhmVar5.a = this.h.m();
            jhmVar5.g = new jhn(this) { // from class: bmye
                private final bmyg a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhn
                public final void a(View view, cjqm cjqmVar) {
                    bmyp bmypVar2 = this.a.h;
                    if (bmypVar2 != null) {
                        bmypVar2.f(cjqmVar);
                    }
                }
            };
            if (!this.h.c()) {
                jhmVar5.n = false;
            }
            jhzVar.c(jhmVar5.c());
        }
        if (iloVar3 == null || !bhat.f(iloVar3) || !this.m.a()) {
            return;
        }
        jhm a2 = jhm.a();
        a2.a = context.getString(R.string.MERCHANT_PANEL_HELP_LABEL);
        cjta c = cjtd.c(iloVar3.bZ());
        c.d = dtxv.bn;
        a2.f = c.a();
        a2.g = new jhn(this) { // from class: bmyf
            private final bmyg a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.e.b("android_toplevel", "com.google.android.apps.vega");
            }
        };
        jhzVar.c(a2.c());
    }

    public /* bridge */ /* synthetic */ void c() {
    }

    @Override // defpackage.bmys
    public /* bridge */ /* synthetic */ void d(bmlh bmlhVar) {
        super.d(bmlhVar);
    }

    public /* bridge */ /* synthetic */ void e(boolean z) {
    }

    @Override // defpackage.bmys
    public /* bridge */ /* synthetic */ void f(bmoe bmoeVar) {
        super.f(bmoeVar);
    }

    @Override // defpackage.bmys
    public /* bridge */ /* synthetic */ void g(jjn jjnVar) {
        super.g(jjnVar);
    }

    @Override // defpackage.bmys
    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // defpackage.bmys
    public /* bridge */ /* synthetic */ void i(bwrs bwrsVar, boolean z) {
        super.i(bwrsVar, z);
    }

    @Override // defpackage.bmys, defpackage.bega
    public /* bridge */ /* synthetic */ void t(bwrs bwrsVar) {
        super.t(bwrsVar);
    }

    @Override // defpackage.bmys, defpackage.bega
    public /* bridge */ /* synthetic */ void u() {
        super.u();
    }

    @Override // defpackage.bmys, defpackage.bega
    public /* bridge */ /* synthetic */ Boolean w() {
        return super.w();
    }
}
