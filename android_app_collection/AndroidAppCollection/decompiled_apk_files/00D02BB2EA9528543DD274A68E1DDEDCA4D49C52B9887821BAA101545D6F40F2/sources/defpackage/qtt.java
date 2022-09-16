package defpackage;
/* compiled from: PG */
/* renamed from: qtt  reason: default package */
/* loaded from: classes7.dex */
public final class qtt implements quv {
    public final ckcw a;
    @dzsi
    public ckcv b;
    private final cklq c;
    @dzsi
    private quu d;

    public qtt(ckcw ckcwVar, cklq cklqVar) {
        this.a = ckcwVar;
        this.c = cklqVar;
    }

    private final void c() {
        this.b = null;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@dzsi quu quuVar) {
        this.d = quuVar;
        ckcv ckcvVar = this.b;
        if (ckcvVar == null || quuVar == null) {
            c();
        } else {
            ckcvVar.a((ckcr) this.a.a(quuVar.f));
        }
    }

    @Override // defpackage.quv
    public final void b(quu quuVar) {
        quu quuVar2;
        ckcv ckcvVar = this.b;
        if (ckcvVar == null || (quuVar2 = this.d) == null) {
            return;
        }
        if (quuVar == quuVar2) {
            ckcvVar.a((ckcr) this.a.a(quuVar.g));
        }
        this.c.c(cklt.COMMUTE_HUB);
        c();
    }
}
