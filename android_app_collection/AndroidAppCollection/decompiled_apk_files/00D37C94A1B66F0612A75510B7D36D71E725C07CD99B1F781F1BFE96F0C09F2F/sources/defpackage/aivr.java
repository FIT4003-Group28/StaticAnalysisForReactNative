package defpackage;
/* compiled from: PG */
/* renamed from: aivr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aivr implements afip {
    public final /* synthetic */ aivt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aivr(aivt aivtVar, int i) {
        this.b = i;
        this.a = aivtVar;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        if (this.b == 0) {
            long d = this.a.a.d();
            StringBuilder sb = new StringBuilder(27);
            double d2 = d - j;
            Double.isNaN(d2);
            sb.append(d2 / 1000.0d);
            sb.append(";su");
            return sb.toString();
        }
        long d3 = this.a.a.d();
        StringBuilder sb2 = new StringBuilder(27);
        double d4 = d3 - j;
        Double.isNaN(d4);
        sb2.append(d4 / 1000.0d);
        sb2.append(";pi");
        return sb2.toString();
    }
}
