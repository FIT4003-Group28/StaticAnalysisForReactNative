package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgsd  reason: default package */
/* loaded from: classes4.dex */
public final class cgsd implements bqlb {
    final /* synthetic */ cgsh a;

    public cgsd(cgsh cgshVar) {
        this.a = cgshVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        cgsh cgshVar = this.a;
        cgshVar.j.c(cgshVar.n);
        this.a.h();
    }

    @Override // defpackage.bqlb
    public final void e() {
        cgsh cgshVar = this.a;
        cgshVar.j.b(cgshVar.n, cgsf.SERVER_ERROR);
        this.a.h();
    }
}
