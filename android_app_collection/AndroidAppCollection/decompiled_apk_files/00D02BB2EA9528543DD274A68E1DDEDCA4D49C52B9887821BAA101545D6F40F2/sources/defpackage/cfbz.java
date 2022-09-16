package defpackage;

import android.view.View;
import android.widget.LinearLayout;
/* renamed from: cfbz  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfbz implements cqfc {
    static final cqfc a = new cfbz();

    private cfbz() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        cqjg cqjgVar = cfcb.a;
        float f = view.getContext().getResources().getDisplayMetrics().density;
        int width = (int) (((((LinearLayout) cqkx.e(view, cfcb.a, LinearLayout.class)).getChildAt(0).getWidth() - (48.0f * f)) / 2.0f) + (f * 6.0f));
        cqkx.d(view, cfcb.b).setPadding(width, 0, width, 0);
    }
}
