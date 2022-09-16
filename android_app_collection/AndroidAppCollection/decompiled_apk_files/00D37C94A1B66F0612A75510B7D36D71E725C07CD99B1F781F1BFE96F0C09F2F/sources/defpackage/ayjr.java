package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayjr  reason: default package */
/* loaded from: classes2.dex */
public final class ayjr {
    public final aylu a;
    public final Object b;
    public final Map c;
    private final ayjp d;
    private final Map e;
    private final Map f;

    public ayjr(ayjp ayjpVar, Map map, Map map2, aylu ayluVar, Object obj, Map map3) {
        this.d = ayjpVar;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = Collections.unmodifiableMap(new HashMap(map2));
        this.a = ayluVar;
        this.b = obj;
        this.c = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final axzq a() {
        if (!this.f.isEmpty() || !this.e.isEmpty() || this.d != null) {
            return new ayjq(this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayjp b(ayax ayaxVar) {
        ayjp ayjpVar = (ayjp) this.e.get(ayaxVar.b);
        if (ayjpVar == null) {
            ayjpVar = (ayjp) this.f.get(ayaxVar.c);
        }
        return ayjpVar == null ? this.d : ayjpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayjr ayjrVar = (ayjr) obj;
            if (akzj.f(this.d, ayjrVar.d) && akzj.f(this.e, ayjrVar.e) && akzj.f(this.f, ayjrVar.f) && akzj.f(this.a, ayjrVar.a) && akzj.f(this.b, ayjrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("defaultMethodConfig", this.d);
        c.b("serviceMethodMap", this.e);
        c.b("serviceMap", this.f);
        c.b("retryThrottling", this.a);
        c.b("loadBalancingConfig", this.b);
        return c.toString();
    }
}
