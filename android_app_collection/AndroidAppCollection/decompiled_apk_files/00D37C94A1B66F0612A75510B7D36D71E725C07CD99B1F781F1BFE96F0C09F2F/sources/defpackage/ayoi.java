package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayoi  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayoi implements ayok {
    public static ayoi G() {
        ayoi ayoiVar = azfh.a;
        azqc.i();
        return ayoiVar;
    }

    public static ayoi H(Throwable th) {
        ayrd.b(th, "exception is null");
        azfi azfiVar = new azfi(ayrb.f(th));
        azqc.i();
        return azfiVar;
    }

    public static ayoi N(Object... objArr) {
        azgc azgcVar = new azgc(objArr);
        azqc.i();
        return azgcVar;
    }

    public static ayoi O(Callable callable) {
        ayrd.b(callable, "supplier is null");
        azgd azgdVar = new azgd(callable);
        azqc.i();
        return azgdVar;
    }

    public static ayoi P(Future future) {
        ayrd.b(future, "future is null");
        azge azgeVar = new azge(future);
        azqc.i();
        return azgeVar;
    }

    public static ayoi Q(Iterable iterable) {
        ayrd.b(iterable, "source is null");
        azgg azggVar = new azgg(iterable);
        azqc.i();
        return azggVar;
    }

    public static ayoi S(long j, long j2, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        azgu azguVar = new azgu(Math.max(0L, j), Math.max(0L, j2), timeUnit, ayorVar);
        azqc.i();
        return azguVar;
    }

    public static ayoi T(Object obj) {
        ayrd.b(obj, "item is null");
        azgv azgvVar = new azgv(obj);
        azqc.i();
        return azgvVar;
    }

    public static ayoi U(Object obj, Object obj2) {
        ayrd.b(obj, "item1 is null");
        ayrd.b(obj2, "item2 is null");
        return N(obj, obj2);
    }

    public static ayoi W(ayok ayokVar, ayok ayokVar2) {
        return N(ayokVar, ayokVar2).aD(ayrb.a, 2);
    }

    public static ayoi ai(long j, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        azjj azjjVar = new azjj(Math.max(j, 0L), timeUnit, ayorVar);
        azqc.i();
        return azjjVar;
    }

    public static ayoi l(Iterable iterable, ayqe ayqeVar) {
        int i = aynx.a;
        ayrd.b(ayqeVar, "combiner is null");
        ayrd.c(i, "bufferSize");
        azeb azebVar = new azeb(null, iterable, ayqeVar, i + i);
        azqc.i();
        return azebVar;
    }

    public static ayoi m(ayok ayokVar, ayok ayokVar2, aypx aypxVar) {
        ayrd.b(ayokVar, "source1 is null");
        ayrd.b(ayokVar2, "source2 is null");
        return n(new ayok[]{ayokVar, ayokVar2}, ayrb.c(aypxVar), aynx.a);
    }

    public static ayoi n(ayok[] ayokVarArr, ayqe ayqeVar, int i) {
        ayrd.b(ayqeVar, "combiner is null");
        ayrd.c(i, "bufferSize");
        azeb azebVar = new azeb(ayokVarArr, null, ayqeVar, i + i);
        azqc.i();
        return azebVar;
    }

    public static ayoi o(ayok ayokVar, ayok ayokVar2, ayok ayokVar3, ayqc ayqcVar) {
        return n(new ayok[]{ayokVar, ayokVar2, ayokVar3}, ayrb.d(ayqcVar), aynx.a);
    }

    public static ayoi p(ayok ayokVar, ayok ayokVar2, ayok ayokVar3, ayok ayokVar4, ayqd ayqdVar) {
        ayrd.b(ayokVar, "source1 is null");
        return n(new ayok[]{ayokVar, ayokVar2, ayokVar3, ayokVar4}, ayrb.e(ayqdVar), aynx.a);
    }

    public static ayoi r(ayok... ayokVarArr) {
        azee azeeVar = new azee(N(ayokVarArr), ayrb.a, aynx.a);
        azqc.i();
        return azeeVar;
    }

    public static ayoi w(ayoj ayojVar) {
        ayrd.b(ayojVar, "source is null");
        azei azeiVar = new azei(ayojVar);
        azqc.i();
        return azeiVar;
    }

    public static ayoi z(Callable callable) {
        ayrd.b(callable, "supplier is null");
        azem azemVar = new azem(callable);
        azqc.i();
        return azemVar;
    }

    public final ayoi A(long j, TimeUnit timeUnit) {
        return aC(j, timeUnit, azpj.a());
    }

    public final ayoi B() {
        azev azevVar = new azev(this, ayrd.a);
        azqc.i();
        return azevVar;
    }

    public final ayoi C(aypv aypvVar) {
        ayrd.b(aypvVar, "onFinally is null");
        azex azexVar = new azex(this, aypvVar);
        azqc.i();
        return azexVar;
    }

    public final ayoi D(aypv aypvVar) {
        return E(ayrb.d, aypvVar);
    }

    public final ayoi E(ayqb ayqbVar, aypv aypvVar) {
        ayrd.b(ayqbVar, "onSubscribe is null");
        ayrd.b(aypvVar, "onDispose is null");
        azfa azfaVar = new azfa(this, ayqbVar, aypvVar);
        azqc.i();
        return azfaVar;
    }

    public final ayoi F(ayqb ayqbVar) {
        return aG(ayqbVar, ayrb.d, ayrb.c);
    }

    public final ayoi I(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        azfk azfkVar = new azfk(this, ayqfVar);
        azqc.i();
        return azfkVar;
    }

    public final ayoi J(ayqe ayqeVar) {
        return aD(ayqeVar, Integer.MAX_VALUE);
    }

    public final ayoi K(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azga azgaVar = new azga(this, ayqeVar);
        azqc.i();
        return azgaVar;
    }

    public final ayoi L(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azfw azfwVar = new azfw(this, ayqeVar);
        azqc.i();
        return azfwVar;
    }

    public final ayoi M(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azfz azfzVar = new azfz(this, ayqeVar);
        azqc.i();
        return azfzVar;
    }

    public final ayoi R() {
        azgo azgoVar = new azgo(this);
        azqc.i();
        return azgoVar;
    }

    public final ayoi V(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azgy azgyVar = new azgy(this, ayqeVar);
        azqc.i();
        return azgyVar;
    }

    public final ayoi X(ayor ayorVar) {
        int i = aynx.a;
        ayrd.b(ayorVar, "scheduler is null");
        ayrd.c(i, "bufferSize");
        azhb azhbVar = new azhb(this, ayorVar, i);
        azqc.i();
        return azhbVar;
    }

    public final ayoi Y(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "valueSupplier is null");
        azhd azhdVar = new azhd(this, ayqeVar);
        azqc.i();
        return azhdVar;
    }

    public final ayoi Z(Object obj, aypx aypxVar) {
        ayrd.b(obj, "initialValue is null");
        Callable f = ayrb.f(obj);
        ayrd.b(aypxVar, "accumulator is null");
        azif azifVar = new azif(this, f, aypxVar);
        azqc.i();
        return azifVar;
    }

    public final ayoi aA() {
        azoi azoiVar = azoi.a;
        ayrd.c(2, "count");
        ayrd.c(1, "skip");
        ayrd.b(azoiVar, "bufferSupplier is null");
        azdu azduVar = new azdu(this, azoiVar);
        azqc.i();
        return azduVar;
    }

    public final ayoi aB(ayqe ayqeVar) {
        return s(ayqeVar, Integer.MAX_VALUE, aynx.a, true);
    }

    public final ayoi aC(long j, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        azer azerVar = new azer(this, j, timeUnit, ayorVar);
        azqc.i();
        return azerVar;
    }

    public final ayoi aD(ayqe ayqeVar, int i) {
        int i2 = aynx.a;
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(i, "maxConcurrency");
        ayrd.c(i2, "bufferSize");
        if (this instanceof ayrl) {
            Object call = ((ayrl) this).call();
            if (call == null) {
                return G();
            }
            return ayme.b(call, ayqeVar);
        }
        azfn azfnVar = new azfn(this, ayqeVar, i, i2);
        azqc.i();
        return azfnVar;
    }

    public final azot aE() {
        ayrd.c(1, "bufferSize");
        return azib.b(this, new azhz(1));
    }

    public final ayoi aF(TimeUnit timeUnit) {
        ayor a = azpj.a();
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(a, "scheduler is null");
        azja azjaVar = new azja(this, timeUnit, a);
        azqc.i();
        return azjaVar;
    }

    public final ayoi aG(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        ayrd.b(ayqbVar, "onNext is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        azez azezVar = new azez(this, ayqbVar, ayqbVar2, aypvVar);
        azqc.i();
        return azezVar;
    }

    public final aypg aH(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        ayrd.b(ayqbVar, "onNext is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        aysc ayscVar = new aysc(ayqbVar, ayqbVar2, aypvVar);
        az(ayscVar);
        return ayscVar;
    }

    public final ayoi aa() {
        AtomicReference atomicReference = new AtomicReference();
        azhh azhhVar = new azhh(new azhg(atomicReference), this, atomicReference);
        azqc.l();
        return azhhVar.aI();
    }

    public final ayoi ab(long j) {
        if (j <= 0) {
            azqc.i();
            return this;
        }
        azij azijVar = new azij(this, j);
        azqc.i();
        return azijVar;
    }

    public final ayoi ac(ayok ayokVar) {
        return r(ayokVar, this);
    }

    public final ayoi ad(Object obj) {
        ayrd.b(obj, "item is null");
        return r(T(obj), this);
    }

    public final ayoi ae(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        azim azimVar = new azim(this, ayorVar);
        azqc.i();
        return azimVar;
    }

    public final ayoi af(ayqe ayqeVar) {
        int i = aynx.a;
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(i, "bufferSize");
        if (this instanceof ayrl) {
            Object call = ((ayrl) this).call();
            if (call == null) {
                return G();
            }
            return ayme.b(call, ayqeVar);
        }
        azir azirVar = new azir(this, ayqeVar, i);
        azqc.i();
        return azirVar;
    }

    public final ayoi ag(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("count >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        azit azitVar = new azit(this, j);
        azqc.i();
        return azitVar;
    }

    public final ayoi ah(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "stopPredicate is null");
        aziy aziyVar = new aziy(this, ayqfVar);
        azqc.i();
        return aziyVar;
    }

    public final ayoi aj(ayok ayokVar) {
        int i = aynx.a;
        ayrd.c(i, "bufferSize");
        azjq azjqVar = new azjq(this, ayokVar, i);
        azqc.i();
        return azjqVar;
    }

    public final ayoi ak(ayok ayokVar, aypx aypxVar) {
        ayrd.b(ayokVar, "other is null");
        ayrd.b(aypxVar, "combiner is null");
        azjt azjtVar = new azjt(this, aypxVar, ayokVar);
        azqc.i();
        return azjtVar;
    }

    public final ayoi al(ayok ayokVar, aypx aypxVar) {
        ayqe c = ayrb.c(aypxVar);
        int i = aynx.a;
        ayrd.c(i, "bufferSize");
        azjw azjwVar = new azjw(new ayok[]{this, ayokVar}, c, i);
        azqc.i();
        return azjwVar;
    }

    public final ayos am(Callable callable, aypw aypwVar) {
        ayrd.b(callable, "initialValueSupplier is null");
        ayrd.b(aypwVar, "collector is null");
        azdy azdyVar = new azdy(this, callable, aypwVar);
        azqc.n();
        return azdyVar;
    }

    public final ayos an(Object obj) {
        ayrd.b(obj, "defaultItem is null");
        azfg azfgVar = new azfg(this, obj);
        azqc.n();
        return azfgVar;
    }

    public final ayos ao() {
        azfg azfgVar = new azfg(this, null);
        azqc.n();
        return azfgVar;
    }

    public final ayos ap(Object obj) {
        azih azihVar = new azih(this, obj);
        azqc.n();
        return azihVar;
    }

    public final ayos aq() {
        ayrd.c(16, "capacityHint");
        azjn azjnVar = new azjn(this);
        azqc.n();
        return azjnVar;
    }

    public final aypg ar() {
        return aH(ayrb.d, ayrb.e, ayrb.c);
    }

    public final aypg as(ayqb ayqbVar) {
        return aH(ayqbVar, ayrb.e, ayrb.c);
    }

    public final aypg at(ayqb ayqbVar, ayqb ayqbVar2) {
        return aH(ayqbVar, ayqbVar2, ayrb.c);
    }

    public final aypg au(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        return aH(ayqbVar, ayqbVar2, aypvVar);
    }

    public final Iterable av() {
        int i = aynx.a;
        ayrd.c(i, "bufferSize");
        return new azdo(this, i);
    }

    public final Object aw() {
        ayrr ayrrVar = new ayrr();
        az(ayrrVar);
        Object f = ayrrVar.f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }

    public final Object ax(Object obj) {
        ayrr ayrrVar = new ayrr();
        az(ayrrVar);
        Object f = ayrrVar.f();
        return f != null ? f : obj;
    }

    public final Object ay(ayqe ayqeVar) {
        try {
            ayrd.b(ayqeVar, "converter is null");
            return ayqeVar.a(this);
        } catch (Throwable th) {
            bapv.j(th);
            throw azom.b(th);
        }
    }

    @Override // defpackage.ayok
    public final void az(ayom ayomVar) {
        ayrd.b(ayomVar, "observer is null");
        try {
            aypx aypxVar = azqc.t;
            ayrd.b(ayomVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(ayomVar);
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

    protected abstract void f(ayom ayomVar);

    public final aynr g(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azft azftVar = new azft(this, ayqeVar);
        azqc.g();
        return azftVar;
    }

    public final aynr h() {
        azgs azgsVar = new azgs(this);
        azqc.g();
        return azgsVar;
    }

    public final aynx i(aynq aynqVar) {
        aywx aywxVar = new aywx(this);
        aynq aynqVar2 = aynq.MISSING;
        int ordinal = aynqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ayxy ayxyVar = new ayxy(aywxVar);
                azqc.j();
                return ayxyVar;
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    return aywxVar.I();
                }
                return aywxVar.H();
            } else {
                ayxw ayxwVar = new ayxw(aywxVar);
                azqc.j();
                return ayxwVar;
            }
        }
        return aywxVar;
    }

    public final ayoc j() {
        azfe azfeVar = new azfe(this);
        azqc.k();
        return azfeVar;
    }

    public final ayoi k(Class cls) {
        return V(ayrb.a(cls));
    }

    public final ayoi q(ayol ayolVar) {
        ayrd.b(ayolVar, "composer is null");
        ayok a = ayolVar.a(this);
        azqc.i();
        return (ayoi) a;
    }

    public final ayoi s(ayqe ayqeVar, int i, int i2, boolean z) {
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(i, "maxConcurrency");
        ayrd.c(i2, "prefetch");
        azeg azegVar = new azeg(this, ayqeVar, true != z ? 2 : 3, i, i2);
        azqc.i();
        return azegVar;
    }

    public final ayoi t(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azga azgaVar = new azga(this, ayqeVar);
        azqc.i();
        return azgaVar;
    }

    public final ayoi u(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        ayrd.c(2, "prefetch");
        azdi azdiVar = new azdi(this, ayqeVar);
        azqc.i();
        return azdiVar;
    }

    public final ayoi v(ayok ayokVar) {
        ayrd.b(ayokVar, "other is null");
        ayrd.b(ayokVar, "source2 is null");
        return r(this, ayokVar);
    }

    public final ayoi x(long j, TimeUnit timeUnit) {
        ayor a = azpj.a();
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(a, "scheduler is null");
        azel azelVar = new azel(this, j, timeUnit, a);
        azqc.i();
        return azelVar;
    }

    public final ayoi y(Object obj) {
        azio azioVar = new azio(this, T(obj));
        azqc.i();
        return azioVar;
    }
}
