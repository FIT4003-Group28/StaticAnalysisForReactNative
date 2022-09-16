package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ady  reason: default package */
/* loaded from: classes2.dex */
public final class ady extends aah {
    final /* synthetic */ adz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ady(adz adzVar, Context context) {
        super(context);
        this.f = adzVar;
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.aah, defpackage.ach
    protected final void k(View view, acf acfVar) {
        adz adzVar = this.f;
        RecyclerView recyclerView = adzVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] a = adzVar.a(recyclerView.l, view);
        int i = a[0];
        int i2 = a[1];
        int c = c(Math.max(Math.abs(i), Math.abs(i2)));
        if (c <= 0) {
            return;
        }
        acfVar.b(i, i2, c, this.b);
    }
}
