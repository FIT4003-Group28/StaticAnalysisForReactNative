package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
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
/* renamed from: qum  reason: default package */
/* loaded from: classes4.dex */
public final class qum implements qsv, qsw {
    public final qsn b;
    public final qtp c;
    public final que d;
    public final int g;
    public boolean h;
    public final /* synthetic */ quq l;
    private final qvr m;
    public final Queue a = new LinkedList();
    public final Set e = new HashSet();
    public final Map f = new HashMap();
    public final List i = new ArrayList();
    public ConnectionResult j = null;
    public int k = 0;

    public qum(quq quqVar, qst qstVar) {
        this.l = quqVar;
        Looper looper = quqVar.o.getLooper();
        qwu a = qstVar.q().a();
        tzc tzcVar = qstVar.y.c;
        qnm.b(tzcVar);
        qsn b = tzcVar.b(qstVar.w, looper, a, qstVar.z, this, this);
        String str = qstVar.x;
        if (str != null) {
            ((qwr) b).B = str;
        }
        this.b = b;
        this.c = qstVar.A;
        this.d = new que();
        this.g = qstVar.C;
        if (b.j()) {
            this.m = new qvr(quqVar.g, quqVar.o, qstVar.q().a());
        } else {
            this.m = null;
        }
    }

    private final Feature p(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] y = this.b.y();
            if (y == null) {
                y = new Feature[0];
            }
            afw afwVar = new afw(y.length);
            for (Feature feature : y) {
                afwVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) afwVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status q(ConnectionResult connectionResult) {
        return quq.a(this.c, connectionResult);
    }

    private final void r(ConnectionResult connectionResult) {
        for (qtq qtqVar : this.e) {
            qtqVar.a(this.c, connectionResult, tnk.j(connectionResult, ConnectionResult.a) ? this.b.s() : null);
        }
        this.e.clear();
    }

    private final void s(Status status, Exception exc, boolean z) {
        qnm.f(this.l.o);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 == z2) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            qto qtoVar = (qto) it.next();
            if (!z || qtoVar.c == 2) {
                if (status != null) {
                    qtoVar.d(status);
                } else {
                    qtoVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(qto qtoVar) {
        qtoVar.g(this.d, o());
        try {
            qtoVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(qto qtoVar) {
        if (!(qtoVar instanceof qti)) {
            t(qtoVar);
            return true;
        }
        qti qtiVar = (qti) qtoVar;
        Feature p = p(qtiVar.b(this));
        if (p == null) {
            t(qtoVar);
            return true;
        }
        String name = this.b.getClass().getName();
        String str = p.a;
        long a = p.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.l.p || !qtiVar.a(this)) {
            qtiVar.e(new qth(p));
            return true;
        }
        qun qunVar = new qun(this.c, p);
        int indexOf = this.i.indexOf(qunVar);
        if (indexOf >= 0) {
            qun qunVar2 = (qun) this.i.get(indexOf);
            this.l.o.removeMessages(15, qunVar2);
            Handler handler = this.l.o;
            handler.sendMessageDelayed(Message.obtain(handler, 15, qunVar2), 5000L);
            return false;
        }
        this.i.add(qunVar);
        Handler handler2 = this.l.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, qunVar), 5000L);
        Handler handler3 = this.l.o;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, qunVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (v(connectionResult)) {
            return false;
        }
        this.l.i(connectionResult, this.g);
        return false;
    }

    private final boolean v(ConnectionResult connectionResult) {
        synchronized (quq.c) {
            quq quqVar = this.l;
            if (quqVar.m == null || !quqVar.n.contains(this.c)) {
                return false;
            }
            this.l.m.a(connectionResult, this.g);
            return true;
        }
    }

    @Override // defpackage.qub
    public final void a(int i) {
        if (Looper.myLooper() == this.l.o.getLooper()) {
            k(i);
        } else {
            this.l.o.post(new quj(this, i));
        }
    }

    @Override // defpackage.qub
    public final void b() {
        if (Looper.myLooper() == this.l.o.getLooper()) {
            h();
        } else {
            this.l.o.post(new qui(this));
        }
    }

    public final void c() {
        qnm.f(this.l.o);
        this.j = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [rty, qsn] */
    public final void d() {
        qnm.f(this.l.o);
        if (this.b.w() || this.b.x()) {
            return;
        }
        try {
            quq quqVar = this.l;
            qxj qxjVar = quqVar.i;
            Context context = quqVar.g;
            qsn qsnVar = this.b;
            qnm.b(context);
            qnm.b(qsnVar);
            qsnVar.A();
            int a = qsnVar.a();
            int b = qxjVar.b(a);
            if (b == -1) {
                b = 0;
                int i = 0;
                while (true) {
                    if (i >= qxjVar.a.size()) {
                        b = -1;
                        break;
                    }
                    int keyAt = qxjVar.a.keyAt(i);
                    if (keyAt > a && qxjVar.a.get(keyAt) == 0) {
                        break;
                    }
                    i++;
                }
                if (b == -1) {
                    b = qxjVar.b.h(context, a);
                }
                qxjVar.a.put(a, b);
            }
            if (b != 0) {
                ConnectionResult connectionResult = new ConnectionResult(b, null);
                String name = this.b.getClass().getName();
                String valueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(valueOf);
                Log.w("GoogleApiManager", sb.toString());
                i(connectionResult);
                return;
            }
            qup qupVar = new qup(this.l, this.b, this.c);
            if (this.b.j()) {
                qvr qvrVar = this.m;
                qnm.b(qvrVar);
                rty rtyVar = qvrVar.e;
                if (rtyVar != null) {
                    rtyVar.l();
                }
                qvrVar.d.h = Integer.valueOf(System.identityHashCode(qvrVar));
                tzc tzcVar = qvrVar.g;
                Context context2 = qvrVar.a;
                Looper looper = qvrVar.b.getLooper();
                qwu qwuVar = qvrVar.d;
                qvrVar.e = tzcVar.b(context2, looper, qwuVar, qwuVar.g, qvrVar, qvrVar);
                qvrVar.f = qupVar;
                Set set = qvrVar.c;
                if (set == null || set.isEmpty()) {
                    qvrVar.b.post(new qvp(qvrVar));
                } else {
                    qwr qwrVar = (qwr) qvrVar.e;
                    qwrVar.v(new qwo(qwrVar));
                }
            }
            try {
                this.b.v(qupVar);
            } catch (SecurityException e) {
                j(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new ConnectionResult(10), e2);
        }
    }

    public final void e(qto qtoVar) {
        qnm.f(this.l.o);
        if (this.b.w()) {
            if (u(qtoVar)) {
                l();
                return;
            } else {
                this.a.add(qtoVar);
                return;
            }
        }
        this.a.add(qtoVar);
        ConnectionResult connectionResult = this.j;
        if (connectionResult == null || !connectionResult.b()) {
            d();
        } else {
            i(this.j);
        }
    }

    public final void f(Status status) {
        qnm.f(this.l.o);
        s(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qto qtoVar = (qto) arrayList.get(i);
            if (!this.b.w()) {
                return;
            }
            if (u(qtoVar)) {
                this.a.remove(qtoVar);
            }
        }
    }

    public final void h() {
        c();
        r(ConnectionResult.a);
        n();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            qvk qvkVar = (qvk) it.next();
            if (p(qvkVar.a.b) != null) {
                it.remove();
            } else {
                try {
                    qvkVar.a.b(this.b, new rvh());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    @Override // defpackage.qvh
    public final void i(ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(ConnectionResult connectionResult, Exception exc) {
        rty rtyVar;
        qnm.f(this.l.o);
        qvr qvrVar = this.m;
        if (qvrVar != null && (rtyVar = qvrVar.e) != null) {
            rtyVar.l();
        }
        c();
        this.l.i.a();
        r(connectionResult);
        if ((this.b instanceof qye) && connectionResult.c != 24) {
            quq quqVar = this.l;
            quqVar.f = true;
            Handler handler = quqVar.o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (connectionResult.c == 4) {
            f(quq.b);
        } else if (this.a.isEmpty()) {
            this.j = connectionResult;
        } else if (exc != null) {
            qnm.f(this.l.o);
            s(null, exc, false);
        } else if (!this.l.p) {
            f(q(connectionResult));
        } else {
            s(q(connectionResult), null, true);
            if (this.a.isEmpty() || v(connectionResult) || this.l.i(connectionResult, this.g)) {
                return;
            }
            if (connectionResult.c == 18) {
                this.h = true;
            }
            if (this.h) {
                Handler handler2 = this.l.o;
                handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
                return;
            }
            f(q(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        que queVar = this.d;
        String t = this.b.t();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (t != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(t);
        }
        queVar.a(true, new Status(20, sb.toString()));
        Handler handler = this.l.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        Handler handler2 = this.l.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.c), 120000L);
        this.l.i.a();
        for (qvk qvkVar : this.f.values()) {
            Runnable runnable = qvkVar.c;
        }
    }

    public final void l() {
        this.l.o.removeMessages(12, this.c);
        Handler handler = this.l.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.l.e);
    }

    public final void m() {
        qnm.f(this.l.o);
        f(quq.a);
        this.d.a(false, quq.a);
        for (qvb qvbVar : (qvb[]) this.f.keySet().toArray(new qvb[0])) {
            e(new qtn(qvbVar, new rvh()));
        }
        r(new ConnectionResult(4));
        if (this.b.w()) {
            this.b.z(new qul(this));
        }
    }

    public final void n() {
        if (this.h) {
            this.l.o.removeMessages(11, this.c);
            this.l.o.removeMessages(9, this.c);
            this.h = false;
        }
    }

    public final boolean o() {
        return this.b.j();
    }
}
