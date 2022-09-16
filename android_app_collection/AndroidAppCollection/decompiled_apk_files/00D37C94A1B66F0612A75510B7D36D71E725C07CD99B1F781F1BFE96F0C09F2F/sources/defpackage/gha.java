package defpackage;
/* compiled from: PG */
/* renamed from: gha  reason: default package */
/* loaded from: classes3.dex */
final class gha extends akam {
    public final amup a;

    public gha(amup amupVar) {
        if (amupVar != null) {
            this.a = amupVar;
            return;
        }
        throw new NullPointerException("Null undoMap");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gha)) {
            return false;
        }
        return this.a.equals(((gha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("MyTransientState{undoMap=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public gha() {
    }
}
