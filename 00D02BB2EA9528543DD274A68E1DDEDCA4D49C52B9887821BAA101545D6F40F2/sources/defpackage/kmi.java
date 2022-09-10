package defpackage;
/* compiled from: PG */
/* renamed from: kmi  reason: default package */
/* loaded from: classes7.dex */
final class kmi implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ kmj c;

    public kmi(kmj kmjVar, String str, String str2) {
        this.c = kmjVar;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ldm c = ldm.c(akqi.b(this.a), this.b);
        kmj kmjVar = this.c;
        nop nopVar = kmjVar.c;
        kdi kdiVar = kmjVar.b;
        kdk kdkVar = kdk.NOTHING;
        mnz mnzVar = mnz.PLACE_CARD_HOST_EV_STATION;
        dcdc<ldm> dcdcVar = this.c.d;
        cjsz cjszVar = new cjsz(dtxm.cK);
        kmj kmjVar2 = this.c;
        nopVar.k(kdiVar.c(c, null, null, kdkVar, mnzVar, false, true, dcdcVar, cjszVar, kmjVar2.a, kmjVar2.c));
    }
}
