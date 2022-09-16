package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayoc  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayoc implements ayof {
    public static ayoc I(ayof ayofVar) {
        azqc.k();
        return (ayoc) ayofVar;
    }

    public static ayoc J(ayof ayofVar, ayof ayofVar2, aypx aypxVar) {
        return K(ayrb.c(aypxVar), ayofVar, ayofVar2);
    }

    public static ayoc K(ayqe ayqeVar, ayof... ayofVarArr) {
        azcy azcyVar = new azcy(ayofVarArr, ayqeVar);
        azqc.k();
        return azcyVar;
    }

    public static ayoc i(ayoe ayoeVar) {
        ayrd.b(ayoeVar, "onSubscribe is null");
        azan azanVar = new azan(ayoeVar);
        azqc.k();
        return azanVar;
    }

    public static ayoc p() {
        azau azauVar = azau.a;
        azqc.k();
        return azauVar;
    }

    public static ayoc q(Throwable th) {
        ayrd.b(th, "exception is null");
        azav azavVar = new azav(th);
        azqc.k();
        return azavVar;
    }

    public static ayoc u(Callable callable) {
        ayrd.b(callable, "callable is null");
        azbh azbhVar = new azbh(callable);
        azqc.k();
        return azbhVar;
    }

    public static ayoc v(Object obj) {
        ayrd.b(obj, "item is null");
        azbt azbtVar = new azbt(obj);
        azqc.k();
        return azbtVar;
    }

    public static ayoc x() {
        azbv azbvVar = azbv.a;
        azqc.k();
        return azbvVar;
    }

    public final ayoc A(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        azbz azbzVar = new azbz(this, ayqfVar);
        azqc.k();
        return azbzVar;
    }

    public final ayoc B(ayof ayofVar) {
        return C(ayrb.b(ayofVar));
    }

    public final ayoc C(ayqe ayqeVar) {
        azcc azccVar = new azcc(this, ayqeVar);
        azqc.k();
        return azccVar;
    }

    public final ayoc D(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "valueSupplier is null");
        azce azceVar = new azce(this, ayqeVar);
        azqc.k();
        return azceVar;
    }

    public final ayoc E(Object obj) {
        ayrd.b(obj, "item is null");
        return D(ayrb.b(obj));
    }

    public final ayoc F(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        azcj azcjVar = new azcj(this, ayorVar);
        azqc.k();
        return azcjVar;
    }

    public final ayoc G(ayof ayofVar) {
        azcl azclVar = new azcl(this, ayofVar);
        azqc.k();
        return azclVar;
    }

    public final ayoc H(ayof ayofVar) {
        azcr azcrVar = new azcr(this, ayofVar);
        azqc.k();
        return azcrVar;
    }

    public final ayoc L(ayof ayofVar, aypx aypxVar) {
        return J(this, ayofVar, aypxVar);
    }

    public final ayod M(ayod ayodVar) {
        X(ayodVar);
        return ayodVar;
    }

    public final ayoi N(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azdf azdfVar = new azdf(this, ayqeVar);
        azqc.i();
        return azdfVar;
    }

    public final ayoi O() {
        if (this instanceof ayrh) {
            return ((ayrh) this).a();
        }
        azct azctVar = new azct(this);
        azqc.i();
        return azctVar;
    }

    public final ayos P() {
        azbs azbsVar = new azbs(this);
        azqc.n();
        return azbsVar;
    }

    public final ayos Q(ayov ayovVar) {
        azco azcoVar = new azco(this, ayovVar);
        azqc.n();
        return azcoVar;
    }

    public final ayos R(Object obj) {
        ayrd.b(obj, "defaultValue is null");
        azcv azcvVar = new azcv(this, obj);
        azqc.n();
        return azcvVar;
    }

    public final aypg S() {
        return V(ayrb.d, ayrb.e, ayrb.c);
    }

    public final aypg T(ayqb ayqbVar) {
        return V(ayqbVar, ayrb.e, ayrb.c);
    }

    public final aypg U(ayqb ayqbVar, ayqb ayqbVar2) {
        return V(ayqbVar, ayqbVar2, ayrb.c);
    }

    public final aypg V(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        ayrd.b(ayqbVar, "onSuccess is null");
        ayrd.b(ayqbVar2, "onError is null");
        ayrd.b(aypvVar, "onComplete is null");
        azal azalVar = new azal(ayqbVar, ayqbVar2, aypvVar);
        M(azalVar);
        return azalVar;
    }

    public final Object W() {
        ayrs ayrsVar = new ayrs();
        X(ayrsVar);
        return ayrsVar.c();
    }

    @Override // defpackage.ayof
    public final void X(ayod ayodVar) {
        ayrd.b(ayodVar, "observer is null");
        aypx aypxVar = azqc.s;
        ayrd.b(ayodVar, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            Y(ayodVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bapv.j(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void Y(ayod ayodVar);

    public final aynr c(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azba azbaVar = new azba(this, ayqeVar);
        azqc.g();
        return azbaVar;
    }

    public final aynr e() {
        azbo azboVar = new azbo(this);
        azqc.g();
        return azboVar;
    }

    public final ayoc f() {
        azak azakVar = new azak(this);
        azqc.k();
        return azakVar;
    }

    public final ayoc g(Class cls) {
        return w(ayrb.a(cls));
    }

    public final ayoc h(ayog ayogVar) {
        ayrd.b(ayogVar, "transformer is null");
        ayof a = ayogVar.a(this);
        I(a);
        return (ayoc) a;
    }

    public final ayoc j(Object obj) {
        ayrd.b(obj, "defaultItem is null");
        return G(v(obj));
    }

    public final ayoc k(ayqb ayqbVar) {
        azar azarVar = new azar(this, ayqbVar);
        azqc.k();
        return azarVar;
    }

    public final ayoc l(aypv aypvVar) {
        ayqb ayqbVar = ayrb.d;
        ayqb ayqbVar2 = ayrb.d;
        ayrd.b(aypvVar, "onComplete is null");
        azcg azcgVar = new azcg(this, ayqbVar, ayqbVar2, aypvVar);
        azqc.k();
        return azcgVar;
    }

    public final ayoc m(ayqb ayqbVar) {
        ayqb ayqbVar2 = ayrb.d;
        ayrd.b(ayqbVar, "onError is null");
        azcg azcgVar = new azcg(this, ayqbVar2, ayqbVar, ayrb.c);
        azqc.k();
        return azcgVar;
    }

    public final ayoc n(aypw aypwVar) {
        azat azatVar = new azat(this, aypwVar);
        azqc.k();
        return azatVar;
    }

    public final ayoc o(ayqb ayqbVar) {
        ayrd.b(ayqbVar, "onSuccess is null");
        azcg azcgVar = new azcg(this, ayqbVar, ayrb.d, ayrb.c);
        azqc.k();
        return azcgVar;
    }

    public final ayoc r(ayqf ayqfVar) {
        ayrd.b(ayqfVar, "predicate is null");
        azaw azawVar = new azaw(this, ayqfVar);
        azqc.k();
        return azawVar;
    }

    public final ayoc s(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azbg azbgVar = new azbg(this, ayqeVar);
        azqc.k();
        return azbgVar;
    }

    public final ayoc t(ayqe ayqeVar, ayqe ayqeVar2, Callable callable) {
        ayrd.b(ayqeVar, "onSuccessMapper is null");
        ayrd.b(ayqeVar2, "onErrorMapper is null");
        ayrd.b(callable, "onCompleteSupplier is null");
        azbd azbdVar = new azbd(this, ayqeVar, ayqeVar2, callable);
        azqc.k();
        return azbdVar;
    }

    public final ayoc w(ayqe ayqeVar) {
        ayrd.b(ayqeVar, "mapper is null");
        azbu azbuVar = new azbu(this, ayqeVar);
        azqc.k();
        return azbuVar;
    }

    public final ayoc y(ayor ayorVar) {
        ayrd.b(ayorVar, "scheduler is null");
        azbx azbxVar = new azbx(this, ayorVar);
        azqc.k();
        return azbxVar;
    }

    public final ayoc z() {
        return A(ayrb.f);
    }
}
