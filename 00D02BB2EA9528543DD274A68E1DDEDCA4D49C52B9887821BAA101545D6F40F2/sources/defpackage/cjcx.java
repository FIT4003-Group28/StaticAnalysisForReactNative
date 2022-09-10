package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjcx  reason: default package */
/* loaded from: classes4.dex */
public final class cjcx extends cjcz {
    public final ilo a;

    public cjcx(ilo iloVar) {
        this.a = iloVar;
    }

    @Override // defpackage.cjcz
    public final ilo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cjcz)) {
            return false;
        }
        return this.a.equals(((cjcz) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("PlacePickResult{placemark=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
