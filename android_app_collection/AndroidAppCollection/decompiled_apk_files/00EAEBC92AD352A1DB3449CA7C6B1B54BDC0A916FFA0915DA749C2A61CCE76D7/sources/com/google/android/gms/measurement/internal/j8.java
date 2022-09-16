package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7399b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f7400c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ p f7401d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ fa f7402e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f7403f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ y7 f7404g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j8(y7 y7Var, boolean z, boolean z2, p pVar, fa faVar, String str) {
        this.f7404g = y7Var;
        this.f7399b = z;
        this.f7400c = z2;
        this.f7401d = pVar;
        this.f7402e = faVar;
        this.f7403f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7404g.f7806d;
        if (r3Var == null) {
            this.f7404g.c().s().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f7399b) {
            this.f7404g.a(r3Var, this.f7400c ? null : this.f7401d, this.f7402e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7403f)) {
                    r3Var.a(this.f7401d, this.f7402e);
                } else {
                    r3Var.a(this.f7401d, this.f7403f, this.f7404g.c().C());
                }
            } catch (RemoteException e2) {
                this.f7404g.c().s().a("Failed to send event to the service", e2);
            }
        }
        this.f7404g.K();
    }
}
