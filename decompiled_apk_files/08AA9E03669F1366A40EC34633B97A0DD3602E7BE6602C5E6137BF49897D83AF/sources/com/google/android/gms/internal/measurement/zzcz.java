package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcz {
    private long startTime;
    private final Clock zzro;

    public zzcz(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zzro = clock;
    }

    public zzcz(Clock clock, long j) {
        Preconditions.checkNotNull(clock);
        this.zzro = clock;
        this.startTime = j;
    }

    public final void clear() {
        this.startTime = 0L;
    }

    public final void start() {
        this.startTime = this.zzro.elapsedRealtime();
    }

    public final boolean zzj(long j) {
        return this.startTime == 0 || this.zzro.elapsedRealtime() - this.startTime > j;
    }
}
