package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aixz  reason: default package */
/* loaded from: classes2.dex */
public final class aixz implements aixt {
    public cqtd a = n();
    private final aixy b;
    private final aikp c;
    private final Resources d;
    private final cqat e;
    private final ajsc f;
    private final ajex g;
    private final ajew h;
    private aink i;

    public aixz(aink ainkVar, aixy aixyVar, aikp aikpVar, Resources resources, cqat cqatVar, ajsc ajscVar, cqhn cqhnVar, ajex ajexVar, ajew ajewVar) {
        this.c = aikpVar;
        this.i = ainkVar;
        this.b = aixyVar;
        this.e = cqatVar;
        this.d = resources;
        this.f = ajscVar;
        this.h = ajewVar;
        this.g = ajexVar;
    }

    private final cqtd n() {
        dbsg<String> dbsgVar;
        aiko aikoVar;
        if (this.i.a().a()) {
            dbsgVar = this.i.a().b().d();
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            return cqrt.f(2131231864);
        }
        aikp aikpVar = this.c;
        String b = dbsgVar.b();
        if (this.i.A() || this.i.s(o())) {
            aikoVar = aiko.GRAYSCALE;
        } else {
            aikoVar = aiko.COLOR;
        }
        return aikpVar.b(b, aikoVar, new dbsz(this) { // from class: aixx
            private final aixz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                aixz aixzVar = this.a;
                aixzVar.a = (cqtd) obj;
                cqkx.p(aixzVar);
            }
        });
    }

    private final eapd o() {
        return new eapd(this.e.b());
    }

    @Override // defpackage.aixt
    public void a(aink ainkVar) {
        if (this.i.equals(ainkVar)) {
            return;
        }
        this.i = ainkVar;
        this.a = n();
        cqkx.p(this);
    }

    @Override // defpackage.aixt
    public boolean b() {
        return this.i.v();
    }

    @Override // defpackage.aixt
    public void c() {
        cqkx.p(this);
    }

    @Override // defpackage.aixu
    public CharSequence d() {
        return (CharSequence) ((dbsg) this.i.a().h(aixw.a).c(this.i.x())).c(this.d.getString(R.string.SHARING_VIA_LINK_TITLE));
    }

    @Override // defpackage.aixu
    public cqtd e() {
        if (this.i.f().booleanValue()) {
            return cqrt.h(2131232973, ibm.p());
        }
        if (!this.i.l().a() || !this.i.l().b().f().a()) {
            return null;
        }
        dqyh b = this.i.l().b().f().b();
        if (!ajew.a(b)) {
            return null;
        }
        dqjl b2 = dqjl.b(b.c);
        if (b2 == null) {
            b2 = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        return cqrt.h(anpd.a(b2), irg.H());
    }

    @Override // defpackage.aixu
    public CharSequence f() {
        if (this.i.f().booleanValue()) {
            if (!this.i.a().a() || !this.i.a().b().c().a()) {
                return this.d.getString(R.string.HIDDEN_PEOPLE_SECTION_HEADER);
            }
            return this.d.getString(R.string.MOD_HIDDEN_FROM_MAP_WARNING_DESCRIPTION, this.i.a().b().c().b());
        } else if (this.i.l().a() && this.i.l().b().f().a()) {
            return this.i.l().b().f().b().d;
        } else {
            return null;
        }
    }

    @Override // defpackage.aixu
    public CharSequence g() {
        if (this.i.s(o())) {
            return this.d.getString(R.string.MOD_LIST_OFFLINE_SUBTITLE);
        }
        if (!this.i.l().a() || !this.i.l().b().c().a()) {
            if (this.i.m().a()) {
                return this.i.m().b().i().f();
            }
            return this.i.v() ? "" : this.d.getString(R.string.MOD_NOT_SHARING_WITH_YOU_TITLE);
        }
        ajew ajewVar = this.h;
        dbsg<dqyh> f = this.i.l().b().f();
        String p = this.i.l().b().c().b().a().k().p();
        if (f.a()) {
            dqjl b = dqjl.b(f.b().c);
            if (b == null) {
                b = dqjl.UNKNOWN_ACTIVITY_TYPE;
            }
            if (b == dqjl.IN_PASSENGER_VEHICLE && ajew.a(f.b())) {
                return ajsb.a(ajewVar.a, alp.a(), R.string.MOD_DRIVING_TO_DESTINATION, p);
            }
        }
        if (f.a()) {
            dqjl b2 = dqjl.b(f.b().c);
            if (b2 == null) {
                b2 = dqjl.UNKNOWN_ACTIVITY_TYPE;
            }
            if (b2 == dqjl.CYCLING && ajew.a(f.b())) {
                return ajsb.a(ajewVar.a, alp.a(), R.string.MOD_CYCLING_TO_DESTINATION, p);
            }
        }
        return ajsb.a(ajewVar.a, alp.a(), R.string.MOD_ON_THEIR_WAY_TO_DESTINATION, p);
    }

    @Override // defpackage.aixu
    public CharSequence h() {
        if (!this.i.m().a() || this.i.l().a()) {
            return null;
        }
        ahvg b = this.i.m().b();
        if (b.e()) {
            return this.d.getString(R.string.LOCATION_SHARING_OVENFRESH_OVENFRESH_GENERIC_MESSAGE);
        }
        dbsg<eaow> l = b.l(o());
        if (!l.a()) {
            return null;
        }
        return this.f.a(l.b().b);
    }

    @Override // defpackage.aixu
    public CharSequence i() {
        if (!this.i.j().isEmpty()) {
            if (this.i.t().a()) {
                return this.d.getString(R.string.MOD_LIST_CAN_SEE_YOUR_JOURNEY_SUBTITLE);
            }
            if (this.i.u().a() && this.i.u().b().j()) {
                dbsg<eaow> o = this.i.u().b().o(o());
                if (o.a()) {
                    ajex ajexVar = this.g;
                    long j = o.b().b;
                    dbsk.b(j >= 0, "Can't have a negative duration");
                    if (j >= TimeUnit.DAYS.toMillis(1L)) {
                        int a = ajex.a(j, TimeUnit.DAYS);
                        int a2 = ajex.a(j - (a * 86400000), TimeUnit.HOURS);
                        if (a == 1) {
                            if (a2 > 0) {
                                return ajexVar.a.getQuantityString(R.plurals.MOD_CAN_SEE_WITH_LINK_FOR_1_DAY_AND_N_HOURS, a2, Integer.valueOf(a2));
                            }
                            a = 1;
                        }
                        return ajexVar.a.getQuantityString(R.plurals.MOD_CAN_SEE_WITH_LINK_FOR_DAYS, a, Integer.valueOf(a));
                    }
                    double millis = TimeUnit.MINUTES.toMillis(1L);
                    Double.isNaN(millis);
                    if (j >= millis * 59.5d) {
                        int a3 = ajex.a(j, TimeUnit.HOURS);
                        int a4 = ajex.a(j - TimeUnit.HOURS.toMillis(a3), TimeUnit.MINUTES);
                        if (a3 == 1) {
                            if (a4 > 0) {
                                return ajexVar.a.getQuantityString(R.plurals.MOD_CAN_SEE_WITH_LINK_FOR_1_HOUR_AND_N_MINS, a4, Integer.valueOf(a4));
                            }
                            a3 = 1;
                        }
                        return ajexVar.a.getQuantityString(R.plurals.MOD_CAN_SEE_WITH_LINK_FOR_HOURS, a3, Integer.valueOf(a3));
                    }
                    int a5 = ajex.a(j, TimeUnit.MINUTES);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    return ajexVar.a.getQuantityString(R.plurals.MOD_CAN_SEE_WITH_LINK_FOR_MINUTES, a5, Integer.valueOf(a5));
                }
            }
            return this.d.getString(R.string.MOD_LIST_CAN_SEE_LOCATION_SUBTITLE);
        }
        return this.d.getString(R.string.MOD_LIST_CANT_SEE_LOCATION_SUBTITLE);
    }

    @Override // defpackage.aixu
    public Boolean j() {
        boolean z = true;
        if (!this.i.A() && !this.i.s(o())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aixu
    public cqtd k() {
        return this.a;
    }

    @Override // defpackage.aixu
    public cqkl l() {
        aiwm aiwmVar = (aiwm) this.b;
        aiws aiwsVar = aiwmVar.a;
        aink ainkVar = aiwmVar.b;
        aiwsVar.aB = ainkVar.b();
        aiwsVar.au.a().s(dbsg.i(ainkVar.b()), ahwe.OUTGOING_SHARE_TAP, false);
        return cqkl.a;
    }

    @Override // defpackage.aixu
    public cjtd m() {
        return cjtd.a(b() ? dtxu.eb : dtxu.dT);
    }
}
