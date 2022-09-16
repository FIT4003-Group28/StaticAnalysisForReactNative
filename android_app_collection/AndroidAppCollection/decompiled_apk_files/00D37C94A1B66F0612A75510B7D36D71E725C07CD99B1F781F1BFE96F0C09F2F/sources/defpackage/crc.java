package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crc  reason: default package */
/* loaded from: classes3.dex */
public final class crc extends ctr {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public crc(Handler handler, int i, long j) {
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.ctz
    public final /* bridge */ /* synthetic */ void b(Object obj, cug cugVar) {
        this.b = (Bitmap) obj;
        this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.e);
    }
}
