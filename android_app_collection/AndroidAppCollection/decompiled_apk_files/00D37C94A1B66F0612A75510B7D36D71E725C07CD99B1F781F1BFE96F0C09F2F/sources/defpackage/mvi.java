package defpackage;
/* compiled from: PG */
/* renamed from: mvi  reason: default package */
/* loaded from: classes3.dex */
public final class mvi {
    public final boolean a;
    public final arag b;
    public final apzg c;
    public final asir d;

    public mvi() {
    }

    public mvi(boolean z, arag aragVar, apzg apzgVar, asir asirVar) {
        this.a = z;
        this.b = aragVar;
        this.c = apzgVar;
        this.d = asirVar;
    }

    public static mvi a() {
        return new mvi(true, null, null, null);
    }

    public static mvi b(arag aragVar, apzg apzgVar, asir asirVar) {
        return new mvi(false, aragVar, apzgVar, asirVar);
    }

    public final boolean equals(Object obj) {
        arag aragVar;
        apzg apzgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvi) {
            mvi mviVar = (mvi) obj;
            if (this.a == mviVar.a && ((aragVar = this.b) != null ? aragVar.equals(mviVar.b) : mviVar.b == null) && ((apzgVar = this.c) != null ? apzgVar.equals(mviVar.c) : mviVar.c == null)) {
                asir asirVar = this.d;
                asir asirVar2 = mviVar.d;
                if (asirVar != null ? asirVar.equals(asirVar2) : asirVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        arag aragVar = this.b;
        int i2 = 0;
        int hashCode = (i ^ (aragVar == null ? 0 : aragVar.hashCode())) * 1000003;
        apzg apzgVar = this.c;
        int hashCode2 = (hashCode ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
        asir asirVar = this.d;
        if (asirVar != null) {
            i2 = asirVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RulesetValidationResult{isValid=");
        sb.append(z);
        sb.append(", errorText=");
        sb.append(valueOf);
        sb.append(", errorCommand=");
        sb.append(valueOf2);
        sb.append(", validationError=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
