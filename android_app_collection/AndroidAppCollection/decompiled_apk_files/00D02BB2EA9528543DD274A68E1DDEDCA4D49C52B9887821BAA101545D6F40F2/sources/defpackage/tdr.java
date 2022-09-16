package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tdr  reason: default package */
/* loaded from: classes7.dex */
public class tdr extends tdz implements tde {
    private final tak a;
    private final tvz b;
    private final CharSequence c;
    @dzsi
    private final suo d;
    private final gga e;
    private final wuv f;

    public tdr(Activity activity, gga ggaVar, cqhn cqhnVar, tao taoVar, suq suqVar, tlv tlvVar, amve amveVar, wuv wuvVar) {
        sup supVar;
        this.e = ggaVar;
        this.f = wuvVar;
        this.a = taoVar.a(amveVar);
        this.c = stf.b(activity, vyb.k(activity, vyb.e(amveVar)), wuvVar.n());
        this.b = twh.a(wuvVar);
        if (tlvVar.d().j().a()) {
            supVar = suqVar.a(wuvVar.l() != null);
        } else {
            supVar = null;
        }
        this.d = supVar;
    }

    @Override // defpackage.tde
    public tak a() {
        return this.a;
    }

    @Override // defpackage.tde
    @dzsi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.tde
    @dzsi
    public CharSequence c() {
        return this.f.y(this.e.getResources());
    }

    @Override // defpackage.tde
    public Boolean d() {
        return Boolean.valueOf(this.f.l() != null);
    }

    @Override // defpackage.tde
    public cqkl e() {
        drgz l = this.f.l();
        if (!this.e.g().J() && l != null) {
            wtw.a(l, dbsj.f(this.f.n())).aJ(this.e);
        }
        return cqkl.a;
    }

    @Override // defpackage.tde
    public tvz f() {
        return this.b;
    }

    @Override // defpackage.tde
    @dzsi
    public suo g() {
        return this.d;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean j() {
        return true;
    }
}
