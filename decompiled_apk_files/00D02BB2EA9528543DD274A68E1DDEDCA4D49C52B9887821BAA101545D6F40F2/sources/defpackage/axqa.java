package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: axqa  reason: default package */
/* loaded from: classes3.dex */
public final class axqa extends cqqw {
    private static final dcqe b = dcqe.c("axqa");
    public boolean a;
    private final Runnable c;
    private boolean d = false;

    public axqa(boolean z, Runnable runnable) {
        this.c = runnable;
        this.a = z;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a) {
            abs absVar = recyclerView.l;
            if (!(absVar instanceof aag)) {
                bvoo.h("recyclerView's layoutManager should be an instance of LinearLayoutManager", new Object[0]);
                return;
            }
            aag aagVar = (aag) absVar;
            if (!this.d) {
                this.d = true;
                if (aagVar.ae() == aagVar.aN() - 1) {
                    this.c.run();
                    return;
                }
            }
            if (i2 <= 0) {
                return;
            }
            if (aagVar.aJ() + aagVar.ac() < aagVar.aN() - 5) {
                return;
            }
            this.c.run();
        }
    }
}
