package defpackage;

import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnkb  reason: default package */
/* loaded from: classes.dex */
public class cnkb {
    public final String a;
    public final Object b;
    public ain<aik<long[]>> c;
    public final /* synthetic */ cnkr d;
    private int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public cnkb(cnkr cnkrVar, cnkb cnkbVar, boolean z) {
        this(cnkrVar, cnkbVar.a);
        synchronized (cnkbVar.b) {
            this.e = cnkbVar.e;
            if (!z) {
                this.c = new ain<>(cnkbVar.c.f());
                for (int i = 0; i < cnkbVar.c.f(); i++) {
                    int g = cnkbVar.c.g(i);
                    aik<long[]> h = cnkbVar.c.h(i);
                    aik<long[]> aikVar = new aik<>(h.e());
                    for (int i2 = 0; i2 < h.e(); i2++) {
                        aikVar.d(h.f(i2), new long[]{h.g(i2)[0]});
                    }
                    this.c.e(g, aikVar);
                }
                return;
            }
            ain<aik<long[]>> ainVar = this.c;
            this.c = cnkbVar.c;
            cnkbVar.c = ainVar;
            cnkbVar.e = 0;
        }
    }

    private final boolean b(long j, long j2, Integer num) {
        synchronized (this.b) {
            aik<long[]> b = this.c.b(num.intValue());
            if (b == null) {
                b = new aik<>();
                this.c.e(num.intValue(), b);
            }
            int i = this.e;
            cnkr cnkrVar = this.d;
            cnkc cnkcVar = cnkr.a;
            if (i >= cnkrVar.g) {
                cnkrVar.q;
                if (this.e == this.d.g && String.valueOf(this.a).length() == 0) {
                    new String("exceeded sample count in ");
                }
                return false;
            }
            this.e = i + 1;
            long[] b2 = b.b(j);
            if (b2 == null) {
                b2 = new long[]{0};
                b.d(j, b2);
            }
            b2[0] = b2[0] + j2;
            this.d.q;
            return false;
        }
    }

    public final void a(long j, long j2, cnkk cnkkVar) {
        Integer g;
        boolean z;
        Integer f;
        if (cnkkVar == null) {
            cnkkVar = cnkr.d;
        }
        cnkr cnkrVar = this.d;
        cnkc cnkcVar = cnkr.a;
        cnkrVar.h.readLock().lock();
        try {
            if (cnkkVar == cnkr.e) {
                g = this.d.m;
            } else {
                g = this.d.g(cnkkVar);
            }
            Integer num = g;
            if (num == null) {
                z = true;
            } else {
                b(j, j2, num);
                z = false;
            }
            if (z) {
                Lock writeLock = this.d.h.writeLock();
                writeLock.lock();
                try {
                    if (cnkkVar == cnkr.e) {
                        cnkr cnkrVar2 = this.d;
                        cnkrVar2.m = cnkrVar2.f(cnkrVar2.l);
                        f = this.d.m;
                    } else {
                        f = this.d.f(cnkkVar);
                    }
                    this.d.h.readLock().lock();
                    writeLock.unlock();
                    writeLock = this.d.h.readLock();
                    b(j, j2, f);
                } finally {
                    writeLock.unlock();
                }
            }
            int i = this.d.i;
        } finally {
            this.d.h.readLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractCounter");
        sb.append("(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            for (int i = 0; i < this.c.f(); i++) {
                aik<long[]> h = this.c.h(i);
                sb.append(this.c.g(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < h.e(); i2++) {
                    sb.append(h.f(i2));
                    sb.append(" = ");
                    sb.append(h.g(i2)[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cnkb(cnkr cnkrVar, String str) {
        this.d = cnkrVar;
        this.b = new Object();
        this.c = new ain<>();
        cnkc cnkcVar = cnkr.a;
        int i = cnkrVar.g;
        if (cnkrVar.k.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "counter/histogram already exists: ".concat(valueOf) : new String("counter/histogram already exists: "));
        } else {
            this.a = str;
        }
    }
}
