package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: rqg  reason: default package */
/* loaded from: classes7.dex */
public final class rqg extends jfu {
    public float e;
    private final aah f;
    private final int g;
    private final int h;
    private final float i;

    public rqg(Context context, cqss cqssVar, cqss cqssVar2, float f) {
        this.g = cqssVar.b(context);
        this.h = cqssVar2.b(context);
        this.i = f;
        this.f = new rqf(this, context);
    }

    private final void l() {
        this.e = this.D / 2.0f;
    }

    private final void o() {
        if (this.e == 0.0f) {
            l();
        }
        for (int i = 0; i < aJ(); i++) {
            TextView textView = (TextView) aK(i);
            float min = 1.0f - (Math.min(0.5f, Math.abs(this.e - ((bC(textView) + bB(textView)) / 2.0f)) / this.e) / 0.5f);
            float f = this.i;
            float f2 = ((1.0f - f) * min) + f;
            textView.setScaleX(f2);
            textView.setScaleY(f2);
            textView.setTextColor(kc.g(this.h, this.g, min));
        }
    }

    @Override // defpackage.abs
    public final void ao(RecyclerView recyclerView, int i) {
        aah aahVar = this.f;
        aahVar.g = i;
        aw(aahVar);
    }

    @Override // defpackage.abs
    public final void av(RecyclerView recyclerView) {
        l();
    }

    @Override // defpackage.abs
    public final void bw(aca acaVar, int i, int i2) {
        View d = acaVar.d(k());
        abt abtVar = (abt) d.getLayoutParams();
        d.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingLeft() + getPaddingRight(), abtVar.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom(), abtVar.height));
        aY(i, View.MeasureSpec.makeMeasureSpec(d.getMeasuredHeight() + abtVar.bottomMargin + abtVar.topMargin, 1073741824));
    }

    @Override // defpackage.jfu, defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        super.d(acaVar, aciVar);
        o();
    }

    @Override // defpackage.abs
    public final void e(aci aciVar) {
        l();
        o();
    }

    @Override // defpackage.jfu, defpackage.abs
    public final int m(int i, aca acaVar, aci aciVar) {
        int m = super.m(i, acaVar, aciVar);
        o();
        return m;
    }
}
