package defpackage;
/* compiled from: PG */
/* renamed from: bdhc  reason: default package */
/* loaded from: classes3.dex */
final class bdhc extends bdhg {
    private final String a;
    private final String b;
    private final String c;
    private final dwyd d;
    private final String e;
    private final String f;
    private final String g;
    private final dcdc<bbtm> h;
    private final bdhf i;
    private final int j;

    public bdhc(String str, @dzsi String str2, @dzsi String str3, dwyd dwydVar, String str4, String str5, @dzsi String str6, int i, dcdc<bbtm> dcdcVar, bdhf bdhfVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dwydVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.j = i;
        this.h = dcdcVar;
        this.i = bdhfVar;
    }

    @Override // defpackage.bdhg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bdhg
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bdhg
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bdhg
    public final dwyd d() {
        return this.d;
    }

    @Override // defpackage.bdhg
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhg) {
            bdhg bdhgVar = (bdhg) obj;
            if (this.a.equals(bdhgVar.a()) && ((str = this.b) != null ? str.equals(bdhgVar.b()) : bdhgVar.b() == null) && ((str2 = this.c) != null ? str2.equals(bdhgVar.c()) : bdhgVar.c() == null) && this.d.equals(bdhgVar.d()) && this.e.equals(bdhgVar.e()) && this.f.equals(bdhgVar.f()) && ((str3 = this.g) != null ? str3.equals(bdhgVar.g()) : bdhgVar.g() == null)) {
                int i = this.j;
                int j = bdhgVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j && dchl.m(this.h, bdhgVar.h()) && this.i.equals(bdhgVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bdhg
    public final String f() {
        return this.f;
    }

    @Override // defpackage.bdhg
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // defpackage.bdhg
    public final dcdc<bbtm> h() {
        return this.h;
    }

    @Override // defpackage.bdhg
    public final bdhf i() {
        return this.i;
    }

    @Override // defpackage.bdhg
    public final int j() {
        return this.j;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        int i = this.j;
        String str7 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SELECT_PHOTO" : "UPLOAD_TO_PLACEMARK" : "UPLOAD_TO_EXPERIENCE" : "DISABLED";
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + length4 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + str7.length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PhotoPickerOption{fid=");
        sb.append(str);
        sb.append(", mid=");
        sb.append(str2);
        sb.append(", listId=");
        sb.append(str3);
        sb.append(", entryPoint=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", subtitle=");
        sb.append(str5);
        sb.append(", photoListDescription=");
        sb.append(str6);
        sb.append(", localUploadBehavior=");
        sb.append(str7);
        sb.append(", preselectedPhotos=");
        sb.append(valueOf2);
        sb.append(", selectionMode=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 ^ i) * 1000003;
        int i3 = this.j;
        if (i3 != 0) {
            return ((((i2 ^ i3) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        }
        throw null;
    }
}
