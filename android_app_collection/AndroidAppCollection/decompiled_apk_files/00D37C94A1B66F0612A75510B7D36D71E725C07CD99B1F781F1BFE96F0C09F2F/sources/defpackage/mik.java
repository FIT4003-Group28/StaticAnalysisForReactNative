package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mik  reason: default package */
/* loaded from: classes3.dex */
final class mik implements View.OnAttachStateChangeListener {
    final /* synthetic */ ajrs a;
    final /* synthetic */ int b;
    final /* synthetic */ mim c;

    public mik(mim mimVar, ajrs ajrsVar, int i) {
        this.c = mimVar;
        this.a = ajrsVar;
        this.b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int measuredHeight;
        this.c.d.removeOnAttachStateChangeListener(this);
        boolean z = false;
        this.c.d.measure(View.MeasureSpec.makeMeasureSpec(((View) this.c.d.getParent()).getMeasuredWidth(), 1073741824), 0);
        int measuredWidth = ((int) (this.c.d.getMeasuredWidth() / this.c.f(this.a))) - this.b;
        mim mimVar = this.c;
        View findViewById = mimVar.d.findViewById(R.id.featured_badge);
        if (findViewById.getVisibility() == 8) {
            measuredHeight = 0;
        } else {
            measuredHeight = findViewById.getMeasuredHeight() + mimVar.a.getResources().getDimensionPixelOffset(R.dimen.promo_panel_text_layout_featured_badge_top_margin);
        }
        int measuredHeight2 = this.c.e.getMeasuredHeight();
        mim mimVar2 = this.c;
        int i = mimVar2.c;
        ImageView imageView = mimVar2.n;
        if (measuredHeight2 + i + i <= measuredWidth - measuredHeight) {
            z = true;
        }
        zag.o(imageView, z);
        this.c.d.requestLayout();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
