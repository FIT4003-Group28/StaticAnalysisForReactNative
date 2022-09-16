package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: idu  reason: default package */
/* loaded from: classes3.dex */
public final class idu implements yyn {
    private final ColorDrawable a;

    public idu(ColorDrawable colorDrawable) {
        this.a = colorDrawable;
    }

    @Override // defpackage.yyn
    public final void a(ImageView imageView) {
        imageView.setImageDrawable(this.a);
    }
}
