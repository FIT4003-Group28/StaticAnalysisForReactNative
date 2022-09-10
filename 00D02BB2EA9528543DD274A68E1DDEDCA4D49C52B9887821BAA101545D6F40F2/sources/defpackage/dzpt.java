package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpt  reason: default package */
/* loaded from: classes6.dex */
public final class dzpt extends dzpy implements dzrn<dzpw> {
    final /* synthetic */ dzqa a;
    private dzpw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpt(dzqa dzqaVar) {
        super(dzqaVar);
        this.a = dzqaVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzpw dzpwVar = new dzpw(this.a, a());
        this.h = dzpwVar;
        return dzpwVar;
    }

    @Override // defpackage.dzpy, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
