package defpackage;
/* compiled from: PG */
/* renamed from: dzlr  reason: default package */
/* loaded from: classes6.dex */
final class dzlr extends dzlq implements dzkd {
    final /* synthetic */ dzls a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzlr(dzls dzlsVar) {
        super(dzlsVar);
        this.a = dzlsVar;
    }

    @Override // defpackage.dzkd
    public final int a() {
        return this.a.c[c()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(this.a.c[c()]);
    }
}
