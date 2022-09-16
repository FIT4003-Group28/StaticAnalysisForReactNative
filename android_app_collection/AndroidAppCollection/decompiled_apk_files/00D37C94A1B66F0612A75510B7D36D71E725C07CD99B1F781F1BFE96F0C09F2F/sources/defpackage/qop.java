package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: qop  reason: default package */
/* loaded from: classes4.dex */
final class qop implements qoi {
    final /* synthetic */ qor a;
    private final /* synthetic */ int b;

    public qop(qor qorVar) {
        this.a = qorVar;
    }

    public qop(qor qorVar, int i) {
        this.b = i;
        this.a = qorVar;
    }

    @Override // defpackage.qoi
    public final void a(Bitmap bitmap) {
        if (this.b == 0) {
            this.a.h(bitmap, 3);
            return;
        }
        this.a.h(qor.g(bitmap), 0);
    }
}
