package com.google.firebase.auth.v0.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class b2 extends com.google.android.gms.common.internal.h<f2> implements z1 {
    private static com.google.android.gms.common.l.a A = new com.google.android.gms.common.l.a("FirebaseAuth", "FirebaseAuth:");
    private final Context y;
    private final i2 z;

    public b2(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, i2 i2Var, com.google.android.gms.common.api.internal.d dVar2, com.google.android.gms.common.api.internal.j jVar) {
        super(context, looper, 112, dVar, dVar2, jVar);
        com.google.android.gms.common.internal.s.a(context);
        this.y = context;
        this.z = i2Var;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof f2 ? (f2) queryLocalInterface : new g2(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean c() {
        return DynamiteModule.a(this.y, "com.google.firebase.auth") == 0;
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int d() {
        return com.google.android.gms.common.i.f6959a;
    }

    @Override // com.google.firebase.auth.v0.a.z1
    public final /* synthetic */ f2 f() {
        return (f2) super.v();
    }

    @Override // com.google.android.gms.common.internal.c
    public final com.google.android.gms.common.d[] p() {
        return c.e.a.b.d.e.g2.f3913d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final Bundle s() {
        Bundle s = super.s();
        if (s == null) {
            s = new Bundle();
        }
        i2 i2Var = this.z;
        if (i2Var != null) {
            s.putString("com.google.firebase.auth.API_KEY", i2Var.d());
        }
        s.putString("com.google.firebase.auth.LIBRARY_VERSION", k2.a());
        return s;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String w() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String x() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String y() {
        if (this.z.f8459b) {
            A.b("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.y.getPackageName();
        }
        A.b("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }
}
