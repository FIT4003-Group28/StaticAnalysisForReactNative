package defpackage;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: blyr  reason: default package */
/* loaded from: classes3.dex */
final class blyr implements cqfc {
    final /* synthetic */ blyv a;

    public blyr(blyv blyvVar) {
        this.a = blyvVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        int measuredHeight;
        TextView textView = (TextView) cqkx.e(view, bltv.g, TextView.class);
        TextView textView2 = (TextView) cqkx.e(view, bltv.h, TextView.class);
        blzs blzsVar = this.a.t;
        Layout layout = textView.getLayout();
        if (layout != null && layout.getEllipsisStart(0) == 0) {
            return;
        }
        blzsVar.a();
        textView.clearAnimation();
        textView2.clearAnimation();
        blzsVar.b.setTarget(textView);
        blzsVar.c.setTarget(textView2);
        blzsVar.d.setTarget(textView2);
        blzsVar.g = true;
        int measuredHeight2 = textView2.getMeasuredHeight();
        if (measuredHeight2 == 0) {
            measuredHeight2 = textView.getMeasuredHeight();
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (blzsVar.f) {
            measuredHeight = textView.getMeasuredHeight() * 4;
        } else {
            measuredHeight = textView.getMeasuredHeight();
            f = 1.0f;
            f2 = 0.0f;
        }
        int measuredHeight3 = (int) (((measuredHeight - measuredHeight2) / (textView.getMeasuredHeight() * 3)) * 500.0f);
        int i = measuredHeight3 < 0 ? -1 : 1;
        blzsVar.b.setFloatValues(textView.getAlpha(), f);
        blzsVar.c.setFloatValues(textView2.getAlpha(), f2);
        blzsVar.d.setIntValues(measuredHeight2, measuredHeight);
        long j = measuredHeight3 * i;
        blzsVar.a.setDuration(j);
        blzsVar.a.start();
        blzsVar.e = textView2.animate().setDuration(j).withEndAction(new blzr(blzsVar, textView2));
        blzsVar.e.start();
    }
}
