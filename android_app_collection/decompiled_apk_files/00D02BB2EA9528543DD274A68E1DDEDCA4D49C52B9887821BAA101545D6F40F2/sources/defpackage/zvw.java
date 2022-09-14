package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: zvw  reason: default package */
/* loaded from: classes7.dex */
public final class zvw extends FrameLayout {
    public zvw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(zvw.class, cqgr.cd(-2), cqgr.bp(-2), cqgr.cH(irh.a()), cqgr.cL(irh.a()));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() > 0) {
            return getChildAt(0).onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
