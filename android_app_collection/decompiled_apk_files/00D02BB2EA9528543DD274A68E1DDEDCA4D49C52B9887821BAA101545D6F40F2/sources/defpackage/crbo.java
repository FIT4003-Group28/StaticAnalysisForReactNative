package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crbo  reason: default package */
/* loaded from: classes5.dex */
public final class crbo implements crbm {
    public static final arc a;
    public final arv b;
    @dzsi
    public arq c;
    @dzsi
    public crbn d;
    public int e;
    @dzsi
    public crbq f;
    private final bvjj g;

    static {
        arb arbVar = new arb();
        arbVar.c("android.media.intent.category.LIVE_AUDIO");
        a = arbVar.a();
    }

    public crbo(bvjj bvjjVar, arv arvVar) {
        bvrj.UI_THREAD.c();
        dbsk.s(bvjjVar);
        this.g = bvjjVar;
        this.b = arvVar;
        this.e = 1;
    }

    @Override // defpackage.crbm
    public final boolean a() {
        bvrj.UI_THREAD.c();
        return anac.b && !this.g.m(bvjk.eO, true) && !arv.c().c.equals(arv.b().c) && this.e == 1;
    }
}
