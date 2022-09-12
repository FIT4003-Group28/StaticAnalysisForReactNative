package defpackage;
/* compiled from: PG */
/* renamed from: eaur  reason: default package */
/* loaded from: classes6.dex */
final class eaur implements eaux, eauw {
    static final eaur a = new eaur("");
    private final String b;

    public eaur(String str) {
        this.b = str;
    }

    @Override // defpackage.eaux
    public final int a(eapu eapuVar) {
        return this.b.length();
    }

    @Override // defpackage.eaux
    public final int b(eapu eapuVar, int i) {
        return 0;
    }

    @Override // defpackage.eaux
    public final void c(StringBuffer stringBuffer, eapu eapuVar) {
        stringBuffer.append(this.b);
    }
}
