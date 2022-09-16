package defpackage;
/* compiled from: PG */
/* renamed from: xkh  reason: default package */
/* loaded from: classes7.dex */
final class xkh extends xki {
    public final amte a;
    public final int b;

    public xkh(amte amteVar, int i) {
        this.a = amteVar;
        this.b = i;
    }

    @Override // defpackage.xki
    public final amte a() {
        return this.a;
    }

    @Override // defpackage.xki
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xki) {
            xki xkiVar = (xki) obj;
            if (this.a.equals(xkiVar.a()) && this.b == xkiVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("DirectionsStorageItemAndIndex{directionsStorageItem=");
        sb.append(valueOf);
        sb.append(", tripIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
