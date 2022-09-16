package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aynr  reason: default package */
/* loaded from: classes2.dex */
public abstract class aynr implements aynu {
    public static aynr A() {
        aynr aynrVar = ayth.a;
        azqc.g();
        return aynrVar;
    }

    public static aynr G(long j, TimeUnit timeUnit, ayor ayorVar) {
        ayrd.b(timeUnit, "unit is null");
        aytu aytuVar = new aytu(j, timeUnit, ayorVar);
        azqc.g();
        return aytuVar;
    }

    public static aynr H(aynu aynuVar) {
        azqc.g();
        return (aynr) aynuVar;
    }

    private static NullPointerException W(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    private aynr a(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar, aypv aypvVar2, aypv aypvVar3, aypv aypvVar4) {
        ayrd.b(ayqbVar, "onSubscribe is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        ayrd.b(aypvVar4, "onDispose is null");
        aytn aytnVar = new aytn(this, ayqbVar, ayqbVar2, aypvVar, aypvVar4);
        azqc.g();
        return aytnVar;
    }

    private static aynr b(bamd bamdVar, int i, boolean z) {
        ayrd.c(Integer.MAX_VALUE, "maxConcurrency");
        ayte ayteVar = new ayte(bamdVar);
        azqc.g();
        return ayteVar;
    }

    private aynr d(long j, TimeUnit timeUnit, ayor ayorVar, aynu aynuVar) {
        ayrd.b(timeUnit, "unit is null");
        ayrd.b(ayorVar, "scheduler is null");
        ayts aytsVar = new ayts(this, j, timeUnit, ayorVar);
        azqc.g();
        return aytsVar;
    }

    public static aynr f() {
        aynr aynrVar = ayst.a;
        azqc.g();
        return aynrVar;
    }

    public static aynr h(bamd bamdVar) {
        return i(bamdVar, 2);
    }

    public static aynr i(bamd bamdVar, int i) {
        ayrd.c(2, "prefetch");
        aysl ayslVar = new aysl(bamdVar);
        azqc.g();
        return ayslVar;
    }

    public static aynr j(aynt ayntVar) {
        ayrd.b(ayntVar, "source is null");
        aysn aysnVar = new aysn(ayntVar);
        azqc.g();
        return aysnVar;
    }

    public static aynr k(Callable callable) {
        ayrd.b(callable, "completableSupplier");
        ayso aysoVar = new ayso(callable);
        azqc.g();
        return aysoVar;
    }

    public static aynr s(Throwable th) {
        ayrd.b(th, "error is null");
        aysu aysuVar = new aysu(th);
        azqc.g();
        return aysuVar;
    }

    public static aynr t(aypv aypvVar) {
        ayrd.b(aypvVar, "run is null");
        aysv aysvVar = new aysv(aypvVar);
        azqc.g();
        return aysvVar;
    }

    public static aynr u(Callable callable) {
        ayrd.b(callable, "callable is null");
        aysw ayswVar = new aysw(callable);
        azqc.g();
        return ayswVar;
    }

    public static aynr v(Future future) {
        return t(new ayqv(future));
    }

    public static aynr w(Runnable runnable) {
        ayrd.b(runnable, "run is null");
        aysx aysxVar = new aysx(runnable);
        azqc.g();
        return aysxVar;
    }

    public static aynr y(aynu... aynuVarArr) {
        aytg aytgVar = new aytg(aynuVarArr);
        azqc.g();
        return aytgVar;
    }

    public static aynr z(bamd bamdVar) {
        return b(bamdVar, Integer.MAX_VALUE, true);
    }

    public final aynr B(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        aytj aytjVar = new aytj(this, ayorVar);
        azqc.g();
        return aytjVar;
    }

    public final aynr C() {
        return D(ayrb.f);
    }

    public final aynr D(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        aytl aytlVar = new aytl(this, ayqfVar);
        azqc.g();
        return aytlVar;
    }

    public final aynr E(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        aytp aytpVar = new aytp(this, ayorVar);
        azqc.g();
        return aytpVar;
    }

    public final aynr F(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, azpj.a(), null);
    }

    public final ayns I(ayns aynsVar) {
        U(aynsVar);
        return aynsVar;
    }

    public final aynx J() {
        if (this instanceof ayrf) {
            return ((ayrf) this).a();
        }
        aytv aytvVar = new aytv(this);
        azqc.j();
        return aytvVar;
    }

    public final ayoc K(ayof ayofVar) {
        azap azapVar = new azap(ayofVar, this);
        azqc.k();
        return azapVar;
    }

    public final ayoc L() {
        if (this instanceof ayrg) {
            return ((ayrg) this).a();
        }
        azbj azbjVar = new azbj(this);
        azqc.k();
        return azbjVar;
    }

    public final ayoi M(ayok ayokVar) {
        ayrd.b(ayokVar, "next is null");
        azda azdaVar = new azda(this, ayokVar);
        azqc.i();
        return azdaVar;
    }

    public final ayoi N() {
        if (this instanceof ayrh) {
            return ((ayrh) this).a();
        }
        aytx aytxVar = new aytx(this);
        azqc.i();
        return aytxVar;
    }

    public final ayos O(ayov ayovVar) {
        azku azkuVar = new azku(ayovVar, this);
        azqc.n();
        return azkuVar;
    }

    public final ayos P(Object obj) {
        aytz aytzVar = new aytz(this, obj);
        azqc.n();
        return aytzVar;
    }

    public final aypg Q() {
        ayry ayryVar = new ayry();
        U(ayryVar);
        return ayryVar;
    }

    public final aypg R(aypv aypvVar) {
        ayrd.b(aypvVar, "onComplete is null");
        ayru ayruVar = new ayru(aypvVar);
        U(ayruVar);
        return ayruVar;
    }

    public final aypg S(aypv aypvVar, ayqb ayqbVar) {
        ayrd.b(ayqbVar, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        ayru ayruVar = new ayru(ayqbVar, aypvVar);
        U(ayruVar);
        return ayruVar;
    }

    public final void T() {
        ayrs ayrsVar = new ayrs();
        U(ayrsVar);
        ayrsVar.c();
    }

    @Override // defpackage.aynu
    public final void U(ayns aynsVar) {
        ayrd.b(aynsVar, "observer is null");
        try {
            aypx aypxVar = azqc.v;
            ayrd.b(aynsVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            V(aynsVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
            throw W(th);
        }
    }

    protected abstract void V(ayns aynsVar);

    public final aynr c(aynu aynuVar) {
        aysg aysgVar = new aysg(this, aynuVar);
        azqc.g();
        return aysgVar;
    }

    public final aynr e() {
        aysi aysiVar = new aysi(this);
        azqc.g();
        return aysiVar;
    }

    public final aynr g(aynv aynvVar) {
        ayrd.b(aynvVar, "transformer is null");
        aynu a = aynvVar.a(this);
        H(a);
        return (aynr) a;
    }

    public final aynr l(long j, TimeUnit timeUnit, ayor ayorVar) {
        return m(j, timeUnit, ayorVar, false);
    }

    public final aynr m(long j, TimeUnit timeUnit, ayor ayorVar, boolean z) {
        ayrd.b(timeUnit, "unit is null");
        aysq aysqVar = new aysq(this, j, timeUnit, ayorVar);
        azqc.g();
        return aysqVar;
    }

    public final aynr n(aypv aypvVar) {
        ayss ayssVar = new ayss(this, aypvVar);
        azqc.g();
        return ayssVar;
    }

    public final aynr o(aypv aypvVar) {
        return a(ayrb.d, ayrb.d, aypvVar, ayrb.c, ayrb.c, ayrb.c);
    }

    public final aynr p(aypv aypvVar) {
        return a(ayrb.d, ayrb.d, ayrb.c, ayrb.c, ayrb.c, aypvVar);
    }

    public final aynr q(ayqb ayqbVar) {
        return a(ayrb.d, ayqbVar, ayrb.c, ayrb.c, ayrb.c, ayrb.c);
    }

    public final aynr r(ayqb ayqbVar) {
        return a(ayqbVar, ayrb.d, ayrb.c, ayrb.c, ayrb.c, ayrb.c);
    }

    public final aynr x() {
        aytb aytbVar = new aytb(this);
        azqc.g();
        return aytbVar;
    }
}
