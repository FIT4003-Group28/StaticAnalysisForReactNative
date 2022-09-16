package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* renamed from: dlo  reason: default package */
/* loaded from: classes3.dex */
final class dlo extends yk {
    final /* synthetic */ dlp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(dlp dlpVar, Context context) {
        super(context);
        this.a = dlpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.yk
    protected final void c(View view, yi yiVar) {
        dlp dlpVar = this.a;
        int[] c = dlpVar.c(dlpVar.b.n, view);
        int i = c[0];
        int i2 = c[1];
        int j = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (j > 0) {
            yiVar.b(i, i2, j, this.j);
        }
    }
}
