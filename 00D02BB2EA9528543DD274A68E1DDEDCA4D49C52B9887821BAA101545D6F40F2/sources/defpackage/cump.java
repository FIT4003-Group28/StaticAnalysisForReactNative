package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.photos.ui.common.RoundedImageView;
/* compiled from: PG */
/* renamed from: cump  reason: default package */
/* loaded from: classes5.dex */
final class cump extends cvas {
    public final RoundedImageView a;

    public cump(Context context) {
        RoundedImageView roundedImageView = new RoundedImageView(context);
        this.a = roundedImageView;
        roundedImageView.setLayoutParams(new ViewGroup.LayoutParams((int) context.getResources().getDimension(R.dimen.photo_preview_conversation_cell_width), (int) context.getResources().getDimension(R.dimen.photo_preview_conversation_cell_height)));
        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedImageView.setRadius(cuwg.a(context, 4.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.addView(roundedImageView);
        this.c = dbsg.i(linearLayout);
    }
}
