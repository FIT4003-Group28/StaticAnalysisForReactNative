package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ctkz  reason: default package */
/* loaded from: classes5.dex */
final class ctkz extends ctlp {
    private final Uri a;
    private final dcdc<String> b;
    private final String c;
    private final dcdc<String> d;
    private final String e;
    private final int f;
    private final int g;
    private final dbsl<?> h;

    public ctkz(Uri uri, dcdc<String> dcdcVar, String str, dcdc<String> dcdcVar2, String str2, int i, int i2, dbsl<?> dbslVar) {
        this.a = uri;
        this.b = dcdcVar;
        this.c = str;
        this.d = dcdcVar2;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = dbslVar;
    }

    @Override // defpackage.ctlp
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ctlp
    public final dcdc<String> b() {
        return this.b;
    }

    @Override // defpackage.ctlp
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ctlp
    public final dcdc<String> d() {
        return this.d;
    }

    @Override // defpackage.ctlp
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dcdc<String> dcdcVar;
        String str;
        dcdc<String> dcdcVar2;
        String str2;
        dbsl<?> dbslVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctlp) {
            ctlp ctlpVar = (ctlp) obj;
            if (this.a.equals(ctlpVar.a()) && ((dcdcVar = this.b) != null ? dchl.m(dcdcVar, ctlpVar.b()) : ctlpVar.b() == null) && ((str = this.c) != null ? str.equals(ctlpVar.c()) : ctlpVar.c() == null) && ((dcdcVar2 = this.d) != null ? dchl.m(dcdcVar2, ctlpVar.d()) : ctlpVar.d() == null) && ((str2 = this.e) != null ? str2.equals(ctlpVar.e()) : ctlpVar.e() == null) && this.f == ctlpVar.f() && this.g == ctlpVar.g() && ((dbslVar = this.h) != null ? dbslVar.equals(ctlpVar.h()) : ctlpVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctlp
    public final int f() {
        return this.f;
    }

    @Override // defpackage.ctlp
    public final int g() {
        return this.g;
    }

    @Override // defpackage.ctlp
    public final dbsl<?> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dcdc<String> dcdcVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (dcdcVar == null ? 0 : dcdcVar.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dcdc<String> dcdcVar2 = this.d;
        int hashCode4 = (hashCode3 ^ (dcdcVar2 == null ? 0 : dcdcVar2.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode5 = (((((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        dbsl<?> dbslVar = this.h;
        if (dbslVar != null) {
            i = dbslVar.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        int i = this.f;
        int i2 = this.g;
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + String.valueOf(str2).length() + String.valueOf(valueOf4).length());
        sb.append("QueryParams{tableUri=");
        sb.append(valueOf);
        sb.append(", projection=");
        sb.append(valueOf2);
        sb.append(", selection=");
        sb.append(str);
        sb.append(", selectionArgs=");
        sb.append(valueOf3);
        sb.append(", orderBy=");
        sb.append(str2);
        sb.append(", limit=");
        sb.append(i);
        sb.append(", offset=");
        sb.append(i2);
        sb.append(", filterPredicate=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
