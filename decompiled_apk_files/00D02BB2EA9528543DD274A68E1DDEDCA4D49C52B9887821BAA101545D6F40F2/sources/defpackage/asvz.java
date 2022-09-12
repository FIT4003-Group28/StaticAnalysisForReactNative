package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asvz  reason: default package */
/* loaded from: classes2.dex */
public final class asvz extends asvw implements atcv {
    private asld h;

    static {
        dcnm.a(asld.OVERVIEW, asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION, asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION);
    }

    public asvz(btrm btrmVar, bvjj bvjjVar, araa araaVar, aufc aufcVar, Executor executor, asvx asvxVar) {
        super(btrmVar, bvjjVar, araaVar, true, aufcVar, executor, asvxVar);
        this.h = null;
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        asld asldVar = atlqVar.c.a;
        this.h = asldVar;
        i(asldVar == asld.FREE_MOVEMENT);
        k(2);
    }
}
