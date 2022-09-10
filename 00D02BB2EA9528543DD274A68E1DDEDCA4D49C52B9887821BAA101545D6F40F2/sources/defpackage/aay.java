package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* renamed from: aay  reason: default package */
/* loaded from: classes2.dex */
final class aay extends aah {
    final /* synthetic */ aaz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aay(aaz aazVar, Context context) {
        super(context);
        this.f = aazVar;
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aah
    public final int d(int i) {
        return Math.min(100, super.d(i));
    }

    @Override // defpackage.aah, defpackage.ach
    protected final void k(View view, acf acfVar) {
        aaz aazVar = this.f;
        int[] a = aazVar.a(aazVar.a.l, view);
        int i = a[0];
        int i2 = a[1];
        int c = c(Math.max(Math.abs(i), Math.abs(i2)));
        if (c > 0) {
            acfVar.b(i, i2, c, this.b);
        }
    }
}
