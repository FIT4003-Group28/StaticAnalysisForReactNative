package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: zor  reason: default package */
/* loaded from: classes4.dex */
public final class zor {
    public Bitmap a;
    public Bitmap b;
    public long c = -1;
    final Runnable d = new zoq(this);
    final /* synthetic */ zou e;

    public zor(zou zouVar) {
        this.e = zouVar;
    }

    public final void a(Bitmap bitmap) {
        this.a = bitmap;
        this.d.run();
    }
}
