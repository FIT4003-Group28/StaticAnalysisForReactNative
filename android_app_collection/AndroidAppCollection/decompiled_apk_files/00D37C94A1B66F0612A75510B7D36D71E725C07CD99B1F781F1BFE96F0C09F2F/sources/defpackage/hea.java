package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hea  reason: default package */
/* loaded from: classes3.dex */
public final class hea extends zvi {
    private final Paint b;

    public hea(Context context) {
        super(context);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.gallery_with_header_thumb_margin);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(zhn.j(context, R.attr.ytBrandBackgroundSolid).orElse(context.getResources().getColor(R.color.yt_white1)));
    }

    @Override // defpackage.nd
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        canvas.drawRect(0.0f, recyclerView.getTop(), recyclerView.getRight(), recyclerView.getBottom(), this.b);
    }
}
