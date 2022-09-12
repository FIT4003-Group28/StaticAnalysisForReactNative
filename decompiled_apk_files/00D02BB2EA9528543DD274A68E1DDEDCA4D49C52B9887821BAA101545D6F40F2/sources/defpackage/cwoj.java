package defpackage;
/* compiled from: PG */
/* renamed from: cwoj  reason: default package */
/* loaded from: classes5.dex */
abstract class cwoj implements dbrn<cowu, cwls> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cwls a(cowu cowuVar) {
        cowu cowuVar2 = cowuVar;
        cwlq k = cwls.k();
        if (cowuVar2.b() != null) {
            k.b(cowuVar2.b());
        }
        if (cowuVar2.e() != null) {
            ((cwli) k).a = cowuVar2.e();
        }
        if (cowuVar2.g() != null) {
            b(cowuVar2, k);
        }
        if (cowuVar2.i() != null) {
            c(cowuVar2, k);
        }
        if (cowuVar2.j() != null) {
            ((cwli) k).d = cowuVar2.j();
        }
        d(cowuVar2, k);
        if (cowuVar2.n() != null) {
            ((cwli) k).e = cowuVar2.n();
        }
        return k.a();
    }

    public void b(cowu cowuVar, cwlq cwlqVar) {
        throw null;
    }

    public void c(cowu cowuVar, cwlq cwlqVar) {
        throw null;
    }

    public abstract void d(cowu cowuVar, cwlq cwlqVar);
}
