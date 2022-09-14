package defpackage;
/* compiled from: PG */
/* renamed from: bmel  reason: default package */
/* loaded from: classes3.dex */
public class bmel {
    private final eeu a;
    private final dxio<aesb> b;
    private final bwft c;

    public bmel(eeu eeuVar, dxio<aesb> dxioVar, bwft bwftVar) {
        this.a = eeuVar;
        this.b = dxioVar;
        this.c = bwftVar;
    }

    public final void a(@dzsi bwrs<ilo> bwrsVar) {
        if (bwrsVar == null || bwrsVar.c() == null || !((efh) this.a).b) {
            return;
        }
        this.b.a().D((ilo) bwrs.b(bwrsVar), 8, dtxy.mq);
        this.c.a(bwrsVar, dtxy.mq);
    }
}
