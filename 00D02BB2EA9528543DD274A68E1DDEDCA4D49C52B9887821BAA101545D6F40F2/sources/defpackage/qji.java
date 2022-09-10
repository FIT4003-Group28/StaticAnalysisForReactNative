package defpackage;
/* compiled from: PG */
/* renamed from: qji  reason: default package */
/* loaded from: classes7.dex */
final class qji extends qjn {
    private final azva a;
    private final azva b;

    public qji(@dzsi azva azvaVar, @dzsi azva azvaVar2) {
        this.a = azvaVar;
        this.b = azvaVar2;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azva a() {
        return this.a;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azva b() {
        return this.b;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azxa c() {
        return null;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azxa d() {
        return null;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azxa e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjn) {
            qjn qjnVar = (qjn) obj;
            azva azvaVar = this.a;
            if (azvaVar != null ? azvaVar.equals(qjnVar.a()) : qjnVar.a() == null) {
                azva azvaVar2 = this.b;
                if (azvaVar2 != null ? azvaVar2.equals(qjnVar.b()) : qjnVar.b() == null) {
                    if (qjnVar.c() == null && qjnVar.d() == null && qjnVar.e() == null && qjnVar.f() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.qjn
    @dzsi
    public final azxa f() {
        return null;
    }

    public final int hashCode() {
        azva azvaVar = this.a;
        int i = 0;
        int hashCode = ((azvaVar == null ? 0 : azvaVar.hashCode()) ^ 1000003) * 1000003;
        azva azvaVar2 = this.b;
        if (azvaVar2 != null) {
            i = azvaVar2.hashCode();
        }
        return (hashCode ^ i) * 1525764945;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = "null".length();
        int length4 = "null".length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + length3 + length4 + "null".length() + "null".length());
        sb.append("HomeWorkResult{home=");
        sb.append(valueOf);
        sb.append(", work=");
        sb.append(valueOf2);
        sb.append(", homePlaceAlias=");
        sb.append("null");
        sb.append(", workPlaceAlias=");
        sb.append("null");
        sb.append(", inferredHome=");
        sb.append("null");
        sb.append(", inferredWork=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
