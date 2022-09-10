package defpackage;
/* compiled from: PG */
/* renamed from: pgy  reason: default package */
/* loaded from: classes7.dex */
final class pgy<V> extends pha<V> {
    private final pim<V> a;
    private final phu<V> b;
    private final Class<V> c;
    private final boolean d;

    public pgy(@dzsi pim<V> pimVar, @dzsi phu<V> phuVar, Class<V> cls, boolean z) {
        this.a = pimVar;
        this.b = phuVar;
        this.c = cls;
        this.d = z;
    }

    @Override // defpackage.pha
    @dzsi
    public final pim<V> a() {
        return this.a;
    }

    @Override // defpackage.pha
    @dzsi
    public final phu<V> b() {
        return this.b;
    }

    @Override // defpackage.pha
    public final Class<V> c() {
        return this.c;
    }

    @Override // defpackage.pha
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pha) {
            pha phaVar = (pha) obj;
            pim<V> pimVar = this.a;
            if (pimVar != null ? pimVar.equals(phaVar.a()) : phaVar.a() == null) {
                phu<V> phuVar = this.b;
                if (phuVar != null ? phuVar.equals(phaVar.b()) : phaVar.b() == null) {
                    if (this.c.equals(phaVar.c()) && this.d == phaVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        pim<V> pimVar = this.a;
        int i = 0;
        int hashCode = ((pimVar == null ? 0 : pimVar.hashCode()) ^ 1000003) * 1000003;
        phu<V> phuVar = this.b;
        if (phuVar != null) {
            i = phuVar.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 85 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CorpusConfig{signalStore=");
        sb.append(valueOf);
        sb.append(", eventSubjectSource=");
        sb.append(valueOf2);
        sb.append(", valueType=");
        sb.append(valueOf3);
        sb.append(", waaConsentRequired=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
