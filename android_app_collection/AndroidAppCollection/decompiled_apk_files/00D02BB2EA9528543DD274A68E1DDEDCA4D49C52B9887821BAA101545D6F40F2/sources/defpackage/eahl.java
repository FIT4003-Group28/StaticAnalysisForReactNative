package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: eahl  reason: default package */
/* loaded from: classes6.dex */
public final class eahl {
    long a = 0;
    long b;
    final int c;
    final eahe d;
    public final Deque<eadx> e;
    public boolean f;
    public final eahj g;
    final eahi h;
    final eahk i;
    final eahk j;
    int k;

    public eahl(int i, eahe eaheVar, boolean z, boolean z2, @dzsi eadx eadxVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new eahk(this);
        this.j = new eahk(this);
        this.k = 0;
        this.c = i;
        this.d = eaheVar;
        this.b = eaheVar.n.d();
        eahj eahjVar = new eahj(this, eaheVar.m.d());
        this.g = eahjVar;
        eahi eahiVar = new eahi(this);
        this.h = eahiVar;
        eahjVar.e = z2;
        eahiVar.b = z;
        if (eadxVar != null) {
            arrayDeque.add(eadxVar);
        }
        if (!b() || eadxVar == null) {
            if (!b() && eadxVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
    }

    private final boolean m(int i) {
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.e && this.h.b) {
                return false;
            }
            this.k = i;
            notifyAll();
            this.d.b(this.c);
            return true;
        }
    }

    public final synchronized boolean a() {
        if (this.k != 0) {
            return false;
        }
        eahj eahjVar = this.g;
        if (eahjVar.e || eahjVar.d) {
            eahi eahiVar = this.h;
            if (eahiVar.b || eahiVar.a) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        int i = this.c;
        boolean z = this.d.b;
        return (i & 1) == 1;
    }

    public final synchronized eadx c() {
        this.i.d();
        while (this.e.isEmpty() && this.k == 0) {
            i();
        }
        this.i.c();
        if (!this.e.isEmpty()) {
        } else {
            throw new eahs(this.k);
        }
        return this.e.removeFirst();
    }

    public final eajx d() {
        synchronized (this) {
            if (!this.f && !b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        boolean a;
        synchronized (this) {
            this.g.e = true;
            a = a();
            notifyAll();
        }
        if (!a) {
            this.d.b(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        boolean a;
        synchronized (this) {
            eahj eahjVar = this.g;
            z = true;
            if (!eahjVar.e && eahjVar.d) {
                eahi eahiVar = this.h;
                if (!eahiVar.b) {
                    if (eahiVar.a) {
                    }
                }
                a = a();
            }
            z = false;
            a = a();
        }
        if (z) {
            j(9);
        } else if (a) {
        } else {
            this.d.b(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        eahi eahiVar = this.h;
        if (eahiVar.a) {
            throw new IOException("stream closed");
        }
        if (!eahiVar.b) {
            int i = this.k;
            if (i != 0) {
                throw new eahs(i);
            }
            return;
        }
        throw new IOException("stream finished");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void j(int i) {
        if (!m(i)) {
            return;
        }
        this.d.n(this.c, i);
    }

    public final void k(int i) {
        if (!m(i)) {
            return;
        }
        this.d.m(this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void l(int i) {
        if (this.k == 0) {
            this.k = i;
            notifyAll();
        }
    }
}
