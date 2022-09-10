package defpackage;
/* compiled from: PG */
/* renamed from: ctov  reason: default package */
/* loaded from: classes5.dex */
public final class ctov extends ctoz {
    private final ctrc a;

    public ctov(ctrc ctrcVar) {
        this.a = ctrcVar;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 6;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final ctrc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 6 && this.a.equals(ctrfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("OneOfType{profileUpdate=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
