package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bosn  reason: default package */
/* loaded from: classes3.dex */
public class bosn implements bosv {
    public final ges a;
    public final Activity b;
    public final bosj c;
    public final bnyc d;
    public final boolean e;
    @dzsi
    bond f;
    public final ivn g;
    private final bosj h;
    private final bosu i;
    private final CharSequence j;
    private final bonr k;
    @dzsi
    private final bost l;
    private boolean m;
    private boolean n;
    private final bomp o;

    public bosn(ges gesVar, bosj bosjVar, bosj bosjVar2, bosu bosuVar, dwyd dwydVar, boolean z, boolean z2, Activity activity, jmx jmxVar, cjqy cjqyVar, dzsj<bbut> dzsjVar, dzsj<boxa> dzsjVar2, bnyd bnydVar, cqkj cqkjVar, btvo btvoVar, cqhn cqhnVar) {
        bomp bompVar = new bomp(new bosk(this));
        this.o = bompVar;
        this.a = gesVar;
        this.h = bosjVar;
        this.c = bosjVar2;
        this.e = z;
        this.i = bosuVar;
        this.b = activity;
        this.d = bnydVar.a(gesVar.A, dtya.V, dtya.bH);
        boolean s = btvoVar.getUgcParameters().s();
        bonr bonrVar = new bonr(activity, gesVar, cqkjVar, btvoVar, bosjVar2.b(), s);
        this.k = bonrVar;
        bonrVar.b(bosjVar2.h());
        cqkx.j(bonrVar, bompVar);
        boolean al = btvoVar.getUgcParameters().al();
        if (s) {
            bond bondVar = new bond(activity, bosjVar2.d(), dwydVar, "", dzsjVar.a(), gesVar, true != al ? "business_hours_photo" : "business_hours_photo_gallery_default", al, dtya.ah, dtya.ab, dtya.j);
            this.f = bondVar;
            cqkx.j(bondVar, bompVar);
        } else {
            this.f = null;
        }
        this.j = dzsjVar2.a().P();
        if (z2) {
            bonr bonrVar2 = new bonr(activity, gesVar, cqkjVar, btvoVar, bosjVar.c(), false);
            bost bostVar = bonrVar2.l().booleanValue() ? new bost(cqhnVar, activity, bonrVar2, dtye.f, dtye.g, this) : null;
            this.l = bostVar;
            if (bostVar != null) {
                cqkx.j(bostVar, bompVar);
            }
        } else {
            this.l = null;
        }
        this.m = this.l != null;
        byee b = bosjVar.b();
        this.n = false;
        if (b != null) {
            this.n = b.d();
        }
        this.g = new bosm(this);
    }

    @Override // defpackage.bosv
    @dzsi
    public bopv a() {
        return this.f;
    }

    @Override // defpackage.bosv
    public Boolean b() {
        return Boolean.valueOf(this.f == null);
    }

    @Override // defpackage.bosv
    public boqa c() {
        return this.k;
    }

    @Override // defpackage.bosv
    /* renamed from: d */
    public ivn q() {
        String string;
        if (!h().booleanValue()) {
            ivn ivnVar = this.g;
            if (this.n) {
                string = this.b.getString(R.string.BUSINESS_HOURS_EDIT_HEADER);
            } else {
                string = this.b.getString(R.string.BUSINESS_HOURS_HEADER);
            }
            ivnVar.e(string);
            this.g.i(this.b.getString(true != this.e ? R.string.REPORT_MAP_ISSUE_DONE : R.string.REPORT_MAP_ISSUE_SUBMIT));
        } else {
            this.g.e(this.b.getString(R.string.BUSINESS_HOURS_VERIFY_HEADER));
            this.g.i("");
        }
        return this.g;
    }

    @Override // defpackage.bosv
    @dzsi
    public bosx e() {
        return this.l;
    }

    @Override // defpackage.bosv
    public void f() {
        this.m = false;
    }

    @Override // defpackage.bosv
    public void g(cjqm cjqmVar) {
        if (this.a.S()) {
            jmw.d(this.b, new bosl(this, cjqmVar));
        } else {
            l(cjqmVar);
        }
    }

    @Override // defpackage.bosv
    public Boolean h() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bosv
    public CharSequence i() {
        return this.j;
    }

    public void j() {
        this.o.b();
    }

    public void k(List<bbtm> list) {
        bond bondVar = this.f;
        if (bondVar != null) {
            bondVar.q(list);
            if (list.isEmpty() || this.e) {
                return;
            }
            l(cjqm.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(cjqm cjqmVar) {
        akqi akqiVar;
        byee a;
        bosi i = this.c.i();
        i.c(this.k.c());
        if (this.k.f().booleanValue()) {
            if (this.k.u().booleanValue()) {
                a = bonk.d(this.k.h(), this.c.e());
            } else {
                a = bonk.a(this.k.g(), this.c.e());
            }
            i.e(a);
        } else if (this.k.d().booleanValue()) {
            i.h(true);
        } else if (!this.k.e().booleanValue()) {
            i.e(null);
        }
        bost bostVar = this.l;
        if (bostVar != null && bostVar.b().booleanValue()) {
            i.g(true);
        }
        bosu bosuVar = this.i;
        bosj a2 = i.a();
        boolean z = this.n;
        boqt boqtVar = (boqt) bosuVar;
        boqv boqvVar = boqtVar.a;
        boqu boquVar = boqvVar.af;
        if (boquVar != null) {
            boquVar.a(a2, boqvVar.d.a(), cjqmVar);
            boqv boqvVar2 = boqtVar.a;
            boolean booleanValue = a2.f().booleanValue();
            Integer num = boqvVar2.ad;
            if (num != null) {
                if (num.intValue() == dpyv.EMPLOYEE_HOURS.dm) {
                    ((ckcn) boqvVar2.f.a(ckdz.aq)).a();
                } else if (num.intValue() == dpyv.BUSINESS_OWNER_HOURS.dm) {
                    ((ckcn) boqvVar2.f.a(ckdz.ar)).a();
                } else if (num.intValue() == dpyv.UGC_OPENING_HOURS.dm) {
                    aujt c = boqvVar2.g.c(ddos.OPENING_HOURS);
                    if (c != null && (akqiVar = boqvVar2.ae) != null) {
                        c.a(akqiVar);
                    }
                    ((ckcn) boqvVar2.f.a(ckdz.ad)).a();
                    if (!z) {
                        if (!booleanValue) {
                            ((ckcn) boqvVar2.f.a(ckdz.ae)).a();
                        }
                    } else if (booleanValue) {
                        ((ckcn) boqvVar2.f.a(ckdz.ag)).a();
                    } else {
                        ((ckcn) boqvVar2.f.a(ckdz.af)).a();
                    }
                }
            }
        } else {
            boqvVar.Nw(a2);
        }
        boqtVar.a.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        if (!this.k.f().booleanValue()) {
            return (!b().booleanValue() && !this.h.d().b().equals(this.c.d().b())) || this.k.e().booleanValue();
        }
        return true;
    }

    public boolean n() {
        return this.d.a(m());
    }

    public void o() {
        this.k.p();
    }

    @Override // defpackage.bosv
    public Boolean p() {
        return this.k.u();
    }
}
