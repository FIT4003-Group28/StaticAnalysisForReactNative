package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jal  reason: default package */
/* loaded from: classes3.dex */
public final class jal implements fcj {
    static final long a = TimeUnit.DAYS.toMillis(1);
    private final snc b;
    private final afvn c;
    private final fcu d;
    private final azqb e;

    public jal(snc sncVar, fcu fcuVar, afvn afvnVar, azqb azqbVar) {
        this.b = sncVar;
        this.d = fcuVar;
        this.c = afvnVar;
        this.e = azqbVar;
    }

    private final boolean f() {
        if (!this.c.t()) {
            return false;
        }
        boolean k = ((fcm) this.e.get()).k();
        String d = this.c.c().d();
        fcv fcvVar = fcv.a;
        aoqp aoqpVar = ((fda) this.d.a.c()).j;
        if (aoqpVar.containsKey(d)) {
            fcvVar = (fcv) aoqpVar.get(d);
        }
        boolean z = fcvVar.c;
        fcv fcvVar2 = fcv.a;
        aoqp aoqpVar2 = ((fda) this.d.a.c()).j;
        if (aoqpVar2.containsKey(d)) {
            fcvVar2 = (fcv) aoqpVar2.get(d);
        }
        long j = fcvVar2.d;
        long c = this.b.c() - a;
        if (!k) {
            if (z) {
                if (j >= c) {
                    return true;
                }
                ylx.m(this.d.a.b(new fct(d)), gpe.l);
            }
            return false;
        }
        if (!z || j < c) {
            ylx.m(this.d.a.b(new wdy(d, this.b.c(), 1)), gpe.k);
        }
        return true;
    }

    @Override // defpackage.fcj
    public final boolean a() {
        return b();
    }

    @Override // defpackage.fcj
    public final boolean b() {
        return this.c.t() && f() && this.d.g();
    }

    @Override // defpackage.fcj
    public final boolean c() {
        return f();
    }
}
