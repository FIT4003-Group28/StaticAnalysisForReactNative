package defpackage;
/* compiled from: PG */
/* renamed from: avbq  reason: default package */
/* loaded from: classes2.dex */
final class avbq implements ckcx {
    final /* synthetic */ boolean a;

    public avbq(boolean z) {
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
            ddyqVar.a |= 8192;
            ddyqVar.k = true;
            return;
        }
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar3 = (ddyq) ddyfVar.b;
        ddyq ddyqVar4 = ddyq.K;
        ddyqVar3.a &= -8193;
        ddyqVar3.k = false;
    }
}
