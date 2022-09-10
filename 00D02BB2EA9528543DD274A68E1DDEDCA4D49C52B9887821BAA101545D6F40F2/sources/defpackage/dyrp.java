package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyrp  reason: default package */
/* loaded from: classes6.dex */
public final class dyrp extends dyeu {
    public final AtomicReference<dygm> a = new AtomicReference<>(dyrz.g);
    final /* synthetic */ dyrz b;
    private final String c;

    public dyrp(dyrz dyrzVar, String str) {
        this.b = dyrzVar;
        dbsk.t(str, "authority");
        this.c = str;
    }

    @Override // defpackage.dyeu
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar) {
        if (this.a.get() != dyrz.g) {
            return d(dyibVar, dyetVar);
        }
        this.b.m.execute(new dyrh(this));
        if (this.a.get() != dyrz.g) {
            return d(dyibVar, dyetVar);
        }
        if (this.b.A.get()) {
            return new dyrk();
        }
        dyro dyroVar = new dyro(this, dyfo.a(), dyibVar, dyetVar);
        this.b.m.execute(new dyrl(this, dyroVar));
        return dyroVar;
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(@dzsi dygm dygmVar) {
        Collection<dyro<?, ?>> collection;
        dygm dygmVar2 = this.a.get();
        this.a.set(dygmVar);
        if (dygmVar2 != dyrz.g || (collection = this.b.w) == null) {
            return;
        }
        for (dyro<?, ?> dyroVar : collection) {
            dyroVar.j();
        }
    }

    public final <ReqT, RespT> dyex<ReqT, RespT> d(dyib<ReqT, RespT> dyibVar, dyet dyetVar) {
        Executor s = this.b.s(dyetVar);
        dyrz dyrzVar = this.b;
        dylr dylrVar = new dylr(dyibVar, s, dyetVar, dyrzVar.T, dyrzVar.D ? null : this.b.i.b(), this.b.E, this.a.get());
        dylrVar.g = this.b.n;
        return dylrVar;
    }
}
