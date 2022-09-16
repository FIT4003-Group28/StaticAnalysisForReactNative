package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: gqx  reason: default package */
/* loaded from: classes3.dex */
public final class gqx implements tef {
    private final azqb a;
    private final DisplayMetrics b;

    public gqx(Context context, azqb azqbVar) {
        this.a = azqbVar;
        this.b = context.getResources().getDisplayMetrics();
    }

    @Override // defpackage.tef
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType) {
        awoi awoiVar = (awoi) obj;
        return new gqy(bitmap, scaleType, (teb) this.a.get(), this.b);
    }

    @Override // defpackage.tef
    public final aooq b() {
        return awoi.b;
    }
}
