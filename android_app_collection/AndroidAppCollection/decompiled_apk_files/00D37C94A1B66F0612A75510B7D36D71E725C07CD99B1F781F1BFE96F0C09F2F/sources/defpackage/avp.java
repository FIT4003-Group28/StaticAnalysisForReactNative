package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avp  reason: default package */
/* loaded from: classes2.dex */
public final class avp {
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public final MediaCodec c;
    public final HandlerThread d;
    public Handler e;
    public final pvt f;
    public final boolean g;
    public boolean h;
    private final AtomicReference i;

    public avp(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        pvt pvtVar = new pvt();
        this.c = mediaCodec;
        this.d = handlerThread;
        this.f = pvtVar;
        this.i = new AtomicReference();
        boolean z2 = true;
        if (!z) {
            String g = akzj.g(pxi.c);
            if (!g.contains("samsung") && !g.contains("motorola")) {
                z2 = false;
            }
        }
        this.g = z2;
    }

    public static avo a() {
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new avo();
            }
            return (avo) arrayDeque.removeFirst();
        }
    }

    public final void b() {
        this.f.f();
        Handler handler = this.e;
        int i = pxi.a;
        handler.obtainMessage(2).sendToTarget();
        this.f.a();
    }

    public final void c() {
        if (this.h) {
            try {
                Handler handler = this.e;
                int i = pxi.a;
                handler.removeCallbacksAndMessages(null);
                b();
                d();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.i.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(RuntimeException runtimeException) {
        this.i.set(runtimeException);
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int[] g(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }
}
