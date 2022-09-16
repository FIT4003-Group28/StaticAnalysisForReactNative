package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnrb  reason: default package */
/* loaded from: classes.dex */
public final class cnrb implements cnrv, cnpq {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final cnmr d;
    public final cnra e;
    final Map<cnnr<?>, cnnz> f;
    final cnum h;
    final Map<Api<?>, Boolean> i;
    final cnnp<? extends coza, cozb> j;
    public volatile cnqy k;
    int l;
    final cnqx m;
    final cnru n;
    final Map<cnnr<?>, ConnectionResult> g = new HashMap();
    private ConnectionResult o = null;

    public cnrb(Context context, cnqx cnqxVar, Lock lock, Looper looper, cnmr cnmrVar, Map<cnnr<?>, cnnz> map, cnum cnumVar, Map<Api<?>, Boolean> map2, cnnp<? extends coza, cozb> cnnpVar, ArrayList<cnpp> arrayList, cnru cnruVar) {
        this.c = context;
        this.a = lock;
        this.d = cnmrVar;
        this.f = map;
        this.h = cnumVar;
        this.i = map2;
        this.j = cnnpVar;
        this.m = cnqxVar;
        this.n = cnruVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b = this;
        }
        this.e = new cnra(this, looper);
        this.b = lock.newCondition();
        this.k = new cnqq(this);
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        this.a.lock();
        try {
            this.k.e(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        this.a.lock();
        try {
            this.k.g(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.cnrv
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T a(T t) {
        t.r();
        this.k.h(t);
        return t;
    }

    @Override // defpackage.cnrv
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t) {
        t.r();
        return (T) this.k.b(t);
    }

    @Override // defpackage.cnrv
    public final ConnectionResult c(Api<?> api) {
        cnnr<?> clientKey = api.getClientKey();
        if (this.f.containsKey(clientKey)) {
            if (this.f.get(clientKey).r()) {
                return ConnectionResult.a;
            }
            if (!this.g.containsKey(clientKey)) {
                return null;
            }
            return this.g.get(clientKey);
        }
        return null;
    }

    @Override // defpackage.cnrv
    public final void d() {
        this.k.d();
    }

    @Override // defpackage.cnrv
    public final ConnectionResult e() {
        d();
        while (i()) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (h()) {
            return ConnectionResult.a;
        }
        ConnectionResult connectionResult = this.o;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // defpackage.cnrv
    public final ConnectionResult f(long j, TimeUnit timeUnit) {
        d();
        long nanos = timeUnit.toNanos(j);
        while (i()) {
            if (nanos > 0) {
                try {
                    nanos = this.b.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            } else {
                g();
                return new ConnectionResult(14, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (h()) {
            return ConnectionResult.a;
        }
        ConnectionResult connectionResult = this.o;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // defpackage.cnrv
    public final void g() {
        if (this.k.c()) {
            this.g.clear();
        }
    }

    @Override // defpackage.cnrv
    public final boolean h() {
        return this.k instanceof cnqe;
    }

    @Override // defpackage.cnrv
    public final boolean i() {
        return this.k instanceof cnqp;
    }

    @Override // defpackage.cnrv
    public final boolean j(cnss cnssVar) {
        return false;
    }

    @Override // defpackage.cnrv
    public final void k() {
        if (h()) {
            cnqe cnqeVar = (cnqe) this.k;
            if (!cnqeVar.b) {
                return;
            }
            cnqeVar.b = false;
            cnqeVar.a.m.l.b();
            cnqeVar.c();
        }
    }

    @Override // defpackage.cnrv
    public final void l() {
    }

    @Override // defpackage.cnrv
    public final boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.k = new cnqq(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(cnqz cnqzVar) {
        this.e.sendMessage(this.e.obtainMessage(1, cnqzVar));
    }

    @Override // defpackage.cnrv
    public final void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (Api<?> api : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.getName()).println(":");
            cnnz cnnzVar = this.f.get(api.getClientKey());
            cnwc.a(cnnzVar);
            cnnzVar.y(concat, printWriter);
        }
    }
}
