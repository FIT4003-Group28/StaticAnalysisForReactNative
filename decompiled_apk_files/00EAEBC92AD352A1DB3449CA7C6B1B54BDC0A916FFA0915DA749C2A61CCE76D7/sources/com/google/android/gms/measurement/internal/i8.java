package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.e.a.b.d.g.nd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p f7367b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7368c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ nd f7369d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y7 f7370e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i8(y7 y7Var, p pVar, String str, nd ndVar) {
        this.f7370e = y7Var;
        this.f7367b = pVar;
        this.f7368c = str;
        this.f7369d = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        byte[] bArr = null;
        try {
            try {
                r3Var = this.f7370e.f7806d;
                if (r3Var == null) {
                    this.f7370e.c().s().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = r3Var.a(this.f7367b, this.f7368c);
                    this.f7370e.K();
                }
            } catch (RemoteException e2) {
                this.f7370e.c().s().a("Failed to send event to the service to bundle", e2);
            }
        } finally {
            this.f7370e.j().a(this.f7369d, bArr);
        }
    }
}
