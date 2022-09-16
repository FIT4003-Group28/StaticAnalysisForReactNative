package defpackage;
/* compiled from: PG */
/* renamed from: ataa  reason: default package */
/* loaded from: classes2.dex */
public final class ataa {
    private final atae a;

    public ataa(atae ataeVar) {
        this.a = ataeVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ataa) && this.a.equals(((ataa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("ActiveSectionInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
