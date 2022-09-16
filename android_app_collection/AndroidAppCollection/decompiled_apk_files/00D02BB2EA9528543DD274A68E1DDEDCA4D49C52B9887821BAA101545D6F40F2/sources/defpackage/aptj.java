package defpackage;
/* compiled from: PG */
/* renamed from: aptj  reason: default package */
/* loaded from: classes2.dex */
public final class aptj extends bvxb<dbnw, dbny> {
    public final btrm a;
    public final bwrs<ilo> b;
    private final gga c;

    public aptj(gga ggaVar, btrm btrmVar, bwrs<ilo> bwrsVar) {
        this.c = ggaVar;
        this.a = btrmVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "drtr.rrd";
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbny e(dbnw dbnwVar) {
        final dbnw dbnwVar2 = dbnwVar;
        this.c.runOnUiThread(new Runnable(this, dbnwVar2) { // from class: apth
            private final aptj a;
            private final dbnw b;

            {
                this.a = this;
                this.b = dbnwVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aptj aptjVar = this.a;
                dbnw dbnwVar3 = this.b;
                String str = dbnwVar3.a;
                ilo c = aptjVar.b.c();
                if (c == null || c.bo() == null) {
                    return;
                }
                bwrs<ilo> bwrsVar = aptjVar.b;
                ily g = c.g();
                g.J(dbnwVar3.a, apti.a);
                bwrsVar.d(g.d());
                aptjVar.a.b(new apuk(str));
            }
        });
        return dbny.a;
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbnw j(byte[] bArr) {
        return ((dbnv) dbnw.b.bZ().by(bArr)).bK();
    }
}
