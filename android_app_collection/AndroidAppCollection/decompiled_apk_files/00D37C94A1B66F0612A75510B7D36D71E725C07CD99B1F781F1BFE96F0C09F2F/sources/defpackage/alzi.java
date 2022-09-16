package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alzi  reason: default package */
/* loaded from: classes.dex */
public final class alzi implements alzj {
    public static final alzi a = new alzi(Collections.emptyMap(), false);
    public static final alzi b = new alzi(Collections.emptyMap(), true);
    public final Map c;
    public final boolean d;

    public alzi(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public static alzh b() {
        return new alzh();
    }

    public static alzi d(alzl alzlVar) {
        alzh b2 = b();
        b2.c(alzlVar);
        return b2.a();
    }

    @Override // defpackage.alzj
    public final alzi a() {
        throw null;
    }

    public final alzh c() {
        alzh b2 = b();
        b2.c(g());
        return b2;
    }

    public final alzi e(int i) {
        alzi alziVar = (alzi) this.c.get(Integer.valueOf(i));
        if (alziVar == null) {
            alziVar = a;
        }
        return this.d ? alziVar.f() : alziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            alzi alziVar = (alzi) obj;
            if (akzj.f(this.c, alziVar.c) && akzj.f(Boolean.valueOf(this.d), Boolean.valueOf(alziVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final alzi f() {
        if (this.c.isEmpty()) {
            return this.d ? a : b;
        }
        return new alzi(this.c, !this.d);
    }

    public final alzl g() {
        aopa createBuilder = alzl.a.createBuilder();
        boolean z = this.d;
        createBuilder.copyOnWrite();
        ((alzl) createBuilder.instance).d = z;
        for (Integer num : this.c.keySet()) {
            int intValue = num.intValue();
            alzi alziVar = (alzi) this.c.get(Integer.valueOf(intValue));
            if (alziVar.equals(b)) {
                createBuilder.copyOnWrite();
                alzl alzlVar = (alzl) createBuilder.instance;
                aopq aopqVar = alzlVar.c;
                if (!aopqVar.c()) {
                    alzlVar.c = aopi.mutableCopy(aopqVar);
                }
                alzlVar.c.g(intValue);
            } else {
                aopa createBuilder2 = alzk.a.createBuilder();
                createBuilder2.copyOnWrite();
                ((alzk) createBuilder2.instance).b = intValue;
                alzl g = alziVar.g();
                createBuilder2.copyOnWrite();
                g.getClass();
                ((alzk) createBuilder2.instance).c = g;
                alzk alzkVar = (alzk) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                alzl alzlVar2 = (alzl) createBuilder.instance;
                alzkVar.getClass();
                aopu aopuVar = alzlVar2.b;
                if (!aopuVar.c()) {
                    alzlVar2.b = aopi.mutableCopy(aopuVar);
                }
                alzlVar2.b.add(alzkVar);
            }
        }
        return (alzl) createBuilder.mo39build();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        if (equals(a)) {
            c.a("empty()");
        } else if (equals(b)) {
            c.a("all()");
        } else {
            c.b("fields", this.c);
            c.g("inverted", this.d);
        }
        return c.toString();
    }
}
