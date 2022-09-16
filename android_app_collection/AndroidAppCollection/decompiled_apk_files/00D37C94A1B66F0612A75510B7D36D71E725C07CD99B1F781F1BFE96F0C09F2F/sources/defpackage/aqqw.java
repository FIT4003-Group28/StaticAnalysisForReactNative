package defpackage;
/* compiled from: PG */
/* renamed from: aqqw  reason: default package */
/* loaded from: classes2.dex */
public final class aqqw {
    private final aqqz a;

    public aqqw(aqqz aqqzVar) {
        this.a = aqqzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqqw) && this.a.equals(((aqqw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DrmLicenseInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
