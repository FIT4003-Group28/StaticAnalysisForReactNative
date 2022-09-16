package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: iau  reason: default package */
/* loaded from: classes6.dex */
final class iau extends cqqw {
    final /* synthetic */ iaw a;

    public iau(iaw iawVar) {
        this.a = iawVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            iaw iawVar = this.a;
            iawVar.h = false;
            iawVar.j = 0;
            cqkx.p(iawVar);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        aag aagVar;
        if ((i == 0 && i2 == 0) || (aagVar = (aag) recyclerView.l) == null) {
            return;
        }
        int ac = aagVar.ac();
        if (ac != -1) {
            this.a.k = ac;
        }
        iaw iawVar = this.a;
        int signum = Integer.signum(i2);
        int i3 = iawVar.j;
        if (i3 != 0 && i2 != 0 && signum != i3) {
            iawVar.h = false;
        }
        iawVar.j = signum;
        iaw iawVar2 = this.a;
        if (iawVar2.h) {
            return;
        }
        int a = iawVar2.g.a();
        int i4 = 0;
        while (i4 < a) {
            if (i4 != a - 1) {
                iaw iawVar3 = this.a;
                int i5 = i4 + 1;
                if (iawVar3.k >= iawVar3.g.b(i5)) {
                    i4 = i5;
                }
            }
            iaw iawVar4 = this.a;
            iawVar4.i = true;
            iawVar4.e = new iba(i4, true);
            cqkx.p(this.a.a());
            this.a.i = false;
            return;
        }
    }
}
