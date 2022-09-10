package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpi  reason: default package */
/* loaded from: classes6.dex */
public final class dzpi extends dzpn implements dzrn<dzpl> {
    final /* synthetic */ dzpp a;
    private dzpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpi(dzpp dzppVar) {
        super(dzppVar);
        this.a = dzppVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzpl dzplVar = new dzpl(this.a, b());
        this.h = dzplVar;
        return dzplVar;
    }

    @Override // defpackage.dzpn, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
