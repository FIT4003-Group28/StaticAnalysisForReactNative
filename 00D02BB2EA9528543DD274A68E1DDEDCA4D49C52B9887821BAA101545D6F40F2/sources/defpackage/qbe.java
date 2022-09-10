package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: qbe  reason: default package */
/* loaded from: classes7.dex */
final class qbe extends qea {
    private final akqq b;
    private final double c;
    private final dbsg<djqr> d;
    private final dbsg<djqt> e;
    private final dvzd f;

    public qbe(akqq akqqVar, double d, dbsg<djqr> dbsgVar, dbsg<djqt> dbsgVar2, dvzd dvzdVar) {
        this.b = akqqVar;
        this.c = d;
        this.d = dbsgVar;
        this.e = dbsgVar2;
        this.f = dvzdVar;
    }

    @Override // defpackage.qea
    public final akqq a() {
        return this.b;
    }

    @Override // defpackage.qea
    public final double b() {
        return this.c;
    }

    @Override // defpackage.qea
    public final dbsg<djqr> c() {
        return this.d;
    }

    @Override // defpackage.qea
    public final dbsg<djqt> d() {
        return this.e;
    }

    @Override // defpackage.qea
    public final dvzd e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qea) {
            qea qeaVar = (qea) obj;
            if (this.b.equals(qeaVar.a()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(qeaVar.b()) && this.d.equals(qeaVar.c()) && this.e.equals(qeaVar.d()) && this.f.equals(qeaVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        dvzd dvzdVar = this.f;
        int i = dvzdVar.bC;
        if (i == 0) {
            i = dsst.a.b(dvzdVar).c(dvzdVar);
            dvzdVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        double d = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_viewInflaterClass + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("Request{latLng=");
        sb.append(valueOf);
        sb.append(", radiusMeters=");
        sb.append(d);
        sb.append(", rankingStrategy=");
        sb.append(valueOf2);
        sb.append(", transitLineFilter=");
        sb.append(valueOf3);
        sb.append(", transitStationParams=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
