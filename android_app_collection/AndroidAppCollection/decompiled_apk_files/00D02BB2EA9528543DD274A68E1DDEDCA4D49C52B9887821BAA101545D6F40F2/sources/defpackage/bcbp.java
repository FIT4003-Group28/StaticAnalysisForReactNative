package defpackage;
/* compiled from: PG */
/* renamed from: bcbp  reason: default package */
/* loaded from: classes3.dex */
final class bcbp extends bcbn {
    private final dbsg<dspd> b;
    private final dbsg<bbur> c;

    public bcbp(dbsg<dspd> dbsgVar, dbsg<bbur> dbsgVar2) {
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.bcbn
    public final dbsg<dspd> a() {
        return this.b;
    }

    @Override // defpackage.bcbn
    public final dbsg<bbur> b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcbn) {
            bcbn bcbnVar = (bcbn) obj;
            if (this.b.equals(bcbnVar.a()) && this.c.equals(bcbnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
        sb.append("AutoOpenCollection{mediaCollectionId=");
        sb.append(valueOf);
        sb.append(", galleryTab=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
