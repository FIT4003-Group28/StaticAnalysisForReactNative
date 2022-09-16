package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzi extends zzzg {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbrr;
    private int zzbrs;
    private int zzbrt;
    private int zzbru;

    private zzzi(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbru = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbrt = this.pos;
        this.zzbrr = z;
    }

    private final void zztj() {
        this.limit += this.zzbrs;
        int i = this.limit - this.zzbrt;
        if (i <= this.zzbru) {
            this.zzbrs = 0;
            return;
        }
        this.zzbrs = i - this.zzbru;
        this.limit -= this.zzbrs;
    }

    public final int zzaf(int i) {
        if (i < 0) {
            throw zzzv.zztw();
        }
        int zzti = i + zzti();
        int i2 = this.zzbru;
        if (zzti > i2) {
            throw zzzv.zztv();
        }
        this.zzbru = zzti;
        zztj();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzzg
    public final int zzti() {
        return this.pos - this.zzbrt;
    }
}
