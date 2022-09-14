package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzae implements zzdh<com.google.android.gms.internal.measurement.zzl> {
    private final /* synthetic */ zzy zzaww;

    private zzae(zzy zzyVar) {
        this.zzaww = zzyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzae(zzy zzyVar, zzz zzzVar) {
        this(zzyVar);
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final /* synthetic */ void onSuccess(com.google.android.gms.internal.measurement.zzl zzlVar) {
        zzai zzaiVar;
        Clock clock;
        long j;
        boolean zzmq;
        com.google.android.gms.internal.measurement.zzl zzlVar2;
        com.google.android.gms.internal.measurement.zzl zzlVar3;
        zzai zzaiVar2;
        com.google.android.gms.internal.measurement.zzl zzlVar4 = zzlVar;
        zzaiVar = this.zzaww.zzawn;
        zzaiVar.zzmw();
        synchronized (this.zzaww) {
            if (zzlVar4.zzpv == null) {
                zzlVar2 = this.zzaww.zzaws;
                if (zzlVar2.zzpv == null) {
                    zzdi.e("Current resource is null; network resource is also null");
                    zzaiVar2 = this.zzaww.zzawn;
                    this.zzaww.zzah(zzaiVar2.zzmu());
                    return;
                }
                zzlVar3 = this.zzaww.zzaws;
                zzlVar4.zzpv = zzlVar3.zzpv;
            }
            zzy zzyVar = this.zzaww;
            clock = this.zzaww.zzro;
            zzyVar.zza(zzlVar4, clock.currentTimeMillis(), false);
            j = this.zzaww.zzavy;
            StringBuilder sb = new StringBuilder(58);
            sb.append("setting refresh time to current time: ");
            sb.append(j);
            zzdi.v(sb.toString());
            zzmq = this.zzaww.zzmq();
            if (!zzmq) {
                this.zzaww.zza(zzlVar4);
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final void zzmr() {
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final void zzq(int i) {
        zzai zzaiVar;
        zzv zzvVar;
        zzy zzyVar;
        ContainerHolder mo86createFailedResult;
        zzai zzaiVar2;
        if (i == zzcz.zzazl) {
            zzaiVar2 = this.zzaww.zzawn;
            zzaiVar2.zzmv();
        }
        synchronized (this.zzaww) {
            if (!this.zzaww.isReady()) {
                zzvVar = this.zzaww.zzawq;
                if (zzvVar != null) {
                    zzyVar = this.zzaww;
                    mo86createFailedResult = this.zzaww.zzawq;
                } else {
                    zzyVar = this.zzaww;
                    mo86createFailedResult = this.zzaww.mo86createFailedResult(Status.RESULT_TIMEOUT);
                }
                zzyVar.setResult(mo86createFailedResult);
            }
        }
        zzaiVar = this.zzaww.zzawn;
        this.zzaww.zzah(zzaiVar.zzmu());
    }
}
