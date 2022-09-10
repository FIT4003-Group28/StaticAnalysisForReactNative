package defpackage;
/* compiled from: PG */
/* renamed from: cwpa  reason: default package */
/* loaded from: classes5.dex */
final class cwpa implements degu<dcdc<cwls>> {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ cwpb c;
    private final String d;

    public cwpa(cwpb cwpbVar, boolean z, long j) {
        this.c = cwpbVar;
        this.a = z;
        this.b = j;
        this.d = cwpbVar.b.name();
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        String a = cwik.a(th);
        cwpb cwpbVar = this.c;
        cwpbVar.a.c(this.d, a, -1, cwpbVar.c, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, a, -1, this.c.c, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<cwls> dcdcVar) {
        int min = Math.min(dcdcVar.size(), 10);
        cwpb cwpbVar = this.c;
        cwpbVar.a.c(this.d, "OK", min, cwpbVar.c, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, "OK", min, this.c.c, this.a);
    }
}
