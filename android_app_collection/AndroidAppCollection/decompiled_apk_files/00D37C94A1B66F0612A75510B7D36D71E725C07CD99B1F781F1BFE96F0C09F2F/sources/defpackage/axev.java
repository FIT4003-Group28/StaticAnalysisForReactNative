package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: axev  reason: default package */
/* loaded from: classes2.dex */
final class axev implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ axfc b;

    public axev(axfc axfcVar, float f) {
        this.b = axfcVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.g.getLayoutParams();
        Context context = this.b.a;
        float f = this.a;
        if (Build.VERSION.SDK_INT >= 23) {
            int dimension = (int) (((int) context.getResources().getDimension(R.dimen.alignment_marker_height)) * f);
            if (layoutParams.getRule(15) == -1) {
                layoutParams.width = dimension;
            } else {
                layoutParams.height = dimension;
            }
        }
        this.b.g.setLayoutParams(layoutParams);
    }
}
