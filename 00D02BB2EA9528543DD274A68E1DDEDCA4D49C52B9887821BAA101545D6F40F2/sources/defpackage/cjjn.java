package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.method.MovementMethod;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjjn  reason: default package */
/* loaded from: classes4.dex */
public final class cjjn extends ConstraintLayout {
    public dzut<dztc> c;
    public final TransitionSet d;
    public final Fade e;
    public final Transition f;
    private final TextView g;
    private final TextView h;
    private final int i;
    private final boolean j;
    @ViewDebug.ExportedProperty
    private float k;
    private cjkd l;
    private final ds m;
    private boolean n;

    public cjjn(Context context) {
        this(context, null, 0, null, 14);
    }

    public cjjn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
    }

    public cjjn(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ cjjn(android.content.Context r6, android.util.AttributeSet r7, int r8, defpackage.cjjr r9, int r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjjn.<init>(android.content.Context, android.util.AttributeSet, int, cjjr, int):void");
    }

    private final ds d() {
        ds dsVar = new ds();
        dsVar.b(this.m);
        cjkd cjkdVar = this.l;
        cjkd cjkdVar2 = cjkd.ABOVE;
        dsVar.i(R.id.calloutBubble, this.k);
        dsVar.i(R.id.calloutBottomBeak, this.k);
        dsVar.j(R.id.calloutBubble, cjkdVar == cjkdVar2 ? 1.0f : 0.0f);
        int i = 4;
        dsVar.k(R.id.calloutTopBeak, cjkdVar == cjkdVar2 ? 4 : 0);
        if (cjkdVar == cjkdVar2) {
            i = 0;
        }
        dsVar.k(R.id.calloutBottomBeak, i);
        return dsVar;
    }

    public final void c() {
        dzsx a;
        if (this.n) {
            a = dzsz.a(Float.valueOf(0.75f), d());
        } else {
            Float valueOf = Float.valueOf(1.0f);
            ds dsVar = new ds();
            dsVar.b(d());
            dsVar.k(R.id.calloutContent, 0);
            dsVar.h(R.id.calloutBubble, 6, 0);
            dsVar.h(R.id.calloutBubble, 7, 0);
            dsVar.m(R.id.calloutBubble, 0);
            dsVar.l(R.id.calloutBubble, 0);
            a = dzsz.a(valueOf, dsVar);
        }
        float floatValue = ((Number) a.a).floatValue();
        setScaleX(floatValue);
        setScaleY(floatValue);
        ((ds) a.b).d(this);
    }

    public final void setBeakBias(float f) {
        this.k = this.j ? 1.0f - f : f;
        int i = this.i;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.i;
        setPivotX(i + ((measuredWidth - (i2 + i2)) * f));
    }

    public final void setContent(cjju cjjuVar) {
        dzvx.c(cjjuVar, "value");
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(cjjuVar.d);
        }
        TextView textView2 = this.g;
        textView2.setText(cjjuVar.c);
        textView2.setMovementMethod((MovementMethod) cjjuVar.b.a());
    }

    public final void setMinimized(boolean z) {
        this.n = z;
    }

    public final void setOnClose(dzut<dztc> dzutVar) {
        this.c = dzutVar;
    }

    public final void setPlacement(cjkd cjkdVar) {
        int measuredHeight;
        dzvx.c(cjkdVar, "value");
        this.l = cjkdVar;
        if (cjkdVar == cjkd.BELOW) {
            measuredHeight = getPaddingTop();
        } else {
            measuredHeight = getMeasuredHeight() - getPaddingBottom();
        }
        setPivotY(measuredHeight);
    }
}
