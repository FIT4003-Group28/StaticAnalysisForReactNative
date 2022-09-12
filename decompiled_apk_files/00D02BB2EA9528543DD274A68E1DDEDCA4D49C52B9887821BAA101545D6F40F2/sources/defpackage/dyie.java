package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dyie  reason: default package */
/* loaded from: classes6.dex */
public final class dyie {
    public final dyjb a;
    public final Object b;

    private dyie(dyjb dyjbVar) {
        this.b = null;
        this.a = dyjbVar;
        dbsk.g(!dyjbVar.i(), "cannot use OK status: %s", dyjbVar);
    }

    private dyie(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public static dyie a(Object obj) {
        return new dyie(obj);
    }

    public static dyie b(dyjb dyjbVar) {
        return new dyie(dyjbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyie dyieVar = (dyie) obj;
            if (dbsd.a(this.a, dyieVar.a) && dbsd.a(this.b, dyieVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            dbsb b = dbsc.b(this);
            b.b("config", this.b);
            return b.toString();
        }
        dbsb b2 = dbsc.b(this);
        b2.b("error", this.a);
        return b2.toString();
    }
}
