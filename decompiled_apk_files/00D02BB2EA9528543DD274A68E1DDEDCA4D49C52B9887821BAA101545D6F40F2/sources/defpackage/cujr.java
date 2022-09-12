package defpackage;
/* compiled from: PG */
/* renamed from: cujr  reason: default package */
/* loaded from: classes5.dex */
public final class cujr extends cujv {
    private final cukn a;

    public cujr(cukn cuknVar) {
        this.a = cuknVar;
    }

    @Override // defpackage.cujv
    public final cukn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cujv)) {
            return false;
        }
        return this.a.equals(((cujv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("MediaUploadResult{mediaId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
