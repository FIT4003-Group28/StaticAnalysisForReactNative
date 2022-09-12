package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: akqp  reason: default package */
/* loaded from: classes.dex */
public final class akqp implements Serializable {
    public final int a;
    public final int b;
    public final int c;

    public akqp(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }

    public akqp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public akqp(akra akraVar) {
        this.a = akraVar.a;
        this.b = akraVar.b;
        this.c = akraVar.c;
    }

    public final akra a() {
        return new akra(this.a, this.b, this.c);
    }

    public final akra b() {
        return new akra(this.a, this.b, 0);
    }

    public final double c() {
        return akra.l(this.b);
    }

    public final double d() {
        return akra.p(this.a);
    }

    public final akqq e() {
        return new akqq(c(), d());
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof akqp) {
            akqp akqpVar = (akqp) obj;
            if (this.a == akqpVar.a && this.b == akqpVar.b && this.c == akqpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(53);
        sb.append("ImmutablePoint{(");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(")}");
        return sb.toString();
    }
}
