package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
/* renamed from: azdl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azdl implements cqfc {
    static final cqfc a = new azdl();

    private azdl() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        cqjg cqjgVar = azdy.a;
        if (view instanceof FrameLayout) {
            View childAt = ((FrameLayout) view).getChildAt(0);
            Rect rect = new Rect();
            childAt.getHitRect(rect);
            rect.top = 0;
            rect.bottom = view.getHeight();
            view.setTouchDelegate(new TouchDelegate(rect, childAt));
        }
    }
}
