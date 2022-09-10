package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aslo  reason: default package */
/* loaded from: classes2.dex */
public final class aslo {
    public final amub a;
    public final int b;
    public final int c;

    public aslo(amub amubVar, int i, int i2) {
        this.a = amubVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aslo)) {
            return false;
        }
        aslo asloVar = (aslo) obj;
        return this.a == asloVar.a && this.b == asloVar.b && this.c == asloVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("routeDescription", this.a);
        b.f("startPoint", this.b);
        b.f("endPoint", this.c);
        return b.toString();
    }
}
