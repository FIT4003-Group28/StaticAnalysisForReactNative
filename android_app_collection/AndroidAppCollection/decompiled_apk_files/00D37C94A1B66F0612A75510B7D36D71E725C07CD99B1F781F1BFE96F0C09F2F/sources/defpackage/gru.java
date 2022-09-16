package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gru  reason: default package */
/* loaded from: classes3.dex */
final class gru extends yo {
    public static final /* synthetic */ int v = 0;
    public final ImageView t;
    public final grm u;

    public gru(View view) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view;
        ImageView imageView = new ImageView(frameLayout.getContext());
        this.t = imageView;
        grm grmVar = new grm(frameLayout.getContext());
        this.u = grmVar;
        Context context = frameLayout.getContext();
        if (grmVar.a == null) {
            grmVar.a = new Paint();
        }
        grmVar.a.setColor(zhn.d(context, R.attr.ytTextDisabled));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        grmVar.b = zew.i(displayMetrics, 1);
        grmVar.c = zew.i(displayMetrics, 12);
        grmVar.d = zew.i(displayMetrics, 20);
        grmVar.e = zew.i(displayMetrics, 32);
        grmVar.setBackgroundColor(zhn.d(frameLayout.getContext(), R.attr.ytGeneralBackgroundA));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(4);
        frameLayout.addView(imageView);
        grmVar.setLayoutParams(layoutParams);
        frameLayout.addView(grmVar);
    }
}
