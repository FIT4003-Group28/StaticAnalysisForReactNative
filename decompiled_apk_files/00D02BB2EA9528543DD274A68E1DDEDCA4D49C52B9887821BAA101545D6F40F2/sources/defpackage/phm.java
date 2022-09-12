package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: phm  reason: default package */
/* loaded from: classes7.dex */
final class phm implements degu<List<pfm>> {
    final /* synthetic */ pfh a;
    final /* synthetic */ phn b;

    public phm(phn phnVar, pfh pfhVar) {
        this.b = phnVar;
        this.a = pfhVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.e();
        this.b.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<pfm> list) {
        List<pfm> list2 = list;
        if (this.b.a) {
            return;
        }
        for (pfm pfmVar : list2) {
            if (pfmVar.e != 0) {
                this.a.d(pfmVar);
            }
        }
        this.a.e();
    }
}
