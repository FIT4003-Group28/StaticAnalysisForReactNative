package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: cwhq  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwhq implements cwqi {
    static final cwqi a = new cwhq();

    private cwhq() {
    }

    @Override // defpackage.cwqi
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Drawable drawable = new cwgf(layoutInflater.getContext()).c;
        ImageView imageView = new ImageView(layoutInflater.getContext());
        imageView.setImageDrawable(drawable);
        return imageView;
    }
}
