package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;
/* compiled from: PG */
/* renamed from: bagu  reason: default package */
/* loaded from: classes2.dex */
public final class bagu extends NetworkQualityThroughputListener {
    private final NetworkQualityThroughputListener a;

    public bagu(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bagu)) {
            return false;
        }
        return this.a.equals(((bagu) obj).a);
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i, long j, int i2) {
        this.a.onThroughputObservation(i, j, i2);
    }
}
