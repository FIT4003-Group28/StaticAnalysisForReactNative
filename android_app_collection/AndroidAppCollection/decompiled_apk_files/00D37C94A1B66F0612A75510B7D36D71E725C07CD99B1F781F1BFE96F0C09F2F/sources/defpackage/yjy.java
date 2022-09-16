package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yjy  reason: default package */
/* loaded from: classes4.dex */
public final class yjy implements yve {
    public final Runnable a;
    public final yvc b;
    public final yjt c;
    private final Executor d;
    private final aoqu e;

    public yjy(Executor executor, yjt yjtVar, Runnable runnable, amfb amfbVar, aoqu aoquVar) {
        this.a = runnable;
        this.b = new yvc(amfbVar, aoquVar);
        this.d = executor;
        this.c = yjtVar;
        this.e = aoquVar;
    }

    private final ankt e(final anir anirVar) {
        ankt a;
        if (this.c.f()) {
            try {
                a = anirVar.a(this.b);
            } catch (Exception e) {
                this.c.e();
                return anlz.p(e);
            }
        } else {
            a = anlz.v(new aniq() { // from class: yjv
                @Override // defpackage.aniq
                public final ankt a() {
                    yjy yjyVar = yjy.this;
                    anir anirVar2 = anirVar;
                    yjyVar.c.c();
                    try {
                        return anirVar2.a(yjyVar.b);
                    } catch (Throwable th) {
                        yjyVar.c.e();
                        return anlz.p(th);
                    }
                }
            }, this.d);
        }
        try {
            return anhq.i(anii.h(anko.q(a), new yju(this, 1), anjk.a), Throwable.class, new anir() { // from class: yjw
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    yjy.this.c.e();
                    return anlz.p((Throwable) obj);
                }
            }, anjk.a);
        } catch (Exception e2) {
            this.c.e();
            return anlz.p(e2);
        }
    }

    @Override // defpackage.yve
    public final ankt a() {
        return e(urc.e);
    }

    @Override // defpackage.yve
    public final ankt b(final ampg ampgVar) {
        return e(new anir() { // from class: yjx
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                return anii.h(((yvc) obj).b(ampgVar), new yju(yjy.this), anjk.a);
            }
        });
    }

    @Override // defpackage.yve
    public final aoqu c() {
        yjt yjtVar;
        try {
            try {
                try {
                    this.c.c();
                    return this.b.c();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    yjtVar = this.c;
                    yjtVar.e();
                    return this.e;
                }
            } catch (Exception unused2) {
                zep.b("Failed to read the valye from PDS");
                yjtVar = this.c;
                yjtVar.e();
                return this.e;
            }
        } finally {
            this.c.e();
        }
    }

    @Override // defpackage.yve
    public final aynx d() {
        return this.b.b;
    }
}
