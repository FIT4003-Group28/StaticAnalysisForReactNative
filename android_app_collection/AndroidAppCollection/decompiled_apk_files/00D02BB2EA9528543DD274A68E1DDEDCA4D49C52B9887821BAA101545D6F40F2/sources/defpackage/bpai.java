package defpackage;
/* compiled from: PG */
/* renamed from: bpai  reason: default package */
/* loaded from: classes3.dex */
final class bpai extends bpan {
    private final dbsg<ilo> a;

    public bpai(dbsg<ilo> dbsgVar) {
        if (dbsgVar != null) {
            this.a = dbsgVar;
            return;
        }
        throw new NullPointerException("Null placemark");
    }

    @Override // defpackage.bpan
    public final dbsg<ilo> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpan)) {
            return false;
        }
        return this.a.equals(((bpan) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("ConfirmPlaceSelectionResult{placemark=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
