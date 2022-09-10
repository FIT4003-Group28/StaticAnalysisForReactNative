package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.widget.SelectedPersonCreateShortcutActivity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aitm  reason: default package */
/* loaded from: classes2.dex */
public class aitm implements aitc, ajvb {
    @dzsi
    private akqq a;
    private aink b;
    private dkog c;
    private String d = s();
    private final cqat e;
    private final Resources f;
    private final ajsc g;
    private final bvsl h;

    public aitm(aink ainkVar, cqat cqatVar, cqhn cqhnVar, ajsc ajscVar, Resources resources, dkog dkogVar, @dzsi akqq akqqVar, bvsl bvslVar) {
        this.b = ainkVar;
        this.e = cqatVar;
        this.g = ajscVar;
        this.h = bvslVar;
        this.f = resources;
        this.c = dkogVar;
        this.a = akqqVar;
    }

    public static dcdc<jho> p(Context context, aink ainkVar, boolean z, dkog dkogVar, final aitl aitlVar) {
        dccx F = dcdc.F();
        if (!ainkVar.d().isEmpty()) {
            jhm jhmVar = new jhm();
            jhmVar.a = context.getString(R.string.REFRESH_BUTTON);
            jhmVar.d(new View.OnClickListener(aitlVar) { // from class: aite
                private final aitl a;

                {
                    this.a = aitlVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    airr airrVar = (airr) this.a;
                    aiza aizaVar = airrVar.an;
                    dbsg<btlu> dbsgVar = airrVar.aS;
                    dbsk.s(dbsgVar);
                    PersonId personId = airrVar.aT;
                    dbsk.s(personId);
                    aizaVar.c(dbsgVar, personId, dbsg.j(airrVar.aU), 7);
                }
            });
            jhmVar.f = cjtd.a(dtxu.fh);
            F.g(jhmVar.c());
        }
        if (ainkVar.a().a()) {
            if (ainkVar.a().b().a().c == ahwj.EMAIL) {
                if (!context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:foo@gmail.com")), 0).isEmpty()) {
                    jhm jhmVar2 = new jhm();
                    jhmVar2.a = context.getString(R.string.EMAIL_MENU_ITEM_TITLE);
                    jhmVar2.d(new View.OnClickListener(aitlVar) { // from class: aitf
                        private final aitl a;

                        {
                            this.a = aitlVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            aitl aitlVar2 = this.a;
                            airr airrVar = (airr) aitlVar2;
                            if (airrVar.aX()) {
                                aink ainkVar2 = airrVar.aU;
                                dbsk.s(ainkVar2);
                                if (ainkVar2.b().c != ahwj.EMAIL) {
                                    return;
                                }
                                aink ainkVar3 = airrVar.aU;
                                dbsk.s(ainkVar3);
                                Uri f = ainkVar3.b().f();
                                dbsk.s(f);
                                airrVar.aq.a().f(((fd) aitlVar2).H(), new Intent("android.intent.action.SENDTO", f), 4);
                            }
                        }
                    });
                    F.g(jhmVar2.c());
                }
            } else if (ainkVar.a().b().a().c == ahwj.PHONE && !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.DIAL", Uri.parse("tel:+61400000000")), 0).isEmpty()) {
                jhm jhmVar3 = new jhm();
                jhmVar3.a = context.getString(R.string.CALL_MENU_ITEM_TITLE);
                jhmVar3.d(new View.OnClickListener(aitlVar) { // from class: aitg
                    private final aitl a;

                    {
                        this.a = aitlVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aitl aitlVar2 = this.a;
                        airr airrVar = (airr) aitlVar2;
                        if (airrVar.aX()) {
                            aink ainkVar2 = airrVar.aU;
                            dbsk.s(ainkVar2);
                            if (ainkVar2.b().c != ahwj.PHONE) {
                                return;
                            }
                            aink ainkVar3 = airrVar.aU;
                            dbsk.s(ainkVar3);
                            Uri f = ainkVar3.b().f();
                            dbsk.s(f);
                            airrVar.aq.a().f(((fd) aitlVar2).H(), new Intent("android.intent.action.DIAL", f), 4);
                        }
                    }
                });
                F.g(jhmVar3.c());
            }
        }
        if (ainkVar.a().a() && ainkVar.a().b().a().c == ahwj.GAIA) {
            ddho ddhoVar = dtxu.fe;
            jhm jhmVar4 = new jhm();
            jhmVar4.a = context.getString(R.string.CREATE_SHORTCUT_LABEL);
            jhmVar4.d(new View.OnClickListener(aitlVar) { // from class: aith
                private final aitl a;

                {
                    this.a = aitlVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aitl aitlVar2 = this.a;
                    airr airrVar = (airr) aitlVar2;
                    if (!airrVar.aX()) {
                        return;
                    }
                    aink ainkVar2 = airrVar.aU;
                    dbsk.s(ainkVar2);
                    PersonId b = ainkVar2.b();
                    aink ainkVar3 = airrVar.aU;
                    dbsk.s(ainkVar3);
                    String c = ainkVar3.a().b().b().c("");
                    aink ainkVar4 = airrVar.aU;
                    dbsk.s(ainkVar4);
                    String c2 = ainkVar4.a().b().d().c("");
                    gga ggaVar = ((ges) aitlVar2).aE;
                    dbsk.s(ggaVar);
                    if (!ako.a() || !jk.a(ggaVar)) {
                        dbsg<btlu> dbsgVar = airrVar.aS;
                        dbsk.s(dbsgVar);
                        SelectedPersonCreateShortcutActivity.p(ggaVar, dbsgVar.f(), b, c, c2, airrVar.ar, new akbv(airrVar) { // from class: airh
                            private final airr a;

                            {
                                this.a = airrVar;
                            }

                            @Override // defpackage.akbv
                            public final void a(Intent intent) {
                                airr airrVar2 = this.a;
                                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                gga ggaVar2 = airrVar2.aE;
                                dbsk.s(ggaVar2);
                                deha.q(airrVar2.aq.a().I(ggaVar2, intent), new airp(airrVar2), airrVar2.aQ);
                            }
                        });
                        return;
                    }
                    dbsg<btlu> dbsgVar2 = airrVar.aS;
                    dbsk.s(dbsgVar2);
                    SelectedPersonCreateShortcutActivity.v(ggaVar, dbsgVar2.f(), b, c, c2, airrVar.ar, new airg(airrVar, ggaVar));
                }
            });
            jhmVar4.f = cjtd.a(ddhoVar);
            F.g(jhmVar4.c());
        }
        if (!ainkVar.d().isEmpty() && !ainkVar.f().booleanValue()) {
            jhm jhmVar5 = new jhm();
            Resources resources = context.getResources();
            alp a = alp.a();
            String b = ainkVar.a().b().b().b();
            String a2 = ajsb.a(resources, a, R.string.HIDE_PERSON_FROM_MAP_MENU_ITEM, b);
            if (dbtw.a(b) || a2.length() > 35) {
                a2 = resources.getString(R.string.HIDE_PERSON_FROM_MAP_MENU_ITEM_WITHOUT_NAME);
            }
            jhmVar5.a = a2;
            jhmVar5.d(new View.OnClickListener(aitlVar) { // from class: aiti
                private final aitl a;

                {
                    this.a = aitlVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aitl aitlVar2 = this.a;
                    airr airrVar = (airr) aitlVar2;
                    if (airrVar.aX()) {
                        aink ainkVar2 = airrVar.aU;
                        dbsk.s(ainkVar2);
                        if (!ainkVar2.a().a()) {
                            return;
                        }
                        aihe<aimj, aiig> aiheVar = airrVar.av;
                        aink ainkVar3 = airrVar.aU;
                        dbsk.s(ainkVar3);
                        aiig f = aiij.f(ainkVar3.a().b(), new eapd(airrVar.ad.b()));
                        dbsg<btlu> dbsgVar = airrVar.aS;
                        dbsk.s(dbsgVar);
                        aiheVar.a(f, dbsgVar);
                        fd fdVar = (fd) aitlVar2;
                        ff J = fdVar.J();
                        Resources Rn = fdVar.Rn();
                        alp a3 = alp.a();
                        aink ainkVar4 = airrVar.aU;
                        dbsk.s(ainkVar4);
                        airr.br(J, ajsb.a(Rn, a3, R.string.HIDDEN_FROM_MAP_TOAST, ainkVar4.a().b().b().c("")), null, null);
                    }
                }
            });
            jhmVar5.f = cjtd.a(dtxu.fg);
            F.g(jhmVar5.c());
        }
        if (ainkVar.j().isEmpty() && ainkVar.d().isEmpty()) {
            jhm jhmVar6 = new jhm();
            jhmVar6.a = context.getString(R.string.REMOVE_FROM_PEOPLE_PICKER_ACTION);
            jhmVar6.d(new View.OnClickListener(aitlVar) { // from class: aitj
                private final aitl a;

                {
                    this.a = aitlVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aitl aitlVar2 = this.a;
                    airr airrVar = (airr) aitlVar2;
                    if (airrVar.aX()) {
                        aink ainkVar2 = airrVar.aU;
                        dbsk.s(ainkVar2);
                        if (!ainkVar2.a().a()) {
                            return;
                        }
                        aihe<aimj, aiig> aiheVar = airrVar.av;
                        aink ainkVar3 = airrVar.aU;
                        dbsk.s(ainkVar3);
                        aiih aiihVar = new aiih(new eapd(airrVar.ad.b()), ainkVar3.a().b());
                        dbsg<btlu> dbsgVar = airrVar.aS;
                        dbsk.s(dbsgVar);
                        aiheVar.a(aiihVar, dbsgVar);
                        fd fdVar = (fd) aitlVar2;
                        ff J = fdVar.J();
                        Resources Rn = fdVar.Rn();
                        alp a3 = alp.a();
                        aink ainkVar4 = airrVar.aU;
                        dbsk.s(ainkVar4);
                        airr.br(J, ajsb.a(Rn, a3, R.string.REMOVED_FROM_PEOPLE_PICKER_TOAST, ainkVar4.a().b().b().c("")), fdVar.Rp(R.string.UNDO), new View.OnClickListener(airrVar) { // from class: airj
                            private final airr a;

                            {
                                this.a = airrVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                airr airrVar2 = this.a;
                                aihe<aimj, aiig> aiheVar2 = airrVar2.av;
                                aink ainkVar5 = airrVar2.aU;
                                dbsk.s(ainkVar5);
                                aiig g = aiij.g(ainkVar5.a().b(), new eapd(airrVar2.ad.b()));
                                dbsg<btlu> dbsgVar2 = airrVar2.aS;
                                dbsk.s(dbsgVar2);
                                aiheVar2.a(g, dbsgVar2);
                            }
                        });
                    }
                }
            });
            jhmVar6.f = cjtd.a(dtxu.fi);
            F.g(jhmVar6.c());
        }
        if (z && !ainkVar.v() && !ainkVar.y()) {
            jhm jhmVar7 = new jhm();
            jhmVar7.a = context.getString(R.string.BLOCK_PERSON_ACTION);
            jhmVar7.d(new View.OnClickListener(aitlVar) { // from class: aitk
                private final aitl a;

                {
                    this.a = aitlVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    airr airrVar = (airr) this.a;
                    if (airrVar.aX()) {
                        dbsg<btlu> dbsgVar = airrVar.aS;
                        dbsk.s(dbsgVar);
                        if (!dbsgVar.a()) {
                            return;
                        }
                        ajsm ajsmVar = airrVar.ao;
                        dbsg<btlu> dbsgVar2 = airrVar.aS;
                        dbsk.s(dbsgVar2);
                        aink ainkVar2 = airrVar.aU;
                        dbsk.s(ainkVar2);
                        bvqd.a(ajsmVar.a(dbsgVar2.b(), ainkVar2.a().b()), airrVar.aR);
                    }
                }
            });
            jhmVar7.f = cjtd.a(dtxu.ff);
            F.g(jhmVar7.c());
        }
        return F.f();
    }

    private final dbsg<String> q() {
        return (!this.b.l().a() || !this.b.l().b().f().a() || (this.b.l().b().f().b().a & 4) == 0) ? dbpy.a : dbsg.i(this.b.l().b().f().b().d);
    }

    private final Boolean r() {
        return Boolean.valueOf(this.b.s(t(this.e)));
    }

    private final String s() {
        dbsg<dhjz> n = this.b.n();
        if (this.a == null || !n.a()) {
            return "";
        }
        Resources resources = this.f;
        alp a = alp.a();
        bvsl bvslVar = this.h;
        akqq akqqVar = this.a;
        dbsk.s(akqqVar);
        return ajsb.a(resources, a, R.string.DISTANCE_AWAY, bvslVar.c((int) akqo.e(akqqVar, new akqq(n.b().c, n.b().b)), null, true, true));
    }

    private static eapd t(cqat cqatVar) {
        return new eapd(cqatVar.b());
    }

    @Override // defpackage.aitc
    public Boolean a() {
        dbsg<ahvf> r = this.b.r(t(this.e));
        boolean z = false;
        if (r().booleanValue() || (r.a() && r.b() == ahvf.STALE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aitc
    public CharSequence b() {
        if (!a().booleanValue() || !Boolean.valueOf(this.b.k()).booleanValue()) {
            return a().booleanValue() ? this.f.getString(R.string.MOD_LIST_OFFLINE_SUBTITLE) : "";
        }
        return this.f.getString(R.string.MOD_DEFAULT_LOADING_INDICATOR);
    }

    @Override // defpackage.aitc
    public CharSequence c() {
        dbsg<String> q = q();
        return q.a() ? q.b() : this.d;
    }

    @Override // defpackage.aitc
    public cjtd d() {
        if (q().a()) {
            return cjtd.a(dtxu.fk);
        }
        return cjtd.a(dtxu.fm);
    }

    @Override // defpackage.aitc
    public CharSequence e() {
        if (this.b.l().a()) {
            return this.g.a(0L);
        }
        if (!this.b.m().a()) {
            return "";
        }
        ahvg b = this.b.m().b();
        if (b.e()) {
            return this.f.getString(R.string.LOCATION_SHARING_OVENFRESH_OVENFRESH_GENERIC_MESSAGE);
        }
        dbsg<eaow> l = b.l(t(this.e));
        return l.a() ? this.g.a(l.b().b) : "";
    }

    @Override // defpackage.aitc
    public Boolean f() {
        boolean z = false;
        if (!r().booleanValue() && this.b.q().a() && this.c.s) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aitc
    public ajvb g() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(aink ainkVar, dkog dkogVar, @dzsi akqq akqqVar) {
        boolean z;
        boolean z2 = true;
        if (!this.b.equals(ainkVar)) {
            this.b = ainkVar;
            z = true;
        } else {
            z = false;
        }
        if (!this.c.equals(dkogVar)) {
            this.c = dkogVar;
            z = true;
        }
        akqq akqqVar2 = this.a;
        if ((akqqVar2 == null || akqqVar2.equals(akqqVar)) && (this.a != null || akqqVar == null)) {
            z2 = z;
        } else {
            this.a = akqqVar;
        }
        this.d = s();
        if (z2) {
            cqkx.p(this);
        }
    }

    public CharSequence i() {
        return this.b.a().b().b().b();
    }

    @Override // defpackage.ajvb
    public Boolean j() {
        boolean z = false;
        if (f().booleanValue() && this.b.q().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ajvb
    @dzsi
    public Integer k() {
        if (this.b.q().a()) {
            return Integer.valueOf(this.b.q().b().c);
        }
        return null;
    }

    @Override // defpackage.ajvb
    public CharSequence l() {
        return i();
    }

    @Override // defpackage.ajvb
    @dzsi
    public Boolean m() {
        if (this.b.q().a()) {
            return Boolean.valueOf(this.b.q().b().b);
        }
        return null;
    }

    @Override // defpackage.ajvb
    @dzsi
    public cjtd n() {
        return cjtd.a(dtxu.fl);
    }

    public boolean o() {
        return !this.b.A();
    }
}
