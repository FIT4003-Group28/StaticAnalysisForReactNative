package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: qxw  reason: default package */
/* loaded from: classes4.dex */
public final class qxw {
    private static qxw b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private qxw() {
    }

    public static synchronized qxw a() {
        qxw qxwVar;
        synchronized (qxw.class) {
            if (b == null) {
                b = new qxw();
            }
            qxwVar = b;
        }
        return qxwVar;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
            return;
        }
        this.a = rootTelemetryConfiguration;
    }
}
