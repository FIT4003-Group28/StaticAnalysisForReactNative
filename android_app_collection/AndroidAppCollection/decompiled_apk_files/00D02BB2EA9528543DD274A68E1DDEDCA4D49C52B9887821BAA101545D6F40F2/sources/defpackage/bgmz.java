package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgmz  reason: default package */
/* loaded from: classes3.dex */
public final class bgmz extends cqiw<bgoc> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    private final cqmp<bgoc>[] d;
    private final cqjb<bgoc, cqfc> e;

    public bgmz(cqmp<bgoc>... cqmpVarArr) {
        super(cqmpVarArr);
        this.e = new cqjb(this) { // from class: bgmm
            private final bgmz a;

            {
                this.a = this;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, final Context context) {
                bgoc bgocVar = (bgoc) cqkpVar;
                return new cqfc(context) { // from class: bgmp
                    private final Context a;

                    {
                        this.a = context;
                    }

                    @Override // defpackage.cqfc
                    public final void a(View view, boolean z) {
                        Context context2 = this.a;
                        apqr apqrVar = (apqr) cqkx.e(view, bgmz.b, apqr.class);
                        RelativeLayout relativeLayout = (RelativeLayout) cqkx.e(view, bgmz.c, RelativeLayout.class);
                        if (apqrVar == null || relativeLayout == null) {
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                        if (apqrVar.getHeight() >= cqrp.d(300.0d).e(context2)) {
                            return;
                        }
                        layoutParams.height = apqrVar.getHeight();
                        relativeLayout.setLayoutParams(layoutParams);
                    }
                };
            }
        };
        this.d = cqmpVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgoc> a() {
        cqmj<bgoc> gj = cqgr.gj(cqgr.aT(c), cqgr.fl(R.style.LocalPostsTheme), cqgr.x(ibm.c()), cqgr.bq(cqrp.d(300.0d)), iue.c(bgmq.a), cqgr.fE(this.e), cqgr.cW(bgmr.a), cqgr.dk(bgms.a), cqgr.V(bgmt.a), apqr.j(cqgr.aT(b), cqgr.bY(cqjd.c()), apqr.k(bgmu.a), apqr.l(bgmv.a), apqr.q(apqp.SHRINK_CONTAINER), apqr.m(bgmw.a), apqr.n(bgmx.a), apqr.r(bgmy.a), apqr.o(false)), cqgr.gj(cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-1), cqgr.v(Integer.valueOf((int) R.color.videoFocusBackground)), cqgr.fR(new apol(), bgmn.a, cqgr.bY(cqjd.c())), cqgr.fR(new appi(), bgmo.a, cqgr.bY(cqjd.j()), cqgr.v(Integer.valueOf((int) R.drawable.quantum_gradient_bar_bottom)))));
        gj.f(this.d);
        return gj;
    }
}
