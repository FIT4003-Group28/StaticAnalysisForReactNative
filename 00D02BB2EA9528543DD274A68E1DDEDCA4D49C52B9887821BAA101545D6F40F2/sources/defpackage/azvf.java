package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azvf  reason: default package */
/* loaded from: classes3.dex */
public final class azvf extends azwv {
    public final akqi a;
    public final akra b;
    public final akqq c;
    public final String d;
    public final String e;
    public final boolean f;
    public final dndr g;
    public final Long h;
    public final List<azvo> i;
    public final int j;
    public final String k;
    public final decq l;
    public final azws m;
    public final dcep<azwu> n;

    public azvf(akqi akqiVar, akra akraVar, akqq akqqVar, String str, @dzsi String str2, boolean z, @dzsi dndr dndrVar, @dzsi Long l, @dzsi List<azvo> list, int i, @dzsi String str3, @dzsi decq decqVar, @dzsi azws azwsVar, dcep<azwu> dcepVar) {
        this.a = akqiVar;
        this.b = akraVar;
        this.c = akqqVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = dndrVar;
        this.h = l;
        this.i = list;
        this.j = i;
        this.k = str3;
        this.l = decqVar;
        this.m = azwsVar;
        this.n = dcepVar;
    }

    @Override // defpackage.azwv
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.azwv
    public final akra b() {
        return this.b;
    }

    @Override // defpackage.azwv
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.azwv
    public final String d() {
        return this.d;
    }

    @Override // defpackage.azwv
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dndr dndrVar;
        Long l;
        List<azvo> list;
        String str2;
        decq decqVar;
        azws azwsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azwv) {
            azwv azwvVar = (azwv) obj;
            if (this.a.equals(azwvVar.a()) && this.b.equals(azwvVar.b()) && this.c.equals(azwvVar.c()) && this.d.equals(azwvVar.d()) && ((str = this.e) != null ? str.equals(azwvVar.e()) : azwvVar.e() == null) && this.f == azwvVar.f() && ((dndrVar = this.g) != null ? dndrVar.equals(azwvVar.g()) : azwvVar.g() == null) && ((l = this.h) != null ? l.equals(azwvVar.h()) : azwvVar.h() == null) && ((list = this.i) != null ? list.equals(azwvVar.i()) : azwvVar.i() == null) && this.j == azwvVar.j() && ((str2 = this.k) != null ? str2.equals(azwvVar.k()) : azwvVar.k() == null) && ((decqVar = this.l) != null ? decqVar.equals(azwvVar.l()) : azwvVar.l() == null) && ((azwsVar = this.m) != null ? azwsVar.equals(azwvVar.m()) : azwvVar.m() == null) && this.n.equals(azwvVar.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azwv
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.azwv
    @dzsi
    public final dndr g() {
        return this.g;
    }

    @Override // defpackage.azwv
    @dzsi
    public final Long h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        dndr dndrVar = this.g;
        int hashCode3 = (hashCode2 ^ (dndrVar == null ? 0 : dndrVar.hashCode())) * 1000003;
        Long l = this.h;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        List<azvo> list = this.i;
        int hashCode5 = (((hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.j) * 1000003;
        String str2 = this.k;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        decq decqVar = this.l;
        int i2 = (hashCode6 ^ (decqVar == null ? 0 : decqVar.b)) * 1000003;
        azws azwsVar = this.m;
        if (azwsVar != null) {
            i = azwsVar.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.azwv
    @dzsi
    public final List<azvo> i() {
        return this.i;
    }

    @Override // defpackage.azwv
    public final int j() {
        return this.j;
    }

    @Override // defpackage.azwv
    @dzsi
    public final String k() {
        return this.k;
    }

    @Override // defpackage.azwv
    @dzsi
    public final decq l() {
        return this.l;
    }

    @Override // defpackage.azwv
    @dzsi
    public final azws m() {
        return this.m;
    }

    @Override // defpackage.azwv
    public final dcep<azwu> n() {
        return this.n;
    }

    @Override // defpackage.azwv
    public final azwq o() {
        return new azve(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        boolean z = this.f;
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int i = this.j;
        String str3 = this.k;
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        String valueOf9 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(str3).length();
        int length10 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("PersonalPlace{featureId=");
        sb.append(valueOf);
        sb.append(", location=");
        sb.append(valueOf2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", name=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", star=");
        sb.append(z);
        sb.append(", aliasType=");
        sb.append(valueOf4);
        sb.append(", aliasSubId=");
        sb.append(valueOf5);
        sb.append(", contactAddresses=");
        sb.append(valueOf6);
        sb.append(", minZoomLevel=");
        sb.append(i);
        sb.append(", nickname=");
        sb.append(str3);
        sb.append(", stickerId=");
        sb.append(valueOf7);
        sb.append(", experienceMetadata=");
        sb.append(valueOf8);
        sb.append(", placeListMetadataSet=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
