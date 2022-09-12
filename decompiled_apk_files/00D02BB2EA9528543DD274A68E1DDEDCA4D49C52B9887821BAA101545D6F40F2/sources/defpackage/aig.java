package defpackage;
/* compiled from: PG */
/* renamed from: aig  reason: default package */
/* loaded from: classes.dex */
final class aig extends aij {
    final /* synthetic */ aih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aig(aih aihVar) {
        super(aihVar.b);
        this.a = aihVar;
    }

    @Override // defpackage.aij
    protected final Object a(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.aij
    protected final void b(int i) {
        this.a.c(i);
    }
}
