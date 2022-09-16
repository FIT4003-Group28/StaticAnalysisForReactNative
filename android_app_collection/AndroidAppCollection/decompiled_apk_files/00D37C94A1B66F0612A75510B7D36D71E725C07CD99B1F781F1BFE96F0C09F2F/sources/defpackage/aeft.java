package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aeft  reason: default package */
/* loaded from: classes.dex */
public final class aeft implements yve {
    public volatile ampq a;
    private final yve b;
    private final aynx c;
    private final aoqu d;
    private final Object e = new Object();
    private final azpb f;
    private final ankt g;

    public aeft(yve yveVar, aoqu aoquVar) {
        this.b = yveVar;
        azpb ax = azpa.ar().ax();
        this.f = ax;
        this.c = ax.I().A().n();
        this.a = amon.a;
        this.d = aoquVar;
        this.g = g();
    }

    private final ankt g() {
        return anlz.r(h(anii.i(this.b.a(), new anir() { // from class: aefr
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                aeft aeftVar = aeft.this;
                aeftVar.f((aoqu) obj);
                return anlz.q((aoqu) aeftVar.a.c());
            }
        }, anjk.a), anlz.q(this.d)));
    }

    private static ankt h(ankt anktVar, ankt anktVar2) {
        return anhq.i(anktVar, Exception.class, new aefs(anktVar2), anjk.a);
    }

    @Override // defpackage.yve
    public final ankt a() {
        if (this.a.h()) {
            return anlz.q((aoqu) this.a.c());
        }
        return this.g.isDone() ? g() : this.g;
    }

    @Override // defpackage.yve
    public final ankt b(final ampg ampgVar) {
        synchronized (this.e) {
            if (!this.a.h()) {
                return h(this.b.b(new ampg() { // from class: aefq
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        aeft aeftVar = aeft.this;
                        aoqu aoquVar = (aoqu) ampgVar.apply((aoqu) obj);
                        aeftVar.e(aoquVar);
                        return aoquVar;
                    }
                }), ankq.a);
            }
            aoqu aoquVar = (aoqu) ampgVar.apply((aoqu) this.a.c());
            e(aoquVar);
            return h(this.b.b(new agae(aoquVar, 1)), ankq.a);
        }
    }

    @Override // defpackage.yve
    public final aoqu c() {
        if (this.a.h()) {
            return (aoqu) this.a.c();
        }
        if (this.g.isDone()) {
            f(this.b.c());
            return (aoqu) this.a.c();
        }
        try {
            return (aoqu) this.g.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this.d;
        } catch (ExecutionException unused2) {
            return this.d;
        }
    }

    @Override // defpackage.yve
    public final aynx d() {
        return this.c;
    }

    public final void e(aoqu aoquVar) {
        synchronized (this.e) {
            this.f.c(aoquVar);
            this.a = ampq.j(aoquVar);
        }
    }

    public final void f(aoqu aoquVar) {
        if (this.a.h()) {
            return;
        }
        synchronized (this.e) {
            if (!this.a.h()) {
                e(aoquVar);
            }
        }
    }
}
