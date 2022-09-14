package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7463b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7464c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7465d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7466e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ fa f7467f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ y7 f7468g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, fa faVar) {
        this.f7468g = y7Var;
        this.f7463b = atomicReference;
        this.f7464c = str;
        this.f7465d = str2;
        this.f7466e = str3;
        this.f7467f = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        AtomicReference atomicReference2;
        List<oa> a2;
        synchronized (this.f7463b) {
            try {
                r3Var = this.f7468g.f7806d;
            } catch (RemoteException e2) {
                this.f7468g.c().s().a("(legacy) Failed to get conditional properties; remote exception", z3.a(this.f7464c), this.f7465d, e2);
                this.f7463b.set(Collections.emptyList());
                atomicReference = this.f7463b;
            }
            if (r3Var == null) {
                this.f7468g.c().s().a("(legacy) Failed to get conditional properties; not connected to service", z3.a(this.f7464c), this.f7465d, this.f7466e);
                this.f7463b.set(Collections.emptyList());
                this.f7463b.notify();
                return;
            }
            if (TextUtils.isEmpty(this.f7464c)) {
                atomicReference2 = this.f7463b;
                a2 = r3Var.a(this.f7465d, this.f7466e, this.f7467f);
            } else {
                atomicReference2 = this.f7463b;
                a2 = r3Var.a(this.f7464c, this.f7465d, this.f7466e);
            }
            atomicReference2.set(a2);
            this.f7468g.K();
            atomicReference = this.f7463b;
            atomicReference.notify();
        }
    }
}
