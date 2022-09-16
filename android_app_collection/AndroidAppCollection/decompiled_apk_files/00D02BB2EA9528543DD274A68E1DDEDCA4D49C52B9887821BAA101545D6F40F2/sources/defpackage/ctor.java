package defpackage;
/* compiled from: PG */
/* renamed from: ctor  reason: default package */
/* loaded from: classes5.dex */
public final class ctor extends ctos {
    private final ctoj a;

    public ctor(ctoj ctojVar) {
        this.a = ctojVar;
    }

    @Override // defpackage.ctqx
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctqx) {
            ctqx ctqxVar = (ctqx) obj;
            if (ctqxVar.b() == 4 && this.a.equals(ctqxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctos, defpackage.ctqx
    public final ctoj f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("OneOfType{kickGroupUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
