package defpackage;

import android.os.RemoteException;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csds  reason: default package */
/* loaded from: classes.dex */
public final class csds {
    private final coey a;

    public csds(coey coeyVar) {
        this.a = coeyVar;
    }

    public final void a(csdp csdpVar) {
        final NetworkQualityReport networkQualityReport = new NetworkQualityReport();
        if (csdpVar.f() >= 0) {
            networkQualityReport.e = csdpVar.f();
        }
        if (csdpVar.h()) {
            networkQualityReport.g = true;
            if (csdpVar.g().containsKey("network_error_code")) {
                networkQualityReport.a("network_error_code", csdpVar.g().get("network_error_code"));
            }
        } else {
            if (csdpVar.c() == null || csdpVar.e() == null) {
                if (csdpVar.c() != null) {
                    networkQualityReport.c = csdpVar.c().longValue();
                    networkQualityReport.b = csdpVar.b().longValue();
                } else if (csdpVar.e() != null) {
                    networkQualityReport.d = csdpVar.e().longValue();
                    networkQualityReport.b = csdpVar.d().longValue();
                }
            } else {
                networkQualityReport.a("rx_bytes", Long.toString(csdpVar.c().longValue()));
                networkQualityReport.a("rx_micros", Long.toString(csdpVar.b().longValue()));
                networkQualityReport.a("tx_bytes", Long.toString(csdpVar.e().longValue()));
                networkQualityReport.a("tx_micros", Long.toString(csdpVar.d().longValue()));
            }
            if (csdpVar.a() != null) {
                networkQualityReport.a = csdpVar.a().intValue();
            }
            dcpd<Map.Entry<String, String>> it = csdpVar.g().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                networkQualityReport.a(next.getKey(), next.getValue());
            }
        }
        coey coeyVar = this.a;
        cntc builder = cntd.builder();
        builder.a = new cnsr(networkQualityReport) { // from class: coew
            private final NetworkQualityReport a;

            {
                this.a = networkQualityReport;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                NetworkQualityReport networkQualityReport2 = this.a;
                cofb cofbVar = (cofb) obj;
                int i = coey.a;
                try {
                    ((cofa) cofbVar.L()).e(networkQualityReport2);
                    ((cpct) obj2).a(null);
                } catch (RemoteException e) {
                    ((cpct) obj2).d(e);
                }
            }
        };
        builder.c();
        coeyVar.e(builder.a()).r(new csdr());
    }
}
