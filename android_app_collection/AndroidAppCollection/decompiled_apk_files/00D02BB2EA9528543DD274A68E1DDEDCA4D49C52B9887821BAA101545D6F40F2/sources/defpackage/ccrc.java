package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ccrc  reason: default package */
/* loaded from: classes4.dex */
final class ccrc extends ccsi {
    private final ccwk a;
    private final dbsg<ccln> b;
    private final dcdc<bbtm> c;
    private final boolean d;
    private final int e;
    private final int f;

    public ccrc(ccwk ccwkVar, dbsg<ccln> dbsgVar, dcdc<bbtm> dcdcVar, boolean z, int i, int i2) {
        this.a = ccwkVar;
        this.b = dbsgVar;
        this.c = dcdcVar;
        this.d = z;
        this.f = i;
        this.e = i2;
    }

    @Override // defpackage.ccsi
    public final ccwk a() {
        return this.a;
    }

    @Override // defpackage.ccsi
    public final dbsg<ccln> b() {
        return this.b;
    }

    @Override // defpackage.ccsi
    public final dcdc<bbtm> c() {
        return this.c;
    }

    @Override // defpackage.ccsi
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.ccsi
    protected final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccsi) {
            ccsi ccsiVar = (ccsi) obj;
            if (this.a.equals(ccsiVar.a()) && this.b.equals(ccsiVar.b()) && dchl.m(this.c, ccsiVar.c()) && this.d == ccsiVar.d()) {
                int i = this.f;
                int f = ccsiVar.f();
                if (i == 0) {
                    throw null;
                }
                if (i == f) {
                    int i2 = this.e;
                    int e = ccsiVar.e();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ccsi
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        ccwk ccwkVar = this.a;
        int i = ccwkVar.bC;
        if (i == 0) {
            i = dsst.a.b(ccwkVar).c(ccwkVar);
            ccwkVar.bC = i;
        }
        int hashCode = (((((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        int i2 = this.f;
        if (i2 != 0) {
            int i3 = (hashCode ^ i2) * 1000003;
            int i4 = this.e;
            if (i4 == 0) {
                throw null;
            }
            return i4 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int i = this.f;
        String str = "null";
        String valueOf4 = String.valueOf(i != 0 ? Integer.toString(i - 1) : str);
        int i2 = this.e;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "NEW_OFFERING";
        } else if (i2 == 3) {
            str = "OFFERING_EDIT";
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + length2 + length3 + String.valueOf(valueOf4).length() + str.length());
        sb.append("Submission{contribution=");
        sb.append(valueOf);
        sb.append(", existingOffering=");
        sb.append(valueOf2);
        sb.append(", associatedMedia=");
        sb.append(valueOf3);
        sb.append(", requestThanksPage=");
        sb.append(z);
        sb.append(", origin=");
        sb.append(valueOf4);
        sb.append(", type=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
