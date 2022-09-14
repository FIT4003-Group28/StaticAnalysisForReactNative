package defpackage;
/* compiled from: PG */
/* renamed from: bfyj  reason: default package */
/* loaded from: classes3.dex */
final class bfyj implements bmof<Integer> {
    final /* synthetic */ bnii a;
    final /* synthetic */ bfyk b;

    public bfyj(bfyk bfykVar, bnii bniiVar) {
        this.b = bfykVar;
        this.a = bniiVar;
    }

    @Override // defpackage.bmof
    public final /* bridge */ /* synthetic */ void a(Integer num) {
        bfyk bfykVar = this.b;
        if (!bfykVar.b) {
            bfykVar.b = this.a.G(ckgo.i).booleanValue();
        }
    }

    @Override // defpackage.bmof
    public final /* bridge */ /* synthetic */ cqkl b(Integer num) {
        bfyk bfykVar = this.b;
        if (!bfykVar.a) {
            bfykVar.a = this.a.G(ckgo.h).booleanValue();
        }
        return cqkl.a;
    }
}
