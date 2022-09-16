package defpackage;
/* compiled from: PG */
/* renamed from: chl  reason: default package */
/* loaded from: classes2.dex */
public final class chl implements cnq {
    private final chi a;
    private final chb b;

    public chl(chb chbVar, ajnp ajnpVar) {
        this.b = chbVar;
        this.a = new chi(ajnpVar);
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        cnf cnfVar = (cnf) obj;
        return new cnp(cnfVar, new chj(this.a, this.b, cnfVar));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        cnf cnfVar = (cnf) obj;
        return true;
    }
}
