package defpackage;
/* compiled from: PG */
/* renamed from: ryc  reason: default package */
/* loaded from: classes4.dex */
final class ryc implements ankb {
    final /* synthetic */ ryh a;

    public ryc(ryh ryhVar) {
        this.a = ryhVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.a.j.i(false);
        this.a.e(th, rxx.APP_FLIP, "createLink grpc call failed");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aofi aofiVar = (aofi) obj;
        if (aofiVar != null) {
            ryh ryhVar = this.a;
            if (ryhVar.e.m) {
                ryhVar.d(aofiVar.d);
                return;
            }
            ryhVar.j.i(false);
            this.a.i(aots.STATE_COMPLETE);
            this.a.k(rwd.h(aofiVar.d));
            return;
        }
        this.a.j.i(false);
        this.a.f(aotq.EVENT_MALFORMED_RESPONSE);
        this.a.k(rwd.g(1, "Linking failed; link was not returned by the server "));
    }
}
