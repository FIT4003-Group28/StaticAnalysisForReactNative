package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
final class aba implements Runnable {
    final /* synthetic */ abf a;
    final /* synthetic */ abh b;

    public aba(abh abhVar, abf abfVar) {
        this.b = abhVar;
        this.a = abfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.b.m;
        if (recyclerView == null || !recyclerView.r) {
            return;
        }
        abf abfVar = this.a;
        if (abfVar.n || abfVar.h.a() == -1) {
            return;
        }
        xs xsVar = this.b.m.E;
        if (xsVar == null || !xsVar.t(null)) {
            abh abhVar = this.b;
            int size = abhVar.l.size();
            for (int i = 0; i < size; i++) {
                if (((abf) abhVar.l.get(i)).o) {
                }
            }
            this.b.j.p();
            return;
        }
        this.b.m.post(this);
    }
}
