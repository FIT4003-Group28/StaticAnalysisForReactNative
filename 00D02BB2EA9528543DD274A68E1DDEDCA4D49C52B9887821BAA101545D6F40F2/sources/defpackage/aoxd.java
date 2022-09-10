package defpackage;
/* compiled from: PG */
/* renamed from: aoxd  reason: default package */
/* loaded from: classes2.dex */
final class aoxd extends aoxu {
    public final bwrs<aoyg> a;
    public final bwrs<aoyg> b;

    public aoxd(bwrs<aoyg> bwrsVar, bwrs<aoyg> bwrsVar2) {
        this.a = bwrsVar;
        this.b = bwrsVar2;
    }

    @Override // defpackage.aoxu
    public final bwrs<aoyg> a() {
        return this.a;
    }

    @Override // defpackage.aoxu
    public final bwrs<aoyg> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoxu) {
            aoxu aoxuVar = (aoxu) obj;
            if (this.a.equals(aoxuVar.a()) && this.b.equals(aoxuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("CitiesAndCountriesLists{citiesListRef=");
        sb.append(valueOf);
        sb.append(", countriesListRef=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
