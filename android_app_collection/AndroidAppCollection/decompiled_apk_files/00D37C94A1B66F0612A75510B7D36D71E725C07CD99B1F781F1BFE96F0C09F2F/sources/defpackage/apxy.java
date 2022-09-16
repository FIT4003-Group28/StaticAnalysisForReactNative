package defpackage;
/* compiled from: PG */
/* renamed from: apxy  reason: default package */
/* loaded from: classes2.dex */
public final class apxy {
    private final apxj a;

    public apxy(apxj apxjVar) {
        this.a = apxjVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxy) && this.a.equals(((apxy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("BackstageItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
