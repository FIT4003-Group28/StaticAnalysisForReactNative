package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctop  reason: default package */
/* loaded from: classes5.dex */
public final class ctop extends ctos {
    private final ctqg a;

    public ctop(ctqg ctqgVar) {
        this.a = ctqgVar;
    }

    @Override // defpackage.ctqx
    public final int b() {
        return 1;
    }

    @Override // defpackage.ctos, defpackage.ctqx
    public final ctqg d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqx) {
            ctqx ctqxVar = (ctqx) obj;
            if (ctqxVar.b() == 1 && this.a.equals(ctqxVar.d())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("OneOfType{changeGroupProfile=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
