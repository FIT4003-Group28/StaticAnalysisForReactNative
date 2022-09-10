package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdae  reason: default package */
/* loaded from: classes4.dex */
public final class cdae extends cdfa {
    public final int a;
    public final ilo b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final List<bvrt<dwfl>> g;
    public final int h;
    public final int i;

    public cdae(int i, ilo iloVar, int i2, int i3, boolean z, boolean z2, boolean z3, String str, List<bvrt<dwfl>> list) {
        this.a = i;
        this.b = iloVar;
        this.i = i2;
        this.h = i3;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = list;
    }

    @Override // defpackage.cdfa
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cdfa
    public final ilo b() {
        return this.b;
    }

    @Override // defpackage.cdfa
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.cdfa
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cdfa
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdfa) {
            cdfa cdfaVar = (cdfa) obj;
            if (this.a == cdfaVar.a() && this.b.equals(cdfaVar.b())) {
                int i = this.i;
                int j = cdfaVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j) {
                    int i2 = this.h;
                    int i3 = cdfaVar.i();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == i3 && this.c == cdfaVar.c() && this.d == cdfaVar.d() && this.e == cdfaVar.e() && this.f.equals(cdfaVar.f()) && this.g.equals(cdfaVar.g())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cdfa
    public final String f() {
        return this.f;
    }

    @Override // defpackage.cdfa
    public final List<bvrt<dwfl>> g() {
        return this.g;
    }

    @Override // defpackage.cdfa
    public final cdez h() {
        return new cdad(this);
    }

    public final int hashCode() {
        int hashCode = (((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.i;
        if (i != 0) {
            int i2 = (hashCode ^ i) * 1000003;
            int i3 = this.h;
            if (i3 == 0) {
                throw null;
            }
            int i4 = 1237;
            int i5 = (((((i2 ^ i3) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
            if (true == this.e) {
                i4 = 1231;
            }
            return ((((i5 ^ i4) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        }
        throw null;
    }

    @Override // defpackage.cdfa
    public final int i() {
        return this.h;
    }

    @Override // defpackage.cdfa
    public final int j() {
        return this.i;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        int i2 = this.i;
        String str = "null";
        String valueOf2 = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : str);
        int i3 = this.h;
        if (i3 == 1) {
            str = "VISIBLE";
        } else if (i3 == 2) {
            str = "SKIPPED";
        } else if (i3 == 3) {
            str = "POSTED";
        }
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        String str2 = this.f;
        String valueOf3 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 181 + length2 + str.length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length());
        sb.append("TodoPhotoPlaceModel{placeIndex=");
        sb.append(i);
        sb.append(", placemark=");
        sb.append(valueOf);
        sb.append(", entryType=");
        sb.append(valueOf2);
        sb.append(", placeCardStatus=");
        sb.append(str);
        sb.append(", ugcPhotoMissing=");
        sb.append(z);
        sb.append(", onDevicePhotos=");
        sb.append(z2);
        sb.append(", forceExpanded=");
        sb.append(z3);
        sb.append(", placeVed=");
        sb.append(str2);
        sb.append(", serializedPhotos=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
