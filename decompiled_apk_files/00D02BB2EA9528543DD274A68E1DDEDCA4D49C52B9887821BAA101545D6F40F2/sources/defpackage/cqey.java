package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: cqey  reason: default package */
/* loaded from: classes5.dex */
public final class cqey {
    public final cznl a;
    public final dbty<cznb> b = dbud.a(new dbty(this) { // from class: cqex
        private final cqey a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cznb b = this.a.a.b("/client_streamz/location_consent_flows/android/event_count", cznf.b("flow_id"), cznf.a("event_type"), cznf.b("android_api_level"));
            b.d();
            return b;
        }
    });
    private final cznj c;

    public cqey(ScheduledExecutorService scheduledExecutorService, cznn cznnVar) {
        cznl a = cznl.a("STREAMZ_LOCATION_CONSENT_FLOWS");
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
