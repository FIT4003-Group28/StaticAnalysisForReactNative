package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzll  reason: default package */
/* loaded from: classes6.dex */
public final class dzll extends dzlq implements dzrn<dzlo> {
    final /* synthetic */ dzls a;
    private dzlo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzll(dzls dzlsVar) {
        super(dzlsVar);
        this.a = dzlsVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzlo dzloVar = new dzlo(this.a, c());
        this.h = dzloVar;
        return dzloVar;
    }

    @Override // defpackage.dzlq, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
