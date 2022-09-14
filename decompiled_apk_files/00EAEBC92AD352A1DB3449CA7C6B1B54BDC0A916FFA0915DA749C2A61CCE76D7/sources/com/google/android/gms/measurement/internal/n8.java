package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7524b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7525c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7526d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7527e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7528f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ fa f7529g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ y7 f7530h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, fa faVar) {
        this.f7530h = y7Var;
        this.f7524b = atomicReference;
        this.f7525c = str;
        this.f7526d = str2;
        this.f7527e = str3;
        this.f7528f = z;
        this.f7529g = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        AtomicReference atomicReference2;
        List<y9> a2;
        synchronized (this.f7524b) {
            try {
                r3Var = this.f7530h.f7806d;
            } catch (RemoteException e2) {
                this.f7530h.c().s().a("(legacy) Failed to get user properties; remote exception", z3.a(this.f7525c), this.f7526d, e2);
                this.f7524b.set(Collections.emptyList());
                atomicReference = this.f7524b;
            }
            if (r3Var == null) {
                this.f7530h.c().s().a("(legacy) Failed to get user properties; not connected to service", z3.a(this.f7525c), this.f7526d, this.f7527e);
                this.f7524b.set(Collections.emptyList());
                this.f7524b.notify();
                return;
            }
            if (TextUtils.isEmpty(this.f7525c)) {
                atomicReference2 = this.f7524b;
                a2 = r3Var.a(this.f7526d, this.f7527e, this.f7528f, this.f7529g);
            } else {
                atomicReference2 = this.f7524b;
                a2 = r3Var.a(this.f7525c, this.f7526d, this.f7527e, this.f7528f);
            }
            atomicReference2.set(a2);
            this.f7530h.K();
            atomicReference = this.f7524b;
            atomicReference.notify();
        }
    }
}
