package defpackage;
/* compiled from: PG */
/* renamed from: afwv  reason: default package */
/* loaded from: classes2.dex */
public final class afwv extends afxd {
    private final dbsg<String> a;
    private final dbsg<akqi> b;
    private final dbsg<dwfl> c;
    private final dbsg<ilo> d;
    private final int e;
    private final int f;

    public afwv(int i, int i2, dbsg<String> dbsgVar, dbsg<akqi> dbsgVar2, dbsg<dwfl> dbsgVar3, dbsg<ilo> dbsgVar4) {
        this.e = i;
        this.f = i2;
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
    }

    @Override // defpackage.afxd
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.afxd
    public final dbsg<akqi> b() {
        return this.b;
    }

    @Override // defpackage.afxd
    public final dbsg<dwfl> c() {
        return this.c;
    }

    @Override // defpackage.afxd
    public final dbsg<ilo> d() {
        return this.d;
    }

    @Override // defpackage.afxd
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afxd)) {
            return false;
        }
        afxd afxdVar = (afxd) obj;
        int i = this.e;
        int e = afxdVar.e();
        if (i == 0) {
            throw null;
        }
        if (i == e) {
            int i2 = this.f;
            int f = afxdVar.f();
            if (i2 == 0) {
                throw null;
            }
            if (i2 == f && this.a.equals(afxdVar.a()) && this.b.equals(afxdVar.b()) && this.c.equals(afxdVar.c()) && this.d.equals(afxdVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afxd
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int i = this.e;
        afxh.b(i);
        int i2 = (i ^ 1000003) * 1000003;
        int i3 = this.f;
        if (i3 == 0) {
            throw null;
        }
        return ((((((((i2 ^ i3) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String a = afxh.a(this.e);
        int i = this.f;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SUGGESTION_CHIP_SEARCH" : "SUGGESTION_CHIP_TRANSLATE" : "SUGGESTION_CHIP_DINING" : "ICON_PRESS" : "NONE";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(a.length() + 91 + str.length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("LensApiParams{lensFilter=");
        sb.append(a);
        sb.append(", lensIntentType=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(valueOf);
        sb.append(", placeFeatureId=");
        sb.append(valueOf2);
        sb.append(", photo=");
        sb.append(valueOf3);
        sb.append(", placemark=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
