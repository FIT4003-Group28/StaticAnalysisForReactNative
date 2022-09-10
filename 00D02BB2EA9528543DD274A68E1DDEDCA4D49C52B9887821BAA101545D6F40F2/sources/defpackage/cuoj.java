package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuoj  reason: default package */
/* loaded from: classes5.dex */
public final class cuoj extends cuom {
    private final cuqb a;

    public cuoj(cuqb cuqbVar) {
        this.a = cuqbVar;
    }

    @Override // defpackage.cuqn
    public final cuqp a() {
        return cuqp.RICH_CARD_BUTTONS;
    }

    @Override // defpackage.cuom, defpackage.cuqn
    public final cuqb e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuqn) {
            cuqn cuqnVar = (cuqn) obj;
            if (cuqp.RICH_CARD_BUTTONS == cuqnVar.a() && this.a.equals(cuqnVar.e())) {
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
        sb.append("Element{richCardButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
