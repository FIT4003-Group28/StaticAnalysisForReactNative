package defpackage;
/* compiled from: PG */
/* renamed from: apyc  reason: default package */
/* loaded from: classes2.dex */
public final class apyc {
    public final apxs a;

    public apyc(apxs apxsVar) {
        this.a = apxsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyc) && this.a.equals(((apyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ComponentPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
