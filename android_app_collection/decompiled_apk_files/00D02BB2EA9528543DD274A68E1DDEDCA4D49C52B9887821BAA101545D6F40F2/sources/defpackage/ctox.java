package defpackage;
/* compiled from: PG */
/* renamed from: ctox  reason: default package */
/* loaded from: classes5.dex */
public final class ctox extends ctoz {
    private final ctra a;

    public ctox(ctra ctraVar) {
        this.a = ctraVar;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 3 && this.a.equals(ctrfVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final ctra f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("OneOfType{receipt=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
