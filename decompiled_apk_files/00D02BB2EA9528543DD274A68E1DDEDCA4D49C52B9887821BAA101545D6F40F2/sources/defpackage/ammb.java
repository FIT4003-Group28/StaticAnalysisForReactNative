package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammb  reason: default package */
/* loaded from: classes.dex */
public final class ammb implements ckcx {
    final /* synthetic */ int a;

    public ammb(int i) {
        this.a = i;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        int i = this.a;
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        ddyq ddyqVar2 = ddyq.K;
        ddyqVar.o = i - 1;
        ddyqVar.a |= 131072;
    }
}
