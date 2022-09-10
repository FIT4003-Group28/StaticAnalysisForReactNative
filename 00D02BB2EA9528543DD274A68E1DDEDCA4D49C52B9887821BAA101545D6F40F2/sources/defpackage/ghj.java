package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ghj  reason: default package */
/* loaded from: classes6.dex */
public final class ghj extends cqiw<ghq> {
    public static final cqjg a = cqjg.a();
    public static final cqjb<ghq, cqtv> b = new ghe();
    private final int c;

    public ghj() {
        this(80);
    }

    public static float c(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        int i = point.x;
        float a2 = cqrp.d(320.0d).a(context);
        return Math.max(point.x - Math.max(i * 0.4f, a2), cqrp.d(66.0d).a(context)) / 2.0f;
    }

    public static List<ghp<?>> d(ghq ghqVar) {
        dccx dccxVar = new dccx();
        dccxVar.i(ghqVar.a());
        ghp<?> b2 = ghqVar.b();
        if (b2 != null) {
            dccxVar.g(b2);
        }
        return dccxVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ghq> a() {
        cqjb<ghq, cqtv> cqjbVar = b;
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.L(false), cqgr.P(false), new cqmh(ghn.class, cqgr.aW(2), cqgr.aR(Integer.valueOf((int) R.id.hybrid_map_layout)), cqgr.aT(a), cqgr.bw(Integer.valueOf(this.c)), cqgr.bs(ggu.a), cqgr.cd(-1), cqgr.dS(cqjbVar), cqgr.dH(cqjbVar), cqgr.P(false), cqgr.L(false), cqjv.g(ghm.TOP_TOUCH_FILTER_HEIGHT, ggv.a, ghn.n), cqjv.g(ghm.DISABLE_CHILD_VIEW_SCROLLING, ggw.a, ghn.n), jnq.B(ggx.a), cqgr.fw(new ghh()), cqjv.o(cqhi.a, cqgr.fA(4), cqgr.fA(1)), cqgr.fz(ggy.a), cqgr.fx(ggz.a), cqgr.fB(cqsv.d(cqrp.d(2.0d), cqrp.d(dcyn.a))), cqjv.o(cqhi.a, cqgr.fC(new ghi()), cqgr.fC(null)), jnq.z(gha.a)), cqgr.gs(cqgr.aI(ghb.a), cqgr.cd(-1), cqgr.cW(cqgr.q(ghc.a)), iue.c(ghd.a), cqgr.J(true)));
    }

    public ghj(int i) {
        super(Integer.valueOf(i));
        this.c = i;
    }
}
