package defpackage;
/* compiled from: PG */
/* renamed from: siv  reason: default package */
/* loaded from: classes7.dex */
public final class siv {
    public final ckcw a;
    @dzsi
    public ckcv b;
    public final siu c = new siu(ckjs.b);
    public final siu d = new siu(ckjs.c);
    public final siu e = new siu(ckjs.d);
    public final siu f = new siu(ckjs.e);
    private final cklq g;

    public siv(ckcw ckcwVar, cklq cklqVar) {
        this.a = ckcwVar;
        this.g = cklqVar;
    }

    public final void a(siu siuVar) {
        ckcv ckcvVar = this.b;
        if (ckcvVar != null && !siuVar.b) {
            ckcvVar.a((ckcr) this.a.a(siuVar.a));
            siuVar.b = true;
            this.g.b();
            if (!this.c.b || !this.d.b || !this.e.b || !this.f.b || this.b == null) {
                return;
            }
            this.g.c(cklt.TRANSPORTATION_TAB);
            this.b = null;
        }
    }
}
