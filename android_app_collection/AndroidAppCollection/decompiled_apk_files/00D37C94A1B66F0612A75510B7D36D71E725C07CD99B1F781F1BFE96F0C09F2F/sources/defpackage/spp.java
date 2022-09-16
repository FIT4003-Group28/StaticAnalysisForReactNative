package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: spp  reason: default package */
/* loaded from: classes4.dex */
public final class spp implements axou {
    private final azqb a;

    public spp(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static spo b(Map map) {
        spo spaVar;
        int size = map.size();
        if (size == 0) {
            spaVar = new spa();
        } else if (size == 1) {
            spaVar = (spo) arey.t(map.keySet());
        } else {
            throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
        }
        spaVar.d();
        spaVar.d();
        spaVar.d();
        aqxo.C(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        spaVar.e();
        spaVar.e();
        aqxo.A(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        spaVar.a();
        spaVar.a();
        spaVar.a();
        aqxo.C(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        spaVar.b();
        spaVar.b();
        aqxo.A(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        spaVar.c();
        spaVar.c();
        spaVar.c();
        aqxo.C(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        spaVar.f();
        spaVar.f();
        axzl.o(spaVar);
        return spaVar;
    }

    public static spp c(azqb azqbVar) {
        return new spp(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final spo get() {
        return b((Map) ((axov) this.a).a);
    }
}
