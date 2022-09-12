package defpackage;
/* compiled from: PG */
/* renamed from: cdfq  reason: default package */
/* loaded from: classes4.dex */
final class cdfq implements degu<Boolean> {
    final /* synthetic */ cdfw a;

    public cdfq(cdfw cdfwVar) {
        this.a = cdfwVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.b();
            return;
        }
        cdfw cdfwVar = this.a;
        new RuntimeException("importPhotos failed; result == false");
        cdfwVar.a();
    }
}
