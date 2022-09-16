package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qvf  reason: default package */
/* loaded from: classes4.dex */
public final class qvf implements rut {
    private final quq a;
    private final int b;
    private final qtp c;
    private final long d;
    private final long e;

    public qvf(quq quqVar, int i, qtp qtpVar, long j, long j2) {
        this.a = quqVar;
        this.b = i;
        this.c = qtpVar;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.rut
    public final void a(rve rveVar) {
        qum b;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        if (!this.a.h()) {
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = qxw.a().a;
        if ((rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) || (b = this.a.b(this.c)) == null) {
            return;
        }
        qsn qsnVar = b.b;
        if (!(qsnVar instanceof qwr)) {
            return;
        }
        boolean z = true;
        int i6 = 0;
        boolean z2 = this.d > 0;
        qwr qwrVar = (qwr) qsnVar;
        int i7 = qwrVar.A;
        if (rootTelemetryConfiguration != null) {
            z2 &= rootTelemetryConfiguration.c;
            int i8 = rootTelemetryConfiguration.d;
            int i9 = rootTelemetryConfiguration.e;
            i = rootTelemetryConfiguration.a;
            if (qwrVar.K() && !qwrVar.x()) {
                ConnectionTelemetryConfiguration b2 = b(b, qwrVar, this.b);
                if (b2 == null) {
                    return;
                }
                if (!b2.c || this.d <= 0) {
                    z = false;
                }
                i9 = b2.e;
                z2 = z;
            }
            i2 = i8;
            i3 = i9;
        } else {
            i = 0;
            i2 = 5000;
            i3 = 100;
        }
        quq quqVar = this.a;
        if (rveVar.k()) {
            i4 = 0;
        } else {
            if (((rvj) rveVar).d) {
                i6 = 100;
            } else {
                Exception f = rveVar.f();
                if (f instanceof qsp) {
                    Status status = ((qsp) f).a;
                    int i10 = status.g;
                    ConnectionResult connectionResult = status.j;
                    i4 = connectionResult == null ? -1 : connectionResult.c;
                    i6 = i10;
                } else {
                    i6 = 101;
                }
            }
            i4 = -1;
        }
        if (z2) {
            long j3 = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            i5 = (int) (SystemClock.elapsedRealtime() - this.e);
            j = j3;
            j2 = currentTimeMillis;
        } else {
            j = 0;
            j2 = 0;
            i5 = -1;
        }
        MethodInvocation methodInvocation = new MethodInvocation(this.b, i6, i4, j, j2, null, null, i7, i5);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(18, new qvg(methodInvocation, i, i2, i3)));
    }

    public static ConnectionTelemetryConfiguration b(qum qumVar, qwr qwrVar, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = qwrVar.E;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !tqn.g(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !tqn.g(iArr2, i))) || qumVar.k >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }
}
