package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cmeq  reason: default package */
/* loaded from: classes5.dex */
public final class cmeq {
    public final int a;
    public final cmeh b;
    public final CopyOnWriteArrayList<cmep> c;

    public cmeq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private cmeq(CopyOnWriteArrayList<cmep> copyOnWriteArrayList, int i, cmeh cmehVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = cmehVar;
    }

    public static final long g(long j) {
        long a = cllt.a(j);
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return a;
    }

    public final void a(Handler handler, cmer cmerVar) {
        cmmn.f(cmerVar);
        this.c.add(new cmep(handler, cmerVar));
    }

    public final void b(final cmdz cmdzVar, final cmee cmeeVar) {
        Iterator<cmep> it = this.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            final cmer cmerVar = next.b;
            cmny.ak(next.a, new Runnable(this, cmerVar, cmdzVar, cmeeVar) { // from class: cmek
                private final cmeq a;
                private final cmer b;
                private final cmdz c;
                private final cmee d;

                {
                    this.a = this;
                    this.b = cmerVar;
                    this.c = cmdzVar;
                    this.d = cmeeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmeq cmeqVar = this.a;
                    this.b.a(cmeqVar.a, cmeqVar.b, this.c, this.d);
                }
            });
        }
    }

    public final void c(final cmdz cmdzVar, final cmee cmeeVar) {
        Iterator<cmep> it = this.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            final cmer cmerVar = next.b;
            cmny.ak(next.a, new Runnable(this, cmerVar, cmdzVar, cmeeVar) { // from class: cmel
                private final cmeq a;
                private final cmer b;
                private final cmdz c;
                private final cmee d;

                {
                    this.a = this;
                    this.b = cmerVar;
                    this.c = cmdzVar;
                    this.d = cmeeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmeq cmeqVar = this.a;
                    this.b.b(cmeqVar.a, cmeqVar.b, this.c, this.d);
                }
            });
        }
    }

    public final void d(final cmdz cmdzVar, final cmee cmeeVar) {
        Iterator<cmep> it = this.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            final cmer cmerVar = next.b;
            cmny.ak(next.a, new Runnable(this, cmerVar, cmdzVar, cmeeVar) { // from class: cmem
                private final cmeq a;
                private final cmer b;
                private final cmdz c;
                private final cmee d;

                {
                    this.a = this;
                    this.b = cmerVar;
                    this.c = cmdzVar;
                    this.d = cmeeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmeq cmeqVar = this.a;
                    this.b.c(cmeqVar.a, cmeqVar.b, this.c, this.d);
                }
            });
        }
    }

    public final void e(final cmdz cmdzVar, final cmee cmeeVar, final IOException iOException, final boolean z) {
        Iterator<cmep> it = this.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            final cmer cmerVar = next.b;
            cmny.ak(next.a, new Runnable(this, cmerVar, cmdzVar, cmeeVar, iOException, z) { // from class: cmen
                private final cmeq a;
                private final cmer b;
                private final cmdz c;
                private final cmee d;
                private final IOException e;
                private final boolean f;

                {
                    this.a = this;
                    this.b = cmerVar;
                    this.c = cmdzVar;
                    this.d = cmeeVar;
                    this.e = iOException;
                    this.f = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmeq cmeqVar = this.a;
                    this.b.d(cmeqVar.a, cmeqVar.b, this.c, this.d, this.e, this.f);
                }
            });
        }
    }

    public final void f(final cmee cmeeVar) {
        Iterator<cmep> it = this.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            final cmer cmerVar = next.b;
            cmny.ak(next.a, new Runnable(this, cmerVar, cmeeVar) { // from class: cmeo
                private final cmeq a;
                private final cmer b;
                private final cmee c;

                {
                    this.a = this;
                    this.b = cmerVar;
                    this.c = cmeeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmeq cmeqVar = this.a;
                    this.b.e(cmeqVar.a, cmeqVar.b, this.c);
                }
            });
        }
    }

    public final cmeq h(int i, cmeh cmehVar) {
        return new cmeq(this.c, i, cmehVar);
    }
}
