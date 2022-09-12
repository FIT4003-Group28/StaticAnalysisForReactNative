package defpackage;
/* compiled from: PG */
/* renamed from: bzdq  reason: default package */
/* loaded from: classes4.dex */
public final class bzdq extends bzdp {
    private final bzcw d;

    public bzdq(dbsz<bzek> dbszVar, String str) {
        super(dbszVar, bzdg.a);
        this.d = new bzcp(bzdg.a, str);
    }

    @Override // defpackage.bzek
    protected final int a(amuo amuoVar) {
        throw new UnsupportedOperationException("Cannot compare step");
    }

    @Override // defpackage.bzek
    protected final /* bridge */ /* synthetic */ bzdh b() {
        return this.d;
    }
}
