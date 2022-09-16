package defpackage;
/* compiled from: PG */
/* renamed from: apxz  reason: default package */
/* loaded from: classes2.dex */
public final class apxz {
    private final apxk a;

    public apxz(apxk apxkVar) {
        this.a = apxkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxz) && this.a.equals(((apxz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ChannelDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
