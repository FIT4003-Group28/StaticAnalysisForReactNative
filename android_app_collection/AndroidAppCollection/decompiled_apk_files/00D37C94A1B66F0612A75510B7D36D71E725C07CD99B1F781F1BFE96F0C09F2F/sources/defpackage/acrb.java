package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acrb  reason: default package */
/* loaded from: classes.dex */
public final class acrb {
    public final azqb a;
    private final azqb b;
    private final azqb c;
    private final aadd d;
    private final Executor e;
    private final ywk f;
    private volatile acqz g;

    public acrb(Executor executor, ywk ywkVar, aadd aaddVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.e = executor;
        this.f = ywkVar;
        this.d = aaddVar;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public final void a() {
        b();
        c();
    }

    public final void b() {
        if (this.f.c(ywk.S) != 10) {
            ((afug) this.b.get()).d((Set) this.c.get());
        }
    }

    public final void c() {
        this.d.a.V(aaku.e).B().X(azpj.b(this.e)).as(new ayqb() { // from class: acra
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                acrb.this.d((apvo) obj);
            }
        });
    }

    public final synchronized void d(apvo apvoVar) {
        boolean z = apvoVar.b;
        boolean z2 = apvoVar.c;
        if (this.g == null) {
            this.g = new acqz(this, z, z2);
            qqh.c.add(0, this.g);
        } else if (z || z2) {
        } else {
            qqh.c.remove(this.g);
            this.g = null;
        }
    }
}
