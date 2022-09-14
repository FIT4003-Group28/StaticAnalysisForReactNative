package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdg implements zzej {
    private long zzaas;
    private final Clock zzro;
    private final String zzua;
    private final Object zzaat = new Object();
    private final int zzaaq = 5;
    private double zzaar = Math.min(1, 5);
    private final long zzaap = 900000;
    private final long zzazp = 5000;

    public zzdg(int i, int i2, long j, long j2, String str, Clock clock) {
        this.zzua = str;
        this.zzro = clock;
    }

    @Override // com.google.android.gms.tagmanager.zzej
    public final boolean zzes() {
        synchronized (this.zzaat) {
            long currentTimeMillis = this.zzro.currentTimeMillis();
            if (currentTimeMillis - this.zzaas < this.zzazp) {
                String str = this.zzua;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Excessive ");
                sb.append(str);
                sb.append(" detected; call ignored.");
                zzdi.zzaa(sb.toString());
                return false;
            }
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
            String str2 = this.zzua;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 34);
            sb2.append("Excessive ");
            sb2.append(str2);
            sb2.append(" detected; call ignored.");
            zzdi.zzaa(sb2.toString());
            return false;
        }
    }
}
