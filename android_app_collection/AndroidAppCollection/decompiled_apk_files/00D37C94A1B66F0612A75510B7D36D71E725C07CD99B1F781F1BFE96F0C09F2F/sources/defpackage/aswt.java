package defpackage;
/* compiled from: PG */
/* renamed from: aswt  reason: default package */
/* loaded from: classes2.dex */
public final class aswt {
    private final asws a;

    public aswt(asws aswsVar) {
        this.a = aswsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswt) && this.a.equals(((aswt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("LowResThumbnailHeaderModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
