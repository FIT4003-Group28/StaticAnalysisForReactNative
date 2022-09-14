package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgqb  reason: default package */
/* loaded from: classes3.dex */
class bgqb extends appo {
    final /* synthetic */ bgqd m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgqb(bgqd bgqdVar, Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar) {
        super(activity, cqhnVar, apqeVar, cjqyVar);
        this.m = bgqdVar;
    }

    private final cjta L(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(this.m.c.q);
        return b;
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd A() {
        return L(dtxu.aV).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd B() {
        cjta L = L(dtxu.aW);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = j().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        L.a = bZ.bK();
        return L.a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd x() {
        return L(dtxu.aY).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd y() {
        return L(dtxu.aX).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd z() {
        return L(dtxu.aZ).a();
    }
}
