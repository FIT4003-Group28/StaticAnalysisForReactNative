package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.photos.ui.common.RoundedImageView;
/* compiled from: PG */
/* renamed from: cume  reason: default package */
/* loaded from: classes5.dex */
public final class cume extends FrameLayout {
    public final RoundedImageView a;
    public final int b;
    public final int c;
    public cukr e;
    private final ImageView f;
    private static final dehp g = cstu.b().a;
    public static final Handler d = new Handler(Looper.getMainLooper());

    public cume(Context context) {
        super(context);
        inflate(getContext(), R.layout.photos_attachment_preview_layout, this);
        RoundedImageView roundedImageView = (RoundedImageView) findViewById(R.id.photo_preview);
        this.a = roundedImageView;
        ImageView imageView = (ImageView) findViewById(R.id.close_button);
        this.f = imageView;
        int layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.photo_preview_cancel_padding);
        imageView.setPadding(layoutDirection != 0 ? 0 : dimensionPixelSize, 0, layoutDirection != 0 ? dimensionPixelSize : 0, dimensionPixelSize);
        roundedImageView.setRadius(cuwg.a(getContext(), 4.0f));
        this.b = (int) getResources().getDimension(R.dimen.photo_preview_min_dimension);
        this.c = (int) getResources().getDimension(R.dimen.photo_preview_max_dimension);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(1.0f);
    }

    public void setCloseButtonContentDescription(String str) {
        this.f.setContentDescription(str);
    }

    public void setImagePreview(final cukp cukpVar) {
        Bitmap a = cums.a(null, cukpVar.d(), cukpVar.e(), this.b, this.c);
        a.eraseColor(akm.c(getContext(), R.color.missing_thumbnail_color));
        this.a.setImageBitmap(a);
        if (this.e == null) {
            cstl.a("PhotoPrevView");
        } else {
            g.a(new Runnable(this, cukpVar) { // from class: cumc
                private final cume a;
                private final cukp b;

                {
                    this.a = this;
                    this.b = cukpVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final cume cumeVar = this.a;
                    cukp cukpVar2 = this.b;
                    cukr cukrVar = cumeVar.e;
                    Context context = cumeVar.getContext();
                    Uri parse = Uri.parse(cukpVar2.b());
                    int i = cumeVar.c;
                    Bitmap a2 = cukrVar.a(context, parse, i, i);
                    if (a2 != null) {
                        final Bitmap a3 = cums.a(a2, cukpVar2.d(), cukpVar2.e(), cumeVar.b, cumeVar.c);
                        cume.d.post(new Runnable(cumeVar, a3) { // from class: cumd
                            private final cume a;
                            private final Bitmap b;

                            {
                                this.a = cumeVar;
                                this.b = a3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                cume cumeVar2 = this.a;
                                cumeVar2.a.setImageBitmap(this.b);
                            }
                        });
                    }
                }
            });
        }
    }

    public void setImagePreviewContentDescription(String str) {
        this.a.setContentDescription(str);
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public void setUriLoader(cukr cukrVar) {
        this.e = cukrVar;
    }
}
