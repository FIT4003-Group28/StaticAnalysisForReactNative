package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: ijv  reason: default package */
/* loaded from: classes6.dex */
final class ijv extends ikp {
    public final int a;
    public final int b;
    public final Paint c;

    public ijv(int i, int i2, Paint paint) {
        this.a = i;
        this.b = i2;
        this.c = paint;
    }

    @Override // defpackage.ikp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ikp
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ikp
    public final Paint c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikp) {
            ikp ikpVar = (ikp) obj;
            if (this.a == ikpVar.a() && this.b == ikpVar.b() && this.c.equals(ikpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
        sb.append("RippleConstants{radiusUnpressed=");
        sb.append(i);
        sb.append(", radiusPressed=");
        sb.append(i2);
        sb.append(", paint=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
