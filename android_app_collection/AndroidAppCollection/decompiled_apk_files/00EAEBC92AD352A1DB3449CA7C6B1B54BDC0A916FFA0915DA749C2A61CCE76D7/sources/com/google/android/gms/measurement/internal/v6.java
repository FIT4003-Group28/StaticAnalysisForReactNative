package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f7740b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7741c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v6(j6 j6Var, Bundle bundle) {
        this.f7741c = j6Var;
        this.f7740b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7741c.d(this.f7740b);
    }
}
