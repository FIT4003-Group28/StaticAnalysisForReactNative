package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7501b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f7502c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ oa f7503d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ fa f7504e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ oa f7505f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ y7 f7506g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m8(y7 y7Var, boolean z, boolean z2, oa oaVar, fa faVar, oa oaVar2) {
        this.f7506g = y7Var;
        this.f7501b = z;
        this.f7502c = z2;
        this.f7503d = oaVar;
        this.f7504e = faVar;
        this.f7505f = oaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7506g.f7806d;
        if (r3Var == null) {
            this.f7506g.c().s().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f7501b) {
            this.f7506g.a(r3Var, this.f7502c ? null : this.f7503d, this.f7504e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7505f.f7562b)) {
                    r3Var.a(this.f7503d, this.f7504e);
                } else {
                    r3Var.a(this.f7503d);
                }
            } catch (RemoteException e2) {
                this.f7506g.c().s().a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f7506g.K();
    }
}
