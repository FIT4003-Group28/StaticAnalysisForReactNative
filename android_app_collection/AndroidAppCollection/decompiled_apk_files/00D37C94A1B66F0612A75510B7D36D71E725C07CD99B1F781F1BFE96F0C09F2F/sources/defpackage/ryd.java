package defpackage;
/* compiled from: PG */
/* renamed from: ryd  reason: default package */
/* loaded from: classes4.dex */
final class ryd implements ankb {
    final /* synthetic */ ryh a;

    public ryd(ryh ryhVar) {
        this.a = ryhVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.a.j.i(false);
        this.a.e(th, rxx.WEB_OAUTH, "finishOAuth grpc call failed");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aofg aofgVar = (aofg) obj;
        if (aofgVar != null) {
            ryh ryhVar = this.a;
            if (ryhVar.e.m) {
                aofi aofiVar = aofgVar.b;
                if (aofiVar == null) {
                    aofiVar = aofi.a;
                }
                ryhVar.d(aofiVar.d);
                return;
            }
            ryhVar.j.i(false);
            this.a.i(aots.STATE_COMPLETE);
            ryh ryhVar2 = this.a;
            aofi aofiVar2 = aofgVar.b;
            if (aofiVar2 == null) {
                aofiVar2 = aofi.a;
            }
            ryhVar2.k(rwd.h(aofiVar2.d));
            return;
        }
        this.a.j.i(false);
        this.a.f(aotq.EVENT_MALFORMED_RESPONSE);
        this.a.k(rwd.g(1, "Linking failed; response not returned by the server"));
    }
}
