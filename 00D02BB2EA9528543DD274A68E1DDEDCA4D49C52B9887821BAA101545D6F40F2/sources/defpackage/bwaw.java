package defpackage;
/* compiled from: PG */
/* renamed from: bwaw  reason: default package */
/* loaded from: classes4.dex */
public final class bwaw extends bvwn<dmhi> {
    private final dxio<auho> b;

    public bwaw(dxio<auho> dxioVar) {
        super(dmhi.d);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmhi dmhiVar) {
        dmhi dmhiVar2 = dmhiVar;
        dpyv b = dpyv.b(dmhiVar2.a);
        if (b == null) {
            b = dpyv.UNKNOWN_NOTIFICATION_ID;
        }
        if (b != dpyv.UNKNOWN_NOTIFICATION_ID) {
            dmhh b2 = dmhh.b(dmhiVar2.b);
            if (b2 == null) {
                b2 = dmhh.UNKNOWN_STATE;
            }
            if (b2 != dmhh.UNKNOWN_STATE) {
                auho a = this.b.a();
                dpyv b3 = dpyv.b(dmhiVar2.a);
                if (b3 == null) {
                    b3 = dpyv.UNKNOWN_NOTIFICATION_ID;
                }
                int i = b3.dm;
                bwav bwavVar = new bwav();
                dmhh b4 = dmhh.b(dmhiVar2.b);
                if (b4 == null) {
                    b4 = dmhh.UNKNOWN_STATE;
                }
                a.e(i, bwavVar.NV(b4));
                return;
            }
        }
        bvwi c = bvwj.c();
        c.b(drtc.INVALID_ARGUMENT);
        throw c.a();
    }
}
