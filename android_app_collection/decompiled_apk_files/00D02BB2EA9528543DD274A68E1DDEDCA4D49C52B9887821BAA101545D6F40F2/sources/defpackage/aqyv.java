package defpackage;
/* compiled from: PG */
/* renamed from: aqyv  reason: default package */
/* loaded from: classes2.dex */
final class aqyv implements aqyq {
    final /* synthetic */ arae a;
    final /* synthetic */ aqyw b;

    public aqyv(aqyw aqywVar, arae araeVar) {
        this.b = aqywVar;
        this.a = araeVar;
    }

    @Override // defpackage.aqyq
    public final void a(araf arafVar) {
        this.b.l(arafVar);
        if (arafVar == araf.OPTIMIZED) {
            this.b.a.n();
        }
        arae araeVar = this.a;
        if (araeVar != null) {
            araeVar.a(arafVar);
        }
    }

    @Override // defpackage.cjxc
    public final void b(boolean z) {
        this.b.l(araf.NOT_OPTIMIZED_OR_DISABLED);
        arae araeVar = this.a;
        if (araeVar != null) {
            araeVar.a(araf.NOT_OPTIMIZED_OR_DISABLED);
        }
    }
}
