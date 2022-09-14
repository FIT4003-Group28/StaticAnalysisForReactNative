package defpackage;
/* compiled from: PG */
/* renamed from: crxp  reason: default package */
/* loaded from: classes5.dex */
public final class crxp extends crxt {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public crxp(String str, int i, int i2, int i3) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    @Override // defpackage.crxt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crxt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.crxt
    public final int c() {
        return this.c;
    }

    @Override // defpackage.crxt
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crxt) {
            crxt crxtVar = (crxt) obj;
            if (this.a.equals(crxtVar.a()) && this.b == crxtVar.b() && this.c == crxtVar.c() && this.d == crxtVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 90);
        sb.append("FileInfo{mimeType=");
        sb.append(str);
        sb.append(", byteSize=");
        sb.append(i);
        sb.append(", pixelWidth=");
        sb.append(i2);
        sb.append(", pixelHeight=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
