package defpackage;
/* compiled from: PG */
/* renamed from: nmr  reason: default package */
/* loaded from: classes3.dex */
final class nmr extends yye {
    final /* synthetic */ nms a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmr(nms nmsVar) {
        super(nmsVar.h);
        this.a = nmsVar;
    }

    @Override // defpackage.yye
    public final void a(boolean z, boolean z2) {
        asxp asxpVar = this.a.f.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if ((asxpVar.f & 4096) != 0) {
            long j = asxpVar.av;
            this.e = j;
            this.d = j;
        } else {
            this.e = yye.g(this.b.getResources());
            this.d = yye.g(this.b.getResources());
        }
        super.a(z, z2);
    }
}
