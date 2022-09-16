package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ajqq  reason: default package */
/* loaded from: classes.dex */
public final class ajqq extends ajqb {
    private LinearLayout a;

    public ajqq(Context context, ajrx ajrxVar, ajsa ajsaVar) {
        super(context, ajrxVar, ajsaVar);
    }

    @Override // defpackage.ajqb
    protected final ViewGroup d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.a.setGravity(48);
        return this.a;
    }

    @Override // defpackage.ajqb
    protected final ajqi e(Context context, ajsa ajsaVar) {
        return new ajqp(context, ajsaVar);
    }

    @Override // defpackage.ajqb
    protected final void g(ajrs ajrsVar, ajqo ajqoVar) {
        this.a.setPadding(ajrsVar.b("grid_row_presenter_horizontal_row_padding", ajqoVar.e), ajrsVar.b("grid_row_presenter_top_padding", ajqoVar.c), ajrsVar.b("grid_row_presenter_horizontal_row_padding", ajqoVar.f), ajrsVar.b("grid_row_presenter_bottom_padding", ajqoVar.d));
    }

    @Override // defpackage.ajqb
    protected final void i(View view, ajqo ajqoVar, int i) {
        int i2 = ajqoVar.g;
        view.setPadding(i2, 0, i2, 0);
        this.a.addView(view);
    }
}
