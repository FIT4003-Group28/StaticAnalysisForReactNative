package defpackage;
/* compiled from: PG */
/* renamed from: bwao  reason: default package */
/* loaded from: classes4.dex */
public final class bwao extends bvwn<dmgs> {
    private static final bviw b = bvjk.b;
    private final dxio<bvjj> c;
    private final dxio<akfa> d;

    public bwao(dxio<bvjj> dxioVar, dxio<akfa> dxioVar2) {
        super(dmgs.d);
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmgs dmgsVar) {
        dmgs dmgsVar2 = dmgsVar;
        if (dmgsVar2.a.isEmpty()) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            throw c.a();
        }
        bvjk bvjkVar = new bvjk(dmgsVar2.a, b);
        bvjj a = this.c.a();
        if (dmgsVar2.b) {
            a.Q(bvjkVar, this.d.a().j());
        } else {
            a.P(bvjkVar);
        }
    }
}
