package defpackage;
/* compiled from: PG */
/* renamed from: avin  reason: default package */
/* loaded from: classes2.dex */
public final class avin {
    private final avio a;

    public avin(avio avioVar) {
        this.a = avioVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avin) && this.a.equals(((avin) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("TimedSyncDataItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
