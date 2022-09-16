package defpackage;
/* compiled from: PG */
/* renamed from: mul  reason: default package */
/* loaded from: classes3.dex */
public final class mul {
    public final boolean a;
    public final amuk b;
    public final amuk c;

    public mul(boolean z, amuk amukVar, amuk amukVar2) {
        this.a = z;
        if (amukVar != null) {
            this.b = amukVar;
            if (amukVar2 != null) {
                this.c = amukVar2;
                return;
            }
            throw new NullPointerException("Null validationErrors");
        }
        throw new NullPointerException("Null invalidInputCommands");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mul) {
            mul mulVar = (mul) obj;
            if (this.a == mulVar.a && amxp.v(this.b, mulVar.b) && amxp.v(this.c, mulVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("FormValidationResult{isValid=");
        sb.append(z);
        sb.append(", invalidInputCommands=");
        sb.append(valueOf);
        sb.append(", validationErrors=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public mul() {
    }
}
