package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;
/* loaded from: classes.dex */
final class zzgg implements Logger {
    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
        zzdi.zza("", exc);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
        zzdi.e(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        switch (zzdi.zzyc) {
            case 2:
                return 0;
            case 3:
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
            default:
                return 3;
        }
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
        zzdi.zzcw(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i) {
        zzdi.zzaa("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
        zzdi.v(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
        zzdi.zzaa(str);
    }
}
