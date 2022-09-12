package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: cnwf  reason: default package */
/* loaded from: classes5.dex */
public final class cnwf {
    private static cnwf b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private cnwf() {
    }

    public static synchronized cnwf a() {
        cnwf cnwfVar;
        synchronized (cnwf.class) {
            if (b == null) {
                b = new cnwf();
            }
            cnwfVar = b;
        }
        return cnwfVar;
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
