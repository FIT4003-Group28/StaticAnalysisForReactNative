package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hlb  reason: default package */
/* loaded from: classes3.dex */
public final class hlb extends FrameLayout {
    public final ImageView a;
    public final View b;
    public final ProgressBar c;
    public final YouTubeTextView d;
    public final ampq e;
    public final ampq f;
    public ampq g;
    private final View h;

    public hlb(Context context, ampq ampqVar, ampq ampqVar2) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.carousel_thumbnail_view, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.carousel_thumbnail_view_parent);
        this.h = findViewById;
        this.a = (ImageView) findViewById(R.id.carousel_thumbnail_image_view);
        this.b = findViewById(R.id.carousel_thumbnail_image_border);
        this.c = (ProgressBar) findViewById(R.id.carousel_thumbnail_image_loading_bar);
        this.d = (YouTubeTextView) findViewById(R.id.carousel_thumbnail_duration_text_view);
        this.e = ampqVar;
        this.f = ampqVar2;
        if (ampqVar.h() && ampqVar2.h()) {
            ((zbq) ampqVar.c()).a((zbr) ampqVar2.c());
            ((zbq) ampqVar.c()).c(findViewById);
        }
        this.g = amon.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ampq ampqVar) {
        this.c.setVisibility(8);
        if (ampqVar.h()) {
            this.a.setBackground(null);
            this.a.setImageBitmap((Bitmap) ampqVar.c());
            return;
        }
        this.a.setBackground(getContext().getDrawable(R.drawable.reel_edit_carousel_thumbnail_failed_background));
        Drawable drawable = getContext().getDrawable(2131233308);
        if (drawable == null) {
            return;
        }
        drawable.setTint(zhn.j(getContext(), R.attr.ytErrorIndicator).orElse(-65536));
        this.a.setImageDrawable(drawable);
    }
}
