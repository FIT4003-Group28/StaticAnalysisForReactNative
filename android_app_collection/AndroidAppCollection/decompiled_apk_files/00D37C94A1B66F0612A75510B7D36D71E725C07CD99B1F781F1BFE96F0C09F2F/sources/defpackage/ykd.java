package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ykd  reason: default package */
/* loaded from: classes4.dex */
public final class ykd {
    public final Runnable a;
    public final azqb b;
    public final yjt c;
    private final Executor d;

    public ykd(Executor executor, yjt yjtVar, Runnable runnable, azqb azqbVar) {
        this.d = executor;
        this.c = yjtVar;
        this.a = runnable;
        this.b = azqbVar;
    }

    public final ankt a(final anir anirVar) {
        ankt a;
        if (this.c.f()) {
            try {
                a = anirVar.a((vne) this.b.get());
            } catch (Exception e) {
                this.c.e();
                return anlz.p(e);
            }
        } else {
            a = anlz.v(new aniq() { // from class: yka
                @Override // defpackage.aniq
                public final ankt a() {
                    ykd ykdVar = ykd.this;
                    anir anirVar2 = anirVar;
                    ykdVar.c.c();
                    try {
                        return anirVar2.a((vne) ykdVar.b.get());
                    } catch (Throwable th) {
                        ykdVar.c.e();
                        return anlz.p(th);
                    }
                }
            }, this.d);
        }
        try {
            return anhq.i(anii.h(anko.q(a), new yjz(this, 1), anjk.a), Throwable.class, new anir() { // from class: ykb
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    ykd.this.c.e();
                    return anlz.p((Throwable) obj);
                }
            }, anjk.a);
        } catch (Exception e2) {
            this.c.e();
            return anlz.p(e2);
        }
    }
}
