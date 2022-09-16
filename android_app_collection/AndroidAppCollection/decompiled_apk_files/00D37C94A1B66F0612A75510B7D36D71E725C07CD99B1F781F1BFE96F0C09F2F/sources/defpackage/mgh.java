package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: mgh  reason: default package */
/* loaded from: classes3.dex */
final class mgh implements mgd {
    public final ActiveItemIndicatorView a;
    apqk b;
    private final Context c;

    public mgh(Context context, ActiveItemIndicatorView activeItemIndicatorView) {
        this.c = context;
        this.a = activeItemIndicatorView;
    }

    @Override // defpackage.mgd
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.mgd
    public final void b(apqk apqkVar) {
        int i;
        int i2;
        this.b = apqkVar;
        int size = apqkVar.c.size();
        for (apql apqlVar : (List) this.b.qm(apqi.d)) {
            if (!akzj.f(apqlVar, apql.a)) {
                size--;
            }
        }
        if (size > 0) {
            ActiveItemIndicatorView activeItemIndicatorView = this.a;
            activeItemIndicatorView.d = size;
            float[] fArr = activeItemIndicatorView.b;
            if (fArr == null || fArr.length != size + size) {
                activeItemIndicatorView.b = new float[size + size];
            }
            int J2 = almu.J(this.b.e);
            if (J2 == 0) {
                J2 = 1;
            }
            if (J2 - 1 == 1) {
                this.a.b(2);
                i = 81;
                i2 = 0;
            } else {
                i2 = this.c.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_start_end_margin);
                this.a.b(1);
                i = 8388693;
            }
            zgd.t(this.a, zgd.b(zgd.g(i), zgd.k(i2)), FrameLayout.LayoutParams.class);
            return;
        }
        d(false);
    }

    @Override // defpackage.mgd
    public final void c(int i) {
        ActiveItemIndicatorView activeItemIndicatorView = this.a;
        if (i < 0 || i >= activeItemIndicatorView.d) {
            throw new IllegalStateException("Selections not within bounds");
        }
        activeItemIndicatorView.e = i;
        activeItemIndicatorView.c();
        activeItemIndicatorView.invalidate();
    }

    @Override // defpackage.mgd
    public final void d(boolean z) {
        zag.o(this.a, z);
    }
}
