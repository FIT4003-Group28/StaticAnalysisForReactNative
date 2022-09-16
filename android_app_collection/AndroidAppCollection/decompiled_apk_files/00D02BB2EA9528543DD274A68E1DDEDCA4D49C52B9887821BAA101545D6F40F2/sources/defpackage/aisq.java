package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aisq  reason: default package */
/* loaded from: classes2.dex */
public final class aisq implements aisg {
    public final aisp a;
    public final Context b;
    public dbsg<aink> c;
    private final cqhn d;
    private final ajsc e;
    private final bvsl f;
    private final cqat g;
    private final jhn h;
    private final jhn i;
    private boolean j;
    private jib k;
    private boolean l;
    private boolean m;
    @dzsi
    private akqq n;
    private dkog o;
    @dzsi
    private ajcd p;
    @dzsi
    private aitm q;

    public aisq(Context context, aisp aispVar, boolean z, dbsg<aink> dbsgVar, cqhn cqhnVar, dbsg<aion> dbsgVar2, cqat cqatVar, ajsc ajscVar, Resources resources, dkog dkogVar, @dzsi akqq akqqVar, bvsl bvslVar, final aisp aispVar2, boolean z2, boolean z3) {
        if (dbsgVar.a() && !dbsgVar.b().v()) {
            this.q = new aitm(dbsgVar.b(), cqatVar, cqhnVar, ajscVar, resources, dkogVar, akqqVar, bvslVar);
        }
        this.d = cqhnVar;
        this.f = bvslVar;
        this.e = ajscVar;
        this.n = akqqVar;
        this.o = dkogVar;
        this.j = z;
        jhn jhnVar = new jhn(aispVar2) { // from class: aisi
            private final aisp a;

            {
                this.a = aispVar2;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                ((airr) this.a).c.a().l();
            }
        };
        this.h = jhnVar;
        jhn jhnVar2 = new jhn(aispVar2) { // from class: aisj
            private final aisp a;

            {
                this.a = aispVar2;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                ((airr) this.a).c.a().q();
            }
        };
        this.i = jhnVar2;
        this.k = j(aispVar, z, false, context, dbsgVar, z2, dkogVar, jhnVar, jhnVar2);
        this.c = dbsgVar;
        this.b = context;
        this.a = aispVar;
        this.l = false;
        this.m = z2;
        this.g = cqatVar;
        this.p = l(dbsgVar2, aispVar);
    }

    static jib j(final aisp aispVar, boolean z, boolean z2, Context context, final dbsg<aink> dbsgVar, boolean z3, dkog dkogVar, jhn jhnVar, jhn jhnVar2) {
        dcdc<jho> e;
        dbsg dbsgVar2;
        jhz a = jhz.a();
        a.f(new View.OnClickListener(aispVar) { // from class: aisk
            private final aisp a;

            {
                this.a = aispVar;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [ggg, aisp] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ?? r3 = this.a;
                ((airr) r3).bc = true;
                gfq.m(r3);
            }
        });
        a.x = false;
        a.j = cqrt.l(R.string.BACK_BUTTON);
        a.o = cjtd.a(dtxu.dJ);
        a.l = context.getString(R.string.OVERFLOW_MENU_ACCESSIBILITY_TEXT);
        if (z2) {
            a.q = ibm.b();
            if (!dbsgVar.a()) {
                dbsgVar2 = dbpy.a;
            } else if (dbsgVar.b().v()) {
                dbsgVar2 = dbsg.i(context.getResources().getString(R.string.SHARING_VIA_LINK_TITLE));
            } else {
                dbsgVar2 = dbsgVar.b().a().h(aisl.a);
            }
            a.a = (CharSequence) dbsgVar2.c("");
        } else {
            a.q = ibm.a();
            a.g = ibl.b();
            a.z = 2;
            a.d = gdj.b();
            a.e = cqrt.f(R.drawable.toolbar_action_background);
        }
        if (z) {
            jhm jhmVar = new jhm();
            jhmVar.c = cqrt.f(2131232316);
            jhmVar.h = 1;
            jhmVar.g = jhnVar2;
            jhmVar.b = context.getResources().getString(R.string.MOD_SHOW_LIST_OF_SHARES_CONTENT_DESCRIPTION);
            jhmVar.f = cjtd.a(dtxu.dK);
            a.c(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.c = cqrt.f(2131232381);
        jhmVar2.h = 1;
        jhmVar2.g = jhnVar;
        jhmVar2.b = context.getResources().getString(R.string.MOD_CREATE_SHARE_FAB);
        jhmVar2.f = cjtd.a(dtxu.dL);
        a.c(jhmVar2.c());
        if (z2) {
            if (!dbsgVar.a()) {
                e = dcdc.e();
            } else if (!dbsgVar.b().v()) {
                e = aitm.p(context, dbsgVar.b(), z3, dkogVar, aispVar);
            } else if (!dbsgVar.b().v() || !dbsgVar.b().w().a()) {
                e = dcdc.e();
            } else {
                jhm a2 = jhm.a();
                a2.a = context.getString(R.string.MOD_COPY_LINK_BUTTON);
                a2.d(new View.OnClickListener(aispVar, dbsgVar) { // from class: aism
                    private final aisp a;
                    private final dbsg b;

                    {
                        this.a = aispVar;
                        this.b = dbsgVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((airr) this.a).i(((aink) this.b.b()).w().b());
                    }
                });
                a2.f = cjtd.a(dtxu.eU);
                e = dcdc.f(a2.c());
            }
            a.d(e);
        }
        return a.b();
    }

    private final dbsg<ajbz> k() {
        if (!this.c.a() || !this.c.b().f().booleanValue()) {
            return dbpy.a;
        }
        return dbsg.i(new aiso(this));
    }

    @dzsi
    private static ajcd l(dbsg<aion> dbsgVar, final aisp aispVar) {
        if (dbsgVar.a()) {
            return new ajcd(dbsgVar.b(), new ajcc(aispVar) { // from class: aisn
                private final aisp a;

                {
                    this.a = aispVar;
                }

                @Override // defpackage.ajcc
                public final void a(aion aionVar) {
                    airr airrVar = (airr) this.a;
                    dbsg<btlu> dbsgVar2 = airrVar.aS;
                    if (dbsgVar2 != null) {
                        airrVar.ay.a(dbsgVar2, aionVar);
                    }
                }
            });
        }
        return null;
    }

    @Override // defpackage.aisg
    @dzsi
    public ajbz a() {
        return k().a() ? k().b() : this.p;
    }

    @Override // defpackage.aisg
    public jib b() {
        return this.k;
    }

    @Override // defpackage.aisg
    public Boolean c() {
        aitm aitmVar = this.q;
        boolean z = true;
        boolean z2 = aitmVar != null && aitmVar.o();
        if (!this.l || !z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aisg
    public Boolean d() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.aisg
    @dzsi
    public aitc e() {
        return this.q;
    }

    public void f(dbsg<aink> dbsgVar, dkog dkogVar, @dzsi akqq akqqVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!this.c.equals(dbsgVar)) {
            this.c = dbsgVar;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.m != z) {
            this.m = z;
            z3 = true;
        }
        if (this.j != z2) {
            this.j = z2;
            z3 = true;
        }
        if (!this.o.equals(dkogVar)) {
            this.o = dkogVar;
            z3 = true;
        }
        if (dbsd.a(this.n, akqqVar)) {
            this.n = akqqVar;
            z4 = true;
        } else {
            z4 = z3;
        }
        if (!this.c.a() || dbsgVar.b().v() || dbsgVar.b().z()) {
            this.q = null;
        } else {
            aitm aitmVar = this.q;
            if (aitmVar != null) {
                aitmVar.h(dbsgVar.b(), dkogVar, akqqVar);
            } else {
                this.q = new aitm(dbsgVar.b(), this.g, this.d, this.e, this.b.getResources(), dkogVar, akqqVar, this.f);
            }
            if (!z4) {
                return;
            }
        }
        this.k = j(this.a, this.j, this.l, this.b, this.c, this.m, this.o, this.h, this.i);
        cqkx.p(this);
    }

    public void g(boolean z) {
        if (this.l != z) {
            this.l = z;
            this.k = j(this.a, this.j, z, this.b, this.c, this.m, this.o, this.h, this.i);
            cqkx.p(this);
        }
    }

    public void h(dbsg<aion> dbsgVar) {
        if (i().equals(dbsgVar)) {
            return;
        }
        this.p = l(dbsgVar, this.a);
        cqkx.p(this);
    }

    public dbsg<aion> i() {
        ajcd ajcdVar = this.p;
        return ajcdVar != null ? dbsg.i(ajcdVar.a) : dbpy.a;
    }
}
