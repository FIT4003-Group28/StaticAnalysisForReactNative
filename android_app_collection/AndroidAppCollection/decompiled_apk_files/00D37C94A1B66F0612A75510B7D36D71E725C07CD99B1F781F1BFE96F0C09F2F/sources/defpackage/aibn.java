package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: aibn  reason: default package */
/* loaded from: classes.dex */
public class aibn extends ahyf implements aibj {
    private Bitmap a;

    public aibn(Context context) {
        super(context);
    }

    @Override // defpackage.aibj
    public final void b(Bitmap bitmap) {
        if (this.a == bitmap) {
            return;
        }
        this.a = bitmap;
        X();
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.ahyl
    /* renamed from: g */
    public ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.a != null;
    }

    @Override // defpackage.aibj
    public final void nC() {
        b(null);
    }
}
