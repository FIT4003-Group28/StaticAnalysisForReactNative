package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import j$.time.Duration;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aczk  reason: default package */
/* loaded from: classes.dex */
public final class aczk implements acyz, rut {
    public static final String a = zep.a("MDX.CastSdkClient");
    public final Context b;
    public final acza c;
    public final String d;
    public final aczl e;
    public final axnm f;
    public final Executor h;
    public aczb i;
    private qls k;
    private aczj l;
    private boolean m;
    private qkp n;
    private final Duration o;
    private long p;
    final Handler j = new Handler(Looper.getMainLooper());
    public boolean g = false;

    public aczk(Context context, acza aczaVar, aczr aczrVar, Executor executor, aczl aczlVar, axnm axnmVar, acwu acwuVar) {
        this.b = context;
        this.c = aczaVar;
        this.h = executor;
        this.e = aczlVar;
        this.f = axnmVar;
        this.o = Duration.ofSeconds(acwuVar.E);
        this.p = acwuVar.F;
        this.d = aczrVar.j;
    }

    private final void g(qkp qkpVar) {
        this.k = qkpVar.d();
        aczj aczjVar = new aczj(this);
        this.l = aczjVar;
        this.k.c(aczjVar, qku.class);
        this.m = true;
    }

    @Override // defpackage.rut
    public final void a(rve rveVar) {
        if (rveVar.k()) {
            qkp qkpVar = (qkp) rveVar.g();
            this.n = qkpVar;
            if (this.m) {
                return;
            }
            g(qkpVar);
            this.p = 2L;
            return;
        }
        zep.f(a, "Error fetching CastContext.", rveVar.f());
        this.j.postDelayed(new Runnable() { // from class: aczh
            @Override // java.lang.Runnable
            public final void run() {
                aczk aczkVar = aczk.this;
                qkp.f(aczkVar.b, aczkVar.h).q(aczkVar);
            }
        }, this.o.multipliedBy(this.p).toMillis());
        long j = this.p;
        this.p = j * j;
    }

    @Override // defpackage.acyz
    public final void b() {
        ylr.c();
        if (this.m) {
            this.l.a = false;
            return;
        }
        qkp qkpVar = this.n;
        if (qkpVar != null) {
            g(qkpVar);
        } else {
            qkp.f(this.b, this.h).q(this);
        }
    }

    @Override // defpackage.acyz
    public final void c() {
        if (!this.m) {
            return;
        }
        this.l.a = true;
    }

    @Override // defpackage.acyz
    public final void d(boolean z) {
        qlb qlbVar;
        qkp qkpVar = this.n;
        if (qkpVar == null) {
            return;
        }
        qnm.g("Must be called from the main thread.");
        CastOptions castOptions = qkpVar.h;
        if (z == castOptions.b) {
            return;
        }
        castOptions.b = z;
        qkpVar.g();
        qku a2 = qkpVar.f.a();
        if (a2 == null || (qlbVar = a2.b) == null) {
            return;
        }
        try {
            qlbVar.i(z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.acyz
    public final boolean e() {
        return this.m;
    }

    public final void f() {
        this.i = null;
    }
}
