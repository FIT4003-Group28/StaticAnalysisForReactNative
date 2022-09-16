package defpackage;
/* compiled from: PG */
/* renamed from: beqj  reason: default package */
/* loaded from: classes3.dex */
public final class beqj implements beqm {
    final /* synthetic */ ccln a;
    final /* synthetic */ ilo b;
    final /* synthetic */ beqn c;
    final /* synthetic */ beth d;

    public beqj(beqn beqnVar, beth bethVar, ccln cclnVar, ilo iloVar) {
        this.c = beqnVar;
        this.d = bethVar;
        this.a = cclnVar;
        this.b = iloVar;
    }

    @Override // defpackage.beqm
    public final void a(@dzsi baad baadVar) {
        final beth bethVar = this.d;
        final boolean z = baadVar != null && baadVar.g(this.c.c(baadVar, this.a, this.b));
        betj betjVar = bethVar.a;
        betjVar.e = false;
        if (baadVar == null) {
            betjVar.f.b(new Runnable(bethVar) { // from class: betf
                private final beth a;

                {
                    this.a = bethVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a.a);
                }
            }, bvrj.UI_THREAD);
        } else {
            betjVar.f.b(new Runnable(bethVar, z) { // from class: betg
                private final beth a;
                private final boolean b;

                {
                    this.a = bethVar;
                    this.b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    beth bethVar2 = this.a;
                    boolean z2 = this.b;
                    betj betjVar2 = bethVar2.a;
                    betjVar2.d = z2;
                    cqkx.p(betjVar2);
                }
            }, bvrj.UI_THREAD);
        }
    }
}
