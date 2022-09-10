package defpackage;
/* compiled from: PG */
/* renamed from: avez  reason: default package */
/* loaded from: classes2.dex */
final class avez implements degu<dlrj> {
    final /* synthetic */ avfd a;

    public avez(avfd avfdVar) {
        this.a = avfdVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.a.S(bvjk.bK, false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dlrj dlrjVar) {
        dlqm dlqmVar = dlrjVar.c;
        if (dlqmVar == null) {
            dlqmVar = dlqm.b;
        }
        if (dlqmVar.a.size() != 1) {
            this.a.a.S(bvjk.bK, false);
            return;
        }
        bvjj bvjjVar = this.a.a;
        bvjk bvjkVar = bvjk.bK;
        dlug dlugVar = dlqmVar.a.get(0).c;
        if (dlugVar == null) {
            dlugVar = dlug.c;
        }
        bvjjVar.S(bvjkVar, !dlugVar.equals(dlug.c));
    }
}
