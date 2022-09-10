package defpackage;
/* compiled from: PG */
/* renamed from: bxzi  reason: default package */
/* loaded from: classes4.dex */
public final class bxzi {
    public final bxzg a;
    public final ania b;
    public final dxio<aeaa> c;
    public final ckhe d;
    @dzsi
    public final cqix<? extends cqkp> e;
    public boolean f = true;

    public bxzi(bxzg bxzgVar, ania aniaVar, dxio<aeaa> dxioVar, ckcw ckcwVar, btvo btvoVar) {
        this.a = bxzgVar;
        this.b = aniaVar;
        this.c = dxioVar;
        this.d = (ckhe) ckcwVar.a(ckke.i);
        boolean z = btvoVar.getSuggestParameters().h;
        boolean z2 = btvoVar.getSuggestParameters().i;
        if (z) {
            this.e = cqgr.fT(new bxvw(), bxzgVar);
        } else if (z2) {
            this.e = cqgr.fT(new brhv(), new bsqs(dtyb.bF));
        } else {
            this.e = null;
        }
    }
}
