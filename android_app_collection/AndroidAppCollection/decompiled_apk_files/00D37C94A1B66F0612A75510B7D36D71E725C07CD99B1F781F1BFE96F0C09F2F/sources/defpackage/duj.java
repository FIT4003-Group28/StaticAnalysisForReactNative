package defpackage;
/* compiled from: PG */
/* renamed from: duj  reason: default package */
/* loaded from: classes3.dex */
public final class duj extends dux {
    public duj(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "2xhaeBqmljdcxdVRLDf+DsIqiMbtdgVwLAnyjmtzuBrCJQ9V1lc+udLICJmCUjME", "EmUnW+V8SpRlFPWPt2G17q1wScavZbElVhdmnpDMxvs=", aopaVar, i, 12);
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.b |= 2048;
        dnwVar.k = -1L;
        aopa aopaVar2 = this.g;
        long longValue = ((Long) this.d.invoke(null, this.a.a)).longValue();
        aopaVar2.copyOnWrite();
        dnw dnwVar3 = (dnw) aopaVar2.instance;
        dnwVar3.b |= 2048;
        dnwVar3.k = longValue;
    }
}
