package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: akpd  reason: default package */
/* loaded from: classes2.dex */
public final class akpd extends akpp {
    public final akqq a;
    public final akps b;
    public final Bitmap c;
    private final long e;
    private final int f;
    private final boolean g;
    private final Integer h;
    private final Integer i;
    private final dcdc<altv> j;
    private final int k;

    public akpd(akqq akqqVar, akps akpsVar, long j, int i, boolean z, int i2, @dzsi Bitmap bitmap, Integer num, Integer num2, dcdc<altv> dcdcVar) {
        this.a = akqqVar;
        if (akpsVar != null) {
            this.b = akpsVar;
            this.e = j;
            this.f = i;
            this.g = z;
            this.k = i2;
            this.c = bitmap;
            this.h = num;
            this.i = num2;
            if (dcdcVar != null) {
                this.j = dcdcVar;
                return;
            }
            throw new NullPointerException("Null indoorLevelReferences");
        }
        throw new NullPointerException("Null pinType");
    }

    @Override // defpackage.akpp
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.akpp
    public final akps b() {
        return this.b;
    }

    @Override // defpackage.akpp
    public final long c() {
        return this.e;
    }

    @Override // defpackage.akpp
    public final int d() {
        return this.f;
    }

    @Override // defpackage.akpp
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpp) {
            akpp akppVar = (akpp) obj;
            if (this.a.equals(akppVar.a()) && this.b.equals(akppVar.b()) && this.e == akppVar.c() && this.f == akppVar.d() && this.g == akppVar.e() && this.k == akppVar.j() && ((bitmap = this.c) != null ? bitmap.equals(akppVar.f()) : akppVar.f() == null) && this.h.equals(akppVar.g()) && this.i.equals(akppVar.h()) && dchl.m(this.j, akppVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akpp
    @dzsi
    public final Bitmap f() {
        return this.c;
    }

    @Override // defpackage.akpp
    public final Integer g() {
        return this.h;
    }

    @Override // defpackage.akpp
    public final Integer h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.e;
        int i = (((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.k) * 1000003;
        Bitmap bitmap = this.c;
        return ((((((i ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.akpp
    public final dcdc<altv> i() {
        return this.j;
    }

    @Override // defpackage.akpp
    public final int j() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.e;
        int i = this.f;
        boolean z = this.g;
        String str = this.k != 1 ? "PLACEMARK" : "LAYER_MARKERS";
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = str.length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 187 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("MapPinState{position=");
        sb.append(valueOf);
        sb.append(", pinType=");
        sb.append(valueOf2);
        sb.append(", fprint=");
        sb.append(j);
        sb.append(", ordinal=");
        sb.append(i);
        sb.append(", anchorAtBottom=");
        sb.append(z);
        sb.append(", drawOrder=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(valueOf3);
        sb.append(", iconNamedStyleId=");
        sb.append(valueOf4);
        sb.append(", layoutNamedStyleId=");
        sb.append(valueOf5);
        sb.append(", indoorLevelReferences=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
