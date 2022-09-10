package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyii  reason: default package */
/* loaded from: classes6.dex */
public final class dyii {
    public final List<dyfw> a;
    public final dyel b;
    @dzsi
    public final dyie c;

    public dyii(List<dyfw> list, dyel dyelVar, dyie dyieVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        dbsk.t(dyelVar, "attributes");
        this.b = dyelVar;
        this.c = dyieVar;
    }

    public static dyih a() {
        return new dyih();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyii)) {
            return false;
        }
        dyii dyiiVar = (dyii) obj;
        return dbsd.a(this.a, dyiiVar.a) && dbsd.a(this.b, dyiiVar.b) && dbsd.a(this.c, dyiiVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("addresses", this.a);
        b.b("attributes", this.b);
        b.b("serviceConfig", this.c);
        return b.toString();
    }
}
