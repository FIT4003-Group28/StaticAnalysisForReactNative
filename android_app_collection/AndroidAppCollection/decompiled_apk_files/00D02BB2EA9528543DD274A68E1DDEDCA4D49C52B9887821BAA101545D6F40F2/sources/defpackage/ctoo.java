package defpackage;
/* compiled from: PG */
/* renamed from: ctoo  reason: default package */
/* loaded from: classes5.dex */
public final class ctoo extends ctos {
    private final ctqe a;

    public ctoo(ctqe ctqeVar) {
        this.a = ctqeVar;
    }

    @Override // defpackage.ctqx
    public final int b() {
        return 2;
    }

    @Override // defpackage.ctos, defpackage.ctqx
    public final ctqe c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqx) {
            ctqx ctqxVar = (ctqx) obj;
            if (ctqxVar.b() == 2 && this.a.equals(ctqxVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("OneOfType{blockUnblockUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
