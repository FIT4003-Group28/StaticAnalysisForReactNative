package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akrn  reason: default package */
/* loaded from: classes2.dex */
public final class akrn implements Comparable<akrn> {
    public final akra a;
    public final double b;
    public final double c;
    public final int d;

    public akrn(akra akraVar, double d, double d2, int i) {
        this.a = akraVar;
        this.b = d;
        this.c = d2;
        this.d = i;
    }

    public final double a() {
        return this.c / this.a.r();
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(akrn akrnVar) {
        return Double.compare(this.c, akrnVar.c);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof akrn)) {
            return false;
        }
        akrn akrnVar = (akrn) obj;
        return dbsd.a(this.a, akrnVar.a) && this.b == akrnVar.b && this.c == akrnVar.c && this.d == akrnVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("position", this.a);
        b.d("bearing", this.b);
        b.d("distanceWorldUnits", this.c);
        b.f("index", this.d);
        b.f("hash", hashCode());
        return b.toString();
    }
}
