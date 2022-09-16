package defpackage;
/* compiled from: PG */
/* renamed from: ajkb  reason: default package */
/* loaded from: classes2.dex */
final class ajkb extends ajnh {
    private final eaow a;
    private final dqym b;
    private final dbsg<eapd> c;

    public ajkb(eaow eaowVar, dqym dqymVar, dbsg<eapd> dbsgVar) {
        this.a = eaowVar;
        this.b = dqymVar;
        this.c = dbsgVar;
    }

    @Override // defpackage.ajnh
    public final eaow a() {
        return this.a;
    }

    @Override // defpackage.ajnh
    public final dqym b() {
        return this.b;
    }

    @Override // defpackage.ajnh
    public final dbsg<eapd> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnh) {
            ajnh ajnhVar = (ajnh) obj;
            if (this.a.equals(ajnhVar.a()) && this.b.equals(ajnhVar.b()) && this.c.equals(ajnhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SubTask{durationBetweenCollections=");
        sb.append(valueOf);
        sb.append(", justification=");
        sb.append(valueOf2);
        sb.append(", expiration=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
