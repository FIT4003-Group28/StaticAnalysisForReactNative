package defpackage;
/* compiled from: PG */
/* renamed from: caem  reason: default package */
/* loaded from: classes4.dex */
public final class caem<T> extends btrh<T> {
    private final int d;

    public caem(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cadx cadxVar;
        if (this.d != 0) {
            caej caejVar = (caej) this.a;
            blpj blpjVar = (blpj) obj;
            return;
        }
        caej caejVar2 = (caej) this.a;
        bqje bqjeVar = (bqje) obj;
        ilo c = bqjeVar.a.c();
        if (c == null || (cadxVar = caejVar2.a.e.get(c.ai().o())) == null) {
            return;
        }
        cadxVar.t(bqjeVar.a);
        if (!bqjeVar.b.isEmpty()) {
            cadxVar.n.clear();
        }
        if (!cadxVar.q().booleanValue()) {
            caejVar2.a.Q(cadxVar);
        }
        cqkx.p(caejVar2.a);
        if (bqjeVar.c != 1) {
            return;
        }
        cadxVar.c();
    }
}
