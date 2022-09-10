package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpo  reason: default package */
/* loaded from: classes6.dex */
public final class dzpo extends dzpn implements dzkd {
    final /* synthetic */ dzpp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpo(dzpp dzppVar) {
        super(dzppVar);
        this.a = dzppVar;
    }

    @Override // defpackage.dzkd
    public final int a() {
        return this.a.b[b()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(this.a.b[b()]);
    }
}
