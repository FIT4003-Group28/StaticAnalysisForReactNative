package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class u4 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final String f7719a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v4 f7720b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(v4 v4Var, String str) {
        this.f7720b = v4Var;
        this.f7719a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f7720b.f7736a.c().v().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            c.e.a.b.d.g.p2 a2 = c.e.a.b.d.g.n5.a(iBinder);
            if (a2 == null) {
                this.f7720b.f7736a.c().v().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f7720b.f7736a.c().B().a("Install Referrer Service connected");
            this.f7720b.f7736a.a().a(new x4(this, a2, this));
        } catch (Exception e2) {
            this.f7720b.f7736a.c().v().a("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7720b.f7736a.c().B().a("Install Referrer Service disconnected");
    }
}
