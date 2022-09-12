package defpackage;
/* compiled from: PG */
/* renamed from: dzpz  reason: default package */
/* loaded from: classes6.dex */
final class dzpz extends dzpy implements dzna {
    final /* synthetic */ dzqa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpz(dzqa dzqaVar) {
        super(dzqaVar);
        this.a = dzqaVar;
    }

    @Override // defpackage.dzna
    public final long b() {
        return this.a.b[a()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(this.a.b[a()]);
    }
}
