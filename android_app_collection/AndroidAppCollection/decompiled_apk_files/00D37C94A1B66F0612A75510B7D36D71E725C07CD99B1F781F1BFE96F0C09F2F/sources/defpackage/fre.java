package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
/* compiled from: PG */
/* renamed from: fre  reason: default package */
/* loaded from: classes3.dex */
public final class fre extends yk {
    final /* synthetic */ ScrollToTopLinearLayoutManager a;
    private final boolean n;
    private final int o;
    private float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fre(ScrollToTopLinearLayoutManager scrollToTopLinearLayoutManager, Context context, boolean z, int i) {
        super(context);
        this.a = scrollToTopLinearLayoutManager;
        this.n = z;
        this.o = (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        int i;
        if (this.p == 0.0f && (i = this.a.b) != 0) {
            this.p = 300.0f / Math.abs(i);
        }
        float a = super.a(displayMetrics);
        float f = this.p;
        return (f == 0.0f || (!this.n && f > a)) ? a : f;
    }

    @Override // defpackage.yk
    public final PointF d(int i) {
        return this.a.O(i);
    }

    @Override // defpackage.yk
    public final int i(View view, int i) {
        return super.i(view, i) - this.o;
    }

    @Override // defpackage.yk
    protected final int l() {
        return -1;
    }
}
