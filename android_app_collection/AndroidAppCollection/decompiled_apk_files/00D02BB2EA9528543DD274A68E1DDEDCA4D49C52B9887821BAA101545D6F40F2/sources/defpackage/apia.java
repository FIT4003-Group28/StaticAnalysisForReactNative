package defpackage;
/* compiled from: PG */
/* renamed from: apia  reason: default package */
/* loaded from: classes2.dex */
final class apia extends apiw {
    private final dbsg<dvay> a;
    private final dbsg<dvyw> b;
    private final boolean c;
    private final boolean d;

    public apia(dbsg<dvay> dbsgVar, dbsg<dvyw> dbsgVar2, boolean z, boolean z2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.apiw
    public final dbsg<dvay> a() {
        return this.a;
    }

    @Override // defpackage.apiw
    public final dbsg<dvyw> b() {
        return this.b;
    }

    @Override // defpackage.apiw
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.apiw
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apiw) {
            apiw apiwVar = (apiw) obj;
            if (this.a.equals(apiwVar.a()) && this.b.equals(apiwVar.b()) && this.c == apiwVar.c() && this.d == apiwVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length());
        sb.append("OngoingData{lastSegment=");
        sb.append(valueOf);
        sb.append(", ongoingCandidate=");
        sb.append(valueOf2);
        sb.append(", isCheckedIn=");
        sb.append(z);
        sb.append(", isFresh=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
