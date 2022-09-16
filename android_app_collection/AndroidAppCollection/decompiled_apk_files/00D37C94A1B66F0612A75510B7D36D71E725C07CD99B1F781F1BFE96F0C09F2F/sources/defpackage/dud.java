package defpackage;
/* compiled from: PG */
/* renamed from: dud  reason: default package */
/* loaded from: classes3.dex */
public final class dud extends dux {
    private final long h;

    public dud(dtq dtqVar, aopa aopaVar, long j, int i) {
        super(dtqVar, "7qQfVBj0qucDMIezkfZznwQ/TgBvJzjDF8gis4aOkX0sgFIOlDV4iWfwg37KzfBn", "M8MzEajoogfW90Zvcmp8+7EhAqEBWPn0oQ/WWLhYD08=", aopaVar, i, 25);
        this.h = j;
    }

    @Override // defpackage.dux
    protected final void a() {
        long longValue = ((Long) this.d.invoke(null, new Object[0])).longValue();
        synchronized (this.g) {
            aopa aopaVar = this.g;
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.d |= 8192;
            dnwVar.ae = longValue;
            long j = this.h;
            if (j != 0) {
                aopa aopaVar2 = this.g;
                long j2 = longValue - j;
                aopaVar2.copyOnWrite();
                dnw dnwVar3 = (dnw) aopaVar2.instance;
                dnwVar3.b |= 65536;
                dnwVar3.o = j2;
                aopa aopaVar3 = this.g;
                long j3 = this.h;
                aopaVar3.copyOnWrite();
                dnw dnwVar4 = (dnw) aopaVar3.instance;
                dnwVar4.b |= 2097152;
                dnwVar4.r = j3;
            }
        }
    }
}
