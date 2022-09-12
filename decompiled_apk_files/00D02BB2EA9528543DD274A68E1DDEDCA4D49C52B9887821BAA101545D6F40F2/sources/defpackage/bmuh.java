package defpackage;
/* renamed from: bmuh  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmuh implements dbrn {
    static final dbrn a = new bmuh();

    private bmuh() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        bmtq bmtqVar = doubleValue != 1.0d ? bmtq.START : bmtq.END;
        boolean z = false;
        if (doubleValue >= dcyn.a && doubleValue <= 1.0d) {
            z = true;
        }
        dbsk.a(z);
        return new bmtg(doubleValue, bmtqVar);
    }
}
