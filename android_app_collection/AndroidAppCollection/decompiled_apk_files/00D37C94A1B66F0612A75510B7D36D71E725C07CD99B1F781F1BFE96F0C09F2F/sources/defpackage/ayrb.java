package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayrb  reason: default package */
/* loaded from: classes2.dex */
public final class ayrb {
    public static final ayqe a = new ayqx();
    public static final Runnable b = new ayqu();
    public static final aypv c = new ayqs();
    public static final ayqb d = new ayqt();
    public static final ayqb e = new ayra();
    public static final azxy g = new azxy();
    public static final ayqf f = new akxt(9);

    public static ayqe a(Class cls) {
        return new ayqr(cls);
    }

    public static ayqe b(Object obj) {
        return new ayqy(obj);
    }

    public static ayqe c(aypx aypxVar) {
        ayrd.b(aypxVar, "f is null");
        return new ayqn(aypxVar);
    }

    public static ayqe d(ayqc ayqcVar) {
        ayrd.b(ayqcVar, "f is null");
        return new ayqo(ayqcVar);
    }

    public static ayqe e(ayqd ayqdVar) {
        ayrd.b(ayqdVar, "f is null");
        return new ayqp(ayqdVar);
    }

    public static Callable f(Object obj) {
        return new ayqy(obj);
    }
}
