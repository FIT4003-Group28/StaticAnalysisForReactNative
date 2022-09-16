package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqp  reason: default package */
/* loaded from: classes4.dex */
public final class cdqp extends cdsb {
    private final boolean a;
    private final bvrt<dmcc> b;

    public cdqp(boolean z, bvrt<dmcc> bvrtVar) {
        this.a = z;
        this.b = bvrtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdsb) {
            cdsb cdsbVar = (cdsb) obj;
            if (this.a == cdsbVar.f() && this.b.equals(cdsbVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdjl
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.cdsb
    public final bvrt<dmcc> g() {
        return this.b;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("UgcText{showTranslation=");
        sb.append(z);
        sb.append(", textSerializable=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
