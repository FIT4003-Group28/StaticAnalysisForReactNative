package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
/* compiled from: PG */
/* renamed from: cqut  reason: default package */
/* loaded from: classes.dex */
public final class cqut extends cqtd {
    private final cqss a;
    private final cqss b;
    private final cqrp c;

    public cqut(cqss cqssVar, cqss cqssVar2, cqrp cqrpVar) {
        super(new Object[]{cqssVar, cqssVar2});
        this.a = cqssVar;
        this.b = cqssVar2;
        this.c = cqrpVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        int b = this.a.b(context);
        int b2 = this.b.b(context);
        PaintDrawable paintDrawable = new PaintDrawable(b);
        PaintDrawable paintDrawable2 = new PaintDrawable(b2);
        paintDrawable.setCornerRadius(this.c.a(context));
        paintDrawable2.setCornerRadius(this.c.a(context));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{paintDrawable, new ClipDrawable(paintDrawable2, 3, 1)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        return layerDrawable;
    }
}
