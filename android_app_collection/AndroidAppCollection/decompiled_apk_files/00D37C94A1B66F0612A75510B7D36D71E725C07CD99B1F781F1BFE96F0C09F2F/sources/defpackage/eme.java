package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eme  reason: default package */
/* loaded from: classes3.dex */
public final class eme implements ajru {
    public final LinearLayout a;
    private final Context b;
    private final aafo c;
    private final ajxz d;
    private final YouTubeTextView e;
    private final ImageView f;

    public eme(Context context, aafo aafoVar, ajxz ajxzVar) {
        this.b = context;
        this.c = aafoVar;
        this.d = ajxzVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) context.getResources().getDimension(R.dimen.channel_edit_info_top_margin), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        this.e = youTubeTextView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_msg_margin), 0, 0, 0);
        youTubeTextView.setLayoutParams(layoutParams2);
        youTubeTextView.setTypeface(ajgo.ROBOTO_REGULAR.c(context));
        youTubeTextView.setTextSize(0, context.getResources().getDimension(R.dimen.extra_small_font_size));
        youTubeTextView.d(true);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_margin_top);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_margin_left);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_size), context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_size));
        layoutParams3.setMargins(dimensionPixelSize2, dimensionPixelSize, 0, 0);
        imageView.setLayoutParams(layoutParams3);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(imageView);
        linearLayout.addView(youTubeTextView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(aptx aptxVar) {
        YouTubeTextView youTubeTextView = this.e;
        arag aragVar = aptxVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        youTubeTextView.setText(aafv.a(aragVar, this.c, false));
        Resources resources = this.b.getResources();
        ajxz ajxzVar = this.d;
        arhs arhsVar = aptxVar.c;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajxzVar.a(b));
        ImageView imageView = this.f;
        yzh.e(drawable, this.e.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawable);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((aptx) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
