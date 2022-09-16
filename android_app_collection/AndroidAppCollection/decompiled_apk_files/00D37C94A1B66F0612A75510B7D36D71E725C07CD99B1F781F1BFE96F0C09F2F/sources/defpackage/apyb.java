package defpackage;
/* compiled from: PG */
/* renamed from: apyb  reason: default package */
/* loaded from: classes2.dex */
public final class apyb {
    public final aajl a;
    public final apxg b;

    public apyb(apxg apxgVar, aajl aajlVar) {
        this.b = apxgVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyb) && this.b.equals(((apyb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("ClientYouTubeDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
