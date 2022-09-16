package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajbc  reason: default package */
/* loaded from: classes.dex */
public final class ajbc {
    public final Runnable a;
    public final Handler b;
    public final snc c;
    public final aadd d;
    public long e;
    public long f;
    public boolean g;

    public ajbc(snc sncVar, aadd aaddVar, Handler handler, final azqb azqbVar) {
        this.c = sncVar;
        this.d = aaddVar;
        this.b = handler;
        this.a = new Runnable() { // from class: ajbb
            @Override // java.lang.Runnable
            public final void run() {
                ajbc ajbcVar = ajbc.this;
                Object obj = azqbVar.get();
                if (ajbcVar.g) {
                    return;
                }
                ajbe ajbeVar = (ajbe) obj;
                ajff ajffVar = ajbeVar.a;
                int i = 2;
                if (ajbcVar.c.d() >= ajbcVar.f && ajjh.n(ajffVar) == 2) {
                    i = 4;
                } else if (!aiix.e(ajbcVar.d).h) {
                    i = 1;
                }
                ajbeVar.D(i);
                if (i == 4) {
                    long d = ajbcVar.c.d();
                    long j = ajbcVar.f;
                    if (d - j > 1000) {
                        ajbcVar.f = ajbcVar.c.d() + 1000;
                    } else {
                        ajbcVar.f = j + 1000;
                    }
                }
                Handler handler2 = ajbcVar.b;
                Runnable runnable = ajbcVar.a;
                long j2 = ajbcVar.e;
                if (j2 <= 0 || j2 > 100) {
                    j2 = 100;
                }
                handler2.postDelayed(runnable, j2);
                ajbcVar.e = Long.MAX_VALUE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.removeCallbacks(this.a);
        this.f = 0L;
        this.b.post(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.removeCallbacks(this.a);
    }
}
