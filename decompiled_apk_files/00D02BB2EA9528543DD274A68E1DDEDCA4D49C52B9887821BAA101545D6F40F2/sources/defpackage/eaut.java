package defpackage;
/* compiled from: PG */
/* renamed from: eaut  reason: default package */
/* loaded from: classes6.dex */
final class eaut implements eaux, eauw {
    public volatile eaux a;
    public volatile eauw b;
    private final String c = "T";
    private final eaux d;

    public eaut(eaux eauxVar) {
        this.d = eauxVar;
    }

    @Override // defpackage.eaux
    public final int a(eapu eapuVar) {
        eaux eauxVar = this.d;
        eaux eauxVar2 = this.a;
        int a = eauxVar.a(eapuVar) + eauxVar2.a(eapuVar);
        return eauxVar2.b(eapuVar, 1) > 0 ? a + this.c.length() : a;
    }

    @Override // defpackage.eaux
    public final int b(eapu eapuVar, int i) {
        int b = this.d.b(eapuVar, i);
        return b < i ? b + this.a.b(eapuVar, i) : b;
    }

    @Override // defpackage.eaux
    public final void c(StringBuffer stringBuffer, eapu eapuVar) {
        eaux eauxVar = this.d;
        eaux eauxVar2 = this.a;
        eauxVar.c(stringBuffer, eapuVar);
        if (eauxVar2.b(eapuVar, 1) > 0) {
            stringBuffer.append(this.c);
        }
        eauxVar2.c(stringBuffer, eapuVar);
    }
}
