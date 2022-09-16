package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfk  reason: default package */
/* loaded from: classes4.dex */
public final class cfk extends cib<Bitmap> {
    final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    public cfk(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    @Override // defpackage.cij
    public final /* bridge */ /* synthetic */ void b(Object obj, cit citVar) {
        this.b = (Bitmap) obj;
        this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
    }

    @Override // defpackage.cij
    public final void c(Drawable drawable) {
        this.b = null;
    }
}
