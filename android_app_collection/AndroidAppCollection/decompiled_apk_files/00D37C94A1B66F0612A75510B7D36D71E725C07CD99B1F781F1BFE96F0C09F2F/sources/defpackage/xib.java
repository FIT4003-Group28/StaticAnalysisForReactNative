package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xib  reason: default package */
/* loaded from: classes4.dex */
public final class xib extends xhz {
    public boolean a;
    private final akbm f;
    private final acti g;
    private int h;
    private int i;

    public xib(akbm akbmVar, acti actiVar) {
        super(xgy.b().a());
        this.f = akbmVar;
        actiVar.getClass();
        this.g = actiVar;
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        int i;
        xgy xgyVar = (xgy) obj;
        if (xgyVar.b && !((xgy) this.b).b) {
            this.f.b(xgyVar.a, this.g);
        }
        this.f.d(xgyVar.b);
        xgy xgyVar2 = (xgy) this.b;
        boolean z2 = xgyVar2.d;
        boolean z3 = xgyVar.d;
        boolean z4 = xgyVar2.c;
        boolean z5 = xgyVar.c;
        int i2 = 0;
        boolean z6 = z && xgyVar.b && !this.a;
        if (z6 && (z2 != z3 || z4 != z5)) {
            boolean z7 = xgyVar.e;
            if (z3 || (z7 && z5)) {
                i = this.i;
            } else {
                i = this.h;
            }
            zgd.t((View) this.c, zgd.e(i), ViewGroup.MarginLayoutParams.class);
        }
        TextView textView = (TextView) this.c;
        if (true != z6) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    @Override // defpackage.xhz
    public final void d() {
        this.h = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_default_bottom_margin);
        this.i = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_cta_bottom_margin);
    }
}
