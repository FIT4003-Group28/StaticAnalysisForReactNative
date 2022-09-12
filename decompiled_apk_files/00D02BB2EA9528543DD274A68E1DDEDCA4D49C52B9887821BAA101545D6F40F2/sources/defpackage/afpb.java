package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afpb  reason: default package */
/* loaded from: classes.dex */
public class afpb extends ivw {
    private static final int f = cqir.a();
    private static final cqtd g;
    public final Activity c;
    @dzsi
    afrk d;
    @dzsi
    PopupWindow e;
    private final cqkj h;
    private final View i;
    private final dxio<afwr> j;
    private final dxio<arfm> k;
    private final dxio<abwo> l;
    private final dxio<bwsh> m;
    private final dxio<bzmm> n;
    private final bvjj o;
    private final cqhn p;
    private final btvo q;
    private boolean r;

    static {
        cqrt.g(2131232745, ibm.x());
        g = cqrt.g(2131232313, ibm.p());
    }

    public afpb(Activity activity, cqkj cqkjVar, dxio<afwr> dxioVar, dxio<arfm> dxioVar2, dxio<abwo> dxioVar3, dxio<bwsh> dxioVar4, dxio<bzmm> dxioVar5, bvjj bvjjVar, cqhn cqhnVar, btvo btvoVar, View view) {
        super(activity, ivu.FIXED, jaq.NO_TINT_MOD_DAY_NIGHT_WHITE, cqrt.g(2131232313, ibm.p()), activity.getString(R.string.LAYERS_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtxu.n), true, f, ivv.MOD_MINI);
        this.c = activity;
        this.h = cqkjVar;
        this.i = view;
        this.j = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.m = dxioVar4;
        this.n = dxioVar5;
        this.o = bvjjVar;
        this.p = cqhnVar;
        this.q = btvoVar;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (this.e == null || this.d == null) {
            this.d = new afrm(this.q, this.j, this.k, this.p, this.l, this.m, this.o, this.r, new afpa(this));
            cqkf e = this.h.e(new afrj());
            e.e(this.d);
            PopupWindow popupWindow = new PopupWindow(e.c(), -2, -2, true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.e = popupWindow;
        }
        h();
        return cqkl.a;
    }

    @dzsi
    public PopupWindow g() {
        return this.e;
    }

    public void h() {
        Point point = new Point();
        this.c.getWindowManager().getDefaultDisplay().getSize(point);
        this.e.getContentView().measure(point.x, point.y);
        int e = gwu.b().e(this.c);
        int e2 = cqrp.d(4.0d).e(this.c);
        int width = ((this.i.getWidth() - e) - this.e.getContentView().getMeasuredWidth()) + e2;
        if (Boolean.valueOf(bvox.b(this.c)).booleanValue()) {
            width = (e - this.i.getWidth()) - e2;
        }
        int height = this.i.getHeight();
        this.e.setAnimationStyle(R.style.LayersFabMenuPopupWindowAnimation);
        this.e.showAsDropDown(this.i, width, (-height) - e2);
        cqkx.p(this);
        afrk afrkVar = this.d;
        if (afrkVar != null) {
            cqkx.p(afrkVar);
            if (this.n.a().d(dqkc.COVID19_LAYER_TOOLTIP) <= 0) {
                return;
            }
            this.o.S(bvjk.gm, true);
        }
    }

    public void i(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        afrk afrkVar = this.d;
        if (afrkVar == null) {
            return;
        }
        afrkVar.A(z);
        cqkx.p(this);
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd r() {
        return g;
    }
}
