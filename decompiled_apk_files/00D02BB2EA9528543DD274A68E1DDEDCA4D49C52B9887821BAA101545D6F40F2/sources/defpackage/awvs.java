package defpackage;
/* compiled from: PG */
/* renamed from: awvs  reason: default package */
/* loaded from: classes.dex */
final class awvs extends awwp {
    private final boolean a;
    private final boolean b;

    public awvs(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.awwp
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.awwp
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awwp) {
            awwp awwpVar = (awwp) obj;
            if (this.a == awwpVar.a() && this.b == awwpVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("UpdateMetadata{forceDestructiveUpdate=");
        sb.append(z);
        sb.append(", contextChange=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
