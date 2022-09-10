package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzil  reason: default package */
/* loaded from: classes6.dex */
public final class dzil extends dziq implements dzrn<dzio> {
    final /* synthetic */ dzis a;
    private dzio h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzil(dzis dzisVar) {
        super(dzisVar);
        this.a = dzisVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzio dzioVar = new dzio(this.a, b());
        this.h = dzioVar;
        return dzioVar;
    }

    @Override // defpackage.dziq, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
