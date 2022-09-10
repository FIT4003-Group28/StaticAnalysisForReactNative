package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnqp  reason: default package */
/* loaded from: classes.dex */
public final class cnqp implements cnqy {
    public final cnrb a;
    public final Lock b;
    public final Context c;
    public final cnmr d;
    public coza e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final cnum j;
    public cnvj k;
    private ConnectionResult l;
    private int m;
    private int o;
    private boolean r;
    private final Map<Api<?>, Boolean> s;
    private final cnnp<? extends coza, cozb> t;
    private int n = 0;
    private final Bundle p = new Bundle();
    private final Set<cnnr> q = new HashSet();
    private final ArrayList<Future<?>> u = new ArrayList<>();

    public cnqp(cnrb cnrbVar, cnum cnumVar, Map<Api<?>, Boolean> map, cnmr cnmrVar, cnnp<? extends coza, cozb> cnnpVar, Lock lock, Context context) {
        this.a = cnrbVar;
        this.j = cnumVar;
        this.s = map;
        this.d = cnmrVar;
        this.t = cnnpVar;
        this.b = lock;
        this.c = context;
    }

    private final void p() {
        cnrb cnrbVar = this.a;
        cnrbVar.a.lock();
        try {
            cnrbVar.m.g();
            cnrbVar.k = new cnqe(cnrbVar);
            cnrbVar.k.a();
            cnrbVar.b.signalAll();
            cnrbVar.a.unlock();
            cnrc.a.execute(new cnqf(this));
            coza cozaVar = this.e;
            if (cozaVar != null) {
                if (this.h) {
                    cnvj cnvjVar = this.k;
                    cnwc.a(cnvjVar);
                    cozaVar.m(cnvjVar, this.i);
                }
                q(false);
            }
            for (cnnr<?> cnnrVar : this.a.g.keySet()) {
                cnnz cnnzVar = this.a.f.get(cnnrVar);
                cnwc.a(cnnzVar);
                cnnzVar.o();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } catch (Throwable th) {
            cnrbVar.a.unlock();
            throw th;
        }
    }

    private final void q(boolean z) {
        coza cozaVar = this.e;
        if (cozaVar != null) {
            if (cozaVar.r() && z) {
                cozaVar.f();
            }
            cozaVar.o();
            cnum cnumVar = this.j;
            cnwc.a(cnumVar);
            if (cnumVar.h) {
                this.e = null;
            }
            this.k = null;
        }
    }

    private final void r() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.u.clear();
    }

    private static final String s(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // defpackage.cnqy
    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.h = false;
        HashMap hashMap = new HashMap();
        for (Api<?> api : this.s.keySet()) {
            cnnz cnnzVar = this.a.f.get(api.getClientKey());
            cnwc.a(cnnzVar);
            api.getBaseClientBuilder();
            boolean booleanValue = this.s.get(api).booleanValue();
            if (cnnzVar.j()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(api.getClientKey());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(cnnzVar, new cnqg(this, api, booleanValue));
        }
        if (this.f) {
            cnwc.a(this.j);
            cnwc.a(this.t);
            this.j.i = Integer.valueOf(System.identityHashCode(this.a.m));
            cnqn cnqnVar = new cnqn(this);
            cnnp<? extends coza, cozb> cnnpVar = this.t;
            Context context = this.c;
            Looper looper = this.a.m.c;
            cnum cnumVar = this.j;
            this.e = cnnpVar.b(context, looper, cnumVar, cnumVar.g, cnqnVar, cnqnVar);
        }
        this.o = ((aim) this.a.f).j;
        this.u.add(cnrc.a.submit(new cnqj(this, hashMap)));
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.cnqy
    public final boolean c() {
        r();
        q(true);
        this.a.n(null);
        return true;
    }

    @Override // defpackage.cnqy
    public final void d() {
    }

    @Override // defpackage.cnqy
    public final void e(Bundle bundle) {
        if (!o(1)) {
            return;
        }
        if (bundle != null) {
            this.p.putAll(bundle);
        }
        if (!i()) {
            return;
        }
        p();
    }

    @Override // defpackage.cnqy
    public final void f(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (!o(1)) {
            return;
        }
        k(connectionResult, api, z);
        if (!i()) {
            return;
        }
        p();
    }

    @Override // defpackage.cnqy
    public final void g(int i) {
        n(new ConnectionResult(8, null));
    }

    @Override // defpackage.cnqy
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> void h(T t) {
        this.a.m.d.add(t);
    }

    public final boolean i() {
        int i = this.o - 1;
        this.o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.a.m.j();
            new Exception();
            n(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.l;
        if (connectionResult == null) {
            return true;
        }
        this.a.l = this.m;
        n(connectionResult);
        return false;
    }

    public final void j() {
        if (this.o != 0) {
            return;
        }
        if (this.f && !this.g) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.n = 1;
        Map<cnnr<?>, cnnz> map = this.a.f;
        this.o = ((aim) map).j;
        for (cnnr<?> cnnrVar : map.keySet()) {
            if (this.a.g.containsKey(cnnrVar)) {
                if (i()) {
                    p();
                }
            } else {
                arrayList.add(this.a.f.get(cnnrVar));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.u.add(cnrc.a.submit(new cnqk(this, arrayList)));
    }

    public final void k(ConnectionResult connectionResult, Api<?> api, boolean z) {
        api.getBaseClientBuilder();
        if ((!z || connectionResult.b() || this.d.k(null, connectionResult.c, null) != null) && this.l == null) {
            this.l = connectionResult;
            this.m = Integer.MAX_VALUE;
        }
        this.a.g.put(api.getClientKey(), connectionResult);
    }

    public final void l() {
        this.f = false;
        this.a.m.g = Collections.emptySet();
        for (cnnr<?> cnnrVar : this.q) {
            if (!this.a.g.containsKey(cnnrVar)) {
                this.a.g.put(cnnrVar, new ConnectionResult(17, null));
            }
        }
    }

    public final boolean m(ConnectionResult connectionResult) {
        return this.r && !connectionResult.b();
    }

    public final void n(ConnectionResult connectionResult) {
        r();
        q(!connectionResult.b());
        this.a.n(connectionResult);
        this.a.n.b(connectionResult);
    }

    public final boolean o(int i) {
        if (this.n != i) {
            this.a.m.j();
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Unexpected callback in ");
            sb.append(valueOf);
            sb.toString();
            int i2 = this.o;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("mRemainingConnections=");
            sb2.append(i2);
            sb2.toString();
            String s = s(this.n);
            String s2 = s(i);
            StringBuilder sb3 = new StringBuilder(s.length() + 70 + s2.length());
            sb3.append("GoogleApiClient connecting is in step ");
            sb3.append(s);
            sb3.append(" but received callback for step ");
            sb3.append(s2);
            sb3.toString();
            new Exception();
            n(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }
}
