package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: abgk  reason: default package */
/* loaded from: classes.dex */
public final class abgk extends abge {
    private final azqb a;
    private final Executor b;
    private final AtomicBoolean c;
    private final aabw d;

    public abgk(SharedPreferences sharedPreferences, azqb azqbVar, azqb azqbVar2, aabw aabwVar, Executor executor) {
        super(sharedPreferences, azqbVar2);
        this.c = new AtomicBoolean(false);
        this.a = azqbVar;
        this.d = aabwVar;
        this.b = executor;
    }

    @Override // defpackage.abge
    protected final synchronized void c() {
        if (!this.c.compareAndSet(false, true)) {
            return;
        }
        aaxg aaxgVar = (aaxg) this.a.get();
        aaxf a = aaxgVar.a();
        a.k(aadi.b);
        this.d.a().J(false).k().ak(ayos.B(aaxgVar.b(a, this.b)).E(aaku.c).I(new ayqe() { // from class: abgj
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                abgk abgkVar = abgk.this;
                Throwable th = (Throwable) obj;
                if (th instanceof ExecutionException) {
                    abgkVar.d(22);
                } else if (th instanceof InterruptedException) {
                    abgkVar.d(21);
                }
                return amon.a;
            }
        }).k().ad(amon.a), nti.l).X(azpj.b(this.b)).F(new ayqb() { // from class: abgi
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                abgk abgkVar = abgk.this;
                Pair pair = (Pair) obj;
                asgd asgdVar = (asgd) ((ampq) pair.second).f();
                if (((Boolean) pair.first).booleanValue() || asgdVar == null) {
                    return;
                }
                abgkVar.b(asgdVar);
            }
        }).an(Pair.create(false, amon.a)).R();
    }
}
