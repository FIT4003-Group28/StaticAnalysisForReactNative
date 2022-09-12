package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bvlb  reason: default package */
/* loaded from: classes.dex */
final class bvlb extends bvls {
    private final Picture a;
    private final ggt b;
    private final Bitmap.Config c;
    private final int d;
    private final int e;

    public bvlb(Picture picture, ggt ggtVar, Bitmap.Config config, int i, int i2) {
        this.a = picture;
        this.b = ggtVar;
        this.c = config;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.bvls
    public final Picture a() {
        return this.a;
    }

    @Override // defpackage.bvls
    public final ggt b() {
        return this.b;
    }

    @Override // defpackage.bvls
    public final Bitmap.Config c() {
        return this.c;
    }

    @Override // defpackage.bvls
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bvls
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvls) {
            bvls bvlsVar = (bvls) obj;
            if (this.a.equals(bvlsVar.a()) && this.b.equals(bvlsVar.b()) && this.c.equals(bvlsVar.c()) && this.d == bvlsVar.d() && this.e == bvlsVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_switchStyle + length2 + String.valueOf(valueOf3).length());
        sb.append("BitmapKey{picture=");
        sb.append(valueOf);
        sb.append(", pictureBounds=");
        sb.append(valueOf2);
        sb.append(", bitmapConfig=");
        sb.append(valueOf3);
        sb.append(", bitmapWidth=");
        sb.append(i);
        sb.append(", bitmapHeight=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
