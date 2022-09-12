package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: boni  reason: default package */
/* loaded from: classes3.dex */
final class boni extends bonn {
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public boni(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.bonn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bonn
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bonn
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bonn
    public final int d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bonn) {
            bonn bonnVar = (bonn) obj;
            if (this.b == bonnVar.a() && this.c == bonnVar.b() && this.d == bonnVar.c() && this.e == bonnVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowMinWidthMinor);
        sb.append("BusinessHoursInterval{openingHour=");
        sb.append(i);
        sb.append(", openingMinute=");
        sb.append(i2);
        sb.append(", closingHour=");
        sb.append(i3);
        sb.append(", closingMinute=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
