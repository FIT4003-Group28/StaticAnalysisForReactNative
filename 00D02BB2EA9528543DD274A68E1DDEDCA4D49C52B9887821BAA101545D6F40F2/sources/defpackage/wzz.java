package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wzz  reason: default package */
/* loaded from: classes7.dex */
public final class wzz implements bzml {
    public final dxio<bzmm> a;
    @dzsi
    public View b;
    private final dxio<cjnf> c;
    private final cqhu d;
    private final View e;

    public wzz(dxio<bzmm> dxioVar, dxio<cjnf> dxioVar2, cqhu cqhuVar, View view) {
        this.a = dxioVar;
        this.c = dxioVar2;
        this.d = cqhuVar;
        this.e = view;
    }

    @dzsi
    private final View h() {
        int i;
        View view = this.b;
        if (view != null) {
            dcdc<View> e = cqhu.e(view, xap.a);
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = e.get(i2);
                View view3 = this.b;
                if (view3 != null) {
                    View view4 = this.e;
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    view4.getLocationOnScreen(iArr);
                    int i4 = iArr[1];
                    view2.getLocationOnScreen(iArr);
                    if (view2.getMeasuredHeight() > 0 && view2.getMeasuredWidth() > 0 && (i = iArr[1]) >= i3 && i + view2.getMeasuredHeight() <= i4) {
                        return view2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSIT_TRIP_ATTRIBUTE_CHIP_TOOLTIP;
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
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (h() != null) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View a;
        View h = h();
        if (h == null || (a = cqhu.a(h, xap.b)) == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.c(wvf.TRANSIT_ATTRIBUTES_PROMO_TOOLTIP);
        i.d(a);
        ((cjnb) i).c = new Runnable(this) { // from class: wzy
            private final wzz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.TRANSIT_TRIP_ATTRIBUTE_CHIP_TOOLTIP);
            }
        };
        this.c.a().a(i.a());
        return true;
    }

    public final void g() {
        this.a.a().a(this);
    }
}
