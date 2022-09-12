package defpackage;
/* compiled from: PG */
/* renamed from: cuob  reason: default package */
/* loaded from: classes5.dex */
final class cuob extends cuod {
    private final cuqk a;

    public cuob(cuqk cuqkVar) {
        this.a = cuqkVar;
    }

    @Override // defpackage.cuod, defpackage.cuql
    public final cuqk a() {
        return this.a;
    }

    @Override // defpackage.cuql
    public final cuqi b() {
        return cuqi.STACK_COMPONENT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuql) {
            cuql cuqlVar = (cuql) obj;
            if (cuqi.STACK_COMPONENT == cuqlVar.b() && this.a.equals(cuqlVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("UiComponent{stackComponent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
