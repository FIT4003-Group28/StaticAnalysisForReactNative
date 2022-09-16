package defpackage;
/* compiled from: PG */
/* renamed from: cton  reason: default package */
/* loaded from: classes5.dex */
public final class cton extends ctos {
    private final ctoj a;

    public cton(ctoj ctojVar) {
        this.a = ctojVar;
    }

    @Override // defpackage.ctos, defpackage.ctqx
    public final ctoj a() {
        return this.a;
    }

    @Override // defpackage.ctqx
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqx) {
            ctqx ctqxVar = (ctqx) obj;
            if (ctqxVar.b() == 3 && this.a.equals(ctqxVar.a())) {
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
        sb.append("OneOfType{addGroupUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
