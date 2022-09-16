package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzlm  reason: default package */
/* loaded from: classes6.dex */
public final class dzlm extends dzlq implements dzna {
    final /* synthetic */ dzls a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzlm(dzls dzlsVar) {
        super(dzlsVar);
        this.a = dzlsVar;
    }

    @Override // defpackage.dzna
    public final long b() {
        return this.a.b[c()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(this.a.b[c()]);
    }
}
