package defpackage;
/* compiled from: PG */
/* renamed from: uiy  reason: default package */
/* loaded from: classes4.dex */
public final class uiy {
    public uiz a;

    public final void a(aomi aomiVar) {
        uwp.e();
        uiz uizVar = this.a;
        for (ucp ucpVar : uizVar.a.c()) {
            String str = ucpVar.b;
            ubx ubxVar = ucpVar.f;
            if (ubxVar == ubx.REGISTERED || ubxVar == ubx.PENDING_REGISTRATION || ubxVar == ubx.FAILED_REGISTRATION) {
                uizVar.a(str, true, aomiVar);
            }
        }
    }
}
