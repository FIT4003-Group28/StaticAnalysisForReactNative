package defpackage;

import android.database.DataSetObserver;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abte  reason: default package */
/* loaded from: classes.dex */
public final class abte extends DataSetObserver {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    public boolean c;
    private final zuk d;
    private String f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private final abxa e = abxa.b();
    public final Deque b = new ArrayDeque();
    private final abwy l = new abtd(this);

    public abte(zuk zukVar) {
        this.d = zukVar;
    }

    public final void a() {
        if (this.g > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.i;
            float f = ((float) uptimeMillis) / 1000.0f;
            this.b.addLast(new abtf(this.f, uptimeMillis, ((float) this.g) / f, ((float) this.h) / f));
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            return;
        }
        if (!this.j) {
            return;
        }
        this.h++;
    }

    public final synchronized void c() {
        if (!this.c) {
            return;
        }
        if (!this.j) {
            this.i = SystemClock.uptimeMillis();
            this.j = true;
        }
        this.g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.c && this.k) {
            this.e.i(astt.class);
            this.e.k(astt.class);
            this.k = false;
        }
    }

    public final void e() {
        this.f = this.d.c;
        this.g = 0L;
        this.h = 0L;
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.c && !this.k) {
            e();
            this.e.j(astt.class, a);
            this.k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        if (!this.c && !this.k) {
            e();
            this.e.f(astt.class, abte.class, this.l);
            this.e.j(astt.class, a);
            this.d.registerObserver(this);
            this.c = true;
            this.k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        if (!this.c) {
            return;
        }
        this.e.i(astt.class);
        this.e.k(astt.class);
        this.e.f(astt.class, abte.class, null);
        this.c = false;
        this.k = false;
    }

    @Override // android.database.DataSetObserver
    public final synchronized void onChanged() {
        if (this.c && this.k) {
            a();
            e();
        }
    }
}
