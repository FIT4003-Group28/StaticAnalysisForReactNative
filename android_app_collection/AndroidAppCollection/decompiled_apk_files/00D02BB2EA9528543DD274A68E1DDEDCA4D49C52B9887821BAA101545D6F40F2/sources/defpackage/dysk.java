package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysk  reason: default package */
/* loaded from: classes6.dex */
public final class dysk {
    @dzsi
    public final dysj a;
    public final Map<String, dysj> b;
    public final Map<String, dysj> c;
    @dzsi
    public final dyus d;
    @dzsi
    public final Object e;
    @dzsi
    public final Map<String, ?> f;

    public dysk(@dzsi dysj dysjVar, Map<String, dysj> map, Map<String, dysj> map2, @dzsi dyus dyusVar, @dzsi Object obj, @dzsi Map<String, ?> map3) {
        this.a = dysjVar;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.c = Collections.unmodifiableMap(new HashMap(map2));
        this.d = dyusVar;
        this.e = obj;
        this.f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final dygm a() {
        if (!this.c.isEmpty() || !this.b.isEmpty() || this.a != null) {
            return new dysi(this);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dysk dyskVar = (dysk) obj;
            if (dbsd.a(this.b, dyskVar.b) && dbsd.a(this.c, dyskVar.c) && dbsd.a(this.d, dyskVar.d) && dbsd.a(this.e, dyskVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("serviceMethodMap", this.b);
        b.b("serviceMap", this.c);
        b.b("retryThrottling", this.d);
        b.b("loadBalancingConfig", this.e);
        return b.toString();
    }
}
