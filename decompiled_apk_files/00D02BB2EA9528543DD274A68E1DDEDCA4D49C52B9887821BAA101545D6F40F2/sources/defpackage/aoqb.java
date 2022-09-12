package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoqb  reason: default package */
/* loaded from: classes2.dex */
public class aoqb implements aopu, anha {
    public final aopn a;
    public final anqv b;
    public dbsg<anho> c = dbpy.a;
    public dcdc<jbf> d = dcdc.e();
    public boolean e;
    private final ff f;
    private final angu<aogb, aoge> g;
    private final dbsg<String> h;
    private final aotw i;
    private final anqx j;
    private final angp k;
    private final jbf l;
    private final aoqa m;
    private final dbsg<dvay> n;
    private final ansb o;
    private final anpw p;

    public aoqb(angu<aogb, aoge> anguVar, dbsg<String> dbsgVar, Runnable runnable, aopm aopmVar, Runnable runnable2, aoqa aoqaVar, dbsg<dvay> dbsgVar2, ff ffVar, angp angpVar, aotw aotwVar, anqv anqvVar, anqx anqxVar, ansb ansbVar, anru anruVar, anpw anpwVar) {
        this.f = ffVar;
        this.i = aotwVar;
        this.k = angpVar;
        this.g = anguVar;
        this.j = anqxVar;
        this.b = anqvVar;
        this.o = ansbVar;
        this.m = aoqaVar;
        this.n = dbsgVar2;
        this.p = anpwVar;
        this.a = new aopn(ffVar, anruVar.a(), anro.e(iva.c(R.color.qu_blue_grey_400, R.color.mod_grey850), iva.c(R.color.maps_activity_timeline_segment_card_secondary_text, R.color.maps_activity_timeline_segment_card_secondary_text_night), iva.c(R.color.maps_activity_timeline_segment_card_secondary_text, R.color.maps_activity_timeline_segment_card_secondary_text_night), ibm.b()), anguVar.a(), runnable, aopmVar);
        this.h = dbsgVar;
        this.l = anruVar.c(ffVar.getResources(), runnable2);
        aotwVar.g.add(new aopw(this));
    }

    @Override // defpackage.anha
    public aogm b() {
        angs<aoge> b = this.g.b();
        if (b.e()) {
            return anpx.a(b.f(), this.j).a();
        }
        return aogm.b;
    }

    @Override // defpackage.anrm
    public cqsn c() {
        return cqrt.l(R.string.SEGMENT_ADDING_CHOOSE_A_PLACE);
    }

    @Override // defpackage.aopu
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.aopu
    public cqkl e() {
        dbsg<ilo> s = this.a.s();
        if (!s.a()) {
            return cqkl.a;
        }
        this.a.p(true);
        if (!s().a()) {
            return cqkl.a;
        }
        aogy b = s().b();
        this.k.r(this.n, b.a().e(), s.b().h(), b.b(), this.h, this.a.o(), dbpy.a, true);
        dvyw h = s.b().h();
        if (b.b() == 2 && !h.aE) {
            this.p.a(h, this.g.b().e() ? this.g.b().f().h() : dbpy.a, this.n.h(aopv.a));
        }
        return cqkl.a;
    }

    @Override // defpackage.aopu
    public cqkl f() {
        this.f.g().f();
        return cqkl.a;
    }

    @Override // defpackage.aopu
    public jbf g() {
        return this.l;
    }

    @Override // defpackage.aopu
    public Boolean h() {
        return a().m();
    }

    @Override // defpackage.aopu
    public Boolean i() {
        return Boolean.valueOf(this.b.a);
    }

    @Override // defpackage.aopu
    public dcdc<jbf> j() {
        return this.d;
    }

    @Override // defpackage.aopu
    @dzsi
    public cqss k() {
        return this.a.i();
    }

    @Override // defpackage.aopu
    /* renamed from: l */
    public aopn a() {
        return this.a;
    }

    public Boolean m() {
        return Boolean.valueOf(this.e);
    }

    public boolean n() {
        return this.a.k().booleanValue();
    }

    public void o(boolean z) {
        this.a.p(false);
    }

    public void p(boolean z) {
        this.e = z;
    }

    public dbsg<akqq> q() {
        return this.i.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<ilo> r() {
        return this.a.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<aogy> s() {
        return this.a.u();
    }

    public void t(dbsg<anho> dbsgVar) {
        this.c = dbsgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(akqq akqqVar) {
        aotw aotwVar = this.i;
        if (aotwVar.a(akqqVar)) {
            aotwVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(ilo iloVar, dnqm dnqmVar) {
        akqq aj;
        dpop bK;
        dnic bK2;
        if (!r().equals(dbsg.i(iloVar))) {
            this.a.r(iloVar, dnqmVar);
            akqq aj2 = iloVar.aj();
            if (aj2 != null) {
                u(aj2);
            }
            this.m.a();
            dbsg<ilo> r = r();
            if (this.e && r.a() && (aj = r.b().aj()) != null) {
                if (this.c.a()) {
                    dpop e = this.c.b().a().e((dssr) dpop.d.cu(7), dpop.d);
                    dnhx bZ = dnic.f.bZ();
                    dnhy bZ2 = dnhz.e.bZ();
                    long j = e.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnhz dnhzVar = (dnhz) bZ2.b;
                    dnhzVar.a |= 4;
                    dnhzVar.d = j;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnic dnicVar = (dnic) bZ.b;
                    dnhz bK3 = bZ2.bK();
                    bK3.getClass();
                    dnicVar.c = bK3;
                    dnicVar.a |= 2;
                    dnhy bZ3 = dnhz.e.bZ();
                    long j2 = e.c;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnhz dnhzVar2 = (dnhz) bZ3.b;
                    dnhzVar2.a |= 4;
                    dnhzVar2.d = j2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnic dnicVar2 = (dnic) bZ.b;
                    dnhz bK4 = bZ3.bK();
                    bK4.getClass();
                    dnicVar2.d = bK4;
                    dnicVar2.a |= 4;
                    bK2 = bZ.bK();
                } else {
                    if (this.g.b().e()) {
                        bK = this.g.b().f().a().e;
                        if (bK == null) {
                            bK = dpop.d;
                        }
                    } else {
                        dngs h = this.g.a().h();
                        dpoo bZ4 = dpop.d.bZ();
                        long f = aogc.f(h);
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dpop dpopVar = (dpop) bZ4.b;
                        dpopVar.a |= 1;
                        dpopVar.b = f;
                        long h2 = aogc.h(h);
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dpop dpopVar2 = (dpop) bZ4.b;
                        dpopVar2.a |= 2;
                        dpopVar2.c = h2;
                        bK = bZ4.bK();
                    }
                    dnhx bZ5 = dnic.f.bZ();
                    dnhy bZ6 = dnhz.e.bZ();
                    long j3 = bK.b;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnhz dnhzVar3 = (dnhz) bZ6.b;
                    dnhzVar3.a |= 4;
                    dnhzVar3.d = j3;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnic dnicVar3 = (dnic) bZ5.b;
                    dnhz bK5 = bZ6.bK();
                    bK5.getClass();
                    dnicVar3.c = bK5;
                    dnicVar3.a |= 2;
                    dnhy bZ7 = dnhz.e.bZ();
                    long j4 = bK.c;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnhz dnhzVar4 = (dnhz) bZ7.b;
                    dnhzVar4.a |= 4;
                    dnhzVar4.d = j4;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnic dnicVar4 = (dnic) bZ5.b;
                    dnhz bK6 = bZ7.bK();
                    bK6.getClass();
                    dnicVar4.d = bK6;
                    dnicVar4.a |= 4;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnic dnicVar5 = (dnic) bZ5.b;
                    dnicVar5.a |= 8;
                    dnicVar5.e = false;
                    bK2 = bZ5.bK();
                }
                a().q(true);
                ansb ansbVar = this.o;
                aopy aopyVar = new aopy(this);
                dvbe bZ8 = dvbj.c.bZ();
                dvbh bZ9 = dvbi.f.bZ();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dvbi dvbiVar = (dvbi) bZ9.b;
                bK2.getClass();
                dvbiVar.d = bK2;
                dvbiVar.a |= 1;
                dpum h3 = aj.h();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dvbi dvbiVar2 = (dvbi) bZ9.b;
                h3.getClass();
                dvbiVar2.c = h3;
                dvbiVar2.b = 3;
                dvbiVar2.a |= 8;
                dvbiVar2.e = 1;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dvbj dvbjVar = (dvbj) bZ8.b;
                dvbi bK7 = bZ9.bK();
                bK7.getClass();
                dvbjVar.b = bK7;
                dvbjVar.a |= 1;
                dvbj bK8 = bZ8.bK();
                btzc btzcVar = ansbVar.a;
                if (btzcVar != null) {
                    btzcVar.a();
                }
                ansbVar.a = ansbVar.b.a(bK8, new ansa(aopyVar), bvrj.UI_THREAD);
            }
            cqkx.p(this);
        }
    }

    public void w(aogy aogyVar) {
        if (!s().equals(dbsg.i(aogyVar))) {
            this.a.t(aogyVar);
            this.m.a();
        }
    }
}
