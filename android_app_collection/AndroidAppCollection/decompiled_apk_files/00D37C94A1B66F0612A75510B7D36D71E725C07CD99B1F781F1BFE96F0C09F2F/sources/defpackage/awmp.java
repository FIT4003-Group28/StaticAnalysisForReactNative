package defpackage;
/* compiled from: PG */
/* renamed from: awmp  reason: default package */
/* loaded from: classes2.dex */
public final class awmp {
    private final awmt a;

    public awmp(awmt awmtVar) {
        this.a = awmtVar;
    }

    public static awmo a(awmt awmtVar) {
        return new awmo((aopc) awmtVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmp) && this.a.equals(((awmp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("CommandModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
