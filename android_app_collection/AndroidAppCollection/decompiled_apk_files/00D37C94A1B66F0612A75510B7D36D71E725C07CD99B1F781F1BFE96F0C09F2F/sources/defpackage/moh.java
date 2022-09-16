package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moh  reason: default package */
/* loaded from: classes3.dex */
public final class moh {
    public final Context a;
    public final ImageView b;
    public final ajmu c;
    private final ajmy d;
    private final double e;

    public moh(Context context, ImageView imageView, ajmy ajmyVar, ajmu ajmuVar, double d) {
        this.a = context;
        this.b = imageView;
        this.d = ajmyVar;
        this.c = ajmuVar;
        this.e = d;
    }

    public final void a(avhn avhnVar, boolean z) {
        Uri r;
        this.b.setImageDrawable(null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener(new mog(this, avhnVar, z));
            return;
        }
        if (z) {
            double width = this.b.getWidth();
            double d = this.e;
            Double.isNaN(width);
            int i = (int) (width / d);
            double d2 = i;
            Double.isNaN(d2);
            r = akel.r(avhnVar, (int) (d2 * 1.7777777777777777d), i);
        } else {
            r = akel.r(avhnVar, this.b.getWidth(), this.b.getHeight());
        }
        mof mofVar = new mof(this, z);
        if (r != null) {
            this.d.l(r, mofVar);
        } else {
            mofVar.a(null, null);
        }
    }
}
