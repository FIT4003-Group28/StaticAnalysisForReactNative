package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: hqa  reason: default package */
/* loaded from: classes3.dex */
public final class hqa {
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public hqa() {
    }

    public hqa(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqa) {
            hqa hqaVar = (hqa) obj;
            if (this.a.equals(hqaVar.a) && this.b == hqaVar.b && this.c == hqaVar.c && this.d == hqaVar.d && this.e == hqaVar.e && this.f == hqaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 177);
        sb.append("CutThumbnailIntoCircleWithBorderParameter{bitmap=");
        sb.append(valueOf);
        sb.append(", targetWidth=");
        sb.append(i);
        sb.append(", targetHeight=");
        sb.append(i2);
        sb.append(", cornerRadius=");
        sb.append(i3);
        sb.append(", borderWidth=");
        sb.append(i4);
        sb.append(", borderColor=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
