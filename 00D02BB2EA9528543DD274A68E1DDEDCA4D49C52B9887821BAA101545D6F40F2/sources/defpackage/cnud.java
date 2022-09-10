package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: cnud  reason: default package */
/* loaded from: classes.dex */
public final class cnud extends cnvo {
    private cnui a;
    private final int b;

    public cnud(cnui cnuiVar, int i) {
        this.a = cnuiVar;
        this.b = i;
    }

    @Override // defpackage.cnvp
    public final void b(int i, IBinder iBinder, Bundle bundle) {
        cnwc.n(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.J(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.cnvp
    public final void c(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        cnui cnuiVar = this.a;
        cnwc.n(cnuiVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        cnwc.a(connectionInfo);
        cnuiVar.n = connectionInfo;
        if (cnuiVar.So()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
            cnwf.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
        }
        b(i, iBinder, connectionInfo.a);
    }

    @Override // defpackage.cnvp
    public final void d() {
        new Exception();
    }
}
