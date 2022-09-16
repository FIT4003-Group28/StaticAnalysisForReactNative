package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnq  reason: default package */
/* loaded from: classes.dex */
public final class abnq extends abmv {
    public abnq(Context context, ajmr ajmrVar, acth acthVar, aafo aafoVar, ajod ajodVar, zhf zhfVar) {
        super(context, ajmrVar, acthVar, aafoVar, ajodVar, zhfVar);
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        zgd.u(this.c, new abmf(marginLayoutParams, 3), zgd.m(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.abmv
    public final int f() {
        return R.layout.live_chat_overlay_paid_sticker;
    }
}
