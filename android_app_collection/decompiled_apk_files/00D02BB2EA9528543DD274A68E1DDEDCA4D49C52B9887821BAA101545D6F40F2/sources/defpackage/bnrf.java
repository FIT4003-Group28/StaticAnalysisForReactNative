package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bnrf  reason: default package */
/* loaded from: classes3.dex */
public final class bnrf implements bnrd {
    @dzsi
    private Bitmap a;
    private final bnuw b;

    public bnrf(Bitmap bitmap) {
        this.a = bitmap;
        this.b = bnuw.c(bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // defpackage.bnrd
    @dzsi
    public final Bitmap a() {
        Bitmap bitmap = this.a;
        this.a = null;
        return bitmap;
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
        return this.a != null;
    }
}
