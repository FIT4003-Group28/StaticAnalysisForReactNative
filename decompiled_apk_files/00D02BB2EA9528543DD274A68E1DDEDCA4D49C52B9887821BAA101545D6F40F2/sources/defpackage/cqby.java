package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: cqby  reason: default package */
/* loaded from: classes5.dex */
public final class cqby {
    public final cznl a;
    public final dbty<cznb> b = dbud.a(new dbty(this) { // from class: cqbx
        private final cqby a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cznb b = this.a.a.b("/client_streamz/footprints_consent_flows/android/event_count", cznf.b("ui_flow_id"), cznf.a("event_type"), cznf.b("android_api_level"), cznf.b("setting_id"));
            b.d();
            return b;
        }
    });
    private final cznj c;

    public cqby(ScheduledExecutorService scheduledExecutorService, cznn cznnVar) {
        cznl a = cznl.a("STREAMZ_FOOTPRINTS_CONSENT_FLOWS");
        this.a = a;
        cznj cznjVar = a.a;
        if (cznjVar == null) {
            this.c = cznt.b(cznnVar, scheduledExecutorService, a, null);
            return;
        }
        this.c = cznjVar;
        ((cznt) cznjVar).a = cznnVar;
    }
}
