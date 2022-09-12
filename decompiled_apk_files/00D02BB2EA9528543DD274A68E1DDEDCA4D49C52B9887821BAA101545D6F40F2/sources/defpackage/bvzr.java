package defpackage;
/* compiled from: PG */
/* renamed from: bvzr  reason: default package */
/* loaded from: classes4.dex */
public final class bvzr extends bvwl<dmes, dmeu> {
    private final dzsj<bvsl> c;

    public bvzr(dzsj<bvsl> dzsjVar) {
        super(dmes.b, dmeu.d);
        this.c = dzsjVar;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmeu g(dmes dmesVar) {
        dmet bZ = dmeu.c.bZ();
        dowa b = this.c.a().b(null);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmeu dmeuVar = (dmeu) bZ.b;
        dmeuVar.b = b.e;
        dmeuVar.a |= 1;
        return bZ.bK();
    }
}
