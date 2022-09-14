package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.analytics.Logger;
/* loaded from: classes.dex */
final class zzbv implements Logger {
    private boolean zzrg;
    private int zzyc = 2;

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return this.zzyc;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i) {
        this.zzyc = i;
        if (!this.zzrg) {
            String str = zzcc.zzym.get();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 91);
            sb.append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(str);
            sb.append(" DEBUG");
            Log.i(zzcc.zzym.get(), sb.toString());
            this.zzrg = true;
        }
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
    }
}
