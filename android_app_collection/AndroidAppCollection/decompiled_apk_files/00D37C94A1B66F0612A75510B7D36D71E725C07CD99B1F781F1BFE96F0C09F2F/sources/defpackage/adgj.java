package defpackage;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.cast.CastDevice;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adgj  reason: default package */
/* loaded from: classes.dex */
public final class adgj {
    public static final String a = zep.a("MDX.MediaRoutes");
    public final ankw b;
    public final adef c;
    private final Executor d;

    public adgj(Executor executor, ankw ankwVar, adef adefVar) {
        this.d = executor;
        this.b = ankwVar;
        this.c = adefVar;
    }

    public static boolean b(CastDevice castDevice) {
        return castDevice != null && !castDevice.d(1) && castDevice.d(4);
    }

    public static CastDevice c(bhc bhcVar) {
        Bundle bundle;
        if (bhcVar == null || (bundle = bhcVar.q) == null) {
            return null;
        }
        return CastDevice.a(bundle);
    }

    public static boolean d(bhc bhcVar) {
        return b(c(bhcVar));
    }

    public final ankt a(final amuk amukVar) {
        return anii.i(anlz.u(new Callable() { // from class: adgf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Map) Collection.EL.stream(amuk.this).collect(Collectors.toMap(omr.t, adgi.c));
            }
        }, this.d), new anir() { // from class: adge
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final adgj adgjVar = adgj.this;
                List list = (List) Collection.EL.stream(((Map) obj).entrySet()).map(new Function() { // from class: adgh
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        adgj adgjVar2 = adgj.this;
                        final Map.Entry entry = (Map.Entry) obj2;
                        if (((Optional) entry.getValue()).isPresent()) {
                            final Bundle bundle = (Bundle) ((Optional) entry.getValue()).get();
                            return anii.h(adgjVar2.c.a.qp(new Callable() { // from class: adee
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Optional.ofNullable(CastDevice.a(bundle));
                                }
                            }), new ampg() { // from class: adgd
                                @Override // defpackage.ampg
                                public final Object apply(Object obj3) {
                                    return new Pair((bhc) entry.getKey(), (Optional) obj3);
                                }
                            }, adgjVar2.b);
                        }
                        return anlz.q(new Pair((bhc) entry.getKey(), Optional.empty()));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                }).collect(Collectors.toList());
                return anlz.j(list).a(new adgg(list), adgjVar.b);
            }
        }, this.b);
    }
}
