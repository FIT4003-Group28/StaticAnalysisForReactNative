package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.e.a.b.d.g.nd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7248b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ nd f7249c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ y7 f7250d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d8(y7 y7Var, fa faVar, nd ndVar) {
        this.f7250d = y7Var;
        this.f7248b = faVar;
        this.f7249c = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        String str = null;
        try {
            try {
                r3Var = this.f7250d.f7806d;
                if (r3Var == null) {
                    this.f7250d.c().s().a("Failed to get app instance id");
                } else {
                    str = r3Var.c(this.f7248b);
                    if (str != null) {
                        this.f7250d.o().a(str);
                        this.f7250d.k().l.a(str);
                    }
                    this.f7250d.K();
                }
            } catch (RemoteException e2) {
                this.f7250d.c().s().a("Failed to get app instance id", e2);
            }
        } finally {
            this.f7250d.j().a(this.f7249c, (String) null);
        }
    }
}
