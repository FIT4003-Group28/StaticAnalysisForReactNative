package defpackage;
/* compiled from: PG */
/* renamed from: bbta  reason: default package */
/* loaded from: classes3.dex */
public final class bbta extends bbvf {
    private final String a;
    private final Boolean b;

    public bbta(String str, Boolean bool) {
        if (str != null) {
            this.a = str;
            this.b = bool;
            return;
        }
        throw new NullPointerException("Null photoId");
    }

    @Override // defpackage.bbvf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bbvf
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbvf) {
            bbvf bbvfVar = (bbvf) obj;
            if (this.a.equals(bbvfVar.a()) && this.b.equals(bbvfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(valueOf).length());
        sb.append("UpdatePhotoSelectionStatusResult{photoId=");
        sb.append(str);
        sb.append(", newSelectionStatus=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
