package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpj  reason: default package */
/* loaded from: classes6.dex */
public final class dzpj extends dzpn implements dzrn {
    final /* synthetic */ dzpp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpj(dzpp dzppVar) {
        super(dzppVar);
        this.a = dzppVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a[b()];
    }
}
