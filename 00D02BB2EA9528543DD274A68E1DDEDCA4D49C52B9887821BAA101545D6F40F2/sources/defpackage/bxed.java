package defpackage;
/* compiled from: PG */
/* renamed from: bxed  reason: default package */
/* loaded from: classes4.dex */
final class bxed implements Runnable {
    final /* synthetic */ bxef a;
    @dzsi
    private final btxx b;
    private final btxx c;
    private final bxep<?, ?> d;

    public bxed(bxef bxefVar, @dzsi bxep<?, ?> bxepVar, btxx btxxVar, btxx btxxVar2) {
        this.a = bxefVar;
        this.b = btxxVar;
        this.d = bxepVar;
        long max = Math.max(bxefVar.b - (bxefVar.a.e() - bxefVar.c), 0L);
        bvrb a = bxefVar.d.a.a();
        bxli.a(a, 1);
        bxli.a(btxxVar2, 2);
        this.c = new bxlh(a, btxxVar2, max, bxefVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            btxx btxxVar = this.b;
            if (btxxVar != null) {
                btxxVar.b();
            }
            bxef bxefVar = this.a;
            btxx btxxVar2 = this.c;
            bxefVar.e = btxxVar2;
            bxefVar.f = this.d;
            btxxVar2.a();
        }
    }
}
