package defpackage;
/* compiled from: PG */
/* renamed from: ctoq  reason: default package */
/* loaded from: classes5.dex */
public final class ctoq extends ctos {
    private final ctqn a;

    public ctoq(ctqn ctqnVar) {
        this.a = ctqnVar;
    }

    @Override // defpackage.ctqx
    public final int b() {
        return 5;
    }

    @Override // defpackage.ctos, defpackage.ctqx
    public final ctqn e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqx) {
            ctqx ctqxVar = (ctqx) obj;
            if (ctqxVar.b() == 5 && this.a.equals(ctqxVar.e())) {
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
        sb.append("OneOfType{createGroup=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
