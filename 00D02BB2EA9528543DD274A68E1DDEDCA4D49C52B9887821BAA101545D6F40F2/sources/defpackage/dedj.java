package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dedj  reason: default package */
/* loaded from: classes.dex */
public class dedj<T> extends decv<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final Type a;
    private transient deda b;

    public dedj() {
        this.a = a();
        throw null;
    }

    public static dedj<?> b(Type type) {
        return new dedc(type);
    }

    public static final dedj<? super T> f(Type type) {
        dedj<? super T> dedjVar = (dedj<? super T>) b(type);
        if (dedjVar.c().isInterface()) {
            return null;
        }
        return dedjVar;
    }

    public static final dcdc<dedj<? super T>> g(Type[] typeArr) {
        dccx F = dcdc.F();
        for (Type type : typeArr) {
            dedj<?> b = b(type);
            if (b.c().isInterface()) {
                F.g(b);
            }
        }
        return F.f();
    }

    public final Class<? super T> c() {
        return e().iterator().next();
    }

    public final dedj<?> d(Type type) {
        deda dedaVar = this.b;
        if (dedaVar == null) {
            Type type2 = this.a;
            deda dedaVar2 = new deda();
            decw decwVar = new decw();
            decwVar.f(type2);
            dcdn r = dcdn.r(decwVar.a);
            decy decyVar = dedaVar2.a;
            dcdg p = dcdn.p();
            p.c(decyVar.c);
            Iterator it = r.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                decz deczVar = (decz) entry.getKey();
                Type type3 = (Type) entry.getValue();
                dbsk.g(!deczVar.b(type3), "Type variable %s bound to itself", deczVar);
                p.f(deczVar, type3);
            }
            deda dedaVar3 = new deda(new decy(p.b()));
            this.b = dedaVar3;
            dedaVar = dedaVar3;
        }
        dedj<?> b = b(dedaVar.a(type));
        b.b = this.b;
        return b;
    }

    public final dcep<Class<? super T>> e() {
        dcen N = dcep.N();
        new dedb(N).f(this.a);
        return N.f();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dedj) {
            return this.a.equals(((dedj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dedy.d(this.a);
    }

    protected Object writeReplace() {
        return b(new deda().a(this.a));
    }

    public dedj(Type type) {
        dbsk.s(type);
        this.a = type;
    }
}
