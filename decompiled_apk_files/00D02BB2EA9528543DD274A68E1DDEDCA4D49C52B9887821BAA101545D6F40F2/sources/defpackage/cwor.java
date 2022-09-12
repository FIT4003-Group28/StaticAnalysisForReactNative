package defpackage;
/* compiled from: PG */
/* renamed from: cwor  reason: default package */
/* loaded from: classes5.dex */
final class cwor extends cwoj {
    static final dbrn<cowu, cwls> a = new cwor();

    @Override // defpackage.cwoj
    public final void b(cowu cowuVar, cwlq cwlqVar) {
        if (!cowuVar.f() || "null".equals(cowuVar.g())) {
            return;
        }
        ((cwli) cwlqVar).b = cowuVar.g();
    }

    @Override // defpackage.cwoj
    public final void c(cowu cowuVar, cwlq cwlqVar) {
        if (!cowuVar.h() || "null".equals(cowuVar.i())) {
            return;
        }
        ((cwli) cwlqVar).c = cowuVar.i();
    }

    @Override // defpackage.cwoj
    public final void d(cowu cowuVar, cwlq cwlqVar) {
        cwlqVar.g(cowuVar.z() == 2);
    }
}
