package defpackage;
/* compiled from: PG */
/* renamed from: aswb  reason: default package */
/* loaded from: classes2.dex */
public final class aswb {
    private final aswf a;

    public aswb(aswf aswfVar) {
        this.a = aswfVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswb) && this.a.equals(((aswb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("HeaderModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
