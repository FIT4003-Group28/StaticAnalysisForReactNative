package defpackage;
/* compiled from: PG */
/* renamed from: awlw  reason: default package */
/* loaded from: classes2.dex */
public final class awlw {
    private final awme a;

    public awlw(awme awmeVar) {
        this.a = awmeVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlw) && this.a.equals(((awlw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("StyleRunExtensionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
