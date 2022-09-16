package defpackage;
/* compiled from: PG */
/* renamed from: nna  reason: default package */
/* loaded from: classes3.dex */
final class nna extends nmx {
    final /* synthetic */ nnb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nna(nnb nnbVar, String str, nmc nmcVar) {
        super(str, nmcVar);
        this.f = nnbVar;
    }

    @Override // defpackage.nmx
    public final void a(int i) {
        if (i == 5) {
            nnb nnbVar = this.f;
            String str = this.a;
            nmc nmcVar = this.b;
            nmx a = nnbVar.a(str);
            if (nnbVar.b(str) && a != null && nmcVar.equals(a.b)) {
                if (this.c != 2) {
                    return;
                }
                super.a(4);
                return;
            }
        }
        super.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        super.a(5);
    }
}
