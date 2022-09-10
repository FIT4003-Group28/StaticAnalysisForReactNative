package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzjm  reason: default package */
/* loaded from: classes6.dex */
public final class dzjm extends dzjq implements dzkd {
    final /* synthetic */ dzjs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzjm(dzjs dzjsVar) {
        super(dzjsVar);
        this.a = dzjsVar;
    }

    @Override // defpackage.dzkd
    public final int a() {
        return this.a.a[b()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(this.a.a[b()]);
    }
}
