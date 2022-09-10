package defpackage;

import android.graphics.Rect;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: kxh  reason: default package */
/* loaded from: classes7.dex */
final class kxh extends kxk {
    public final dcdc<Rect> a;
    public final alae b;
    public final Rect c;
    public final Rect d;
    public final dcdc<amkz> e;

    public kxh(dcdc<Rect> dcdcVar, alae alaeVar, Rect rect, Rect rect2, dcdc<amkz> dcdcVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = alaeVar;
            this.c = rect;
            this.d = rect2;
            if (dcdcVar2 != null) {
                this.e = dcdcVar2;
                return;
            }
            throw new NullPointerException("Null obscuringAABBs");
        }
        throw new NullPointerException("Null mapVisibleRects");
    }

    @Override // defpackage.kxk
    public final dcdc<Rect> a() {
        return this.a;
    }

    @Override // defpackage.kxk
    public final alae b() {
        return this.b;
    }

    @Override // defpackage.kxk
    public final Rect c() {
        return this.c;
    }

    @Override // defpackage.kxk
    public final Rect d() {
        return this.d;
    }

    @Override // defpackage.kxk
    public final dcdc<amkz> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxk) {
            kxk kxkVar = (kxk) obj;
            if (dchl.m(this.a, kxkVar.a()) && this.b.equals(kxkVar.b()) && this.c.equals(kxkVar.c()) && this.d.equals(kxkVar.d()) && dchl.m(this.e, kxkVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedWidthMajor + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("MapViewport{mapVisibleRects=");
        sb.append(valueOf);
        sb.append(", lookAhead=");
        sb.append(valueOf2);
        sb.append(", paddedObscuredMapVisibleRect=");
        sb.append(valueOf3);
        sb.append(", unpaddedObscuredMapVisibleRect=");
        sb.append(valueOf4);
        sb.append(", obscuringAABBs=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
