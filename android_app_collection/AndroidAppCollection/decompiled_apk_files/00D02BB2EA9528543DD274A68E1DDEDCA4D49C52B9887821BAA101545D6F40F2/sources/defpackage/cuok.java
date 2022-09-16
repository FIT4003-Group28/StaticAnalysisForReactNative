package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuok  reason: default package */
/* loaded from: classes5.dex */
public final class cuok extends cuom {
    private final cuhv a;

    public cuok(cuhv cuhvVar) {
        this.a = cuhvVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.RICH_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.RICH_TEXT == cuqnVar.a() && this.a.equals(cuqnVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cuhv f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Element{richText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
