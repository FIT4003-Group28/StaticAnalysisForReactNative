package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f7686b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7687c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6(j6 j6Var, Bundle bundle) {
        this.f7687c = j6Var;
        this.f7686b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7687c.c(this.f7686b);
    }
}
