package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afns  reason: default package */
/* loaded from: classes2.dex */
public final class afns implements afks {
    private final aflu a;

    public afns(aflu afluVar) {
        dbsk.s(afluVar);
        this.a = afluVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_MAPS_ENGINE_MAP;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        int i = duqpVar.a;
        if ((i & 32) == 0 || (i & 262144) == 0) {
            throw new afkt("No My Maps request / response.");
        }
        aflu afluVar = this.a;
        dvct dvctVar = duqpVar.f;
        if (dvctVar == null) {
            dvctVar = dvct.f;
        }
        dvcx dvcxVar = duqpVar.m;
        if (dvcxVar == null) {
            dvcxVar = dvcx.c;
        }
        return new aflt(afluVar, dvctVar, dvcxVar);
    }
}
