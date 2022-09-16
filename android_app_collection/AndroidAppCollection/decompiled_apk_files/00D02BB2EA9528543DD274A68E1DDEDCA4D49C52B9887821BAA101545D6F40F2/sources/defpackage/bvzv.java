package defpackage;
/* compiled from: PG */
/* renamed from: bvzv  reason: default package */
/* loaded from: classes4.dex */
public final class bvzv extends bvwl<dmfg, dmfi> {
    private final anhk c;

    public bvzv(anhk anhkVar) {
        super(dmfg.b, dmfi.d);
        this.c = anhkVar;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmfi g(dmfg dmfgVar) {
        dmfh bZ = dmfi.c.bZ();
        dnwb a = this.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfi dmfiVar = (dmfi) bZ.b;
        a.getClass();
        dmfiVar.b = a;
        dmfiVar.a |= 1;
        return bZ.bK();
    }
}
