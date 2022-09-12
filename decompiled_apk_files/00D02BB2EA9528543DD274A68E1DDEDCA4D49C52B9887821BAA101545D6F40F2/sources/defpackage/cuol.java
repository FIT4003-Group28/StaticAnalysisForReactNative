package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuol  reason: default package */
/* loaded from: classes5.dex */
public final class cuol extends cuom {
    private final cuqh a;

    public cuol(cuqh cuqhVar) {
        this.a = cuqhVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.STATUS_BADGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.STATUS_BADGE == cuqnVar.a() && this.a.equals(cuqnVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cuqh g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Element{statusBadge=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
