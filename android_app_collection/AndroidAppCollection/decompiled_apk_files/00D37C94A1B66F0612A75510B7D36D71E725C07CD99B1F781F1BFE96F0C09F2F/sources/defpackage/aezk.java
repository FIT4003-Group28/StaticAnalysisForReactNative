package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezk  reason: default package */
/* loaded from: classes.dex */
public final class aezk extends aeyz {
    final /* synthetic */ aezm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezk(aezm aezmVar, Handler handler, aeyq aeyqVar, Handler handler2) {
        super(handler, aeyqVar, handler2);
        this.d = aezmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(final aezp aezpVar) {
        aezp aezpVar2 = this.d.d;
        if (aezpVar2 != null) {
            long c = afbz.c(aezpVar.o, aezpVar2.o);
            long c2 = afbz.c(aezpVar.p, aezpVar2.p);
            long micros = TimeUnit.MILLISECONDS.toMicros(50L);
            if (aezpVar.j == aezpVar2.j && aezpVar.k == aezpVar2.k && aezpVar.l == aezpVar2.l && ((c == -9223372036854775807L || Math.abs(c) < micros) && ((aezpVar.p == aezpVar2.p || (c2 != -9223372036854775807L && Math.abs(c2) < micros)) && aezpVar.q == aezpVar2.q && aezpVar.n == aezpVar2.n && akzj.f(aezpVar.e, aezpVar2.e) && aezpVar.r == aezpVar2.r))) {
                return;
            }
        }
        if (this.d.d == null) {
            afki afkiVar = afki.ABR;
        }
        this.d.d = aezpVar;
        this.c.post(new Runnable() { // from class: aezj
            @Override // java.lang.Runnable
            public final void run() {
                aezk aezkVar = aezk.this;
                aezkVar.d.rF(aezpVar);
            }
        });
    }
}
