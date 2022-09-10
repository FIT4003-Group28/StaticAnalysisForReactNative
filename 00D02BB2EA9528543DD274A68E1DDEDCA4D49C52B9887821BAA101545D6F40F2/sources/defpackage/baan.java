package defpackage;
/* compiled from: PG */
/* renamed from: baan  reason: default package */
/* loaded from: classes3.dex */
public final class baan extends bttk<dvoj, dvon> {
    public final dvoj a;
    @dzsi
    public dvon b;
    @dzsi
    public int c;
    private final azls d;

    public baan(dvoj dvojVar, azls azlsVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        this.a = dvojVar;
        this.d = azlsVar;
    }

    @Override // defpackage.bttu
    protected final void a(@dzsi bttq bttqVar) {
        if (bttqVar != null || this.b == null || this.c != dvom.a) {
            azls azlsVar = this.d;
            if (this.c == 0) {
                int i = dvom.a;
            }
            azlsVar.a();
            return;
        }
        dvon dvonVar = this.b;
        dbsk.s(dvonVar);
        if ((dvonVar.a & 1) != 0) {
            String str = dvonVar.c;
            azls azlsVar2 = this.d;
            azlsVar2.c.c(str);
            azlsVar2.c.L(azlsVar2.a, azlsVar2.d, azlsVar2.b);
            return;
        }
        this.d.a();
    }
}
