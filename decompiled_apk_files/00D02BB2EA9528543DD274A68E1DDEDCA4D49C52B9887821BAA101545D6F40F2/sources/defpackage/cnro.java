package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.cnnx;
/* compiled from: PG */
/* renamed from: cnro  reason: default package */
/* loaded from: classes.dex */
public final class cnro<O extends cnnx> extends cnqb {
    private final cnof<O> a;

    public cnro(cnof<O> cnofVar) {
        this.a = cnofVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T enqueue(T t) {
        this.a.j(0, t);
        return t;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T execute(T t) {
        this.a.j(1, t);
        return t;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.a.b;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.a.g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerPendingTransform(cntg cntgVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterPendingTransform(cntg cntgVar) {
    }
}
