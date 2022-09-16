package defpackage;
/* compiled from: PG */
/* renamed from: awjx  reason: default package */
/* loaded from: classes2.dex */
public final class awjx {
    public final awkb a;

    public awjx(awkb awkbVar) {
        this.a = awkbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awjx) && this.a.equals(((awjx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DownloadedItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
