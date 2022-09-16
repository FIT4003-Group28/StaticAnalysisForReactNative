package defpackage;
/* compiled from: PG */
/* renamed from: afwx  reason: default package */
/* loaded from: classes2.dex */
final class afwx extends afxf {
    private final boolean b;
    private final boolean c;

    public afwx(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.afxf
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.afxf
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afxf) {
            afxf afxfVar = (afxf) obj;
            if (this.b == afxfVar.a() && this.c == afxfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(63);
        sb.append("LensCapabilities{supportsTranslate=");
        sb.append(z);
        sb.append(", supportsDining=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
