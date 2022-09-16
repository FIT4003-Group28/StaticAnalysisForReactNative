package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tis  reason: default package */
/* loaded from: classes4.dex */
public final class tis {
    private final rev a;

    public tis(rev revVar) {
        this.a = revVar;
    }

    public final void a(tiq tiqVar) {
        final NetworkQualityReport networkQualityReport = new NetworkQualityReport();
        int i = tiqVar.c;
        if (i >= 0) {
            networkQualityReport.e = i;
        }
        if (tiqVar.e) {
            networkQualityReport.g = true;
            if (tiqVar.d.containsKey("network_error_code")) {
                networkQualityReport.a("network_error_code", (String) tiqVar.d.get("network_error_code"));
            }
        } else {
            Long l = tiqVar.b;
            if (l != null) {
                networkQualityReport.c = l.longValue();
                networkQualityReport.b = tiqVar.a.longValue();
            }
            amzs it = tiqVar.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                networkQualityReport.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        rev revVar = this.a;
        qvx b = qvy.b();
        b.a = new qvo() { // from class: ret
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                NetworkQualityReport networkQualityReport2 = NetworkQualityReport.this;
                rex rexVar = (rex) obj;
                int i2 = rev.a;
                try {
                    rew rewVar = (rew) rexVar.D();
                    Parcel pv = rewVar.pv();
                    dve.g(pv, networkQualityReport2);
                    rewVar.py(1, pv);
                    ((rvh) obj2).b(null);
                } catch (RemoteException e) {
                    ((rvh) obj2).c(e);
                }
            }
        };
        b.b();
        b.c = 17101;
        revVar.r(b.a()).n(new tir());
    }
}
