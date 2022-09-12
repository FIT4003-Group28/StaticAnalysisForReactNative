package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnqe  reason: default package */
/* loaded from: classes5.dex */
public final class cnqe implements cnqy {
    public final cnrb a;
    public boolean b = false;

    public cnqe(cnrb cnrbVar) {
        this.a = cnrbVar;
    }

    @Override // defpackage.cnqy
    public final void a() {
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t) {
        try {
            this.a.m.l.a(t);
            cnqx cnqxVar = this.a.m;
            cnnz cnnzVar = cnqxVar.f.get(t.b);
            cnwc.n(cnnzVar, "Appropriate Api was not requested.");
            if (cnnzVar.r() || !this.a.g.containsKey(t.b)) {
                t.l(cnnzVar);
            } else {
                t.m(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.o(new cnqc(this, this));
        }
        return t;
    }

    @Override // defpackage.cnqy
    public final boolean c() {
        if (this.b) {
            return false;
        }
        Set<cntg> set = this.a.m.k;
        if (set == null || set.isEmpty()) {
            this.a.n(null);
            return true;
        }
        this.b = true;
        Iterator<cntg> it = set.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        throw null;
    }

    @Override // defpackage.cnqy
    public final void d() {
        if (this.b) {
            this.b = false;
            this.a.o(new cnqd(this, this));
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
        this.a.n(null);
        this.a.n.c(i, this.b);
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> void h(T t) {
        b(t);
    }
}
