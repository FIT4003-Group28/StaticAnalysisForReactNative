package defpackage;
/* compiled from: PG */
/* renamed from: ppy  reason: default package */
/* loaded from: classes7.dex */
final class ppy implements ckcx {
    final /* synthetic */ ddon a;

    public ppy(ddon ddonVar) {
        this.a = ddonVar;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        int a = dveq.a(((ddoo) this.a.b).b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        ddyq ddyqVar2 = ddyq.K;
        ddyqVar.c = a - 1;
        ddyqVar.a |= 1;
        int a2 = dumc.a(((ddoo) this.a.b).c);
        if (a2 != 0) {
            i = a2;
        }
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar3 = (ddyq) ddyfVar.b;
        ddyqVar3.d = i - 1;
        ddyqVar3.a |= 2;
    }
}
