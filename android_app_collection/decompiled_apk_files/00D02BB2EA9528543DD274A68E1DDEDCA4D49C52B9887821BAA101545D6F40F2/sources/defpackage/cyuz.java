package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cyuz  reason: default package */
/* loaded from: classes5.dex */
final class cyuz extends cyxj {
    private final cyxh a;
    private final double b;
    private final double c;

    public cyuz(cyxh cyxhVar, double d, double d2) {
        this.a = cyxhVar;
        this.b = d;
        this.c = d2;
    }

    @Override // defpackage.cyxj
    public final cyxh a() {
        return this.a;
    }

    @Override // defpackage.cyxj
    public final double b() {
        return this.b;
    }

    @Override // defpackage.cyxj
    public final double c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyxj) {
            cyxj cyxjVar = (cyxj) obj;
            if (this.a.equals(cyxjVar.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(cyxjVar.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(cyxjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        double d = this.b;
        double d2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_switchStyle);
        sb.append("RankingScoringParam{featureType=");
        sb.append(valueOf);
        sb.append(", weight=");
        sb.append(d);
        sb.append(", exponent=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
