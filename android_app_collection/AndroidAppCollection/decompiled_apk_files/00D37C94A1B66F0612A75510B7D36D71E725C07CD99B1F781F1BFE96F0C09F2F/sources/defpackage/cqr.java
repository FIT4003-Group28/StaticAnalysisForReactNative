package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqr  reason: default package */
/* loaded from: classes3.dex */
final class cqr extends cqq {
    private cqr(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cku g(Drawable drawable) {
        if (drawable != null) {
            return new cqr(drawable);
        }
        return null;
    }

    @Override // defpackage.cku
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.cku
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.cku
    public final void e() {
    }
}
