package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aynx  reason: default package */
/* loaded from: classes2.dex */
public abstract class aynx implements bamd {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static aynx B(Object obj) {
        ayrd.b(obj, "item is null");
        ayxj ayxjVar = new ayxj(obj);
        azqc.j();
        return ayxjVar;
    }

    public static aynx D(Iterable iterable) {
        return y(iterable).v(ayrb.a);
    }

    public static aynx E(bamd bamdVar, bamd bamdVar2) {
        ayrd.b(bamdVar, "source1 is null");
        ayrd.b(bamdVar2, "source2 is null");
        return w(bamdVar, bamdVar2).ah(ayrb.a, 2);
    }

    public static aynx F(bamd bamdVar, bamd bamdVar2, bamd bamdVar3) {
        return w(bamdVar, bamdVar2, bamdVar3).ah(ayrb.a, 3);
    }

    public static aynx S(long j, TimeUnit timeUnit) {
        return T(j, timeUnit, azpj.a());
    }

    public static aynx T(long j, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        azab azabVar = new azab(Math.max(0L, j), timeUnit, ayorVar);
        azqc.j();
        return azabVar;
    }

    public static aynx d(ayqe ayqeVar, bamd... bamdVarArr) {
        int i = a;
        ayrd.b(ayqeVar, "combiner is null");
        ayrd.c(i, "bufferSize");
        ayum ayumVar = new ayum(bamdVarArr, ayqeVar, i);
        azqc.j();
        return ayumVar;
    }

    public static aynx e(bamd bamdVar, bamd bamdVar2, aypx aypxVar) {
        ayrd.b(bamdVar, "source1 is null");
        ayrd.b(bamdVar2, "source2 is null");
        return d(ayrb.c(aypxVar), bamdVar, bamdVar2);
    }

    public static aynx g(bamd bamdVar, bamd bamdVar2, bamd bamdVar3, bamd bamdVar4, ayqd ayqdVar) {
        ayrd.b(bamdVar2, "source2 is null");
        return d(ayrb.e(ayqdVar), bamdVar, bamdVar2, bamdVar3, bamdVar4);
    }

    public static aynx i(bamd... bamdVarArr) {
        ayuo ayuoVar = new ayuo(bamdVarArr);
        azqc.j();
        return ayuoVar;
    }

    public static aynx k(aynz aynzVar, aynq aynqVar) {
        ayrd.b(aynzVar, "source is null");
        ayrd.b(aynqVar, "mode is null");
        ayux ayuxVar = new ayux(aynzVar, aynqVar);
        azqc.j();
        return ayuxVar;
    }

    public static aynx r() {
        aynx aynxVar = ayvu.b;
        azqc.j();
        return aynxVar;
    }

    public static aynx s(Throwable th) {
        return t(ayrb.f(th));
    }

    public static aynx sn(bamd bamdVar, bamd bamdVar2, bamd bamdVar3, ayqc ayqcVar) {
        ayrd.b(bamdVar, "source1 is null");
        ayrd.b(bamdVar2, "source2 is null");
        ayrd.b(bamdVar3, "source3 is null");
        return d(ayrb.d(ayqcVar), bamdVar, bamdVar2, bamdVar3);
    }

    public static aynx t(Callable callable) {
        ayrd.b(callable, "supplier is null");
        ayvv ayvvVar = new ayvv(callable);
        azqc.j();
        return ayvvVar;
    }

    public static aynx w(Object... objArr) {
        aywq aywqVar = new aywq(objArr);
        azqc.j();
        return aywqVar;
    }

    public static aynx x(Future future) {
        aywr aywrVar = new aywr(future);
        azqc.j();
        return aywrVar;
    }

    public static aynx y(Iterable iterable) {
        ayrd.b(iterable, "source is null");
        aywv aywvVar = new aywv(iterable);
        azqc.j();
        return aywvVar;
    }

    public final aynx A() {
        ayxd ayxdVar = new ayxd(this);
        azqc.j();
        return ayxdVar;
    }

    public final aynx C(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        ayxm ayxmVar = new ayxm(this, ayqeVar);
        azqc.j();
        return ayxmVar;
    }

    public final aynx G(ayor ayorVar) {
        int i = a;
        ayrd.b(ayorVar, "scheduler is null");
        ayrd.c(i, "bufferSize");
        ayxq ayxqVar = new ayxq(this, ayorVar, i);
        azqc.j();
        return ayxqVar;
    }

    public final aynx H() {
        int i = a;
        ayrd.c(i, "capacity");
        ayxs ayxsVar = new ayxs(this, i);
        azqc.j();
        return ayxsVar;
    }

    public final aynx I() {
        ayya ayyaVar = new ayya(this);
        azqc.j();
        return ayyaVar;
    }

    public final aynx J(aypx aypxVar) {
        ayrd.b(aypxVar, "accumulator is null");
        ayyx ayyxVar = new ayyx(this, aypxVar);
        azqc.j();
        return ayyxVar;
    }

    public final aynx K(Object obj, aypx aypxVar) {
        ayrd.b(obj, "initialValue is null");
        Callable f = ayrb.f(obj);
        ayrd.b(aypxVar, "accumulator is null");
        ayyz ayyzVar = new ayyz(this, f, aypxVar);
        azqc.j();
        return ayyzVar;
    }

    public final aynx L() {
        int i = a;
        ayrd.c(i, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        ayyg ayygVar = new ayyg(new ayyd(atomicReference, i), this, atomicReference, i);
        azqc.m();
        return ayygVar.c();
    }

    public final aynx M(Object obj) {
        return i(B(obj), this);
    }

    public final aynx N(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        ayrd.b(ayorVar, "scheduler is null");
        ayzl ayzlVar = new ayzl(this, ayorVar, !(this instanceof ayux));
        azqc.j();
        return ayzlVar;
    }

    public final aynx O(ayqe ayqeVar) {
        int i = a;
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(i, "bufferSize");
        if (this instanceof ayrl) {
            Object call = ((ayrl) this).call();
            if (call == null) {
                return r();
            }
            return azww.c(call, ayqeVar);
        }
        ayzo ayzoVar = new ayzo(this, ayqeVar, i);
        azqc.j();
        return ayzoVar;
    }

    public final aynx P(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azdd azddVar = new azdd(this, ayqeVar);
        azqc.j();
        return azddVar;
    }

    public final aynx Q(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "stopPredicate is null");
        ayzv ayzvVar = new ayzv(this, ayqfVar);
        azqc.j();
        return ayzvVar;
    }

    public final aynx R(bamd bamdVar) {
        ayrd.b(bamdVar, "other is null");
        ayzt ayztVar = new ayzt(this, bamdVar);
        azqc.j();
        return ayztVar;
    }

    public final aynx U(bamd bamdVar, aypx aypxVar) {
        ayrd.b(bamdVar, "other is null");
        ayrd.b(aypxVar, "combiner is null");
        azae azaeVar = new azae(this, aypxVar, bamdVar);
        azqc.j();
        return azaeVar;
    }

    public final aynx V(bamd bamdVar, bamd bamdVar2, ayqc ayqcVar) {
        ayrd.b(bamdVar, "source1 is null");
        ayrd.b(bamdVar2, "source2 is null");
        azah azahVar = new azah(this, new bamd[]{bamdVar, bamdVar2}, ayrb.d(ayqcVar));
        azqc.j();
        return azahVar;
    }

    public final ayoi W() {
        azgi azgiVar = new azgi(this);
        azqc.i();
        return azgiVar;
    }

    public final ayos X() {
        ayvt ayvtVar = new ayvt(this, null);
        azqc.n();
        return ayvtVar;
    }

    public final aypg Y() {
        return aq(ayrb.d, ayrb.e, ayxi.a);
    }

    public final aypg Z(ayqb ayqbVar) {
        return aq(ayqbVar, ayrb.e, ayxi.a);
    }

    public final aypg aa(ayqb ayqbVar, ayqb ayqbVar2) {
        return aq(ayqbVar, ayqbVar2, ayxi.a);
    }

    public final Object ab() {
        aznv aznvVar = new aznv();
        ac(aznvVar);
        if (aznvVar.getCount() != 0) {
            try {
                azxy.d();
                aznvVar.await();
            } catch (InterruptedException e) {
                bamf bamfVar = aznvVar.c;
                aznvVar.c = azof.a;
                if (bamfVar != null) {
                    bamfVar.si();
                }
                throw azom.b(e);
            }
        }
        Throwable th = aznvVar.b;
        if (th == null) {
            Object obj = aznvVar.a;
            if (obj == null) {
                throw new NoSuchElementException();
            }
            return obj;
        }
        throw azom.b(th);
    }

    public final void ac(ayoa ayoaVar) {
        ayrd.b(ayoaVar, "s is null");
        try {
            aypx aypxVar = azqc.r;
            ayrd.b(ayoaVar, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            ae(ayoaVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bamd
    public final void ad(bame bameVar) {
        if (bameVar instanceof ayoa) {
            ac(bameVar);
            return;
        }
        ayrd.b(bameVar, "s is null");
        ac(new azny(bameVar));
    }

    protected abstract void ae(bame bameVar);

    public final aynx af(int i) {
        azoi azoiVar = azoi.a;
        ayrd.c(i, "count");
        ayrd.c(1, "skip");
        ayrd.b(azoiVar, "bufferSupplier is null");
        ayuf ayufVar = new ayuf(this, i, azoiVar);
        azqc.j();
        return ayufVar;
    }

    public final aynx ag(ayqe ayqeVar) {
        return ai(ayqeVar, Integer.MAX_VALUE, a);
    }

    public final aynx ah(ayqe ayqeVar, int i) {
        return ai(ayqeVar, i, a);
    }

    public final aynx ai(ayqe ayqeVar, int i, int i2) {
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(i, "maxConcurrency");
        ayrd.c(i2, "bufferSize");
        if (this instanceof ayrl) {
            Object call = ((ayrl) this).call();
            if (call == null) {
                return r();
            }
            return azww.c(call, ayqeVar);
        }
        aywb aywbVar = new aywb(this, ayqeVar, i, i2);
        azqc.j();
        return aywbVar;
    }

    public final aypt aj() {
        ayrd.c(1, "bufferSize");
        ayyq ayyqVar = new ayyq();
        AtomicReference atomicReference = new AtomicReference();
        ayyu ayyuVar = new ayyu(new ayyr(atomicReference, ayyqVar), this, atomicReference, ayyqVar);
        azqc.m();
        return ayyuVar;
    }

    public final aynx ak() {
        ayzf ayzfVar = new ayzf(this);
        azqc.j();
        return ayzfVar;
    }

    public final aynx al() {
        ayzq ayzqVar = new ayzq(this);
        azqc.j();
        return ayzqVar;
    }

    public final aynx am(TimeUnit timeUnit) {
        ayor a2 = azpj.a();
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(a2, "scheduler is null");
        ayzx ayzxVar = new ayzx(this, timeUnit, a2);
        azqc.j();
        return ayzxVar;
    }

    public final aynx an(TimeUnit timeUnit) {
        return l(5000L, timeUnit);
    }

    public final aynx ao(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        ayrd.b(ayqbVar, "onNext is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        ayvl ayvlVar = new ayvl(this, ayqbVar, ayqbVar2, aypvVar);
        azqc.j();
        return ayvlVar;
    }

    public final aynx ap(ayqb ayqbVar, aypv aypvVar) {
        ayrd.b(ayqbVar, "onSubscribe is null");
        ayrd.b(aypvVar, "onCancel is null");
        ayvn ayvnVar = new ayvn(this, ayqbVar, aypvVar);
        azqc.j();
        return ayvnVar;
    }

    public final aypg aq(ayqb ayqbVar, ayqb ayqbVar2, ayqb ayqbVar3) {
        ayrd.b(ayqbVar, "onNext is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(ayqbVar3, "onSubscribe is null");
        aznw aznwVar = new aznw(ayqbVar, ayqbVar2, ayqbVar3);
        ac(aznwVar);
        return aznwVar;
    }

    public final aynx h(ayob ayobVar) {
        ayrd.b(ayobVar, "composer is null");
        bamd a2 = ayobVar.a(this);
        if (a2 instanceof aynx) {
            azqc.j();
        } else {
            ayrd.b(a2, "source is null");
            aywy aywyVar = new aywy(a2);
            azqc.j();
            a2 = aywyVar;
        }
        return (aynx) a2;
    }

    public final aynx j(bamd bamdVar) {
        ayrd.b(bamdVar, "other is null");
        ayrd.b(bamdVar, "source2 is null");
        return i(this, bamdVar);
    }

    public final aynx l(long j, TimeUnit timeUnit) {
        return m(j, timeUnit, azpj.a());
    }

    public final aynx m(long j, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        ayva ayvaVar = new ayva(this, j, timeUnit, ayorVar);
        azqc.j();
        return ayvaVar;
    }

    public final aynx n() {
        return o(ayrb.a);
    }

    public final aynx o(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "keySelector is null");
        ayvi ayviVar = new ayvi(this, ayqeVar);
        azqc.j();
        return ayviVar;
    }

    public final aynx p(ayqb ayqbVar) {
        return ao(ayrb.d, ayqbVar, ayrb.c);
    }

    public final aynx q(ayqb ayqbVar) {
        return ao(ayqbVar, ayrb.d, ayrb.c);
    }

    public final aynx u(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        ayvy ayvyVar = new ayvy(this, ayqfVar);
        azqc.j();
        return ayvyVar;
    }

    public final aynx v(ayqe ayqeVar) {
        int i = a;
        return ai(ayqeVar, i, i);
    }

    public final aynx z(ayqe ayqeVar) {
        int i = a;
        ayrd.b(ayqeVar, "keySelector is null");
        ayrd.c(i, "bufferSize");
        ayxb ayxbVar = new ayxb(this, ayqeVar, i);
        azqc.j();
        return ayxbVar;
    }
}
