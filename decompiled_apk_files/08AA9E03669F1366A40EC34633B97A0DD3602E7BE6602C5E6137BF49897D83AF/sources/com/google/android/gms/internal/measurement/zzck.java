package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzck {
    private final long zzaap;
    private final int zzaaq;
    private double zzaar;
    private long zzaas;
    private final Object zzaat;
    private final Clock zzro;
    private final String zzua;

    private zzck(int i, long j, String str, Clock clock) {
        this.zzaat = new Object();
        this.zzaaq = 60;
        this.zzaar = this.zzaaq;
        this.zzaap = 2000L;
        this.zzua = str;
        this.zzro = clock;
    }

    public zzck(String str, Clock clock) {
        this(60, 2000L, str, clock);
    }

    public final boolean zzes() {
        synchronized (this.zzaat) {
            long currentTimeMillis = this.zzro.currentTimeMillis();
            if (this.zzaar < this.zzaaq) {
                double d2 = (currentTimeMillis - this.zzaas) / this.zzaap;
                if (d2 > 0.0d) {
                    this.zzaar = Math.min(this.zzaaq, this.zzaar + d2);
                }
            }
            this.zzaas = currentTimeMillis;
            if (this.zzaar >= 1.0d) {
                this.zzaar -= 1.0d;
                return true;
            }
            String str = this.zzua;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            zzcl.zzaa(sb.toString());
            return false;
        }
    }
}
