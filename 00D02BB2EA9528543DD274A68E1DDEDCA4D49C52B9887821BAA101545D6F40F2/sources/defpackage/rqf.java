package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* renamed from: rqf  reason: default package */
/* loaded from: classes7.dex */
final class rqf extends aah {
    final /* synthetic */ rqg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqf(rqg rqgVar, Context context) {
        super(context);
        this.f = rqgVar;
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.aah
    public final int h(View view, int i) {
        abs absVar = this.i;
        if (absVar == null || !absVar.D()) {
            return 0;
        }
        return Math.round(this.f.e - ((rqg.bC(view) + rqg.bB(view)) / 2.0f));
    }
}
