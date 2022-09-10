package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpu  reason: default package */
/* loaded from: classes6.dex */
public final class dzpu extends dzpy implements dzrn {
    final /* synthetic */ dzqa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpu(dzqa dzqaVar) {
        super(dzqaVar);
        this.a = dzqaVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a[a()];
    }
}
