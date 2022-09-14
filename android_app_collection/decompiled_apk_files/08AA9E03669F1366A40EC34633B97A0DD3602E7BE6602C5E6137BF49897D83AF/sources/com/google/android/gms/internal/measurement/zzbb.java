package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
/* loaded from: classes.dex */
final class zzbb implements Runnable {
    private final /* synthetic */ ComponentName val$name;
    private final /* synthetic */ zzaz zzwt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(zzaz zzazVar, ComponentName componentName) {
        this.zzwt = zzazVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzwt.zzwp.onServiceDisconnected(this.val$name);
    }
}
