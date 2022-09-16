package defpackage;

import android.graphics.Paint;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ijw  reason: default package */
/* loaded from: classes6.dex */
final class ijw extends ikq {
    public final int a;
    public final int b;
    public final int c;
    public final Paint d;

    public ijw(int i, int i2, int i3, Paint paint) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = paint;
    }

    @Override // defpackage.ikq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ikq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ikq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ikq
    public final Paint d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikq) {
            ikq ikqVar = (ikq) obj;
            if (this.a == ikqVar.a() && this.b == ikqVar.b() && this.c == ikqVar.c() && this.d.equals(ikqVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_switchStyle);
        sb.append("ThumbConstants{hitRadius=");
        sb.append(i);
        sb.append(", radiusUnpressed=");
        sb.append(i2);
        sb.append(", radiusPressed=");
        sb.append(i3);
        sb.append(", paint=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
