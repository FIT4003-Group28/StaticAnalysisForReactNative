package defpackage;
/* compiled from: PG */
/* renamed from: bvyq  reason: default package */
/* loaded from: classes4.dex */
final class bvyq implements degu<dmcj> {
    final /* synthetic */ String a;
    final /* synthetic */ bvys b;

    public bvyq(bvys bvysVar, String str) {
        this.b = bvysVar;
        this.a = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvyr remove;
        synchronized (this.b) {
            remove = this.b.d.remove(this.a);
        }
        if (remove != null) {
            ddyq c = remove.c();
            dsqp dsqpVar = (dsqp) c.cu(5);
            dsqpVar.bC(c);
            ddyf ddyfVar = (ddyf) dsqpVar;
            drtc drtcVar = drtc.DEADLINE_EXCEEDED;
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar = (ddyq) ddyfVar.b;
            ddyq ddyqVar2 = ddyq.K;
            ddyqVar.A = drtcVar.s;
            ddyqVar.b |= 8;
            this.b.c.a(ckku.f, ddyfVar.bK());
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dmcj dmcjVar) {
    }
}
