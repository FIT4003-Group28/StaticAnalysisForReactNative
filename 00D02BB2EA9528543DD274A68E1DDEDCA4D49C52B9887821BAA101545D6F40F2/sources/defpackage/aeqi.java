package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqi  reason: default package */
/* loaded from: classes2.dex */
public class aeqi implements bzml {
    public final dxio<bzmm> a;
    public View b;
    private final cpv c;
    private final Activity d;
    private final btvo e;
    private final jlp f;
    private final dxio<begg> g;
    private final dxio<cjqq> h;

    public aeqi(gga ggaVar, cpv cpvVar, btvo btvoVar, jlp jlpVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, dxio<begg> dxioVar3) {
        this.c = cpvVar;
        this.d = ggaVar;
        this.e = btvoVar;
        this.f = jlpVar;
        this.a = dxioVar;
        this.h = dxioVar2;
        this.g = dxioVar3;
    }

    public static final boolean g(dqxa dqxaVar) {
        if (dqxaVar != null) {
            int i = dqxaVar.b;
            char c = 4;
            if (i == 0) {
                c = 1;
            } else if (i != 3) {
                c = i != 4 ? i != 5 ? (char) 0 : (char) 6 : (char) 5;
            }
            if (c == 0) {
                throw null;
            }
            if (c == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean i() {
        return this.g.a().e() != null;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.DATEPICKER_DEFAULT_DATES_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (this.c.e(this.d)) {
            return false;
        }
        return i() ? this.e.getHotelBookingModuleParameters().g() : this.e.getCategoricalSearchParameters().j();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!i() || this.g.a().j() == bege.PRICES) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        int i;
        if (bzmkVar != bzmk.VISIBLE || this.b == null) {
            return false;
        }
        if (!i()) {
            View view = this.b;
            dbsk.s(view);
            Point point = new Point();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int height = iArr[1] + view.getHeight();
            if (i2 >= point.x || height >= point.y) {
                return false;
            }
        }
        jlp jlpVar = this.f;
        String string = this.d.getString(R.string.RESTRICTION_HOTEL_DATEPICKER_DEFAULT_DATES_TOOLTIP);
        View view2 = this.b;
        dbsk.s(view2);
        jlo a = jlpVar.a(string, view2);
        a.e(new Runnable(this) { // from class: aeqh
            private final aeqi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aeqi aeqiVar = this.a;
                aeqiVar.a.a().f(dqkc.DATEPICKER_DEFAULT_DATES_TOOLTIP);
                aeqiVar.b = null;
            }
        }, dege.a);
        Activity activity = this.d;
        if (!i()) {
            i = -7;
        } else {
            i = this.e.getCategoricalSearchParameters().b() ? 4 : -12;
        }
        a.l(jmj.a(activity, i));
        a.o(true);
        a.p();
        a.s(0.42f);
        a.t(jln.GM2_BLUE);
        if (i()) {
            a.h();
            a.i();
        } else {
            a.k();
        }
        a.a();
        cjqp g = this.h.a().g();
        cjta b = cjtd.b();
        b.d = dtxr.cm;
        g.d(b.a());
        return true;
    }

    public final void h() {
        this.a.a().a(this);
    }
}
