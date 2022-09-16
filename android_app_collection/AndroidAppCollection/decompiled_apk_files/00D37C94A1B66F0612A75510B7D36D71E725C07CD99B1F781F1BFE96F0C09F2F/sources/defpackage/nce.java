package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: nce  reason: default package */
/* loaded from: classes3.dex */
public final class nce extends mxt {
    private apzg l;
    private long m;

    public nce(Context context, aafo aafoVar, wxc wxcVar, wwk wwkVar, tjv tjvVar, enm enmVar, View view, View view2, View view3, View view4, View view5) {
        super(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, view, view2, view3, view5, view4, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxt
    public final void k(View view, View view2) {
        long j = this.m;
        float f = 0.0f;
        float f2 = (j < 0 || j >= 50) ? 0.0f : ((float) j) / 100.0f;
        int measuredWidth = view2.getMeasuredWidth();
        int i = 1000;
        if (measuredWidth <= 0) {
            measuredWidth = 1000;
        }
        int i2 = (int) (f2 * measuredWidth);
        long j2 = this.m;
        if (j2 >= 0 && j2 < 50) {
            f = ((float) j2) / 100.0f;
        }
        int measuredHeight = view2.getMeasuredHeight();
        if (measuredHeight > 0) {
            i = measuredHeight;
        }
        int i3 = (int) (f * i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = view2.getMeasuredWidth() - (i2 + i2);
        marginLayoutParams.height = view2.getMeasuredHeight() - (i3 + i3);
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i3;
        view.requestLayout();
    }

    @Override // defpackage.mxt
    public final void l(View view, MotionEvent motionEvent, List list, boolean z) {
        q(this.l);
    }

    @Override // defpackage.mxt
    public final void m(View view, MotionEvent motionEvent, List list) {
    }

    @Override // defpackage.mxt
    public final void n(List list) {
    }

    @Override // defpackage.mxt
    public final void o() {
    }

    @Override // defpackage.mxt
    protected final boolean s() {
        return this.m == 0;
    }

    public final void w(acti actiVar, Object obj, String str, List list, apzg apzgVar, long j, long j2, aozy aozyVar, byte[] bArr) {
        this.l = apzgVar;
        this.m = j;
        super.p(actiVar, obj, str, list, j2, aozyVar, bArr);
    }
}
