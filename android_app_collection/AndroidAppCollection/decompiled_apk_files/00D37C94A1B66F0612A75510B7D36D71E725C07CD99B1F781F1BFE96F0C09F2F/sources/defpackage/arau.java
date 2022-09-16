package defpackage;
/* compiled from: PG */
/* renamed from: arau  reason: default package */
/* loaded from: classes2.dex */
public final class arau {
    private final araw a;

    public arau(araw arawVar) {
        this.a = arawVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arau) && this.a.equals(((arau) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("FormfillFieldTextValueModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
