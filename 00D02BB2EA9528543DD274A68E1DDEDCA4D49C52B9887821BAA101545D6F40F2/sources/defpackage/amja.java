package defpackage;
/* compiled from: PG */
/* renamed from: amja  reason: default package */
/* loaded from: classes.dex */
public final class amja extends amxg implements amxn {
    final /* synthetic */ amjd a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amja(amjd amjdVar, bnrz bnrzVar, int i) {
        super(bnrzVar);
        this.a = amjdVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.n = new amxp(true, false, this);
    }

    @Override // defpackage.amxn
    public final boolean d(amxr amxrVar) {
        return this.a.e(amxrVar, this.b);
    }
}
