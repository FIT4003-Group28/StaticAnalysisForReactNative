package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jln  reason: default package */
/* loaded from: classes3.dex */
public final class jln implements ynl {
    static final long a = TimeUnit.HOURS.toMillis(4);
    private final yrj b;
    private final snc c;
    private final fcu d;
    private final azqb e;
    private final azqb f;

    public jln(yrj yrjVar, snc sncVar, fcu fcuVar, azqb azqbVar, azqb azqbVar2) {
        this.b = yrjVar;
        this.c = sncVar;
        this.d = fcuVar;
        this.e = azqbVar;
        this.f = azqbVar2;
    }

    public final void b() {
        c(1);
    }

    public final void c(final int i) {
        if (this.b.o()) {
            long c = this.c.c();
            aoqp aoqpVar = ((fcy) this.d.b.c()).g;
            Integer valueOf = Integer.valueOf(i - 1);
            if (c - (aoqpVar.containsKey(valueOf) ? ((Long) aoqpVar.get(valueOf)).longValue() : 0L) < a) {
                return;
            }
            ((aguv) this.f.get()).c(((agrf) this.e.get()).d());
            fcu fcuVar = this.d;
            final long c2 = this.c.c();
            ylx.m(fcuVar.b.b(new ampg() { // from class: fcs
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    int i2 = i;
                    long j = c2;
                    aopa mo52toBuilder = ((fcy) obj).mo52toBuilder();
                    mo52toBuilder.g(i2 - 1, j);
                    return (fcy) mo52toBuilder.mo39build();
                }
            }), gpe.q);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((ypy) obj).a()) {
                    return null;
                }
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}
