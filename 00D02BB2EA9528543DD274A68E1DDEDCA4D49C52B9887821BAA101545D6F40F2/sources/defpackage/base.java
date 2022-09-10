package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: base  reason: default package */
/* loaded from: classes3.dex */
abstract class base implements baqj {
    private final gga a;
    private final bakx b;
    private final gdc c;
    private final drjs d;
    private boolean e;
    @dzsi
    private final bruv f;
    @dzsi
    private basp g;

    public base(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        this.a = ggaVar;
        this.b = bakxVar;
        this.c = gdcVar;
        this.d = drjsVar;
        this.f = bruvVar;
    }

    @Override // defpackage.baqj
    @dzsi
    public jic a() {
        if (dbsj.d(l())) {
            return null;
        }
        return new jic(l(), ckqc.FULLY_QUALIFIED, k(), 0);
    }

    @Override // defpackage.baqj
    public jic b() {
        return new jic(j(), ckqc.FULLY_QUALIFIED, k(), 0);
    }

    @Override // defpackage.baqj
    public String c() {
        return batk.a(this.a, this.d);
    }

    @Override // defpackage.baqj
    public String d() {
        return batk.b(this.a, this.d);
    }

    @Override // defpackage.baqj
    @dzsi
    public baqi e() {
        if (this.e) {
            basp baspVar = this.g;
            if (baspVar == null) {
                gga ggaVar = this.a;
                bakx bakxVar = this.b;
                gdc gdcVar = this.c;
                drjs drjsVar = this.d;
                bruv bruvVar = this.f;
                drjr drjrVar = drjr.FLIGHT_RESERVATION;
                switch (drjr.a(drjsVar.a).ordinal()) {
                    case 0:
                        baspVar = new bask(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 1:
                        baspVar = new basl(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 2:
                        baspVar = new baso(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 3:
                        baspVar = new basj(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 4:
                        baspVar = new basm(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 5:
                        baspVar = new basi(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    case 6:
                        baspVar = new basn(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
                        break;
                    default:
                        throw new IllegalArgumentException("reservation type not set");
                }
            }
            this.g = baspVar;
            return baspVar;
        }
        return null;
    }

    @Override // defpackage.baqj
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.baqj
    public cqkl g() {
        this.e = !this.e;
        final View o = cqkx.o(this);
        if (o != null) {
            cpv.a.f(o, this.a.getString(true != this.e ? R.string.RESERVATION_CARD_COLLAPSED : R.string.RESERVATION_CARD_EXPANDED));
        }
        cqkx.p(this);
        if (o != null && this.e) {
            ViewParent parent = o.getParent();
            while (true) {
                if (parent instanceof GmmRecyclerView) {
                    final GmmRecyclerView gmmRecyclerView = (GmmRecyclerView) parent;
                    Rect rect = new Rect();
                    gmmRecyclerView.getGlobalVisibleRect(rect);
                    final int i = rect.bottom;
                    o.post(new Runnable(o, i, gmmRecyclerView) { // from class: barw
                        private final View a;
                        private final int b;
                        private final GmmRecyclerView c;

                        {
                            this.a = o;
                            this.b = i;
                            this.c = gmmRecyclerView;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            View view = this.a;
                            int i2 = this.b;
                            GmmRecyclerView gmmRecyclerView2 = this.c;
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            int height = (iArr[1] + view.getHeight()) - i2;
                            if (height > 0) {
                                gmmRecyclerView2.t(0, height);
                            }
                        }
                    });
                    break;
                } else if (parent == null) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return cqkl.a;
    }

    public abstract basq h();

    public cqtd i(boolean z, boolean z2) {
        return iup.g(cqrt.h(batk.f(this.d), ibl.ax()), 0.55f, cqrt.c(batk.g(this.d)));
    }

    @dzsi
    public String j() {
        return null;
    }

    public cqtd k() {
        return iup.g(cqrt.h(batk.f(this.d), ibl.o()), 0.8f, ibl.a());
    }

    @dzsi
    public String l() {
        return null;
    }
}
