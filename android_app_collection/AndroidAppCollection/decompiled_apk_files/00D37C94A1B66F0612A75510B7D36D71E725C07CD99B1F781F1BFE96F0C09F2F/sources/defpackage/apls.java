package defpackage;
/* compiled from: PG */
/* renamed from: apls  reason: default package */
/* loaded from: classes.dex */
public final class apls {
    private final aplt a;

    public apls(aplt apltVar) {
        this.a = apltVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apls) && this.a.equals(((apls) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("BadgeInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
