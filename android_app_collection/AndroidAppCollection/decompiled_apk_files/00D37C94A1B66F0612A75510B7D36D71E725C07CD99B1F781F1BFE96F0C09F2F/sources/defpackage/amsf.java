package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.stream.Collector;
/* compiled from: PG */
/* renamed from: amsf  reason: default package */
/* loaded from: classes.dex */
public final class amsf {
    public static final Collector a = Collector.CC.of(ibz.k, amsc.b, amsd.b, akrs.e, new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(ibz.m, amsc.c, amsd.d, akrs.h, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(ibz.l, amsc.a, amsd.c, akrs.g, new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(ibz.n, new BiConsumer() { // from class: amse
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function function3 = Function.this;
                Function function4 = function2;
                Collector collector = amsf.a;
                ((amum) obj).f(function3.apply(obj2), function4.apply(obj2));
            }

            @Override // j$.util.function.BiConsumer
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return biConsumer.getClass();
            }
        }, amsd.a, akrs.f, new Collector.Characteristics[0]);
    }
}
