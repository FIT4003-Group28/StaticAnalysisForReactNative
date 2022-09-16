package defpackage;

import android.os.Handler;
import com.google.android.filament.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnsf  reason: default package */
/* loaded from: classes5.dex */
public final class cnsf<T> implements cpcf<T> {
    private final cnrn a;
    private final int b;
    private final cnpa<?> c;
    private final long d;

    public cnsf(cnrn cnrnVar, int i, cnpa<?> cnpaVar, long j) {
        this.a = cnrnVar;
        this.b = i;
        this.c = cnpaVar;
        this.d = j;
    }

    public static ConnectionTelemetryConfiguration b(cnrj<?> cnrjVar, int i) {
        ConnectionInfo connectionInfo = ((cnui) cnrjVar.b).n;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.b) {
            int[] iArr = connectionTelemetryConfiguration.d;
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 != i) {
                    }
                }
            }
            if (cnrjVar.i < connectionTelemetryConfiguration.e) {
                return connectionTelemetryConfiguration;
            }
        }
        return null;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<T> cpcqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (!this.a.g()) {
            return;
        }
        boolean z = true;
        boolean z2 = this.d > 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = cnwf.a().a;
        if (rootTelemetryConfiguration == null) {
            i = 5000;
            i2 = 0;
            i3 = 100;
        } else if (!rootTelemetryConfiguration.b) {
            return;
        } else {
            z2 &= rootTelemetryConfiguration.c;
            i = rootTelemetryConfiguration.d;
            int i6 = rootTelemetryConfiguration.e;
            int i7 = rootTelemetryConfiguration.a;
            cnrj e = this.a.e(this.c);
            if (e != null && e.b.r() && (e.b instanceof cnui)) {
                ConnectionTelemetryConfiguration b = b(e, this.b);
                if (b == null) {
                    return;
                }
                if (!b.c || this.d <= 0) {
                    z = false;
                }
                i6 = b.e;
                z2 = z;
            }
            i2 = i7;
            i3 = i6;
        }
        cnrn cnrnVar = this.a;
        if (cpcqVar.b()) {
            i4 = 0;
            i5 = 0;
        } else {
            if (((cpcx) cpcqVar).d) {
                i4 = 100;
            } else {
                Exception e2 = cpcqVar.e();
                if (e2 instanceof cnob) {
                    Status status = ((cnob) e2).a;
                    int i8 = status.g;
                    ConnectionResult connectionResult = status.j;
                    i5 = connectionResult == null ? -1 : connectionResult.c;
                    i4 = i8;
                } else {
                    i4 = R.styleable.AppCompatTheme_switchStyle;
                }
            }
            i5 = -1;
        }
        if (z2) {
            j = this.d;
            j2 = System.currentTimeMillis();
        } else {
            j = 0;
            j2 = 0;
        }
        MethodInvocation methodInvocation = new MethodInvocation(this.b, i4, i5, j, j2, null, null);
        Handler handler = cnrnVar.n;
        handler.sendMessage(handler.obtainMessage(18, new cnsg(methodInvocation, i2, i, i3)));
    }
}
