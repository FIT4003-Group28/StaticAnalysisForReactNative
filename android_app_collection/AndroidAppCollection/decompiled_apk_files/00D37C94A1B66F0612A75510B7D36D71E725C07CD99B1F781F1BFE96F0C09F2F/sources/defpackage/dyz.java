package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyz  reason: default package */
/* loaded from: classes3.dex */
public abstract class dyz extends amhj implements dwk {
    public boolean a;
    dzb b;
    azqb c;
    azqb d;
    azqb e;
    axnm f;
    axnm g;
    azqb h;
    Executor i;
    azqb j;
    azqb k;
    azqb l;
    ywk m;
    private long p;
    private long q;
    private dyv r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amhj, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.p = SystemClock.elapsedRealtime();
        this.q = System.currentTimeMillis();
        super.attachBaseContext(context);
    }

    @Override // defpackage.dwk
    public final long b() {
        return this.q;
    }

    @Override // defpackage.dwk
    public final long c() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(azqb azqbVar) {
        this.r = (dyv) azqbVar.get();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        boolean z;
        azqb azqbVar;
        ywk ywkVar = this.m;
        boolean z2 = false;
        if (ywkVar == null || (ywkVar.c(ywk.F) & 16) != 0) {
            z = false;
        } else {
            if (this.r == null && (azqbVar = this.e) != null) {
                i(azqbVar);
            }
            z = true;
        }
        final dyv dyvVar = this.r;
        if (dyvVar != null) {
            if (dyvVar.b == 1 || (dyvVar.b == 2 && i >= 20)) {
                if ((dyvVar.c & 1) == 0) {
                    dyvVar.b(i);
                    dyvVar.a(i);
                } else {
                    dyvVar.a.a.a.execute(new Runnable() { // from class: dyu
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2;
                            dyv dyvVar2 = dyv.this;
                            int i3 = i;
                            while (true) {
                                int i4 = dyvVar2.d.get();
                                if (i4 != 0) {
                                    if (i3 <= i4 || dyvVar2.d.compareAndSet(i4, i3)) {
                                        return;
                                    }
                                } else if (dyvVar2.d.compareAndSet(0, i3)) {
                                    do {
                                        i2 = dyvVar2.d.get();
                                        dyvVar2.b(i2);
                                        dyvVar2.a(i2);
                                    } while (!dyvVar2.d.compareAndSet(i2, 0));
                                    return;
                                }
                            }
                        }
                    });
                }
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            super.onTrimMemory(i);
        }
    }
}
