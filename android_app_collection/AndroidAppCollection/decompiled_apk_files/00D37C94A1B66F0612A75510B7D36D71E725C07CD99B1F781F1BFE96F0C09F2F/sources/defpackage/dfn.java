package defpackage;
/* compiled from: PG */
/* renamed from: dfn  reason: default package */
/* loaded from: classes3.dex */
public final class dfn {
    public final def a;
    public final dfe b;

    public dfn(def defVar, dfe dfeVar) {
        this.a = defVar;
        this.b = dfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dfn dfnVar = (dfn) obj;
            if (this.a.equals(dfnVar.a) && this.b.equals(dfnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.d * 31) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("PropertyHandle{ mTransitionId='");
        sb.append(valueOf);
        sb.append("', mProperty=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
