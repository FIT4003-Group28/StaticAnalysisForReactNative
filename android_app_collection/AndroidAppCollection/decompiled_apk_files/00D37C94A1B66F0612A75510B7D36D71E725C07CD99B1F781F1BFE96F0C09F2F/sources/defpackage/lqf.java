package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lqf  reason: default package */
/* loaded from: classes3.dex */
final class lqf extends bpg {
    final /* synthetic */ lqh b;

    public lqf(lqh lqhVar) {
        this.b = lqhVar;
    }

    @Override // defpackage.bpg
    public final Object c(ViewGroup viewGroup, int i) {
        lqh lqhVar = this.b;
        View view = (View) lqhVar.c.get(lqhVar.b.y(i));
        this.b.b.addView(view, 0);
        return view;
    }

    @Override // defpackage.bpg
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        this.b.b.removeView((View) obj);
    }

    @Override // defpackage.bpg
    public final boolean g(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.bpg
    public final int j() {
        return this.b.c.size();
    }

    @Override // defpackage.bpg
    public final int k(Object obj) {
        for (int i = 0; i < this.b.c.size(); i++) {
            if (((View) this.b.c.get(i)) == obj) {
                return this.b.b.y(i);
            }
        }
        return -2;
    }
}
