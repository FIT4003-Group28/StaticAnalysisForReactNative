package com.google.android.gms.tagmanager;

import android.util.Log;
/* loaded from: classes.dex */
public final class zzba implements zzdj {
    private int zzyc = 5;

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void e(String str) {
        if (this.zzyc <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void setLogLevel(int i) {
        this.zzyc = i;
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void v(String str) {
        if (this.zzyc <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void zza(String str, Throwable th) {
        if (this.zzyc <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void zzaa(String str) {
        if (this.zzyc <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void zzb(String str, Throwable th) {
        if (this.zzyc <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void zzcw(String str) {
        if (this.zzyc <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzdj
    public final void zzcx(String str) {
        if (this.zzyc <= 3) {
            Log.d("GoogleTagManager", str);
        }
    }
}
