package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yyh  reason: default package */
/* loaded from: classes7.dex */
public class yyh implements yyd {
    private final acoe a;
    private final zvb b;
    private final String c;
    private final int d;

    public yyh(acoe acoeVar, djym djymVar, int i) {
        this.a = acoeVar;
        this.b = new zvb(dcdc.r(djymVar.b));
        djys djysVar = djymVar.d;
        this.c = albv.e((djysVar == null ? djys.g : djysVar).b);
        this.d = i;
    }

    @Override // defpackage.yyd
    public zvb a() {
        return this.b;
    }

    @Override // defpackage.yyd
    public String b() {
        return this.c;
    }

    @Override // defpackage.yyd
    public Boolean c() {
        return Boolean.valueOf(this.a.Os().intValue() == this.d);
    }
}
