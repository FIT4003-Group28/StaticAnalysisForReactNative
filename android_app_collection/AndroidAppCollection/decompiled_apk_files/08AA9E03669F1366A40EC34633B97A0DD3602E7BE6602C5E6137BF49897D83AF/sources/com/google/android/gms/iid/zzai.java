package com.google.android.gms.iid;
/* loaded from: classes.dex */
abstract class zzai {
    private static zzai zzcy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized zzai zzw() {
        zzai zzaiVar;
        synchronized (zzai.class) {
            if (zzcy == null) {
                zzcy = new zzac();
            }
            zzaiVar = zzcy;
        }
        return zzaiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzaj<Boolean> zzd(String str, boolean z);
}
