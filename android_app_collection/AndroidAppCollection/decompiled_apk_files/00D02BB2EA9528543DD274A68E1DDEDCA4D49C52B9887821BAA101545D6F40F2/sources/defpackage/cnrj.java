package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import defpackage.cnnx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnrj  reason: default package */
/* loaded from: classes.dex */
public final class cnrj<O extends cnnx> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, cnpq {
    public final cnnz b;
    public final cnpa<O> c;
    public final cnpy d;
    public final int f;
    public boolean g;
    public final /* synthetic */ cnrn j;
    private final cnsv l;
    public final Queue<cnoy> a = new LinkedList();
    private final Set<cnpd> k = new HashSet();
    public final Map<cnsb<?>, cnsl> e = new HashMap();
    public final List<cnrk> h = new ArrayList();
    private ConnectionResult m = null;
    public int i = 0;

    /* JADX WARN: Type inference failed for: r1v4, types: [cnnz] */
    public cnrj(cnrn cnrnVar, cnof<O> cnofVar) {
        this.j = cnrnVar;
        Looper looper = cnrnVar.n.getLooper();
        cnum a = cnofVar.i().a();
        cnnp<?, O> clientBuilder = cnofVar.d.getClientBuilder();
        cnwc.a(clientBuilder);
        ?? b = clientBuilder.b(cnofVar.b, looper, a, cnofVar.e, this, this);
        String str = cnofVar.c;
        if (str != null && (b instanceof cnui)) {
            ((cnui) b).k = str;
        }
        if (str == null || !(b instanceof cnsh)) {
            this.b = b;
            this.c = cnofVar.f;
            this.d = new cnpy();
            this.f = cnofVar.h;
            if (b.j()) {
                this.l = new cnsv(cnrnVar.g, cnrnVar.n, cnofVar.i().a());
                return;
            } else {
                this.l = null;
                return;
            }
        }
        cnsh cnshVar = (cnsh) b;
        throw null;
    }

    private final boolean o(ConnectionResult connectionResult) {
        synchronized (cnrn.e) {
            cnrn cnrnVar = this.j;
            if (cnrnVar.l == null || !cnrnVar.m.contains(this.c)) {
                return false;
            }
            this.j.l.l(connectionResult, this.f);
            return true;
        }
    }

    private final boolean p(cnoy cnoyVar) {
        if (!(cnoyVar instanceof cnos)) {
            q(cnoyVar);
            return true;
        }
        cnos cnosVar = (cnos) cnoyVar;
        Feature t = t(cnosVar.a(this));
        if (t == null) {
            q(cnoyVar);
            return true;
        }
        String name = this.b.getClass().getName();
        String str = t.a;
        long a = t.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a);
        sb.append(").");
        sb.toString();
        if (!this.j.o || !cnosVar.b(this)) {
            cnosVar.d(new cnor(t));
            return true;
        }
        cnrk cnrkVar = new cnrk(this.c, t);
        int indexOf = this.h.indexOf(cnrkVar);
        if (indexOf >= 0) {
            cnrk cnrkVar2 = this.h.get(indexOf);
            this.j.n.removeMessages(15, cnrkVar2);
            Handler handler = this.j.n;
            handler.sendMessageDelayed(Message.obtain(handler, 15, cnrkVar2), 5000L);
            return false;
        }
        this.h.add(cnrkVar);
        Handler handler2 = this.j.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, cnrkVar), 5000L);
        Handler handler3 = this.j.n;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, cnrkVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (o(connectionResult)) {
            return false;
        }
        this.j.i(connectionResult, this.f);
        return false;
    }

    private final void q(cnoy cnoyVar) {
        cnoyVar.e(this.d, n());
        try {
            cnoyVar.f(this);
        } catch (DeadObjectException unused) {
            Pj(1);
            this.b.h("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.b.getClass().getName()), th);
        }
    }

    private final void r(Status status, Exception exc, boolean z) {
        cnwc.j(this.j.n);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 == z2) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<cnoy> it = this.a.iterator();
        while (it.hasNext()) {
            cnoy next = it.next();
            if (!z || next.c == 2) {
                if (status != null) {
                    next.c(status);
                } else {
                    next.d(exc);
                }
                it.remove();
            }
        }
    }

    private final void s(ConnectionResult connectionResult) {
        Iterator<cnpd> it = this.k.iterator();
        if (it.hasNext()) {
            it.next();
            if (cnvv.a(connectionResult, ConnectionResult.a)) {
                this.b.z();
            }
            throw null;
        }
        this.k.clear();
    }

    private final Feature t(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] u = this.b.u();
            if (u == null) {
                u = new Feature[0];
            }
            aif aifVar = new aif(u.length);
            for (Feature feature : u) {
                aifVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) aifVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status u(ConnectionResult connectionResult) {
        return cnrn.k(this.c, connectionResult);
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        if (Looper.myLooper() == this.j.n.getLooper()) {
            c();
        } else {
            this.j.n.post(new cnrf(this));
        }
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        e(connectionResult, null);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        if (Looper.myLooper() == this.j.n.getLooper()) {
            d(i);
        } else {
            this.j.n.post(new cnrg(this, i));
        }
    }

    public final void c() {
        i();
        s(ConnectionResult.a);
        k();
        Iterator<cnsl> it = this.e.values().iterator();
        while (it.hasNext()) {
            cnsl next = it.next();
            cnsk<cnnq, ?> cnskVar = next.a;
            if (t(null) != null) {
                it.remove();
            } else {
                try {
                    next.a.a(this.b, new cpct<>());
                } catch (DeadObjectException unused) {
                    Pj(3);
                    this.b.h("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        l();
    }

    public final void d(int i) {
        i();
        this.g = true;
        cnpy cnpyVar = this.d;
        String w = this.b.w();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (w != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(w);
        }
        cnpyVar.a(true, new Status(20, sb.toString()));
        Handler handler = this.j.n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        Handler handler2 = this.j.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.c), 120000L);
        this.j.i.b();
        for (cnsl cnslVar : this.e.values()) {
            Runnable runnable = cnslVar.c;
        }
    }

    public final void e(ConnectionResult connectionResult, Exception exc) {
        coza cozaVar;
        cnwc.j(this.j.n);
        cnsv cnsvVar = this.l;
        if (cnsvVar != null && (cozaVar = cnsvVar.f) != null) {
            cozaVar.o();
        }
        i();
        this.j.i.b();
        s(connectionResult);
        if ((this.b instanceof cnxe) && connectionResult.c != 24) {
            cnrn cnrnVar = this.j;
            cnrnVar.d = true;
            Handler handler = cnrnVar.n;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (connectionResult.c == 4) {
            j(cnrn.b);
        } else if (this.a.isEmpty()) {
            this.m = connectionResult;
        } else if (exc != null) {
            cnwc.j(this.j.n);
            r(null, exc, false);
        } else if (!this.j.o) {
            j(u(connectionResult));
        } else {
            r(u(connectionResult), null, true);
            if (this.a.isEmpty() || o(connectionResult) || this.j.i(connectionResult, this.f)) {
                return;
            }
            if (connectionResult.c == 18) {
                this.g = true;
            }
            if (this.g) {
                Handler handler2 = this.j.n;
                handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
                return;
            }
            j(u(connectionResult));
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cnoy cnoyVar = (cnoy) arrayList.get(i);
            if (!this.b.r()) {
                return;
            }
            if (p(cnoyVar)) {
                this.a.remove(cnoyVar);
            }
        }
    }

    public final void g(cnoy cnoyVar) {
        cnwc.j(this.j.n);
        if (this.b.r()) {
            if (p(cnoyVar)) {
                l();
                return;
            } else {
                this.a.add(cnoyVar);
                return;
            }
        }
        this.a.add(cnoyVar);
        ConnectionResult connectionResult = this.m;
        if (connectionResult == null || !connectionResult.b()) {
            m();
        } else {
            Pi(this.m);
        }
    }

    public final void h() {
        cnwc.j(this.j.n);
        j(cnrn.a);
        this.d.a(false, cnrn.a);
        for (cnsb cnsbVar : (cnsb[]) this.e.keySet().toArray(new cnsb[0])) {
            g(new cnox(cnsbVar, new cpct()));
        }
        s(new ConnectionResult(4));
        if (this.b.r()) {
            this.b.x(new cnri(this));
        }
    }

    public final void i() {
        cnwc.j(this.j.n);
        this.m = null;
    }

    public final void j(Status status) {
        cnwc.j(this.j.n);
        r(status, null, false);
    }

    public final void k() {
        if (this.g) {
            this.j.n.removeMessages(11, this.c);
            this.j.n.removeMessages(9, this.c);
            this.g = false;
        }
    }

    public final void l() {
        this.j.n.removeMessages(12, this.c);
        Handler handler = this.j.n;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.j.c);
    }

    public final void m() {
        cnwc.j(this.j.n);
        if (this.b.r() || this.b.s()) {
            return;
        }
        try {
            cnrn cnrnVar = this.j;
            int a = cnrnVar.i.a(cnrnVar.g, this.b);
            if (a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(a, null);
                String name = this.b.getClass().getName();
                String valueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(valueOf);
                sb.toString();
                Pi(connectionResult);
                return;
            }
            cnrm cnrmVar = new cnrm(this.j, this.b, this.c);
            if (this.b.j()) {
                cnsv cnsvVar = this.l;
                cnwc.a(cnsvVar);
                coza cozaVar = cnsvVar.f;
                if (cozaVar != null) {
                    cozaVar.o();
                }
                cnsvVar.e.i = Integer.valueOf(System.identityHashCode(cnsvVar));
                cnnp<? extends coza, cozb> cnnpVar = cnsvVar.c;
                Context context = cnsvVar.a;
                Looper looper = cnsvVar.b.getLooper();
                cnum cnumVar = cnsvVar.e;
                cnsvVar.f = cnnpVar.b(context, looper, cnumVar, cnumVar.g, cnsvVar, cnsvVar);
                cnsvVar.g = cnrmVar;
                Set<Scope> set = cnsvVar.d;
                if (set == null || set.isEmpty()) {
                    cnsvVar.b.post(new cnst(cnsvVar));
                } else {
                    cnsvVar.f.g();
                }
            }
            try {
                this.b.n(cnrmVar);
            } catch (SecurityException e) {
                e(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            e(new ConnectionResult(10), e2);
        }
    }

    public final boolean n() {
        return this.b.j();
    }
}
