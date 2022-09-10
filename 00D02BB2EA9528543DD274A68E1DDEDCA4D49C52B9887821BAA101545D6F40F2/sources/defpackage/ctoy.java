package defpackage;
/* compiled from: PG */
/* renamed from: ctoy  reason: default package */
/* loaded from: classes5.dex */
public final class ctoy extends ctoz {
    private final ctri a;

    public ctoy(ctri ctriVar) {
        this.a = ctriVar;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 4 && this.a.equals(ctrfVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final ctri g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("OneOfType{typingIndicator=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
