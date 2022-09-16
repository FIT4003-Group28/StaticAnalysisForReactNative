package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zvp  reason: default package */
/* loaded from: classes4.dex */
public class zvp extends FrameLayout {
    private static final long e = TimeUnit.SECONDS.toMillis(1);
    public final ImageView a;
    public final ImageView b;
    public final int c;
    public zvm d;
    private final ImageView f;
    private final YouTubeTextView g;
    private final int h;
    private boolean i;

    public zvp(Context context) {
        super(context, null);
        b(context);
        this.a = (ImageView) findViewById(R.id.thumb_image_view);
        this.b = (ImageView) findViewById(R.id.thumb_image_view_placeholder);
        this.f = (ImageView) findViewById(R.id.thumb_image_view_scrim);
        this.g = (YouTubeTextView) findViewById(R.id.duration_text_view);
        this.h = ake.d(context, R.color.gallery_thumb_background);
        this.c = ake.d(context, R.color.gallery_thumb_background_no_thumb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.setBackgroundColor(this.h);
        this.b.setVisibility(8);
    }

    protected void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_grid_thumb_view, (ViewGroup) this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j) {
        long j2 = e;
        String str = "";
        if (j >= j2) {
            YouTubeTextView youTubeTextView = this.g;
            if (j >= j2) {
                str = zgh.i(((int) j) / j2);
            }
            youTubeTextView.setText(str);
            this.g.setContentDescription(vqw.e(getContext(), j));
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        } else if (!this.i || j <= 0) {
            this.g.setVisibility(8);
            this.g.setText(str);
            this.g.setContentDescription(str);
            this.f.setVisibility(4);
        } else {
            this.g.setText("0:00");
            this.g.setContentDescription(vqw.e(getContext(), j));
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (!this.i) {
            super.onMeasure(i, i);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) (size * 1.7777778f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(size, i3);
    }

    public zvp(Context context, boolean z) {
        this(context);
        this.i = z;
    }
}
