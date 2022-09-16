package defpackage;
/* compiled from: PG */
/* renamed from: rft  reason: default package */
/* loaded from: classes4.dex */
final class rft extends rfu {
    private final rfp a;

    public rft(rvh rvhVar, rfp rfpVar) {
        super(rvhVar);
        this.a = rfpVar;
    }

    @Override // defpackage.rfu, defpackage.rgm
    public final void b() {
        rfp rfpVar = this.a;
        qst qstVar = rfpVar.c;
        rfv rfvVar = rfpVar.a;
        rgf rgfVar = rfpVar.b;
        rfvVar.a = false;
        qstVar.z(rgfVar);
    }
}
