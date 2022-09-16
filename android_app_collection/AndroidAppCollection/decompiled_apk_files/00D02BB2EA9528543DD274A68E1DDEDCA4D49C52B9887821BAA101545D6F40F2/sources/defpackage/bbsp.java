package defpackage;
/* compiled from: PG */
/* renamed from: bbsp  reason: default package */
/* loaded from: classes3.dex */
public final class bbsp extends bbud {
    public final dbsg<ilo> a;

    public bbsp(dbsg<ilo> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.bbud
    public final dbsg<ilo> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbud)) {
            return false;
        }
        return this.a.equals(((bbud) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("PhotoLocation{placemark=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
