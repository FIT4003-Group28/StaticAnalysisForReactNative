package defpackage;
/* compiled from: PG */
/* renamed from: beys  reason: default package */
/* loaded from: classes3.dex */
public class beys implements beyr {
    private final gen a;
    private final ilo b;
    private final cjtd c;

    public beys(gen genVar, bwrs<ilo> bwrsVar, bfby bfbyVar) {
        this.a = genVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.b = c;
        this.c = bfbz.b(bfbyVar, bfbx.WELCOME_OFFER_SAVED_OK, c, dbpy.a);
    }

    @Override // defpackage.beyr
    public cqkl a() {
        this.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.beyr
    public cjtd b() {
        return this.c;
    }
}
