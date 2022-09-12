package defpackage;
/* compiled from: PG */
/* renamed from: dypq  reason: default package */
/* loaded from: classes6.dex */
final class dypq extends dyok {
    final /* synthetic */ dyls a;
    final /* synthetic */ dypr b;

    public dypq(dypr dyprVar, dyls dylsVar) {
        this.b = dyprVar;
        this.a = dylsVar;
    }

    @Override // defpackage.dyok, defpackage.dyls
    public final void a(dylu dyluVar) {
        this.b.a.a();
        this.a.a(new dypp(this, dyluVar));
    }

    @Override // defpackage.dyok
    protected final dyls o() {
        return this.a;
    }
}
