package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bfbl  reason: default package */
/* loaded from: classes3.dex */
public class bfbl {
    public final cqat a;
    private final bvrb b;

    public bfbl(bvrb bvrbVar, cqat cqatVar) {
        this.b = bvrbVar;
        this.a = cqatVar;
    }

    public final dehn<Uri> a(Bitmap bitmap) {
        deig d = deig.d();
        this.b.b(new bfbk(this, bitmap, d), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }
}
