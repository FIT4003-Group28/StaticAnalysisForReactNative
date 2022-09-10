package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuoc  reason: default package */
/* loaded from: classes5.dex */
public final class cuoc extends cuod {
    private final cuqq a;

    public cuoc(cuqq cuqqVar) {
        this.a = cuqqVar;
    }

    @Override // defpackage.cuql
    public final cuqi b() {
        return cuqi.UI_ELEMENT;
    }

    @Override // defpackage.cuod, defpackage.cuql
    public final cuqq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuql) {
            cuql cuqlVar = (cuql) obj;
            if (cuqi.UI_ELEMENT == cuqlVar.b() && this.a.equals(cuqlVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("UiComponent{uiElement=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
