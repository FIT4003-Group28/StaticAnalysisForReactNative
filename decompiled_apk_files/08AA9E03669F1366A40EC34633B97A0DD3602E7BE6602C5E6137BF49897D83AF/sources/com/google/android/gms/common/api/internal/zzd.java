package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
/* loaded from: classes.dex */
public final class zzd<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zzb {
    private final A zzdv;

    public zzd(int i, A a2) {
        super(i);
        this.zzdv = a2;
    }

    @Override // com.google.android.gms.common.api.internal.zzb
    public final void zza(Status status) {
        this.zzdv.setFailedResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.zzb
    public final void zza(GoogleApiManager.zza<?> zzaVar) {
        try {
            this.zzdv.run(zzaVar.zzae());
        } catch (RuntimeException e) {
            zza(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzb
    public final void zza(zzaa zzaaVar, boolean z) {
        zzaaVar.zza(this.zzdv, z);
    }

    @Override // com.google.android.gms.common.api.internal.zzb
    public final void zza(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.zzdv.setFailedResult(new Status(10, sb.toString()));
    }
}
