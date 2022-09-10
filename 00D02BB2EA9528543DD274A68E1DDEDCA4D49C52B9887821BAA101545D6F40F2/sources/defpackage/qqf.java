package defpackage;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: qqf  reason: default package */
/* loaded from: classes7.dex */
public final class qqf implements bzml {
    private static final dcqe c = dcqe.c("qqf");
    @dzsi
    jdi a;
    protected final View.OnLayoutChangeListener b = new qqd(this);
    private final cqkj d;
    private final yzi e;
    private final qqy f;
    private final bvjj g;
    private final gga h;
    private final View i;

    public qqf(View view, gga ggaVar, bvjj bvjjVar, yzi yziVar, cqkj cqkjVar, qqy qqyVar) {
        this.h = ggaVar;
        this.i = view;
        this.g = bvjjVar;
        this.e = yziVar;
        this.d = cqkjVar;
        this.f = qqyVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.COMMUTE_HUB_SHORTCUT_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        dbsk.l(true);
        int s = this.g.s(bvjk.bW, 0);
        int s2 = this.g.s(bvjk.bZ, 0);
        if (s == 0) {
            dbsk.m(s2 == 0, "The visit counter is incrementing with 0 promos showed");
            List<String> F = this.g.F(bvjk.bY, new ArrayList());
            return F.size() >= 3 && eaov.c(eapg.c(F.get(0)), eapg.c(F.get(F.size() + (-1)))).p <= 30;
        }
        if (s != 1) {
            if (s != 2) {
                if (s != 3) {
                    bvoo.h("The promo has been shown an unintended number of times: %d", Integer.valueOf(s));
                }
                return false;
            } else if (s2 >= 9) {
                return true;
            }
        } else if (s2 >= 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View view = this.i;
        dbsk.s(view);
        View a = cqhu.a(view, qvm.c);
        if (a == null) {
            return false;
        }
        gga ggaVar = this.h;
        final cqkf c2 = this.d.c(new qql(), null);
        View c3 = c2.c();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        int height = iArr[1] + a.getHeight() + jmj.a(ggaVar, 6);
        Point point = new Point(new int[]{iArr[0] + (a.getWidth() / 2), height}[0], height);
        jdi a2 = jdj.a(ggaVar, jdo.TOP, new PopupWindow.OnDismissListener(this, c2) { // from class: qqc
            private final qqf a;
            private final cqkf b;

            {
                this.a = this;
                this.b = c2;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                qqf qqfVar = this.a;
                cqkf cqkfVar = this.b;
                qqfVar.a = null;
                cqkfVar.e(null);
            }
        });
        a2.b.g(cqrp.d(8.0d));
        a2.e = -2;
        DisplayMetrics displayMetrics = ggaVar.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        float f2 = ggaVar.getResources().getConfiguration().fontScale;
        if (((int) (i / f)) <= 360 || f2 >= 1.0f) {
            a2.e = jmj.b(this.h, f2 * 160.0f);
        }
        qqy qqyVar = this.f;
        yzi yziVar = this.e;
        cqvf l = cqrt.l(R.string.COMMUTE_HUB_CREATE_SHORTCUT_PROMO_BODY);
        bvjj a3 = qqyVar.a.a();
        qqy.a(a3, 1);
        qqy.a(a2, 2);
        qqy.a(yziVar, 3);
        qqy.a(l, 4);
        c2.e(new qqx(a3, a2, yziVar, l, 3));
        a2.c(c3);
        a2.d(a, point.x, point.y);
        a.addOnLayoutChangeListener(this.b);
        this.a = a2;
        return true;
    }

    public final void g() {
        List<String> F = this.g.F(bvjk.bY, new ArrayList());
        String eapgVar = eapg.a().toString();
        if (F.isEmpty() || !dbsd.a(F.get(F.size() - 1), eapgVar)) {
            int i = 0;
            if (this.g.s(bvjk.bW, 0) > 0) {
                this.g.ao(bvjk.bZ);
            }
            if (F.size() >= 3) {
                while (i < F.size() - 1) {
                    int i2 = i + 1;
                    F.set(i, F.get(i2));
                    i = i2;
                }
                F.set(F.size() - 1, eapgVar);
            } else {
                F.add(eapgVar);
            }
        }
        this.g.ah(bvjk.bY, F);
    }

    public final void h() {
        int s = this.g.s(bvjk.bW, 0);
        if (s < 3) {
            this.g.W(bvjk.bW, s + 1);
        } else {
            bvoo.h("Trying to show tutorial more than 3 times, currentCount: %d", Integer.valueOf(s));
        }
    }
}
