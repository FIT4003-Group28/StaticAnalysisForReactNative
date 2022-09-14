package defpackage;
/* compiled from: PG */
/* renamed from: amsu  reason: default package */
/* loaded from: classes2.dex */
public final class amsu extends amsv {
    public final int a;

    public amsu(int i) {
        this.a = i;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof amsu) && ((amsu) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(33);
        sb.append("<canned_message id=\"");
        sb.append(i);
        sb.append("\">");
        return sb.toString();
    }
}
