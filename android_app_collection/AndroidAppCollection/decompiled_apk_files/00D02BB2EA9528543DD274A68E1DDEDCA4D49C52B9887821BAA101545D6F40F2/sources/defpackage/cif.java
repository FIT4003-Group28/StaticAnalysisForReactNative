package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: cif  reason: default package */
/* loaded from: classes.dex */
public class cif extends cig<Drawable> {
    public cif(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.cig
    protected final /* bridge */ /* synthetic */ void l(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
