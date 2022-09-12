package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* compiled from: PG */
/* renamed from: axd  reason: default package */
/* loaded from: classes3.dex */
final class axd extends Property<Drawable, PointF> {
    private final Rect a;

    public axd(Class cls) {
        super(cls, "boundsOrigin");
        this.a = new Rect();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(Drawable drawable) {
        drawable.copyBounds(this.a);
        return new PointF(this.a.left, this.a.top);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Drawable drawable, PointF pointF) {
        Drawable drawable2 = drawable;
        PointF pointF2 = pointF;
        drawable2.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
        drawable2.setBounds(this.a);
    }
}
