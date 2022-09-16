package defpackage;
/* compiled from: PG */
/* renamed from: asrz  reason: default package */
/* loaded from: classes2.dex */
public final class asrz {
    public final aajl a;
    public final asse b;

    public asrz(asse asseVar, aajl aajlVar) {
        this.b = asseVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asrz) && this.b.equals(((asrz) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("LiveChatPollChoiceStateModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
