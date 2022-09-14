package com.google.android.gms.tagmanager;
/* loaded from: classes.dex */
final class zzfh {
    private zzdz<com.google.android.gms.internal.measurement.zzm> zzbbt;
    private com.google.android.gms.internal.measurement.zzm zzbbu;

    public zzfh(zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar, com.google.android.gms.internal.measurement.zzm zzmVar) {
        this.zzbbt = zzdzVar;
        this.zzbbu = zzmVar;
    }

    public final int getSize() {
        return this.zzbbt.getObject().zzvu() + (this.zzbbu == null ? 0 : this.zzbbu.zzvu());
    }

    public final zzdz<com.google.android.gms.internal.measurement.zzm> zzoo() {
        return this.zzbbt;
    }

    public final com.google.android.gms.internal.measurement.zzm zzop() {
        return this.zzbbu;
    }
}
