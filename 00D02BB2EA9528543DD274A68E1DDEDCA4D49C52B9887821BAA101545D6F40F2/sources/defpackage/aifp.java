package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: aifp  reason: default package */
/* loaded from: classes2.dex */
public abstract class aifp {
    @dzsi
    public akra e;
    public Map<Class<?>, aifx> f = new ConcurrentHashMap();

    public abstract aifq a();

    public abstract void b(float f);

    protected abstract void c(akqp akqpVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(float f);

    protected abstract void e(akwd akwdVar);

    public abstract void f(float f);

    protected abstract void g(dcdn<Class<?>, aifx> dcdnVar);

    public final akra h() {
        akra akraVar = this.e;
        dbsk.s(akraVar);
        return akraVar;
    }

    public final <T extends aifx> aifq i() {
        akra akraVar = this.e;
        if (akraVar == null) {
            throw new IllegalStateException("Position not specified");
        }
        c(akraVar.a());
        g(dcdn.r(this.f));
        return a();
    }

    public final <T extends aifx> void j(Class<T> cls, @dzsi T t) {
        if (t == null) {
            this.f.remove(cls);
        } else {
            this.f.put(cls, t);
        }
    }

    public final void k(float f, akwd akwdVar) {
        d(f);
        e(akwdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends aifx> void l(ConcurrentHashMap<Class<?>, aifx> concurrentHashMap) {
        g(dcmn.a);
        this.f = concurrentHashMap;
    }
}
