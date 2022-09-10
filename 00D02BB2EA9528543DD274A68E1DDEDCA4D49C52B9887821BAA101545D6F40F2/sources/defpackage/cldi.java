package defpackage;
/* compiled from: PG */
/* renamed from: cldi  reason: default package */
/* loaded from: classes5.dex */
public final class cldi implements deqn<cled> {
    public static final cldi a = new cldi();

    private cldi() {
    }

    @Override // defpackage.deql
    public final /* bridge */ /* synthetic */ void a(Object obj, deqo deqoVar) {
        cled cledVar = (cled) obj;
        deqoVar.b("requestTimeMs", cledVar.a());
        deqoVar.b("requestUptimeMs", cledVar.b());
        deqw deqwVar = (deqw) deqoVar;
        deqwVar.f("clientInfo", cledVar.c());
        deqwVar.f("logSource", cledVar.d());
        deqwVar.f("logSourceName", cledVar.e());
        deqwVar.f("logEvent", cledVar.f());
        deqwVar.f("qosTier", cledVar.g());
    }
}
