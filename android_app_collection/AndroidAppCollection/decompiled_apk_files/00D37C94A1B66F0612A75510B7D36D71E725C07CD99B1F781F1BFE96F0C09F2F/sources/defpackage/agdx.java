package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: agdx  reason: default package */
/* loaded from: classes.dex */
final class agdx implements yiw {
    final /* synthetic */ amum a;
    final /* synthetic */ agdz b;
    final /* synthetic */ CountDownLatch c;

    public agdx(amum amumVar, agdz agdzVar, CountDownLatch countDownLatch) {
        this.a = amumVar;
        this.b = agdzVar;
        this.c = countDownLatch;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.c.countDown();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.f(this.b, bitmap);
        }
        this.c.countDown();
    }
}
