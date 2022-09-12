package defpackage;
/* compiled from: PG */
/* renamed from: bbsd  reason: default package */
/* loaded from: classes3.dex */
public final class bbsd extends bbsc {
    private final int a;

    public bbsd(int i) {
        this.a = i;
    }

    @Override // defpackage.bbsc
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bbsc) && this.a == ((bbsc) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("AddVisitedPhotoResult{photoIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
