package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayos  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayos implements ayov {
    public static ayos A(Callable callable) {
        ayrd.b(callable, "callable is null");
        azlk azlkVar = new azlk(callable);
        azqc.n();
        return azlkVar;
    }

    public static ayos B(Future future) {
        return b(aynx.x(future));
    }

    public static ayos D(Object obj) {
        ayrd.b(obj, "item is null");
        azln azlnVar = new azln(obj);
        azqc.n();
        return azlnVar;
    }

    public static ayos F() {
        ayos ayosVar = azlq.a;
        azqc.n();
        return ayosVar;
    }

    public static ayos N(ayov ayovVar) {
        azqc.n();
        return (ayos) ayovVar;
    }

    public static ayos O(ayov ayovVar, ayov ayovVar2, aypx aypxVar) {
        return P(ayrb.c(aypxVar), ayovVar, ayovVar2);
    }

    public static ayos P(ayqe ayqeVar, ayov... ayovVarArr) {
        azmh azmhVar = new azmh(ayovVarArr, ayqeVar);
        azqc.n();
        return azmhVar;
    }

    private ayos a(long j, TimeUnit timeUnit, ayor ayorVar, ayov ayovVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        azma azmaVar = new azma(this, j, timeUnit, ayorVar);
        azqc.n();
        return azmaVar;
    }

    private static ayos b(aynx aynxVar) {
        ayzd ayzdVar = new ayzd(aynxVar);
        azqc.n();
        return ayzdVar;
    }

    public static ayos n(ayou ayouVar) {
        ayrd.b(ayouVar, "source is null");
        azkn azknVar = new azkn(ayouVar);
        azqc.n();
        return azknVar;
    }

    public static ayos o(Callable callable) {
        azko azkoVar = new azko(callable);
        azqc.n();
        return azkoVar;
    }

    public static ayos x(Throwable th) {
        ayrd.b(th, "exception is null");
        return y(ayrb.f(th));
    }

    public static ayos y(Callable callable) {
        azlb azlbVar = new azlb(callable);
        azqc.n();
        return azlbVar;
    }

    public final ayos C() {
        azlm azlmVar = new azlm(this);
        azqc.n();
        return azlmVar;
    }

    public final ayos E(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azlp azlpVar = new azlp(this, ayqeVar);
        azqc.n();
        return azlpVar;
    }

    public final ayos G(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        azls azlsVar = new azls(this, ayorVar);
        azqc.n();
        return azlsVar;
    }

    public final ayos H(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "resumeFunctionInCaseOfError is null");
        azlw azlwVar = new azlw(this, ayqeVar);
        azqc.n();
        return azlwVar;
    }

    public final ayos I(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "resumeFunction is null");
        azlu azluVar = new azlu(this, ayqeVar, null);
        azqc.n();
        return azluVar;
    }

    public final ayos J(Object obj) {
        ayrd.b(obj, "value is null");
        azlu azluVar = new azlu(this, null, obj);
        azqc.n();
        return azluVar;
    }

    public final ayos K(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        azly azlyVar = new azly(this, ayorVar);
        azqc.n();
        return azlyVar;
    }

    public final ayos L(long j, TimeUnit timeUnit) {
        return a(4L, timeUnit, azpj.a(), null);
    }

    public final ayos M(long j, TimeUnit timeUnit, ayor ayorVar) {
        return a(j, timeUnit, ayorVar, null);
    }

    public final ayot Q(ayot ayotVar) {
        W(ayotVar);
        return ayotVar;
    }

    public final aypg R() {
        return T(ayrb.d, ayrb.e);
    }

    public final aypg S(ayqb ayqbVar) {
        return T(ayqbVar, ayrb.e);
    }

    public final aypg T(ayqb ayqbVar, ayqb ayqbVar2) {
        ayrd.b(ayqbVar, "onSuccess is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrv ayrvVar = new ayrv(ayqbVar, ayqbVar2);
        W(ayrvVar);
        return ayrvVar;
    }

    public final Object U() {
        ayrs ayrsVar = new ayrs();
        W(ayrsVar);
        return ayrsVar.c();
    }

    public final Future V() {
        ayrz ayrzVar = new ayrz();
        Q(ayrzVar);
        return ayrzVar;
    }

    @Override // defpackage.ayov
    public final void W(ayot ayotVar) {
        ayrd.b(ayotVar, "observer is null");
        aypx aypxVar = azqc.u;
        ayrd.b(ayotVar, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            X(ayotVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bapv.j(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void X(ayot ayotVar);

    public final aynr c(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azlf azlfVar = new azlf(this, ayqeVar);
        azqc.g();
        return azlfVar;
    }

    public final aynr e() {
        aysz ayszVar = new aysz(this);
        azqc.g();
        return ayszVar;
    }

    public final aynx f(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azlj azljVar = new azlj(this, ayqeVar);
        azqc.j();
        return azljVar;
    }

    public final aynx g() {
        if (this instanceof ayrf) {
            return ((ayrf) this).a();
        }
        azmc azmcVar = new azmc(this);
        azqc.j();
        return azmcVar;
    }

    public final ayoc h(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        azay azayVar = new azay(this, ayqfVar);
        azqc.k();
        return azayVar;
    }

    public final ayoc i(ayqe ayqeVar) {
        azlh azlhVar = new azlh(this, ayqeVar);
        azqc.k();
        return azlhVar;
    }

    public final ayoc j() {
        if (this instanceof ayrg) {
            return ((ayrg) this).a();
        }
        azbl azblVar = new azbl(this);
        azqc.k();
        return azblVar;
    }

    public final ayoi k() {
        if (this instanceof ayrh) {
            return ((ayrh) this).a();
        }
        azme azmeVar = new azme(this);
        azqc.i();
        return azmeVar;
    }

    public final ayos l() {
        azkl azklVar = new azkl(this);
        azqc.n();
        return azklVar;
    }

    public final ayos m(ayow ayowVar) {
        ayrd.b(ayowVar, "transformer is null");
        ayov a = ayowVar.a(this);
        N(a);
        return (ayos) a;
    }

    public final ayos p(long j, TimeUnit timeUnit, ayor ayorVar) {
        return q(15L, timeUnit, ayorVar, false);
    }

    public final ayos q(long j, TimeUnit timeUnit, ayor ayorVar, boolean z) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        azks azksVar = new azks(this, timeUnit, ayorVar);
        azqc.n();
        return azksVar;
    }

    public final ayos r(aynu aynuVar) {
        azku azkuVar = new azku(this, aynuVar);
        azqc.n();
        return azkuVar;
    }

    public final ayos s(ayok ayokVar) {
        azkw azkwVar = new azkw(this, ayokVar);
        azqc.n();
        return azkwVar;
    }

    public final ayos t(long j, TimeUnit timeUnit) {
        return u(j, timeUnit, azpj.a());
    }

    public final ayos u(long j, TimeUnit timeUnit, ayor ayorVar) {
        return s(ayoi.ai(j, timeUnit, ayorVar));
    }

    public final ayos v(ayqb ayqbVar) {
        ayrd.b(ayqbVar, "onError is null");
        azky azkyVar = new azky(this, ayqbVar);
        azqc.n();
        return azkyVar;
    }

    public final ayos w(ayqb ayqbVar) {
        ayrd.b(ayqbVar, "onSuccess is null");
        azla azlaVar = new azla(this, ayqbVar);
        azqc.n();
        return azlaVar;
    }

    public final ayos z(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azld azldVar = new azld(this, ayqeVar);
        azqc.n();
        return azldVar;
    }
}
