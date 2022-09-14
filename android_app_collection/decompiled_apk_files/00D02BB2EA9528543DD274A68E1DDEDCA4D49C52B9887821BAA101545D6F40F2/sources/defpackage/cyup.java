package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyup  reason: default package */
/* loaded from: classes5.dex */
final class cyup extends cyvy {
    private final cyfj a;
    private final String b;
    private final PersonFieldMetadata c;
    private final String d;
    private final Email.ExtendedData e;
    private final dcdc<Email.Certificate> f;
    private final cyxg g;
    private final String h;

    public cyup(cyfj cyfjVar, String str, PersonFieldMetadata personFieldMetadata, String str2, @dzsi Email.ExtendedData extendedData, dcdc<Email.Certificate> dcdcVar, cyxg cyxgVar, String str3) {
        this.a = cyfjVar;
        this.b = str;
        this.c = personFieldMetadata;
        this.d = str2;
        this.e = extendedData;
        this.f = dcdcVar;
        this.g = cyxgVar;
        this.h = str3;
    }

    @Override // defpackage.cyvy
    public final cyfj a() {
        return this.a;
    }

    @Override // defpackage.cyvy
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cyvy
    public final PersonFieldMetadata c() {
        return this.c;
    }

    @Override // defpackage.cyvy
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cyvy
    @dzsi
    public final Email.ExtendedData e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Email.ExtendedData extendedData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyvy) {
            cyvy cyvyVar = (cyvy) obj;
            if (this.a.equals(cyvyVar.a()) && this.b.equals(cyvyVar.b()) && this.c.equals(cyvyVar.c()) && this.d.equals(cyvyVar.d()) && ((extendedData = this.e) != null ? extendedData.equals(cyvyVar.e()) : cyvyVar.e() == null) && dchl.m(this.f, cyvyVar.f()) && this.g.equals(cyvyVar.g()) && this.h.equals(cyvyVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyvy
    public final dcdc<Email.Certificate> f() {
        return this.f;
    }

    @Override // defpackage.cyvy
    public final cyxg g() {
        return this.g;
    }

    @Override // defpackage.cyvy
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Email.ExtendedData extendedData = this.e;
        return ((((((hashCode ^ (extendedData == null ? 0 : extendedData.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String str3 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMajor + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str3).length());
        sb.append("LoaderField{fieldType=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", canonicalValue=");
        sb.append(str2);
        sb.append(", emailExtendedData=");
        sb.append(valueOf3);
        sb.append(", certificates=");
        sb.append(valueOf4);
        sb.append(", rankingFeatureSet=");
        sb.append(valueOf5);
        sb.append(", key=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
