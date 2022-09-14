package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coh  reason: default package */
/* loaded from: classes5.dex */
public final class coh extends aah {
    public final int f;
    final /* synthetic */ cok n;
    private final coi o;
    private final boolean p;
    private final Interpolator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coh(cok cokVar, Context context, int i, coi coiVar) {
        super(context);
        this.n = cokVar;
        this.f = i;
        this.o = coiVar;
        this.p = cokVar.a.getResources().getBoolean(R.bool.gearhead_sdk_true_for_touch);
        this.q = new DecelerateInterpolator(coiVar.e);
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return this.o.c / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aah
    public final int c(int i) {
        int ceil = (int) Math.ceil(d(i) / this.o.d);
        return this.p ? ceil : Math.min(ceil, 1000);
    }

    @Override // defpackage.aah
    protected final int f() {
        return -1;
    }

    @Override // defpackage.aah, defpackage.ach
    protected final void k(View view, acf acfVar) {
        int c;
        int g = g(view, -1);
        if (g != 0 && (c = c(g)) > 0) {
            acfVar.b(0, -g, c, this.q);
        }
    }

    @Override // defpackage.ach
    public final PointF l(int i) {
        if (q() == 0) {
            return null;
        }
        cok cokVar = this.n;
        return new PointF(0.0f, this.f < cok.bm(cokVar.aK(cokVar.k())) ? -1 : 1);
    }

    @Override // defpackage.ach
    public final int n() {
        return this.f;
    }
}
