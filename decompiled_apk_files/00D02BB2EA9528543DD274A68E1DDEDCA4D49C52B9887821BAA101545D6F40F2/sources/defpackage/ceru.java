package defpackage;
/* compiled from: PG */
/* renamed from: ceru  reason: default package */
/* loaded from: classes4.dex */
public final class ceru extends cerx {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final drds d;
    public final axok e;
    public final bvrt<drfs> f;
    public final dpyv g;
    public final int h;
    private final bvrt<dhtc> i;

    public ceru(int i, @dzsi String str, boolean z, boolean z2, @dzsi drds drdsVar, @dzsi axok axokVar, @dzsi bvrt<dhtc> bvrtVar, @dzsi bvrt<drfs> bvrtVar2, @dzsi dpyv dpyvVar) {
        this.h = i;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = drdsVar;
        this.e = axokVar;
        this.i = bvrtVar;
        this.f = bvrtVar2;
        this.g = dpyvVar;
    }

    @Override // defpackage.cerx
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cerx
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cerx
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.cerx
    @dzsi
    public final drds d() {
        return this.d;
    }

    @Override // defpackage.cerx
    @dzsi
    public final axok e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        drds drdsVar;
        axok axokVar;
        bvrt<dhtc> bvrtVar;
        bvrt<drfs> bvrtVar2;
        dpyv dpyvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cerx) {
            cerx cerxVar = (cerx) obj;
            if (this.h == cerxVar.i() && ((str = this.a) != null ? str.equals(cerxVar.a()) : cerxVar.a() == null) && this.b == cerxVar.b() && this.c == cerxVar.c() && ((drdsVar = this.d) != null ? drdsVar.equals(cerxVar.d()) : cerxVar.d() == null) && ((axokVar = this.e) != null ? axokVar.equals(cerxVar.e()) : cerxVar.e() == null) && ((bvrtVar = this.i) != null ? bvrtVar.equals(cerxVar.f()) : cerxVar.f() == null) && ((bvrtVar2 = this.f) != null ? bvrtVar2.equals(cerxVar.g()) : cerxVar.g() == null) && ((dpyvVar = this.g) != null ? dpyvVar.equals(cerxVar.h()) : cerxVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cerx
    @dzsi
    public final bvrt<dhtc> f() {
        return this.i;
    }

    @Override // defpackage.cerx
    @dzsi
    public final bvrt<drfs> g() {
        return this.f;
    }

    @Override // defpackage.cerx
    @dzsi
    public final dpyv h() {
        return this.g;
    }

    public final int hashCode() {
        int i = (this.h ^ 1000003) * 1000003;
        String str = this.a;
        int i2 = 0;
        int i3 = 1237;
        int hashCode = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i3 = 1231;
        }
        int i4 = (hashCode ^ i3) * 1000003;
        drds drdsVar = this.d;
        int hashCode2 = (i4 ^ (drdsVar == null ? 0 : drdsVar.hashCode())) * 1000003;
        axok axokVar = this.e;
        int hashCode3 = (hashCode2 ^ (axokVar == null ? 0 : axokVar.hashCode())) * 1000003;
        bvrt<dhtc> bvrtVar = this.i;
        int hashCode4 = (hashCode3 ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003;
        bvrt<drfs> bvrtVar2 = this.f;
        int hashCode5 = (hashCode4 ^ (bvrtVar2 == null ? 0 : bvrtVar2.hashCode())) * 1000003;
        dpyv dpyvVar = this.g;
        if (dpyvVar != null) {
            i2 = dpyvVar.hashCode();
        }
        return hashCode5 ^ i2;
    }

    @Override // defpackage.cerx
    public final int i() {
        return this.h;
    }

    public final String toString() {
        int i = this.h;
        String str = i != 1 ? i != 2 ? i != 3 ? "FOLLOW_LIST" : "EDIT" : "LEAF" : "MAIN";
        String str2 = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 230 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SerializableShowProfileOptions{pageType=");
        sb.append(str);
        sb.append(", obfuscatedGaiaId=");
        sb.append(str2);
        sb.append(", isPublicView=");
        sb.append(z);
        sb.append(", preloadProfileMainPage=");
        sb.append(z2);
        sb.append(", leafPageType=");
        sb.append(valueOf);
        sb.append(", followListType=");
        sb.append(valueOf2);
        sb.append(", serializedCreatorProfileInfo=");
        sb.append(valueOf3);
        sb.append(", serializedTopicFilterSpec=");
        sb.append(valueOf4);
        sb.append(", entryPointNotificationType=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
