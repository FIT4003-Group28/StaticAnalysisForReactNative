package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcfc  reason: default package */
/* loaded from: classes3.dex */
final class bcfc extends aah {
    final /* synthetic */ int f;
    final /* synthetic */ bcfd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcfc(bcfd bcfdVar, Context context, int i) {
        super(context);
        this.n = bcfdVar;
        this.f = i;
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.aah, defpackage.ach
    protected final void k(View view, acf acfVar) {
        int h = h(view, -1) + this.f;
        int c = c(Math.abs(h));
        if (c > 0) {
            acfVar.b(-h, 0, c, this.b);
        }
    }

    @Override // defpackage.ach
    public final PointF l(int i) {
        return this.n.L(i);
    }
}
