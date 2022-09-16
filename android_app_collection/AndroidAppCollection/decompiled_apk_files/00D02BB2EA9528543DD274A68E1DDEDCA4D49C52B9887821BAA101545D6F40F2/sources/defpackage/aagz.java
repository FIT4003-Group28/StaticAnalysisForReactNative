package defpackage;
/* compiled from: PG */
/* renamed from: aagz  reason: default package */
/* loaded from: classes2.dex */
class aagz extends aafy {
    private final gga e;

    public aagz(aafv aafvVar, gga ggaVar, aafw aafwVar) {
        super(aafvVar, aafwVar);
        this.e = ggaVar;
    }

    @Override // defpackage.aafy, defpackage.ivk, defpackage.izs
    public Boolean L() {
        boolean z = false;
        if (super.L().booleanValue() && btpf.c(this.e) != btpf.PHONE_LANDSCAPE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ivk, defpackage.izs
    public cjtd V() {
        return cjtd.a(dtxo.ca);
    }
}
