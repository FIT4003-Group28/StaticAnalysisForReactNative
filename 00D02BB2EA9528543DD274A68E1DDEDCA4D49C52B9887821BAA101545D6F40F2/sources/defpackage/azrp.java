package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azrp  reason: default package */
/* loaded from: classes3.dex */
public final class azrp extends azrv {
    public final dndr a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final ddho e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final akqq k;
    public final byte[] l;
    public final anee m;
    public final boolean n;

    public azrp(dndr dndrVar, String str, boolean z, boolean z2, @dzsi ddho ddhoVar, @dzsi String str2, boolean z3, boolean z4, boolean z5, boolean z6, @dzsi akqq akqqVar, @dzsi byte[] bArr, @dzsi anee aneeVar, boolean z7) {
        this.a = dndrVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = ddhoVar;
        this.f = str2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = akqqVar;
        this.l = bArr;
        this.m = aneeVar;
        this.n = z7;
    }

    @Override // defpackage.azrv
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.azrv
    public final String b() {
        return this.b;
    }

    @Override // defpackage.azrv
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.azrv
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.azrv
    @dzsi
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddho ddhoVar;
        String str;
        akqq akqqVar;
        anee aneeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azrv) {
            azrv azrvVar = (azrv) obj;
            if (this.a.equals(azrvVar.a()) && this.b.equals(azrvVar.b()) && this.c == azrvVar.c() && this.d == azrvVar.d() && ((ddhoVar = this.e) != null ? ddhoVar.equals(azrvVar.e()) : azrvVar.e() == null) && ((str = this.f) != null ? str.equals(azrvVar.f()) : azrvVar.f() == null) && this.g == azrvVar.g() && this.h == azrvVar.h() && this.i == azrvVar.i() && this.j == azrvVar.j() && ((akqqVar = this.k) != null ? akqqVar.equals(azrvVar.k()) : azrvVar.k() == null)) {
                if (Arrays.equals(this.l, azrvVar instanceof azrp ? ((azrp) azrvVar).l : azrvVar.l()) && ((aneeVar = this.m) != null ? aneeVar.equals(azrvVar.m()) : azrvVar.m() == null) && this.n == azrvVar.n()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.azrv
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.azrv
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.azrv
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        ddho ddhoVar = this.e;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (ddhoVar == null ? 0 : ddhoVar.hashCode())) * 1000003;
        String str = this.f;
        int hashCode3 = (((((((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003;
        akqq akqqVar = this.k;
        int hashCode4 = (((hashCode3 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003) ^ Arrays.hashCode(this.l)) * 1000003;
        anee aneeVar = this.m;
        if (aneeVar != null) {
            i2 = aneeVar.hashCode();
        }
        int i3 = (hashCode4 ^ i2) * 1000003;
        if (true == this.n) {
            i = 1231;
        }
        return i3 ^ i;
    }

    @Override // defpackage.azrv
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.azrv
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.azrv
    @dzsi
    public final akqq k() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azrv
    @dzsi
    public final byte[] l() {
        return this.l;
    }

    @Override // defpackage.azrv
    @dzsi
    public final anee m() {
        return this.m;
    }

    @Override // defpackage.azrv
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.azrv
    public final azru o() {
        return new azro(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String str2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        boolean z6 = this.j;
        String valueOf3 = String.valueOf(this.k);
        String arrays = Arrays.toString(this.l);
        String valueOf4 = String.valueOf(this.m);
        boolean z7 = this.n;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 364 + length2 + length3 + length4 + length5 + String.valueOf(arrays).length() + String.valueOf(valueOf4).length());
        sb.append("EditAliasCombinedFragmentParameters{aliasType=");
        sb.append(valueOf);
        sb.append(", initialQuery=");
        sb.append(str);
        sb.append(", initialQueryIsLatLng=");
        sb.append(z);
        sb.append(", forceLoadMapPointPickerOnStart=");
        sb.append(z2);
        sb.append(", veType=");
        sb.append(valueOf2);
        sb.append(", aliasEditToken=");
        sb.append(str2);
        sb.append(", openPlaceSheet=");
        sb.append(z3);
        sb.append(", popBackStack=");
        sb.append(z4);
        sb.append(", fromMapPointPicker=");
        sb.append(z5);
        sb.append(", prepopulateWithStpResults=");
        sb.append(z6);
        sb.append(", viewportCenterOverride=");
        sb.append(valueOf3);
        sb.append(", aliasFlowDataBytes=");
        sb.append(arrays);
        sb.append(", mapPointPickerArguments=");
        sb.append(valueOf4);
        sb.append(", shouldUseMapPointPickerHeader=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
