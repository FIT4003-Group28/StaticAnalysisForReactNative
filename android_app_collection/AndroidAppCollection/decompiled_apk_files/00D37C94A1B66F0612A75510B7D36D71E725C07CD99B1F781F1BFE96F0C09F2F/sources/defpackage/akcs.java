package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akcs  reason: default package */
/* loaded from: classes.dex */
final class akcs extends djo {
    private final LinearLayoutManager b;
    private final ViewGroup.LayoutParams c;

    public akcs(LinearLayoutManager linearLayoutManager, ViewGroup.LayoutParams layoutParams) {
        super(linearLayoutManager);
        this.b = linearLayoutManager;
        this.c = layoutParams;
    }

    @Override // defpackage.djo
    public final int f(int i, dlj dljVar) {
        ViewGroup.LayoutParams layoutParams;
        if (this.b.i != 0 || (layoutParams = this.c) == null || layoutParams.height != -2) {
            return super.f(i, dljVar);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
