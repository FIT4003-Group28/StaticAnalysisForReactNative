package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzat;
import java.util.ListIterator;
@VisibleForTesting
/* loaded from: classes.dex */
public class zza extends zzj<zza> {
    private final zzat zzqm;
    private boolean zzqn;

    @VisibleForTesting
    public zza(zzat zzatVar) {
        super(zzatVar.zzbw(), zzatVar.zzbt());
        this.zzqm = zzatVar;
    }

    public final void enableAdvertisingIdCollection(boolean z) {
        this.zzqn = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.analytics.zzj
    public final void zza(zzg zzgVar) {
        zzad zzadVar = (zzad) zzgVar.zzb(zzad.class);
        if (TextUtils.isEmpty(zzadVar.zzaz())) {
            zzadVar.setClientId(this.zzqm.zzcn().zzdn());
        }
        if (!this.zzqn || !TextUtils.isEmpty(zzadVar.zzbb())) {
            return;
        }
        zzah zzcm = this.zzqm.zzcm();
        zzadVar.zzl(zzcm.zzbj());
        zzadVar.zza(zzcm.zzbc());
    }

    public final void zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri zzb = zzb.zzb(str);
        ListIterator<zzo> listIterator = this.zzrz.zzq().listIterator();
        while (listIterator.hasNext()) {
            if (zzb.equals(listIterator.next().zzk())) {
                listIterator.remove();
            }
        }
        this.zzrz.zzq().add(new zzb(this.zzqm, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzat zzh() {
        return this.zzqm;
    }

    @Override // com.google.android.gms.analytics.zzj
    public final zzg zzi() {
        zzg zzo = this.zzrz.zzo();
        zzo.zza(this.zzqm.zzce().zzdb());
        zzo.zza(this.zzqm.zzcf().zzeg());
        zzd(zzo);
        return zzo;
    }
}
