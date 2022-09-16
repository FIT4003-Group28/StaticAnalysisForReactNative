package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ajte  reason: default package */
/* loaded from: classes2.dex */
public final class ajte implements btzi<ditg, diti> {
    final /* synthetic */ btlu a;
    final /* synthetic */ dqzv b;
    final /* synthetic */ deig c;
    final /* synthetic */ ajtg d;

    public ajte(ajtg ajtgVar, btlu btluVar, dqzv dqzvVar, deig deigVar) {
        this.d = ajtgVar;
        this.a = btluVar;
        this.b = dqzvVar;
        this.c = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<ditg> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        ajtg ajtgVar = this.d;
        ajtgVar.f.a(new aiht(new eapd(ajtgVar.e.b()), this.b), dbsg.i(this.a));
        this.d.c.b(this.a);
        this.c.j(null);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<ditg> btzrVar, diti ditiVar) {
        dqzv dqzvVar = ditiVar.a;
        if (dqzvVar == null) {
            dqzvVar = dqzv.h;
        }
        eapd eapdVar = new eapd(this.d.e.b());
        dbsg<Profile> h = aiij.h(dqzvVar);
        if (h.a()) {
            this.d.g.a(aiij.g(h.b(), eapdVar), dbsg.i(this.a));
        }
        this.d.f.a(new aihq(eapdVar, this.b, false), dbsg.i(this.a));
        this.d.c.b(this.a);
        this.c.j(dqzvVar);
    }
}
