package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: zwr  reason: default package */
/* loaded from: classes7.dex */
public final class zwr extends LinearLayout {
    public static final cqjg a = cqjg.a();
    public boolean b;
    public dpge c;
    private boolean d;

    public zwr(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = dpge.UNKNOWN_RECOMMENDATION_REASON;
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            final bvsi bvsiVar = new bvsi(getContext());
            cqkx.h(this, a, zwu.class, new dbrn(this, bvsiVar) { // from class: zwq
                private final zwr a;
                private final bvsi b;

                {
                    this.a = this;
                    this.b = bvsiVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
                @Override // defpackage.dbrn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r13) {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zwq.a(java.lang.Object):java.lang.Object");
                }
            });
            setContentDescription(bvsiVar.toString());
            this.d = false;
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = true;
    }

    public void setSimplifiedTrainCarRecommendation(boolean z) {
        this.b = z;
        this.d = true;
    }

    public void setTrainCarRecommendationReason(dpge dpgeVar) {
        this.c = dpgeVar;
        this.d = true;
    }
}
