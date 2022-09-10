package defpackage;
/* renamed from: bmse  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmse implements dbrn {
    static final dbrn a = new bmse();

    private bmse() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Long l = (Long) obj;
        dqmw bZ = dqmx.d.bZ();
        dbsk.s(l);
        long longValue = l.longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqmx dqmxVar = (dqmx) bZ.b;
        dqmxVar.a |= 1;
        dqmxVar.b = longValue;
        return bZ;
    }
}
