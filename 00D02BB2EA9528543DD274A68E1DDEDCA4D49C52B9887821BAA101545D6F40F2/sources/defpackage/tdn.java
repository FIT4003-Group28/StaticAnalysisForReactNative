package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tdn  reason: default package */
/* loaded from: classes7.dex */
public class tdn extends tdz implements tdc {
    private final tak a;
    private final twa b;
    @dzsi
    private final taj c;
    private final zfg d;

    public tdn(Activity activity, cqhn cqhnVar, vtn vtnVar, bvsl bvslVar, tam tamVar, tao taoVar, tlv tlvVar, amve amveVar) {
        zqx zqxVar = new zqx(activity, amveVar);
        this.b = new tap(activity, amveVar);
        Activity activity2 = (Activity) ((dxjd) taoVar.a).a;
        tao.b(activity2, 1);
        tao.b(amveVar, 2);
        tao.b(zqxVar, 3);
        this.a = new tan(activity2, amveVar, zqxVar);
        stf.h(activity, vtnVar, amveVar);
        tal a = tamVar.a(tlvVar, amveVar);
        this.c = true == dbsj.d(a.a()) ? null : a;
        this.d = zqc.q(activity.getResources(), bvslVar, amveVar.s(), amveVar.t(), amtg.c(amveVar));
    }

    @Override // defpackage.tdc
    public zfg a() {
        return this.d;
    }

    @Override // defpackage.tdc
    @dzsi
    public taj b() {
        return this.c;
    }

    @Override // defpackage.tdc
    public tak c() {
        return this.a;
    }

    @Override // defpackage.tdc
    public twa d() {
        return this.b;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean i() {
        return Boolean.valueOf(b() != null);
    }
}
