package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqn  reason: default package */
/* loaded from: classes4.dex */
public final class cdqn extends cdrt {
    public final String a;
    public final dbsg<String> b;
    public final dbsg<Locale> c;
    public final dbsg<String> d;
    public final boolean e;
    public final boolean f;

    public cdqn(String str, dbsg<String> dbsgVar, dbsg<Locale> dbsgVar2, dbsg<String> dbsgVar3, boolean z, boolean z2) {
        this.a = str;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.cdjl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cdjl
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cdjl
    public final dbsg<Locale> c() {
        return this.c;
    }

    @Override // defpackage.cdjl
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.cdjl
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdrt) {
            cdrt cdrtVar = (cdrt) obj;
            if (this.a.equals(cdrtVar.a()) && this.b.equals(cdrtVar.b()) && this.c.equals(cdrtVar.c()) && this.d.equals(cdrtVar.d()) && this.e == cdrtVar.e() && this.f == cdrtVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdjl
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.cdrt
    public final cdrs g() {
        return new cdqm(this);
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 146 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TactileReviewText{originalText=");
        sb.append(str);
        sb.append(", translatedText=");
        sb.append(valueOf);
        sb.append(", originalLocale=");
        sb.append(valueOf2);
        sb.append(", displayableLanguageName=");
        sb.append(valueOf3);
        sb.append(", showTranslatedTextFirst=");
        sb.append(z);
        sb.append(", showTranslation=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
