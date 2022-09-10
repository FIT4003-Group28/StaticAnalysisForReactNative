package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
/* compiled from: PG */
/* renamed from: eafm  reason: default package */
/* loaded from: classes6.dex */
public final class eafm {
    public final eacx a;
    public eafj b;
    public eaes c;
    public final eadj d;
    public final eadc e;
    public final eadu f;
    public final eafk g;
    public int h;
    public eafg i;
    public boolean j;
    public boolean k;
    public boolean l;
    public eafq m;
    private final Object n;

    public eafm(eadj eadjVar, eacx eacxVar, eadc eadcVar, eadu eaduVar, Object obj) {
        this.d = eadjVar;
        this.a = eacxVar;
        this.e = eadcVar;
        this.f = eaduVar;
        this.g = new eafk(eacxVar, a());
        this.n = obj;
    }

    public final eafh a() {
        return this.d.f;
    }

    public final synchronized eafg b() {
        return this.i;
    }

    public final void c() {
        eafg eafgVar;
        Socket e;
        synchronized (this.d) {
            eafgVar = this.i;
            e = e(false, true, false);
            if (this.i != null) {
                eafgVar = null;
            }
        }
        eafa.c(e);
        if (eafgVar != null) {
            ((eaek) this.e).e(null);
        }
    }

    public final void d() {
        Socket e;
        synchronized (this.d) {
            e = e(true, false, false);
        }
        eafa.c(e);
    }

    public final Socket e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.m = null;
        }
        if (z2) {
            this.k = true;
        }
        eafg eafgVar = this.i;
        if (eafgVar != null) {
            if (z) {
                eafgVar.j = true;
            }
            if (this.m != null) {
                return null;
            }
            if (!this.k && !eafgVar.j) {
                return null;
            }
            int size = eafgVar.m.size();
            for (int i = 0; i < size; i++) {
                if (eafgVar.m.get(i).get() == this) {
                    eafgVar.m.remove(i);
                    if (this.i.m.isEmpty()) {
                        this.i.n = System.nanoTime();
                        eadj eadjVar = this.d;
                        eafg eafgVar2 = this.i;
                        if (eafgVar2.j || eadjVar.b == 0) {
                            eadjVar.e.remove(eafgVar2);
                            socket = this.i.d;
                            this.i = null;
                            return socket;
                        }
                        eadjVar.notifyAll();
                    }
                    socket = null;
                    this.i = null;
                    return socket;
                }
            }
            throw new IllegalStateException();
        }
        return null;
    }

    public final void f(IOException iOException) {
        boolean z;
        Socket e;
        synchronized (this.d) {
            if (iOException instanceof eahs) {
                int i = ((eahs) iOException).a;
                if (i == 8) {
                    int i2 = this.h + 1;
                    this.h = i2;
                    if (i2 > 1) {
                        this.c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (i != 9) {
                        this.c = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                eafg eafgVar = this.i;
                if (eafgVar != null && (!eafgVar.h() || (iOException instanceof eagh))) {
                    if (this.i.k == 0) {
                        eaes eaesVar = this.c;
                        if (eaesVar != null && iOException != null) {
                            eafk eafkVar = this.g;
                            if (eaesVar.b.type() != Proxy.Type.DIRECT) {
                                eacx eacxVar = eafkVar.a;
                                eacxVar.g.connectFailed(eacxVar.a.b(), eaesVar.b.address(), iOException);
                            }
                            eafkVar.b.a(eaesVar);
                        }
                        this.c = null;
                    }
                    z = true;
                }
                z = false;
            }
            e = e(z, false, true);
        }
        eafa.c(e);
    }

    public final void g(eafg eafgVar, boolean z) {
        if (this.i == null) {
            this.i = eafgVar;
            this.j = z;
            eafgVar.m.add(new eafl(this, this.n));
            return;
        }
        throw new IllegalStateException();
    }

    public final void h(boolean z, eafq eafqVar, IOException iOException) {
        Socket e;
        boolean z2;
        synchronized (this.d) {
            if (eafqVar != null) {
                if (eafqVar == this.m) {
                    if (!z) {
                        this.i.k++;
                    }
                    e = e(z, false, true);
                    z2 = this.k;
                }
            }
            throw new IllegalStateException("expected " + this.m + " but was " + eafqVar);
        }
        eafa.c(e);
        if (iOException != null) {
            ((eaek) this.e).e(iOException);
        } else if (!z2) {
        } else {
            ((eaek) this.e).e(null);
        }
    }

    public final String toString() {
        eafg b = b();
        return b != null ? b.toString() : this.a.toString();
    }
}
