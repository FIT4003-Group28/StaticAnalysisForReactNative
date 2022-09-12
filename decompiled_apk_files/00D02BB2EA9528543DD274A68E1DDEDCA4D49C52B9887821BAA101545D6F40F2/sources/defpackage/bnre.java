package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bnre  reason: default package */
/* loaded from: classes3.dex */
final class bnre implements bnrd {
    @dzsi
    private final Bitmap a;
    private final bnuw b;

    public bnre(@dzsi Bitmap bitmap) {
        this.a = bitmap;
        this.b = bitmap != null ? bnuw.c(bitmap.getWidth(), bitmap.getHeight()) : bnuw.c(0, 0);
    }

    @Override // defpackage.bnrd
    @dzsi
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.bnrd
    public final bnuw b() {
        return this.b;
    }

    @Override // defpackage.bnrd
    public final void c() {
    }

    @Override // defpackage.bnrv
    public final boolean d() {
        return true;
    }
}
