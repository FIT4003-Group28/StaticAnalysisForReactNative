package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acxb  reason: default package */
/* loaded from: classes.dex */
public final class acxb implements acxh {
    public static final String a = zep.a("MDX.BackgroundPlaybackStarter");
    public final Context b;
    public final adgc c;
    public final adeo d;
    public final snc f;
    public final acxo g;
    public final adoa h;
    public final Intent i;
    public final azqb j;
    public final acxi k;
    public final Executor l;
    public final acwu m;
    public acxk n;
    public long o;
    public boolean p;
    public adnt q;
    public boolean r;
    private final acwx t = new acwx(this);
    public final adny s = new acwy(this);
    public final Handler e = new Handler(Looper.getMainLooper());

    public acxb(Context context, adgc adgcVar, adeo adeoVar, snc sncVar, acxo acxoVar, adoa adoaVar, Intent intent, azqb azqbVar, acxi acxiVar, Executor executor, acwu acwuVar) {
        this.b = context;
        this.c = adgcVar;
        this.d = adeoVar;
        this.f = sncVar;
        this.g = acxoVar;
        this.h = adoaVar;
        this.i = intent;
        this.j = azqbVar;
        this.k = acxiVar;
        this.l = executor;
        this.m = acwuVar;
    }

    public final void a() {
        this.e.removeCallbacksAndMessages(null);
        this.h.i(this.s);
        this.c.K(this);
        this.n = null;
        this.r = false;
        this.q = null;
    }

    public final void b() {
        adnt adntVar = this.q;
        if (adntVar != null) {
            this.r = true;
            adntVar.C();
            acxi acxiVar = this.k;
            acxk acxkVar = this.n;
            acxiVar.a(7, acxkVar.e, this.p, acxkVar.d.e);
        }
        a();
    }

    public final void c(int i) {
        d(i, null);
    }

    public final void d(int i, adnt adntVar) {
        acxk acxkVar = this.n;
        acxkVar.getClass();
        this.g.b(acxkVar);
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 5;
            } else if (i != 2) {
                adntVar.getClass();
                i2 = 4;
            } else {
                i2 = 6;
            }
        }
        acxi acxiVar = this.k;
        acxk acxkVar2 = this.n;
        acxiVar.a(i2, acxkVar2.e, this.p, acxkVar2.d.e);
        a();
    }

    @Override // defpackage.acxh
    public final void e(acxk acxkVar) {
        f(acxkVar, false);
    }

    public final void f(acxk acxkVar, boolean z) {
        this.p = z;
        this.g.f(this.t);
        this.g.c(acxkVar);
        if (acxkVar.c <= 0) {
            acxj acxjVar = new acxj(acxkVar);
            acxjVar.d(10);
            acxkVar = acxjVar.a();
        }
        this.o = this.f.c();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.P(this);
        } else {
            this.e.post(new Runnable() { // from class: acww
                @Override // java.lang.Runnable
                public final void run() {
                    acxb acxbVar = acxb.this;
                    acxbVar.c.P(acxbVar);
                }
            });
        }
        this.n = acxkVar;
        this.e.removeCallbacksAndMessages(null);
        this.e.post(new acxa(this));
    }
}
