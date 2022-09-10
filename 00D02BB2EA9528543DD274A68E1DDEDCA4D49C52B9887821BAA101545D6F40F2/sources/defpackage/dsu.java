package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: dsu  reason: default package */
/* loaded from: classes6.dex */
final class dsu extends dsn {
    public final akqq a;
    public final akps b;
    public final long c;
    public final boolean d;
    public final dsm e;
    public final Bitmap f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final String j;
    private final dcdc<altv> k;

    public dsu(akqq akqqVar, akps akpsVar, long j, boolean z, dsm dsmVar, @dzsi Bitmap bitmap, Integer num, Integer num2, Integer num3, dcdc<altv> dcdcVar, String str) {
        if (akqqVar != null) {
            this.a = akqqVar;
            if (akpsVar != null) {
                this.b = akpsVar;
                this.c = j;
                this.d = z;
                if (dsmVar != null) {
                    this.e = dsmVar;
                    this.f = bitmap;
                    this.g = num;
                    this.h = num2;
                    this.i = num3;
                    if (dcdcVar != null) {
                        this.k = dcdcVar;
                        if (str != null) {
                            this.j = str;
                            return;
                        }
                        throw new NullPointerException("Null labelText");
                    }
                    throw new NullPointerException("Null indoorLevelReferences");
                }
                throw new NullPointerException("Null mapPinType");
            }
            throw new NullPointerException("Null pinType");
        }
        throw new NullPointerException("Null position");
    }

    @Override // defpackage.dsn
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.dsn
    public final akps b() {
        return this.b;
    }

    @Override // defpackage.dsn
    public final long c() {
        return this.c;
    }

    @Override // defpackage.dsn
    public final int d() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.dsn
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsn) {
            dsn dsnVar = (dsn) obj;
            if (this.a.equals(dsnVar.a()) && this.b.equals(dsnVar.b()) && this.c == dsnVar.c() && dsnVar.d() == Integer.MIN_VALUE && this.d == dsnVar.e() && this.e.equals(dsnVar.f()) && ((bitmap = this.f) != null ? bitmap.equals(dsnVar.g()) : dsnVar.g() == null) && this.g.equals(dsnVar.h()) && this.h.equals(dsnVar.i()) && this.i.equals(dsnVar.j()) && dchl.m(this.k, dsnVar.k()) && this.j.equals(dsnVar.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsn
    public final dsm f() {
        return this.e;
    }

    @Override // defpackage.dsn
    @dzsi
    public final Bitmap g() {
        return this.f;
    }

    @Override // defpackage.dsn
    public final Integer h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        int hashCode3 = (((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ Integer.MIN_VALUE) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003;
        Bitmap bitmap = this.f;
        return ((((((((((hashCode3 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.dsn
    public final Integer i() {
        return this.h;
    }

    @Override // defpackage.dsn
    public final Integer j() {
        return this.i;
    }

    @Override // defpackage.dsn
    public final dcdc<altv> k() {
        return this.k;
    }

    @Override // defpackage.dsn
    public final String l() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.k);
        String str = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 221 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + str.length());
        sb.append("ArMapPinState{position=");
        sb.append(valueOf);
        sb.append(", pinType=");
        sb.append(valueOf2);
        sb.append(", fprint=");
        sb.append(j);
        sb.append(", ordinal=");
        sb.append(Integer.MIN_VALUE);
        sb.append(", anchorAtBottom=");
        sb.append(z);
        sb.append(", mapPinType=");
        sb.append(valueOf3);
        sb.append(", icon=");
        sb.append(valueOf4);
        sb.append(", textNamedStyleId=");
        sb.append(valueOf5);
        sb.append(", iconNamedStyleId=");
        sb.append(valueOf6);
        sb.append(", layoutNamedStyleId=");
        sb.append(valueOf7);
        sb.append(", indoorLevelReferences=");
        sb.append(valueOf8);
        sb.append(", labelText=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
