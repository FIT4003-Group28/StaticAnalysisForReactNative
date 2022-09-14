package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuoh  reason: default package */
/* loaded from: classes5.dex */
public final class cuoh extends cuom {
    private final cups a;

    public cuoh(cups cupsVar) {
        this.a = cupsVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.HORIZONTAL_LINE;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cups c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.HORIZONTAL_LINE == cuqnVar.a() && this.a.equals(cuqnVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Element{horizontalLine=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
