package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amsx  reason: default package */
/* loaded from: classes2.dex */
public final class amsx {
    public final double a;
    public final dbsg<Double> b;

    public amsx(amsw amswVar) {
        this.a = amswVar.a;
        this.b = amswVar.b;
    }

    public static amsw a(double d) {
        return new amsw(d);
    }

    public final boolean b() {
        return this.b.a();
    }

    public final double c() {
        dbsk.l(b());
        return this.b.b().doubleValue();
    }

    public final double d() {
        return b() ? this.b.b().doubleValue() : this.a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amsx)) {
            return false;
        }
        amsx amsxVar = (amsx) obj;
        return dbsd.a(this.b, amsxVar.b) && Double.compare(this.a, amsxVar.a) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), this.b});
    }

    public final String toString() {
        dbsb c = dbsc.c(amsx.class);
        c.d("typicalEtaSeconds", this.a);
        c.b("etaWithTrafficSeconds", this.b);
        return c.toString();
    }
}
