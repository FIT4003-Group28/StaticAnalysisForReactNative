package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: afr  reason: default package */
/* loaded from: classes2.dex */
final class afr implements Runnable {
    final /* synthetic */ afx a;
    final /* synthetic */ int b;
    final /* synthetic */ aga c;

    public afr(aga agaVar, afx afxVar, int i) {
        this.c = agaVar;
        this.a = afxVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.c.m;
        if (recyclerView == null || !recyclerView.p) {
            return;
        }
        afx afxVar = this.a;
        if (afxVar.n || afxVar.h.f() == -1) {
            return;
        }
        abn abnVar = this.c.m.C;
        if (abnVar == null || !abnVar.r(null)) {
            aga agaVar = this.c;
            int size = agaVar.l.size();
            for (int i = 0; i < size; i++) {
                if (agaVar.l.get(i).o) {
                }
            }
            this.c.j.h(this.a.h, this.b);
            return;
        }
        this.c.m.post(this);
    }
}
