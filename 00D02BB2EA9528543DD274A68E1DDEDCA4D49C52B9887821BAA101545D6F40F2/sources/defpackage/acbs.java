package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: acbs  reason: default package */
/* loaded from: classes2.dex */
final class acbs extends cqqw {
    final /* synthetic */ acbv a;
    private final bcky b;

    public acbs(acbv acbvVar, bcky bckyVar) {
        this.a = acbvVar;
        this.b = bckyVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        abg abgVar;
        if (i == 0 && recyclerView.computeVerticalScrollOffset() == 0 && (abgVar = recyclerView.k) != null) {
            abgVar.s();
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abs absVar = recyclerView.l;
        if (absVar instanceof aeh) {
            aeh aehVar = (aeh) absVar;
            if (aehVar == null) {
                bvoo.h("InfiniteScrollingListener requires non-null layout manager.", new Object[0]);
                return;
            }
            this.b.a(recyclerView, i, i2);
            acbg acbgVar = this.a.d;
            acbgVar.c = recyclerView.computeVerticalScrollOffset();
            if (acbgVar.a()) {
                cqkx.p(this.a);
            }
            int i3 = aehVar.a;
            int[] iArr = new int[i3];
            if (i3 >= i3) {
                for (int i4 = 0; i4 < aehVar.a; i4++) {
                    aeg aegVar = aehVar.b[i4];
                    iArr[i4] = aegVar.f.e ? aegVar.s(0, aegVar.a.size()) : aegVar.s(aegVar.a.size() - 1, -1);
                }
                if (aehVar.aN() - (iArr[0] + 1) > 10) {
                    return;
                }
                this.a.c.c();
                return;
            }
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + aehVar.a + ", array size:" + i3);
        }
        bvoo.h("InfiniteScrollingListener applied to incorrect View.", new Object[0]);
    }
}
