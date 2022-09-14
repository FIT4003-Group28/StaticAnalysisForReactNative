package com.google.android.gms.tagmanager;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
final class zzbw {
    private final long zzaal;
    private final long zzayn;
    private final long zzayo;
    private String zzayp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbw(long j, long j2, long j3) {
        this.zzayn = j;
        this.zzaal = j2;
        this.zzayo = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzdc(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.zzayp = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zznp() {
        return this.zzayn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zznq() {
        return this.zzayo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zznr() {
        return this.zzayp;
    }
}
