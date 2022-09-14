package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes.dex */
final class zzfl implements zzej {
    private final long zzaap;
    private final int zzaaq;
    private double zzaar;
    private final Object zzaat;
    private long zzbca;
    private final Clock zzro;

    public zzfl() {
        this(60, 2000L);
    }

    private zzfl(int i, long j) {
        this.zzaat = new Object();
        this.zzaaq = 60;
        this.zzaar = this.zzaaq;
        this.zzaap = 2000L;
        this.zzro = DefaultClock.getInstance();
    }

    @Override // com.google.android.gms.tagmanager.zzej
    public final boolean zzes() {
        synchronized (this.zzaat) {
            long currentTimeMillis = this.zzro.currentTimeMillis();
            if (this.zzaar < this.zzaaq) {
                double d2 = (currentTimeMillis - this.zzbca) / this.zzaap;
                if (d2 > 0.0d) {
                    this.zzaar = Math.min(this.zzaaq, this.zzaar + d2);
                }
            }
            this.zzbca = currentTimeMillis;
            if (this.zzaar >= 1.0d) {
                this.zzaar -= 1.0d;
                return true;
            }
            zzdi.zzaa("No more tokens available.");
            return false;
        }
    }
}
