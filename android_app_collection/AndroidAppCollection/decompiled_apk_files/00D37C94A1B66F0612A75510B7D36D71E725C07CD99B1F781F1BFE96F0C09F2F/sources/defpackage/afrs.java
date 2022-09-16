package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: afrs  reason: default package */
/* loaded from: classes.dex */
public final class afrs {
    public final Context a;
    public final ImageView b;
    private final ajmy c;

    public afrs(Context context, ImageView imageView, ajmy ajmyVar) {
        this.a = context;
        this.b = imageView;
        this.c = ajmyVar;
    }

    public final void a(avhn avhnVar) {
        this.b.setImageDrawable(null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener(new afrr(this, avhnVar));
            return;
        }
        Uri r = akel.r(avhnVar, this.b.getWidth(), this.b.getHeight());
        afrq afrqVar = new afrq(this);
        if (r != null) {
            this.c.l(r, afrqVar);
        } else {
            afrqVar.a(null, null);
        }
    }
}
