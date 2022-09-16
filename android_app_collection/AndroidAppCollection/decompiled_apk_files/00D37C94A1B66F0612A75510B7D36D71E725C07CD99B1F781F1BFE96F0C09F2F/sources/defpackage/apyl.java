package defpackage;
/* compiled from: PG */
/* renamed from: apyl  reason: default package */
/* loaded from: classes2.dex */
public final class apyl {
    private final apxr a;

    public apyl(apxr apxrVar) {
        this.a = apxrVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyl) && this.a.equals(((apyl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("YouTubeCreatorCampaignDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
