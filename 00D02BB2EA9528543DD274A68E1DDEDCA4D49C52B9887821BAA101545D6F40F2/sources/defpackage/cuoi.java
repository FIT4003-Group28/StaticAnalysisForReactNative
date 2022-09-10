package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuoi  reason: default package */
/* loaded from: classes5.dex */
public final class cuoi extends cuom {
    private final cupu a;

    public cuoi(cupu cupuVar) {
        this.a = cupuVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.IMAGE_ELEMENT;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cupu d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.IMAGE_ELEMENT == cuqnVar.a() && this.a.equals(cuqnVar.d())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Element{imageElement=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
