package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ywm  reason: default package */
/* loaded from: classes4.dex */
public final class ywm implements ywk {
    private final zds X;
    private final Context Y;
    private final ScheduledExecutorService Z;
    public final AtomicReference a = new AtomicReference();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (defpackage.zgd.B(defpackage.ywg.n(r3)) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ywm(android.content.Context r3, j$.util.Optional r4, java.util.concurrent.ScheduledExecutorService r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.Y = r3
            r0 = 0
            java.lang.Object r4 = r4.orElse(r0)
            zds r4 = (defpackage.zds) r4
            r2.X = r4
            r2.Z = r5
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r2.a = r4
            r4 = 1
            r5 = 0
            java.io.File r3 = defpackage.ywg.o(r3)     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto L34
            java.io.File r1 = defpackage.ywg.p(r3)     // Catch: java.lang.Exception -> L34
            boolean r1 = defpackage.zgd.B(r1)     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto L35
            java.io.File r3 = defpackage.ywg.n(r3)     // Catch: java.lang.Exception -> L34
            boolean r3 = defpackage.zgd.B(r3)     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto L34
            goto L35
        L34:
            r4 = 0
        L35:
            r2.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywm.<init>(android.content.Context, j$.util.Optional, java.util.concurrent.ScheduledExecutorService):void");
    }

    final ywk a(boolean z, Object obj) {
        ywk ywpVar;
        if (z) {
            ywpVar = new ywg(this.Y, this.X, this.Z, (String[]) obj);
        } else {
            ywpVar = new ywp(this.Y, (long[][]) obj);
        }
        this.a.set(ywpVar);
        return ywpVar;
    }

    public final void b(ywr ywrVar) {
        ywrVar.f.as(new ayqb() { // from class: ywl
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ywf ywfVar;
                ywe b;
                ywm ywmVar = ywm.this;
                long longValue = ((Long) obj).longValue();
                ywk ywkVar = (ywk) ywmVar.a.get();
                if (ywkVar instanceof ywg) {
                    ywg ywgVar = (ywg) ywkVar;
                    if (zgt.r(longValue, ywr.a) == 3) {
                        ywgVar.i(2);
                        return;
                    }
                    int r = zgt.r(longValue, ywr.e);
                    do {
                        ywfVar = (ywf) ywgVar.a.get();
                        if (ywfVar.e == r) {
                            return;
                        }
                        b = ywfVar.b();
                        b.f(r);
                    } while (!ywgVar.k(ywfVar, b));
                }
            }
        });
    }

    @Override // defpackage.ywk
    public final long c(ywj ywjVar) {
        return ((ywk) this.a.get()).c(ywjVar);
    }

    @Override // defpackage.ywk
    public final synchronized SharedPreferences.Editor d(SharedPreferences.Editor editor, apyy apyyVar, arhd arhdVar) {
        ywk ywkVar;
        avfg avfgVar = arhdVar.y;
        if (avfgVar == null) {
            avfgVar = avfg.a;
        }
        boolean z = avfgVar.c;
        ywkVar = (ywk) this.a.get();
        if (z != (this.a.get() instanceof ywg)) {
            Object g = ywkVar.g();
            ywkVar.i(1);
            ywkVar = a(z, g);
        }
        return ywkVar.d(editor, apyyVar, arhdVar);
    }

    @Override // defpackage.ywk
    public final synchronized SharedPreferences.Editor e(SharedPreferences.Editor editor) {
        return ((ywk) this.a.get()).e(editor);
    }

    @Override // defpackage.ywk
    public final Object g() {
        return ((ywk) this.a.get()).g();
    }

    @Override // defpackage.ywk
    public final /* synthetic */ void i(int i) {
        int i2 = ywh.a;
    }

    @Override // defpackage.ywk
    public final boolean l(ywj ywjVar) {
        return ((ywk) this.a.get()).l(ywjVar);
    }
}
