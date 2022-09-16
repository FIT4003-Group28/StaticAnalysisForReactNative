package defpackage;
/* compiled from: PG */
/* renamed from: aesj  reason: default package */
/* loaded from: classes2.dex */
final class aesj extends cqmr {
    boolean a = false;
    final /* synthetic */ cqjz b;
    final /* synthetic */ aesk c;

    public aesj(aesk aeskVar, cqjz cqjzVar) {
        this.c = aeskVar;
        this.b = cqjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void a(cqkp cqkpVar, boolean z) {
        bmog.b(this.b.c, new aesi(this), this.c.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        bmog.a(this.b.c);
        this.a = false;
    }
}
