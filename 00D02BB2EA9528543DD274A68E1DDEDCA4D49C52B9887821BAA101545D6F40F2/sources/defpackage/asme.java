package defpackage;
/* compiled from: PG */
/* renamed from: asme  reason: default package */
/* loaded from: classes2.dex */
public final class asme {
    public final asmn a;
    private final bvjj b;
    private final dxio<ahjq> c;
    private final arag d;

    public asme(asmn asmnVar, bvjj bvjjVar, dxio<ahjq> dxioVar, arag aragVar) {
        dbsk.s(asmnVar);
        this.a = asmnVar;
        this.b = bvjjVar;
        dbsk.s(dxioVar);
        this.c = dxioVar;
        this.d = aragVar;
    }

    public final void a() {
        if (this.b.z(bvjk.aq, "fake_my_location_disabled").equals("fake_my_location_disabled") || this.c.a().a() == null) {
            this.d.i(new asmd(this));
        }
    }
}
