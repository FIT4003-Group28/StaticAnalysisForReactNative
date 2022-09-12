package defpackage;
/* compiled from: PG */
/* renamed from: sva  reason: default package */
/* loaded from: classes7.dex */
final class sva implements degu<Boolean> {
    final /* synthetic */ svb a;

    public sva(svb svbVar) {
        this.a = svbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        this.a.a.j(bool.booleanValue() ? sur.SERVICE_ONLINE : sur.SERVICE_UNAVAILABLE);
    }
}
