package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zp  reason: default package */
/* loaded from: classes4.dex */
public final class zp extends yk {
    final /* synthetic */ xz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(xz xzVar, Context context) {
        super(context);
        this.a = xzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.yk
    protected final void c(View view, yi yiVar) {
        xz xzVar = this.a;
        RecyclerView recyclerView = xzVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] c = xzVar.c(recyclerView.n, view);
        int i = c[0];
        int i2 = c[1];
        int j = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (j <= 0) {
            return;
        }
        yiVar.b(i, i2, j, this.j);
    }
}
