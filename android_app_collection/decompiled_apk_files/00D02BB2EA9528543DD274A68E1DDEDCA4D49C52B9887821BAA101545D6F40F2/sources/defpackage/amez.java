package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: amez  reason: default package */
/* loaded from: classes.dex */
final class amez extends ckqk {
    final /* synthetic */ amfu a;

    public amez(amfu amfuVar) {
        this.a = amfuVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        synchronized (this.a) {
            this.a.o(bitmap);
            this.a.q();
        }
    }
}
