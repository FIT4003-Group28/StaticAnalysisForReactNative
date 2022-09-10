package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: krf  reason: default package */
/* loaded from: classes7.dex */
public final class krf implements View.OnTouchListener {
    private final View a;
    private final kqp b;
    private final cqhu c = new cqhu();
    private final btvo d;
    private final cjqy e;
    private final cjqq f;

    public krf(btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar, kqp kqpVar, View view) {
        this.d = btvoVar;
        this.e = cjqyVar;
        this.f = cjqqVar;
        this.b = kqpVar;
        this.a = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (!this.b.b()) {
            return false;
        }
        if (krc.q(this.d)) {
            final FrameLayout frameLayout = (FrameLayout) view.getParent();
            if (dcbg.b(cqhu.e(frameLayout, ndt.b)).p(new dbsl(frameLayout, view, motionEvent) { // from class: kre
                private final FrameLayout a;
                private final View b;
                private final MotionEvent c;

                {
                    this.a = frameLayout;
                    this.b = view;
                    this.c = motionEvent;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    FrameLayout frameLayout2 = this.a;
                    View view2 = this.b;
                    MotionEvent motionEvent2 = this.c;
                    View view3 = (View) obj;
                    Rect rect = new Rect();
                    view3.getHitRect(rect);
                    frameLayout2.offsetDescendantRectToMyCoords((View) view3.getParent(), rect);
                    Rect rect2 = new Rect((int) motionEvent2.getX(), (int) motionEvent2.getY(), (int) motionEvent2.getX(), (int) motionEvent2.getY());
                    frameLayout2.offsetDescendantRectToMyCoords(view2, rect2);
                    return rect.contains(rect2);
                }
            })) {
                return false;
            }
        }
        cjqy cjqyVar = this.e;
        cjql e = this.f.f(view).e(view);
        cjtd k = cjqg.k(view);
        dbsk.s(k);
        cjqyVar.j(e, k);
        kqp kqpVar = this.b;
        this.a.getWindowToken();
        kqpVar.c();
        return false;
    }
}
