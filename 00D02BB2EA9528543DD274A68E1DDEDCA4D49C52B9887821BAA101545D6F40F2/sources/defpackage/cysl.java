package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cysl  reason: default package */
/* loaded from: classes5.dex */
final class cysl {
    public final cyqg a;
    private final cysn b;

    public cysl(cysn cysnVar, cyqg cyqgVar) {
        this.b = cysnVar;
        this.a = cyqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cysl) {
            cysl cyslVar = (cysl) obj;
            if (dbsd.a(this.b, cyslVar.b) && dbsd.a(this.a, cyslVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("contact", this.a);
        b.b("token", this.b);
        return b.toString();
    }
}
