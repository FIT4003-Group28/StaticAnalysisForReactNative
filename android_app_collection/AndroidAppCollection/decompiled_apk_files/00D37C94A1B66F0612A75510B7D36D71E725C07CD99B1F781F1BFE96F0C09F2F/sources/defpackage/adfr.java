package defpackage;
/* compiled from: PG */
/* renamed from: adfr  reason: default package */
/* loaded from: classes.dex */
final class adfr implements ayom {
    final /* synthetic */ adft a;

    public adfr(adft adftVar) {
        this.a = adftVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        zep.f(adft.a, "Received error observing isCastingEnabled.", th);
        this.a.c.qr();
    }

    @Override // defpackage.ayom
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.b = ((Boolean) obj).booleanValue();
        this.a.c();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.a.c = aypgVar;
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.c.qr();
    }
}
