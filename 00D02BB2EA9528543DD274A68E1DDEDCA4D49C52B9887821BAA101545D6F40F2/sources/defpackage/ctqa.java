package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctqa  reason: default package */
/* loaded from: classes5.dex */
public final class ctqa extends ctrg {
    public final cuib a;
    public final boolean b;
    public final ctrf c;

    public ctqa(cuib cuibVar, boolean z, ctrf ctrfVar) {
        this.a = cuibVar;
        this.b = z;
        this.c = ctrfVar;
    }

    @Override // defpackage.ctrg
    public final cuib a() {
        return this.a;
    }

    @Override // defpackage.ctrg
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ctrg
    public final ctrf c() {
        return this.c;
    }

    @Override // defpackage.ctrg
    public final ctrd d() {
        return new ctpz(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctrg) {
            ctrg ctrgVar = (ctrg) obj;
            cuib cuibVar = this.a;
            if (cuibVar != null ? cuibVar.equals(ctrgVar.a()) : ctrgVar.a() == null) {
                if (this.b == ctrgVar.b() && this.c.equals(ctrgVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cuib cuibVar = this.a;
        return (((((cuibVar == null ? 0 : cuibVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("TachyonMessage{suggestionList=");
        sb.append(valueOf);
        sb.append(", skipNotification=");
        sb.append(z);
        sb.append(", oneOfType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
