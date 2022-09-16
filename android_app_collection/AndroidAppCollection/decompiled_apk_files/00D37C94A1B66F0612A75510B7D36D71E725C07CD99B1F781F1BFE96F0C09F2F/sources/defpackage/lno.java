package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lno  reason: default package */
/* loaded from: classes3.dex */
public final class lno implements lnt, lns, lnr {
    @Override // defpackage.lns
    public final void b(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
        View a = ajruVar.a();
        String string = a.getContext().getResources().getString(R.string.accessibility_list_item_drag_over, Integer.valueOf(i2 + 1));
        Context context = a.getContext();
        if (zdg.e(context)) {
            zdg.a(context).interrupt();
        }
        zdg.c(context, a, string);
    }

    @Override // defpackage.lnt
    public final void c(ajru ajruVar, ajsm ajsmVar, int i) {
        View a = ajruVar.a();
        zdg.c(a.getContext(), a, a.getContext().getResources().getString(R.string.accessibility_list_item_drag_start, Integer.valueOf(i + 1), Integer.valueOf(ajsmVar.size())));
    }

    @Override // defpackage.lnr
    public final void oM(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
        View a = ajruVar.a();
        zdg.c(a.getContext(), a, a.getContext().getResources().getString(R.string.accessibility_list_item_drag_end, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1), Integer.valueOf(ajsmVar.size())));
    }
}
