package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arja  reason: default package */
/* loaded from: classes2.dex */
public class arja extends bnjo {
    private final arij a;
    private final bflc b;
    private final arin c;
    private final bnie d;
    private final behx e;
    @dzsi
    private String f;
    private boolean g;

    public arja(Activity activity, bfld bfldVar, arin arinVar, jkf jkfVar, behx behxVar, bniv bnivVar, bfhx bfhxVar, bniy bniyVar, cqhn cqhnVar, boolean z, vwv vwvVar, cpv cpvVar) {
        super(activity, bnivVar, bniyVar, cjtd.a(dtxv.eF), cpvVar, false, false, true, false);
        this.e = behxVar;
        this.a = new arij(activity.getResources(), jkfVar, ap(), jjn.COLLAPSED, z, bfhxVar, super.aq());
        Activity activity2 = (Activity) ((dxjd) bfldVar.a).a;
        bfld.a(activity2, 2);
        this.b = new bflc(2131231692, activity2);
        this.c = arinVar;
        behxVar.b(iln.MY_MAPS_FEATURE, false, false, true, false);
        this.d = new ariz(behxVar);
    }

    @Override // defpackage.bnjo
    public void A(btrm btrmVar) {
    }

    @Override // defpackage.bnjo
    public void B(btrm btrmVar) {
    }

    @Override // defpackage.bnih
    public cqkl C() {
        return cqkl.a;
    }

    public void a(String str, String str2) {
        this.f = str2;
        this.a.b(str);
        for (befz<? extends bega> befzVar : this.e.a()) {
            if (befzVar.c() instanceof arhg) {
                ((arhg) befzVar.c()).E(str2);
            }
        }
        cqkx.p(this);
    }

    public void b(arhf arhfVar) {
        this.a.c(arhfVar.f());
        this.c.b(arhfVar.f().a);
        for (befz<? extends bega> befzVar : this.e.a()) {
            if (befzVar.c() instanceof arhg) {
                ((arhg) befzVar.c()).D(arhfVar.f());
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.bnih
    public bfgu c() {
        return this.a;
    }

    @Override // defpackage.bnih
    public Boolean d() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.bnih
    public iln e() {
        return iln.MY_MAPS_FEATURE;
    }

    @Override // defpackage.bnjo
    public void f(jjn jjnVar) {
        this.a.a(jjnVar);
        an(jjnVar);
        this.g = jjnVar == jjn.EXPANDED;
    }

    @Override // defpackage.bnjo
    public void g(Bundle bundle) {
    }

    @Override // defpackage.bnjo
    public void h(Bundle bundle) {
    }

    @Override // defpackage.bnih
    public jbk i() {
        return this.c;
    }

    @Override // defpackage.bnih
    public Boolean j() {
        return this.a.l();
    }

    @Override // defpackage.bnih
    public Boolean k() {
        return this.a.m();
    }

    @Override // defpackage.bnih
    public Boolean l() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bnih
    public Boolean m() {
        return false;
    }

    @Override // defpackage.bnih
    public cjtd n() {
        return cjtd.a(dtxv.eA);
    }

    @Override // defpackage.bnih
    public bfkm o() {
        return this.b;
    }

    @Override // defpackage.bnjo
    @dzsi
    public CharSequence p() {
        return null;
    }

    @Override // defpackage.bnih
    @dzsi
    public bfch q() {
        return null;
    }

    @Override // defpackage.bnih
    @dzsi
    public bfch r() {
        return null;
    }

    @Override // defpackage.bnih
    @dzsi
    public bfat s() {
        return null;
    }

    @Override // defpackage.bnih
    public bnie t() {
        return this.d;
    }

    @Override // defpackage.bnih
    public Boolean u() {
        return false;
    }

    @Override // defpackage.bnih
    public Boolean v() {
        return false;
    }

    @Override // defpackage.bnih
    public Boolean w() {
        return false;
    }

    @Override // defpackage.bnih
    public bfgt x() {
        return null;
    }

    @Override // defpackage.bnih
    public bfgr y() {
        return null;
    }

    @Override // defpackage.bnjo
    public void z(Context context, bwrs<ilo> bwrsVar) {
    }
}
