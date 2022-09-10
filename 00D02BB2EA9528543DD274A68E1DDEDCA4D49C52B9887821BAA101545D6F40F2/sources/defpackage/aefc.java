package defpackage;
/* compiled from: PG */
/* renamed from: aefc  reason: default package */
/* loaded from: classes.dex */
public final class aefc implements acyt {
    int a = 0;
    final /* synthetic */ aegc b;
    final /* synthetic */ aefg c;

    public aefc(aefg aefgVar, aegc aegcVar) {
        this.c = aefgVar;
        this.b = aegcVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        int c = this.b.c();
        int i = this.a;
        aefg aefgVar = this.c;
        if (aefgVar.q && c > i) {
            ((ckcn) aefgVar.k.a(ckfh.aJ)).a();
            this.c.q = false;
        }
        this.a = this.b.c();
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
