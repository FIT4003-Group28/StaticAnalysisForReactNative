package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aoxc  reason: default package */
/* loaded from: classes2.dex */
final class aoxc extends aoxt {
    private final ilo a;
    private final bvrt<dqlg> b;
    private final bvrt<dqdw> c;
    private final int d;

    public aoxc(ilo iloVar, bvrt<dqlg> bvrtVar, bvrt<dqdw> bvrtVar2, int i) {
        this.a = iloVar;
        this.b = bvrtVar;
        this.c = bvrtVar2;
        if (i != 0) {
            this.d = i;
            return;
        }
        throw new NullPointerException("Null placeType");
    }

    @Override // defpackage.aoxt
    public final ilo a() {
        return this.a;
    }

    @Override // defpackage.aoxt
    public final bvrt<dqlg> b() {
        return this.b;
    }

    @Override // defpackage.aoxt
    public final bvrt<dqdw> c() {
        return this.c;
    }

    @Override // defpackage.aoxt
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoxt) {
            aoxt aoxtVar = (aoxt) obj;
            if (this.a.equals(aoxtVar.a()) && this.b.equals(aoxtVar.b()) && this.c.equals(aoxtVar.c()) && this.d == aoxtVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int i = this.d;
        aown.b(i);
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String a = aown.a(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + a.length());
        sb.append("VisitedPlaceDetails{placemark=");
        sb.append(valueOf);
        sb.append(", visitStatisticsSerializable=");
        sb.append(valueOf2);
        sb.append(", politicalAddressComponentsSerializable=");
        sb.append(valueOf3);
        sb.append(", placeType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
