package defpackage;
/* compiled from: PG */
/* renamed from: ryf  reason: default package */
/* loaded from: classes4.dex */
final class ryf implements ankb {
    final /* synthetic */ Throwable a;
    final /* synthetic */ ryh b;

    public ryf(ryh ryhVar, Throwable th) {
        this.b = ryhVar;
        this.a = th;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.b.j.i(false);
        this.b.e(th, null, "Google credential deposit failed. Failed to delete 3P token.");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aofc aofcVar = (aofc) obj;
        this.b.j.i(false);
        this.b.e(this.a, null, "Google credential deposit failed. 3P token deleted.");
    }
}
