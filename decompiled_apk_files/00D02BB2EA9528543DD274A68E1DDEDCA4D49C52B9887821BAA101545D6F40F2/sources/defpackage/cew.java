package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cew  reason: default package */
/* loaded from: classes4.dex */
final class cew extends ceu<Drawable> {
    private cew(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxd<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new cew(drawable);
        }
        return null;
    }

    @Override // defpackage.bxd
    public final Class<Drawable> a() {
        return this.a.getClass();
    }

    @Override // defpackage.bxd
    public final int c() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.bxd
    public final void d() {
    }
}
