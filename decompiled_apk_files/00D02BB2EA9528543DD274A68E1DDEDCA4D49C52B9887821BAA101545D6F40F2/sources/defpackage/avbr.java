package defpackage;
/* compiled from: PG */
/* renamed from: avbr  reason: default package */
/* loaded from: classes2.dex */
final class avbr implements ckcx {
    final /* synthetic */ boolean a;

    public avbr(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        if (this.a) {
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar = (ddyq) ddyfVar.b;
            ddyq ddyqVar2 = ddyq.K;
            ddyqVar.a |= 16384;
            ddyqVar.l = true;
            return;
        }
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar3 = (ddyq) ddyfVar.b;
        ddyq ddyqVar4 = ddyq.K;
        ddyqVar3.a &= -16385;
        ddyqVar3.l = false;
    }
}
