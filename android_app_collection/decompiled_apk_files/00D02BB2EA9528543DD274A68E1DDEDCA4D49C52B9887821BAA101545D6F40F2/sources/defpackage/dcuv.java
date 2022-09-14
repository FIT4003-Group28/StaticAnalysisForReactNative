package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcuv  reason: default package */
/* loaded from: classes5.dex */
public final class dcuv implements Serializable {
    public final dcuu a;
    public final dcuu b;

    public dcuv() {
        this.a = new dcuu();
        this.b = new dcuu();
    }

    public dcuv(dcuu dcuuVar, dcuu dcuuVar2) {
        this.a = dcuuVar;
        this.b = dcuuVar2;
    }

    public static dcuv a() {
        return new dcuv(dcuu.a(), dcuu.a());
    }

    public final dcuv b(double d) {
        dcuw dcuwVar = new dcuw(d, d);
        dcuu h = this.a.h(dcuwVar.a);
        dcuu h2 = this.b.h(dcuwVar.b);
        if (h.d() || h2.d()) {
            return a();
        }
        return new dcuv(h, h2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcuv) {
            dcuv dcuvVar = (dcuv) obj;
            if (this.a.equals(dcuvVar.a) && this.b.equals(dcuvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 701) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(new dcuw(this.a.a, this.b.a));
        String valueOf2 = String.valueOf(new dcuw(this.a.b, this.b.b));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8 + String.valueOf(valueOf2).length());
        sb.append("[Lo");
        sb.append(valueOf);
        sb.append(", Hi");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public dcuv(dcuv dcuvVar) {
        this.a = new dcuu(dcuvVar.a);
        this.b = new dcuu(dcuvVar.b);
    }
}
