package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuog  reason: default package */
/* loaded from: classes5.dex */
public final class cuog extends cuom {
    private final cupq a;

    public cuog(cupq cupqVar) {
        this.a = cupqVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.HORIZONTAL_LAYOUT_BUTTONS;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cupq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.HORIZONTAL_LAYOUT_BUTTONS == cuqnVar.a() && this.a.equals(cuqnVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Element{horizontalLayoutButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
