package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmyn  reason: default package */
/* loaded from: classes3.dex */
public class bmyn extends bmys {
    public final brba a;
    public final betx b;
    public final bect c;
    private final dxio<abfa> d;
    private final bmzc e;
    private final boolean k;

    public bmyn(boolean z, cqhn cqhnVar, gga ggaVar, brba brbaVar, bhtr bhtrVar, dzsj<bmyp> dzsjVar, bmzc bmzcVar, btvo btvoVar, betx betxVar, bect bectVar, dxio<abfa> dxioVar, bmza bmzaVar, bhat bhatVar) {
        super(ggaVar, btvoVar, bhtrVar, dzsjVar, bmzaVar, bhatVar);
        this.d = dxioVar;
        this.a = brbaVar;
        this.e = bmzcVar;
        this.k = z;
        this.b = betxVar;
        this.c = bectVar;
    }

    @Override // defpackage.bmys, defpackage.jbk
    public /* bridge */ /* synthetic */ jib NC() {
        return super.NC();
    }

    @Override // defpackage.bmys
    public final void b(jhz jhzVar, Context context, @dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        if (!this.k) {
            jhm jhmVar = new jhm();
            jhmVar.a = context.getString(R.string.SEARCH);
            jhmVar.c = cqrt.f(2131231736);
            jhmVar.h = 2;
            jhmVar.b = context.getString(R.string.SEARCH);
            jhmVar.f = cjtd.a(dtxy.mj);
            jhmVar.d(new View.OnClickListener(this) { // from class: bmyi
                private final bmyn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a.e("");
                }
            });
            jhzVar.c(jhmVar.c());
        }
        this.i.d(jhzVar);
        jho a = this.e.a(bwrsVar);
        if (a != null) {
            jhzVar.c(a);
        }
        if (iloVar.aS()) {
            jhm jhmVar2 = new jhm();
            jhmVar2.a = context.getString(R.string.OFFLINE_CACHE_START_SELECTION_BUTTON_IN_MENU);
            jhmVar2.d(new View.OnClickListener(this) { // from class: bmyj
                private final bmyn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.g.b();
                }
            });
            jhzVar.c(jhmVar2.c());
        }
        this.i.e(jhzVar);
        bmyp bmypVar = this.h;
        if (bmypVar != null && bmypVar.b()) {
            jhm jhmVar3 = new jhm();
            jhmVar3.a = this.h.m();
            jhmVar3.g = new jhn(this) { // from class: bmyk
                private final bmyn a;

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
                jhmVar3.n = false;
            }
            jhzVar.c(jhmVar3.c());
        }
        if (!iloVar.aW() || !this.d.a().a()) {
            return;
        }
        betx betxVar = this.b;
        dbsk.s(bwrsVar);
        betxVar.t(bwrsVar);
        jhm jhmVar4 = new jhm();
        jhmVar4.a = this.b.m();
        jhmVar4.g = new jhn(this) { // from class: bmyl
            private final bmyn a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.b.f(cjqmVar);
            }
        };
        jhzVar.c(jhmVar4.c());
        bect bectVar = this.c;
        dbsk.s(bwrsVar);
        bectVar.t(bwrsVar);
        jhm jhmVar5 = new jhm();
        jhmVar5.a = this.c.m();
        jhmVar5.g = new jhn(this) { // from class: bmym
            private final bmyn a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.c.f(cjqmVar);
            }
        };
        jhzVar.c(jhmVar5.c());
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
