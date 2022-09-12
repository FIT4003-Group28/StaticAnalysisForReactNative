package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: deqv  reason: default package */
/* loaded from: classes6.dex */
public final class deqv {
    public static final /* synthetic */ int e = 0;
    private static final deqn<Object> f = deqq.a;
    private static final deqp<String> g = deqr.a;
    private static final deqp<Boolean> h = deqs.a;
    private static final dequ i = new dequ();
    public final Map<Class<?>, deqn<?>> a = new HashMap();
    public final Map<Class<?>, deqp<?>> b = new HashMap();
    public final deqn<Object> c = f;
    public boolean d = false;

    public deqv() {
        c(String.class, g);
        c(Boolean.class, h);
        c(Date.class, i);
    }

    public final deqt a() {
        return new deqt(this);
    }

    public final <T> void b(Class<T> cls, deqn<? super T> deqnVar) {
        this.a.put(cls, deqnVar);
        this.b.remove(cls);
    }

    public final <T> void c(Class<T> cls, deqp<? super T> deqpVar) {
        this.b.put(cls, deqpVar);
        this.a.remove(cls);
    }
}
