package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfkc  reason: default package */
/* loaded from: classes3.dex */
public final class bfkc extends bfke {
    public final ddho a;
    public final ddho b;
    public final ddho c;
    public final ddho d;
    public final ddho e;
    public final boolean f;

    public bfkc(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5, boolean z) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
        this.e = ddhoVar5;
        this.f = z;
    }

    @Override // defpackage.bfke
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.bfke
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.bfke
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.bfke
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.bfke
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfke) {
            bfke bfkeVar = (bfke) obj;
            if (this.a.equals(bfkeVar.a()) && this.b.equals(bfkeVar.b()) && this.c.equals(bfkeVar.c()) && this.d.equals(bfkeVar.d()) && this.e.equals(bfkeVar.e()) && this.f == bfkeVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bfke
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bfke
    public final bfkd g() {
        return new bfkb(this);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMajor + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("HeroImageCarouselVeConfig{photoCarouselVe=");
        sb.append(valueOf);
        sb.append(", photoVe=");
        sb.append(valueOf2);
        sb.append(", addAPhotoVe=");
        sb.append(valueOf3);
        sb.append(", morePhotosVe=");
        sb.append(valueOf4);
        sb.append(", panoPhotoVe=");
        sb.append(valueOf5);
        sb.append(", allowPanoPhotoVe=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
