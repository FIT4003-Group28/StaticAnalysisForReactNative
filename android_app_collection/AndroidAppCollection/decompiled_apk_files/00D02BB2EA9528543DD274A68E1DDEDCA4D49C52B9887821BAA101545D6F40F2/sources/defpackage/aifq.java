package defpackage;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: aifq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aifq {
    public static aifp j() {
        aiep aiepVar = new aiep();
        aiepVar.f(1.0f);
        aiepVar.b(1.0f);
        aiepVar.k(0.0f, akwd.UNSPECIFIED);
        aiepVar.l(new ConcurrentHashMap<>());
        return aiepVar;
    }

    public abstract akqp a();

    public abstract float b();

    public abstract float c();

    public abstract akwd d();

    public abstract float e();

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aifq)) {
            return false;
        }
        aifq aifqVar = (aifq) obj;
        akqp a = a();
        akqp a2 = aifqVar.a();
        float f = a.a - a2.a;
        float f2 = a.b - a2.b;
        float f3 = a.c - a2.c;
        return ((f * f) + (f2 * f2)) + (f3 * f3) < 1.0f && b() == aifqVar.b() && c() == aifqVar.c() && d() == aifqVar.d() && e() == aifqVar.e() && dbsd.a(f(), aifqVar.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dcdn<Class<?>, aifx> f();

    public final <T extends aifx> T g(Class<T> cls) {
        T t = (T) h(cls);
        dbsk.s(t);
        return t;
    }

    @dzsi
    public final <T extends aifx> T h(Class<T> cls) {
        return cls.cast(f().get(cls));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(b()), Float.valueOf(c()), d(), Float.valueOf(e()), f()});
    }

    public final aifp i() {
        aiep aiepVar = new aiep();
        aiepVar.e = a().a();
        aiepVar.f(b());
        aiepVar.b(c());
        aiepVar.k(e(), d());
        aiepVar.l(new ConcurrentHashMap<>(f()));
        return aiepVar;
    }
}
