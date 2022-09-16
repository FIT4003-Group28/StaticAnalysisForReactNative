package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: vgj  reason: default package */
/* loaded from: classes4.dex */
public final class vgj implements vgs {
    final /* synthetic */ ExpandingScrollView a;
    private final /* synthetic */ int b;

    public vgj(ExpandingScrollView expandingScrollView) {
        this.a = expandingScrollView;
    }

    public vgj(ExpandingScrollView expandingScrollView, int i) {
        this.b = i;
        this.a = expandingScrollView;
    }

    @Override // defpackage.vgs
    public final void a(MotionEvent motionEvent) {
        if (this.b != 0) {
            ExpandingScrollView.j(this.a, motionEvent);
            return;
        }
        View view = this.a.i;
        if (view == null) {
            return;
        }
        view.dispatchTouchEvent(motionEvent);
    }
}
