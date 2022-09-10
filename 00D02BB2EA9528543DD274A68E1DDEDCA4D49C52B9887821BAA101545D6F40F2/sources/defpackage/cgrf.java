package defpackage;
/* compiled from: PG */
/* renamed from: cgrf  reason: default package */
/* loaded from: classes4.dex */
public final class cgrf implements cgrd<dhry> {
    private static final dcqe d = dcqe.c("cgrf");
    public final cgrc a;
    public cgri b;
    public final buky c;

    public cgrf(buky bukyVar, cgrc cgrcVar) {
        this.a = cgrcVar;
        this.c = bukyVar;
    }

    private static void d() {
        bvoo.h("Share request manager is null when trying to deliver CreateShareableUrl RPC result. Please call setRequestManager() before sending request.", new Object[0]);
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cgri cgriVar = this.b;
        if (cgriVar == null) {
            d();
        } else {
            cgriVar.d("");
        }
    }

    @Override // defpackage.cgrd
    public final void b() {
        cgri cgriVar = this.b;
        if (cgriVar == null) {
            d();
        } else {
            cgriVar.d("");
        }
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dhry dhryVar) {
        dhry dhryVar2 = dhryVar;
        cgri cgriVar = this.b;
        if (cgriVar == null) {
            d();
        } else {
            cgriVar.d(dhryVar2.b);
        }
    }
}
