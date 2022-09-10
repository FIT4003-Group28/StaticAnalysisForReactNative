package defpackage;
/* compiled from: PG */
/* renamed from: cldh  reason: default package */
/* loaded from: classes5.dex */
public final class cldh implements deqn<cleb> {
    public static final cldh a = new cldh();

    private cldh() {
    }

    @Override // defpackage.deql
    public final /* bridge */ /* synthetic */ void a(Object obj, deqo deqoVar) {
        cleb clebVar = (cleb) obj;
        deqoVar.b("eventTimeMs", clebVar.a());
        deqw deqwVar = (deqw) deqoVar;
        deqwVar.f("eventCode", clebVar.b());
        deqoVar.b("eventUptimeMs", clebVar.c());
        deqwVar.f("sourceExtension", clebVar.d());
        deqwVar.f("sourceExtensionJsonProto3", clebVar.e());
        deqoVar.b("timezoneOffsetSeconds", clebVar.f());
        deqwVar.f("networkConnectionInfo", clebVar.g());
    }
}
