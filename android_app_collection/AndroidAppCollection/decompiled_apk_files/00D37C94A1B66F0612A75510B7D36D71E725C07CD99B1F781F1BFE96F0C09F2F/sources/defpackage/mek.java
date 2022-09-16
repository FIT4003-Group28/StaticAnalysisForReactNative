package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mek  reason: default package */
/* loaded from: classes3.dex */
public final class mek implements zdx {
    public final ImageView a;
    public final Drawable b;
    final /* synthetic */ PivotBar c;

    public mek(PivotBar pivotBar, ImageView imageView, Drawable drawable) {
        this.c = pivotBar;
        imageView.getClass();
        this.a = imageView;
        drawable.getClass();
        this.b = drawable;
        imageView.setImageDrawable(drawable);
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }
}
