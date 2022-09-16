package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: agdy  reason: default package */
/* loaded from: classes.dex */
final class agdy implements yiw {
    final /* synthetic */ amum a;
    final /* synthetic */ agdz b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ ajmy d;
    final /* synthetic */ Uri e;
    final /* synthetic */ yiw f;

    public agdy(amum amumVar, agdz agdzVar, CountDownLatch countDownLatch, ajmy ajmyVar, Uri uri, yiw yiwVar) {
        this.a = amumVar;
        this.b = agdzVar;
        this.c = countDownLatch;
        this.d = ajmyVar;
        this.e = uri;
        this.f = yiwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.d.l(this.e, this.f);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.f(this.b, bitmap);
            this.c.countDown();
            return;
        }
        this.d.l(this.e, this.f);
    }
}
