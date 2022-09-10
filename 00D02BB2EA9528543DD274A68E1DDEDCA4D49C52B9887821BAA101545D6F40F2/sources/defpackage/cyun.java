package defpackage;

import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyun  reason: default package */
/* loaded from: classes5.dex */
final class cyun extends cyvv {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final PersonFieldMetadata e;
    private final int f;

    public cyun(String str, @dzsi String str2, @dzsi String str3, String str4, int i, PersonFieldMetadata personFieldMetadata) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.f = i;
        this.e = personFieldMetadata;
    }

    @Override // defpackage.cyvv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cyvv, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.e;
    }

    @Override // defpackage.cyvv
    @dzsi
    public final String c() {
        return this.b;
    }

    @Override // defpackage.cyvv
    @dzsi
    public final String d() {
        return this.c;
    }

    @Override // defpackage.cyvv
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyvv) {
            cyvv cyvvVar = (cyvv) obj;
            if (this.a.equals(cyvvVar.a()) && ((str = this.b) != null ? str.equals(cyvvVar.c()) : cyvvVar.c() == null) && ((str2 = this.c) != null ? str2.equals(cyvvVar.d()) : cyvvVar.d() == null) && this.d.equals(cyvvVar.e())) {
                int i = this.f;
                int f = cyvvVar.f();
                if (i == 0) {
                    throw null;
                }
                if (i == f && this.e.equals(cyvvVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyvv
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i2 = this.f;
        if (i2 != 0) {
            return ((hashCode3 ^ i2) * 1000003) ^ this.e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        String str3 = this.b;
        String str4 = this.c;
        String str5 = this.d;
        switch (this.f) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "DEVICE";
                break;
            case 3:
                str = "PEOPLE_API";
                break;
            case 4:
                str = "MERGED_CACHE";
                break;
            case 5:
                str = "TOP_N_PEOPLE";
                break;
            case 6:
                str = "TOP_N_TARGETS";
                break;
            case 7:
                str = "PEOPLE_CACHE";
                break;
            case 8:
                str = "GET_PEOPLE_BY_ID";
                break;
            default:
                str = "null";
                break;
        }
        String valueOf = String.valueOf(this.e);
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + length3 + length4 + str.length() + String.valueOf(valueOf).length());
        sb.append("InternalResultDisplayName{value=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", label=");
        sb.append(str5);
        sb.append(", source=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
