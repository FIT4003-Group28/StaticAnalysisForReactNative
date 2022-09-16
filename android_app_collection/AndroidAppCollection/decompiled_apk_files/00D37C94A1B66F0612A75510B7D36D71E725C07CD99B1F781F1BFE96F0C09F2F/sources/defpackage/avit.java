package defpackage;
/* compiled from: PG */
/* renamed from: avit  reason: default package */
/* loaded from: classes2.dex */
public final class avit {
    private final aviu a;

    public avit(aviu aviuVar) {
        this.a = aviuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avit) && this.a.equals(((avit) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("TimestampModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
