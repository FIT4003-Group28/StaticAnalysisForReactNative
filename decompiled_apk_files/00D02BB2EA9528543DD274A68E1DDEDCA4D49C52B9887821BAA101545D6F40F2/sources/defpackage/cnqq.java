package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cnqq  reason: default package */
/* loaded from: classes.dex */
public final class cnqq implements cnqy {
    private final cnrb a;

    public cnqq(cnrb cnrbVar) {
        this.a = cnrbVar;
    }

    @Override // defpackage.cnqy
    public final void a() {
        for (cnnz cnnzVar : this.a.f.values()) {
            cnnzVar.o();
        }
        this.a.m.g = Collections.emptySet();
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.cnqy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.cnqy
    public final void d() {
        cnrb cnrbVar = this.a;
        cnrbVar.a.lock();
        try {
            cnrbVar.k = new cnqp(cnrbVar, cnrbVar.h, cnrbVar.i, cnrbVar.d, cnrbVar.j, cnrbVar.a, cnrbVar.c);
            cnrbVar.k.a();
            cnrbVar.b.signalAll();
        } finally {
            cnrbVar.a.unlock();
        }
    }

    @Override // defpackage.cnqy
    public final void e(Bundle bundle) {
    }

    @Override // defpackage.cnqy
    public final void f(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // defpackage.cnqy
    public final void g(int i) {
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> void h(T t) {
        this.a.m.d.add(t);
    }
}
