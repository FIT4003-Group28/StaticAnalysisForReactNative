package defpackage;
/* compiled from: PG */
/* renamed from: mui  reason: default package */
/* loaded from: classes3.dex */
public final class mui {
    public final boolean a;
    public final apzg b;
    public final asir c;

    public mui() {
    }

    public mui(boolean z, apzg apzgVar, asir asirVar) {
        this.a = z;
        this.b = apzgVar;
        this.c = asirVar;
    }

    public static mui a(boolean z, apzg apzgVar, asir asirVar) {
        return new mui(z, apzgVar, asirVar);
    }

    public final boolean equals(Object obj) {
        apzg apzgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mui) {
            mui muiVar = (mui) obj;
            if (this.a == muiVar.a && ((apzgVar = this.b) != null ? apzgVar.equals(muiVar.b) : muiVar.b == null)) {
                asir asirVar = this.c;
                asir asirVar2 = muiVar.c;
                if (asirVar != null ? asirVar.equals(asirVar2) : asirVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        apzg apzgVar = this.b;
        int i2 = 0;
        int hashCode = (i ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
        asir asirVar = this.c;
        if (asirVar != null) {
            i2 = asirVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("InputValidationResult{isValid=");
        sb.append(z);
        sb.append(", errorCommand=");
        sb.append(valueOf);
        sb.append(", validationError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
