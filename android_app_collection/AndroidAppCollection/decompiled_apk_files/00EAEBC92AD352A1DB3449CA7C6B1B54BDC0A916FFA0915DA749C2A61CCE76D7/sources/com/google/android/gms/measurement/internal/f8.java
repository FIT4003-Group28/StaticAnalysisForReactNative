package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q7 f7300b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y7 f7301c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(y7 y7Var, q7 q7Var) {
        this.f7301c = y7Var;
        this.f7300b = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        long j;
        String str;
        String str2;
        String packageName;
        r3Var = this.f7301c.f7806d;
        if (r3Var == null) {
            this.f7301c.c().s().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f7300b == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f7301c.d().getPackageName();
            } else {
                j = this.f7300b.f7616c;
                str = this.f7300b.f7614a;
                str2 = this.f7300b.f7615b;
                packageName = this.f7301c.d().getPackageName();
            }
            r3Var.a(j, str, str2, packageName);
            this.f7301c.K();
        } catch (RemoteException e2) {
            this.f7301c.c().s().a("Failed to send current screen to the service", e2);
        }
    }
}
