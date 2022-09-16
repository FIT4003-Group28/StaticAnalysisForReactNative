package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caao  reason: default package */
/* loaded from: classes4.dex */
public final class caao implements cacy {
    final /* synthetic */ caaw a;

    public caao(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.cacy
    public final void a() {
        cqjg cqjgVar;
        final caaw caawVar = this.a;
        if (caawVar.be != 0 && (cqjgVar = casc.b) != null) {
            final RecyclerView recyclerView = (RecyclerView) cqkx.e(caawVar.e, cajs.b, RecyclerView.class);
            if (recyclerView == null) {
                bvoo.h("failed to scroll to section: no recycler view.", new Object[0]);
            } else {
                View d = cqkx.d(recyclerView, cqjgVar);
                final int i = -1;
                if (d == null) {
                    bvoo.h("failed to scroll to section: no section message.", new Object[0]);
                } else {
                    acl V = recyclerView.V(d);
                    if (V == null) {
                        bvoo.h("failed to scroll to section: no child view holder.", new Object[0]);
                    } else {
                        abg abgVar = recyclerView.k;
                        if (abgVar != null) {
                            int i2 = V.f;
                            int i3 = 0;
                            while (true) {
                                if (i3 < abgVar.c()) {
                                    if (abgVar.i(i3) == i2) {
                                        i = i3;
                                        break;
                                    }
                                    i3++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (i > 0) {
                    caawVar.ao.b(new Runnable(caawVar, recyclerView, i) { // from class: bzzp
                        private final caaw a;
                        private final RecyclerView b;
                        private final int c;

                        {
                            this.a = caawVar;
                            this.b = recyclerView;
                            this.c = i;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            caaw caawVar2 = this.a;
                            RecyclerView recyclerView2 = this.b;
                            int i4 = this.c;
                            if (caawVar2.aD) {
                                int NR = cqsg.d(caawVar2.aT(), caawVar2.aU()).NR(caawVar2.J()) + casc.c.NR(caawVar2.J());
                                aag aagVar = (aag) recyclerView2.l;
                                if (aagVar == null) {
                                    return;
                                }
                                aagVar.P(i4, NR);
                                caawVar2.br(recyclerView2, false);
                            }
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        }
        caaw caawVar2 = this.a;
        caawVar2.be = 0;
        caawVar2.bu();
    }
}
