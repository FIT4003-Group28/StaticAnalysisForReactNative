package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ppt  reason: default package */
/* loaded from: classes4.dex */
public final class ppt extends ppo {
    public static final Object b = new Object();
    public final Object d;
    private final Object e;

    public ppt(pkt pktVar, Object obj, Object obj2) {
        super(pktVar);
        this.e = obj;
        this.d = obj2;
    }

    public static ppt i(pkt pktVar, Object obj, Object obj2) {
        return new ppt(pktVar, obj, obj2);
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final int b(Object obj) {
        Object obj2;
        pkt pktVar = this.a;
        if (b.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return pktVar.b(obj);
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        this.a.e(i, pkrVar, z);
        if (pxi.M(pkrVar.b, this.d) && z) {
            pkrVar.b = b;
        }
        return pkrVar;
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        this.a.g(i, pksVar, j);
        if (pxi.M(pksVar.b, this.e)) {
            pksVar.b = pks.a;
        }
        return pksVar;
    }

    public final ppt h(pkt pktVar) {
        return new ppt(pktVar, this.e, this.d);
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final Object j(int i) {
        Object j = this.a.j(i);
        return pxi.M(j, this.d) ? b : j;
    }
}
