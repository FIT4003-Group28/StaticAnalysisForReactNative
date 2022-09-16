package defpackage;
/* compiled from: PG */
/* renamed from: awvt  reason: default package */
/* loaded from: classes2.dex */
public final class awvt {
    public final aajl a;
    public final awvu b;

    public awvt(awvu awvuVar, aajl aajlVar) {
        this.b = awvuVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awvt) && this.b.equals(((awvt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("FocusVisibilityLoggingConfigModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
