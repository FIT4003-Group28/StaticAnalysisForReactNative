package defpackage;
/* compiled from: PG */
/* renamed from: ctok  reason: default package */
/* loaded from: classes5.dex */
final class ctok extends ctol {
    private final ctqo a;

    public ctok(ctqo ctqoVar) {
        this.a = ctqoVar;
    }

    @Override // defpackage.ctol, defpackage.ctqk
    public final ctqo a() {
        return this.a;
    }

    @Override // defpackage.ctqk
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqk) {
            ctqk ctqkVar = (ctqk) obj;
            if (ctqkVar.b() == 1 && this.a.equals(ctqkVar.a())) {
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
        sb.append("OneOfType{deleteConversation=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
