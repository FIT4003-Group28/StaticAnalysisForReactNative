package defpackage;
/* compiled from: PG */
/* renamed from: ctot  reason: default package */
/* loaded from: classes5.dex */
public final class ctot extends ctoz {
    private final ctql a;

    public ctot(ctql ctqlVar) {
        this.a = ctqlVar;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final ctql a() {
        return this.a;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 5 && this.a.equals(ctrfVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("OneOfType{cloudUpdate=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
