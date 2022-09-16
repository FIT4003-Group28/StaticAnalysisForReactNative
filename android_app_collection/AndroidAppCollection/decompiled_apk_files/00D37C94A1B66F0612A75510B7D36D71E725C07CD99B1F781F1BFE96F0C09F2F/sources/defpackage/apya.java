package defpackage;
/* compiled from: PG */
/* renamed from: apya  reason: default package */
/* loaded from: classes2.dex */
public final class apya {
    private final apxl a;

    public apya(apxl apxlVar) {
        this.a = apxlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apya) && this.a.equals(((apya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ChannelItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
