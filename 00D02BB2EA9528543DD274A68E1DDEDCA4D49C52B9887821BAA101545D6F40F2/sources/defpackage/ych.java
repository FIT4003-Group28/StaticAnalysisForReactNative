package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ych  reason: default package */
/* loaded from: classes7.dex */
final class ych implements cqfd {
    final /* synthetic */ yci a;

    public ych(yci yciVar) {
        this.a = yciVar;
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        boolean z;
        xyv xyvVar;
        final int i;
        xyy e;
        vwg vwgVar = this.a.h.m;
        if (vwgVar == null) {
            vwgVar = vwg.d;
        }
        int a = vwd.a(vwgVar.c);
        if (a == 0 || a != 4) {
            vwg vwgVar2 = this.a.h.m;
            if (vwgVar2 == null) {
                vwgVar2 = vwg.d;
            }
            int a2 = vwd.a(vwgVar2.c);
            if (a2 != 0 && a2 == 3) {
                int a3 = vwf.a(vwgVar2.b);
                if (a3 != 0 && a3 == 3) {
                    z = true;
                } else {
                    int a4 = vwf.a(vwgVar2.b);
                    if (a4 != 0 && a4 == 4) {
                        z = false;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= this.a.b.size()) {
                        xyvVar = null;
                        break;
                    }
                    xyv xyvVar2 = this.a.b.get(i2);
                    if (xyvVar2 instanceof xza) {
                        e = ((xza) xyvVar2).e();
                    } else {
                        e = xyvVar2 instanceof xzc ? ((xzc) xyvVar2).e() : null;
                    }
                    if (e != null && e.e() == z) {
                        xyvVar = this.a.b.get(i2);
                        break;
                    }
                    i2++;
                }
                if (xyvVar != null) {
                    for (View view2 : cqkx.n(this.a)) {
                        final GmmRecyclerView gmmRecyclerView = (GmmRecyclerView) view2.findViewById(R.id.details_cardlist);
                        if (gmmRecyclerView != null) {
                            abg abgVar = gmmRecyclerView.k;
                            if (abgVar instanceof cqrj) {
                                cqrj cqrjVar = (cqrj) abgVar;
                                i = 0;
                                while (i < cqrjVar.c()) {
                                    if (cqrjVar.z(i) == xyvVar) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            i = -1;
                            if (i != -1) {
                                this.a.g.b(new Runnable(gmmRecyclerView, i) { // from class: ycf
                                    private final GmmRecyclerView a;
                                    private final int b;

                                    {
                                        this.a = gmmRecyclerView;
                                        this.b = i;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GmmRecyclerView gmmRecyclerView2 = this.a;
                                        int i3 = this.b;
                                        ycg ycgVar = new ycg(gmmRecyclerView2.getContext());
                                        ycgVar.g = i3;
                                        abs absVar = gmmRecyclerView2.l;
                                        if (absVar != null) {
                                            absVar.aw(ycgVar);
                                        }
                                    }
                                }, bvrj.UI_THREAD);
                            }
                        }
                    }
                }
            }
            return true;
        }
        ckos.b(view, R.string.DIRECTIONS_TRANSIT_MODE_SWAP_FAILURE_MESSAGE, 0).c();
        yci yciVar = this.a;
        vwh vwhVar = yciVar.h;
        dsqp dsqpVar = (dsqp) vwhVar.cu(5);
        dsqpVar.bC(vwhVar);
        vwa vwaVar = (vwa) dsqpVar;
        if (vwaVar.c) {
            vwaVar.bF();
            vwaVar.c = false;
        }
        vwh vwhVar2 = (vwh) vwaVar.b;
        vwhVar2.m = null;
        vwhVar2.a &= -1025;
        yciVar.h = vwaVar.bK();
        vmv vmvVar = this.a.d;
        if (vmvVar != null) {
            vmvVar.t();
        }
        return true;
    }
}
