package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaht  reason: default package */
/* loaded from: classes6.dex */
public final class eaht extends eaib {
    final eaiz a;
    long b;

    public eaht(long j) {
        eaiz eaizVar = new eaiz();
        this.a = eaizVar;
        this.b = -1L;
        e(eaizVar, j);
    }

    @Override // defpackage.eaib, defpackage.eaen
    public final long b() {
        return this.b;
    }

    @Override // defpackage.eaen
    public final void c(eaja eajaVar) {
        eaiz eaizVar = this.a;
        eaizVar.G(((eajr) eajaVar).a, 0L, eaizVar.b);
    }

    @Override // defpackage.eaib
    public final eaem d(eaem eaemVar) {
        if (eaemVar.a("Content-Length") != null) {
            return eaemVar;
        }
        this.d.close();
        this.b = this.a.b;
        eael b = eaemVar.b();
        b.e("Transfer-Encoding");
        b.b("Content-Length", Long.toString(this.a.b));
        return b.a();
    }
}
