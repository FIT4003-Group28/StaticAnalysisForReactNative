package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: vvd  reason: default package */
/* loaded from: classes4.dex */
public final class vvd extends vvb {
    public final CountDownLatch c;
    public Bitmap d;
    private final int e;

    public vvd(int i) {
        super(10);
        this.c = new CountDownLatch(1);
        this.e = i;
    }

    @Override // defpackage.vvb
    public final int a() {
        return this.e;
    }

    @Override // defpackage.vvb
    public final void b() {
        this.c.countDown();
    }

    @Override // defpackage.vvb
    public final void c(Exception exc) {
        vqy.c("Failed to extract thumbnail for video", exc);
        this.c.countDown();
    }

    @Override // defpackage.vvb
    public final int d() {
        if (this.d == null) {
            return this.e;
        }
        return -1;
    }

    @Override // defpackage.vvb
    public final void e(int i, Bitmap bitmap) {
        viu.d(this.e == i);
        this.d = bitmap;
    }

    @Override // defpackage.vvb
    public final boolean f(int i) {
        return this.e == i;
    }
}
