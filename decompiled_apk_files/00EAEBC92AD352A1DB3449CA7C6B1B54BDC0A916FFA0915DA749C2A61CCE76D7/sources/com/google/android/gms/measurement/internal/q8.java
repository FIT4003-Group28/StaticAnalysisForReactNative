package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.e.a.b.d.g.nd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7619b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7620c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f7621d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ fa f7622e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ nd f7623f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ y7 f7624g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(y7 y7Var, String str, String str2, boolean z, fa faVar, nd ndVar) {
        this.f7624g = y7Var;
        this.f7619b = str;
        this.f7620c = str2;
        this.f7621d = z;
        this.f7622e = faVar;
        this.f7623f = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        Bundle bundle = new Bundle();
        try {
            try {
                r3Var = this.f7624g.f7806d;
                if (r3Var == null) {
                    this.f7624g.c().s().a("Failed to get user properties; not connected to service", this.f7619b, this.f7620c);
                } else {
                    bundle = z9.a(r3Var.a(this.f7619b, this.f7620c, this.f7621d, this.f7622e));
                    this.f7624g.K();
                }
            } catch (RemoteException e2) {
                this.f7624g.c().s().a("Failed to get user properties; remote exception", this.f7619b, e2);
            }
        } finally {
            this.f7624g.j().a(this.f7623f, bundle);
        }
    }
}
