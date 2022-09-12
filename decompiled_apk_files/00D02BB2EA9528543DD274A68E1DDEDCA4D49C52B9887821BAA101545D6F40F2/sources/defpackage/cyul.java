package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyul  reason: default package */
/* loaded from: classes5.dex */
public final class cyul extends cyvi {
    public final cyfj a;
    public final String b;
    public final String c;
    public final PersonFieldMetadata d;
    public final String e;
    public final Email.ExtendedData f;
    public final dcdc<Email.Certificate> g;

    public cyul(cyfj cyfjVar, @dzsi String str, String str2, PersonFieldMetadata personFieldMetadata, @dzsi String str3, @dzsi Email.ExtendedData extendedData, dcdc<Email.Certificate> dcdcVar) {
        this.a = cyfjVar;
        this.b = str;
        this.c = str2;
        this.d = personFieldMetadata;
        this.e = str3;
        this.f = extendedData;
        this.g = dcdcVar;
    }

    @Override // defpackage.cyvi
    public final cyfj a() {
        return this.a;
    }

    @Override // defpackage.cyvi, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.d;
    }

    @Override // defpackage.cyvi
    @dzsi
    public final String c() {
        return this.b;
    }

    @Override // defpackage.cyvi
    public final String d() {
        return this.c;
    }

    @Override // defpackage.cyvi
    @dzsi
    public final Email.ExtendedData e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Email.ExtendedData extendedData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyvi) {
            cyvi cyviVar = (cyvi) obj;
            if (this.a.equals(cyviVar.a()) && ((str = this.b) != null ? str.equals(cyviVar.c()) : cyviVar.c() == null) && this.c.equals(cyviVar.d()) && this.d.equals(cyviVar.b()) && ((str2 = this.e) != null ? str2.equals(cyviVar.k()) : cyviVar.k() == null) && ((extendedData = this.f) != null ? extendedData.equals(cyviVar.e()) : cyviVar.e() == null) && dchl.m(this.g, cyviVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyvi
    public final dcdc<Email.Certificate> f() {
        return this.g;
    }

    @Override // defpackage.cyvi
    public final cyvh g() {
        return new cyuk(this);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Email.ExtendedData extendedData = this.f;
        if (extendedData != null) {
            i = extendedData.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.cyvi, defpackage.cyff
    @dzsi
    public final String k() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Field{fieldType=");
        sb.append(valueOf);
        sb.append(", canonicalValue=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", key=");
        sb.append(str3);
        sb.append(", emailExtendedData=");
        sb.append(valueOf3);
        sb.append(", certificates=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
