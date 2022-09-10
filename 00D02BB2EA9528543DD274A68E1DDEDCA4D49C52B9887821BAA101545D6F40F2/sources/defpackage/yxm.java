package defpackage;

import android.graphics.BitmapRegionDecoder;
import com.google.android.apps.viewer.client.Dimensions;
/* compiled from: PG */
/* renamed from: yxm  reason: default package */
/* loaded from: classes7.dex */
public final class yxm {
    public final BitmapRegionDecoder a;
    public final Dimensions b;
    public volatile boolean c;
    @dzsi
    public volatile Dimensions d;
    public final /* synthetic */ yxn e;

    public yxm(yxn yxnVar, byte[] bArr) {
        this.e = yxnVar;
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, true);
        this.a = newInstance;
        this.b = new Dimensions(newInstance.getWidth(), newInstance.getHeight());
    }

    public final synchronized void a(Dimensions dimensions) {
        if (dbsd.a(dimensions, this.d)) {
            return;
        }
        this.d = dimensions;
        this.e.a.b(new yxi(this, dimensions), bvrj.BACKGROUND_THREADPOOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = true;
    }
}
