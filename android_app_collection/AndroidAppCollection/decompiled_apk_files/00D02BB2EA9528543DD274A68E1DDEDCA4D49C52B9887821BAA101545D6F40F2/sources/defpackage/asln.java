package defpackage;

import defpackage.asln;
/* compiled from: PG */
/* renamed from: asln  reason: default package */
/* loaded from: classes2.dex */
public final class asln<T extends asln<T>> extends asle<T> {
    public final dccx<aslo> e;
    @dzsi
    public aslf f;

    public asln() {
        this.e = dcdc.F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asle
    public final void b() {
        aslf aslfVar;
        if (this.a != asld.INSPECT_ROUTE_SECTION) {
            bvoo.h("CameraMode should be INSPECT_ROUTE_SECTION but was %s.", this.a);
            this.a = asld.INSPECT_ROUTE_SECTION;
        }
        while (true) {
            aslfVar = this.f;
            if (!(aslfVar instanceof aslp)) {
                break;
            }
            this.f = ((aslp) aslfVar).g;
        }
        if (aslfVar == null) {
            this.f = new asle().a();
        } else if (aslfVar.a == asld.FOLLOWING || this.f.a == asld.OVERVIEW || this.f.a == asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION || this.f.a == asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION) {
        } else {
            asle asleVar = new asle(this.f);
            asleVar.a = asld.FOLLOWING;
            this.f = asleVar.a();
        }
    }

    @Override // defpackage.asle
    /* renamed from: d */
    public final aslp a() {
        b();
        return new aslp(this);
    }

    public final void e(aslo... asloVarArr) {
        this.e.h(asloVarArr);
    }

    public asln(aslf aslfVar) {
        super(aslfVar);
        dccx<aslo> F = dcdc.F();
        this.e = F;
        if (aslfVar instanceof aslp) {
            aslp aslpVar = (aslp) aslfVar;
            F.i(aslpVar.f);
            this.f = aslpVar.g;
        }
    }
}
