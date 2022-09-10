package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: bfrz  reason: default package */
/* loaded from: classes3.dex */
final class bfrz implements View.OnClickListener {
    final /* synthetic */ bfsa a;

    public bfrz(bfsa bfsaVar) {
        this.a = bfsaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final bfsa bfsaVar = this.a;
        if (bfsaVar.e == null) {
            return;
        }
        final cqkf e = bfsaVar.b.e(new bfmw());
        gga ggaVar = bfsaVar.a;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = iArr[1] + (view.getHeight() / 2) + jmj.a(ggaVar, 4);
        Point point = new Point(new int[]{iArr[0] + (view.getWidth() / 2), height}[0], height);
        if (bfsaVar.d == null) {
            bfsaVar.d = jdj.a(bfsaVar.a, jdo.NONE, new PopupWindow.OnDismissListener(bfsaVar, e) { // from class: bfrx
                private final bfsa a;
                private final cqkf b;

                {
                    this.a = bfsaVar;
                    this.b = e;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    bfsa bfsaVar2 = this.a;
                    cqkf cqkfVar = this.b;
                    bfsaVar2.d = null;
                    cqkfVar.e(null);
                }
            });
        }
        jdi jdiVar = bfsaVar.d;
        dbsk.s(jdiVar);
        bfmz bfmzVar = bfsaVar.c;
        dnng dnngVar = bfsaVar.e;
        dbsk.s(dnngVar);
        dosu dosuVar = dnngVar.n;
        if (dosuVar == null) {
            dosuVar = dosu.b;
        }
        dosu dosuVar2 = dosuVar;
        Runnable runnable = new Runnable(bfsaVar) { // from class: bfry
            private final bfsa a;

            {
                this.a = bfsaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        };
        dnng dnngVar2 = bfsaVar.e;
        dbsk.s(dnngVar2);
        int size = dnngVar2.f.size();
        dxio a = ((dxjh) bfmzVar.a).a();
        bfmz.a(a, 1);
        Resources a2 = bfmzVar.b.a();
        bfmz.a(a2, 2);
        bfmz.a(dosuVar2, 3);
        bfmz.a(runnable, 4);
        e.e(new bfmy(a, a2, dosuVar2, runnable, size));
        jdiVar.a(ibm.b().b(bfsaVar.a));
        jdiVar.c(e.c());
        jdiVar.a.setFocusable(true);
        jdiVar.b.measure(0, 0);
        jdiVar.d = jdiVar.b.getMeasuredWidth() + jmj.a(bfsaVar.a, 16);
        jdiVar.d(view, point.x, point.y);
    }
}
