package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: ijx  reason: default package */
/* loaded from: classes6.dex */
final class ijx extends iks {
    public final int a;
    public final Paint b;
    public final Paint c;

    public ijx(int i, Paint paint, Paint paint2) {
        this.a = i;
        this.b = paint;
        this.c = paint2;
    }

    @Override // defpackage.iks
    public final int a() {
        return this.a;
    }

    @Override // defpackage.iks
    public final Paint b() {
        return this.b;
    }

    @Override // defpackage.iks
    public final Paint c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iks) {
            iks iksVar = (iks) obj;
            if (this.a == iksVar.a() && this.b.equals(iksVar.b()) && this.c.equals(iksVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
        sb.append("TrackConstants{height=");
        sb.append(i);
        sb.append(", unselectedPaint=");
        sb.append(valueOf);
        sb.append(", selectedPaint=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
