package defpackage;
/* compiled from: PG */
/* renamed from: mis  reason: default package */
/* loaded from: classes7.dex */
public final class mis implements kyx {
    private final kdi a;
    private final nov b;
    private final nop c;
    private final noo d;
    private final dcdc<ldm> e;
    private final not f;

    public mis(kdi kdiVar, nov novVar, nop nopVar, noo nooVar, not notVar) {
        dcdc<ldm> e = dcdc.e();
        dbsk.s(kdiVar);
        this.a = kdiVar;
        this.b = novVar;
        this.c = nopVar;
        this.d = nooVar;
        this.f = notVar;
        dbsk.s(e);
        this.e = e;
    }

    @Override // defpackage.kyx
    public final void a(ldm ldmVar, boolean z) {
        mnz mnzVar;
        this.b.a();
        this.d.a();
        nop nopVar = this.c;
        kdi kdiVar = this.a;
        kdk kdkVar = kdk.NOTHING;
        if (z) {
            mnzVar = mnz.MAP_INTERACTION_DROPPED_PIN;
        } else {
            mnzVar = mnz.MAP_INTERACTION_POI;
        }
        nopVar.k(kdiVar.c(ldmVar, null, null, kdkVar, mnzVar, z, true, this.e, null, this.f, this.c));
        this.b.b();
    }
}
