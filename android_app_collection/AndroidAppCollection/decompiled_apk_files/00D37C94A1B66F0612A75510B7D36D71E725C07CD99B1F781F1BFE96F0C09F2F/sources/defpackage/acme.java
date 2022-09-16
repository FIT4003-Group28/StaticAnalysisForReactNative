package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acme  reason: default package */
/* loaded from: classes.dex */
public final class acme extends abmt {
    public acme(Context context, ajmr ajmrVar, acth acthVar, aafo aafoVar, ajvm ajvmVar, ajxz ajxzVar, abka abkaVar) {
        super(context, ajmrVar, acthVar, aafoVar, ajvmVar, ajxzVar, abkaVar);
    }

    @Override // defpackage.abmt
    protected final int d() {
        return R.layout.live_chat_overlay_paid_message;
    }

    @Override // defpackage.abmt
    protected final int e() {
        return R.drawable.live_chat_overlay_paid_message_full_background;
    }

    @Override // defpackage.abmt
    protected final int f() {
        return R.drawable.live_chat_overlay_paid_message_top_background;
    }

    @Override // defpackage.abmt
    protected final ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // defpackage.abmt
    public final void h(ajrs ajrsVar, asrw asrwVar) {
        super.oK(ajrsVar, asrwVar);
        Resources resources = this.c.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.i.getVisibility() != 0) {
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_amount_vertical_padding_when_moderated);
            TextView textView = this.j;
            int i = dimensionPixelSize / 2;
            textView.setPaddingRelative(i, dimensionPixelOffset3, textView.getPaddingEnd(), dimensionPixelOffset3);
            TextView textView2 = this.l;
            textView2.setPaddingRelative(i - dimensionPixelOffset, 0, textView2.getPaddingEnd(), 0);
            return;
        }
        TextView textView3 = this.j;
        textView3.setPaddingRelative(0, 0, textView3.getPaddingEnd(), 0);
        TextView textView4 = this.l;
        textView4.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView4.getPaddingEnd(), 0);
    }

    @Override // defpackage.abmt, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        oK(ajrsVar, (asrw) obj);
    }
}
