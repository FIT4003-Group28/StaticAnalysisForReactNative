package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: qww  reason: default package */
/* loaded from: classes7.dex */
public class qww implements qwq {
    public final qvz a;
    @dzsi
    public PopupWindow b;
    private final cqkj c;
    private final Context d;
    private final dxio<bsvm> e;

    public qww(qvz qvzVar, cqhn cqhnVar, cqkj cqkjVar, cqhu cqhuVar, Application application, dxio<bsvm> dxioVar) {
        this.a = qvzVar;
        this.c = cqkjVar;
        this.d = application;
        this.e = dxioVar;
    }

    @Override // defpackage.qwq
    public Integer a() {
        return Integer.valueOf(((qvy) this.a).b.size());
    }

    @Override // defpackage.qwq
    public qwp b(final int i) {
        CharSequence f;
        Runnable runnable = new Runnable(this, i) { // from class: qwt
            private final qww a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qww qwwVar = this.a;
                int i2 = this.b;
                cqkx.p(qwwVar);
                qvy qvyVar = (qvy) qwwVar.a;
                qvx qvxVar = qvyVar.b.get(i2);
                if (qvxVar.e()) {
                    qut qutVar = qvyVar.a;
                    azva b = qvxVar.b();
                    dbsk.s(b);
                    qutVar.i(b);
                } else {
                    qvyVar.a(qvxVar.a());
                }
                qwwVar.c();
            }
        };
        boolean e = ((qvy) this.a).b.get(i).e();
        Runnable runnable2 = new Runnable(this, i) { // from class: qwu
            private final qww a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qww qwwVar = this.a;
                int i2 = this.b;
                cqkx.p(qwwVar);
                qvy qvyVar = (qvy) qwwVar.a;
                qvyVar.a(qvyVar.b.get(i2).a());
                qwwVar.c();
            }
        };
        qvx qvxVar = ((qvy) this.a).b.get(i);
        if (qvxVar.e()) {
            f = qvxVar.c().d();
        } else {
            f = qvxVar.c().f();
        }
        return new qws(runnable, e, runnable2, f, ((qvy) this.a).b.get(i).c().i(), ((qvy) this.a).b.get(i).c().k(), ((qvy) this.a).b.get(i).c().g());
    }

    @Override // defpackage.qwq
    public cqkl c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        return cqkl.a;
    }

    @Override // defpackage.qwq
    @dzsi
    public qwr d() {
        dndr dndrVar;
        dcdc<qvx> dcdcVar = ((qvy) this.a).b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            azva b = dcdcVar.get(i).b();
            if (b != null && ((dndrVar = b.a) == dndr.INFERRED_HOME || dndrVar == dndr.INFERRED_WORK)) {
                return new qwy(this.e.a());
            }
        }
        return null;
    }

    public void e(qwq qwqVar, View view) {
        int i;
        cqkf c = this.c.c(new qwl(), null);
        c.e(qwqVar);
        PopupWindow popupWindow = new PopupWindow(c.c(), -2, -2, true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(this) { // from class: qwv
            private final qww a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.a.b = null;
            }
        });
        View contentView = popupWindow.getContentView();
        int i2 = 0;
        contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = contentView.getMeasuredHeight();
        View contentView2 = popupWindow.getContentView();
        contentView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = contentView2.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (view.getContext().getResources().getDisplayMetrics().heightPixels - iArr[1] >= measuredHeight) {
            if (measuredWidth > view.getWidth()) {
                i = (measuredWidth - view.getWidth()) / 2;
            } else {
                i = measuredWidth / 2;
            }
            int i3 = -i;
            if (f().booleanValue()) {
                i3 -= view.getWidth();
            }
            View a = cqhu.a(popupWindow.getContentView(), qwl.a);
            if (a != null && a.getLayoutParams() != null) {
                i2 = ((ViewGroup.MarginLayoutParams) a.getLayoutParams()).topMargin;
            }
            popupWindow.showAsDropDown(view, i3, (-i2) - jmj.a(this.d, 4));
        } else {
            popupWindow.showAsDropDown(view, 0, -measuredHeight);
        }
        this.b = popupWindow;
    }

    public Boolean f() {
        return Boolean.valueOf(bvox.b(this.d));
    }
}
