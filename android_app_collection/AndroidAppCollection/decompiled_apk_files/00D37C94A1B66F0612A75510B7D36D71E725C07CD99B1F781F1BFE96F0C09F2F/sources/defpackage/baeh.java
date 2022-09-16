package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;
/* compiled from: PG */
/* renamed from: baeh  reason: default package */
/* loaded from: classes2.dex */
public final class baeh implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;

    public baeh(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.a = cronetBidirectionalStream;
        this.b = byteBuffer;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.b;
            this.b = null;
            synchronized (this.a.c) {
                if (this.a.e()) {
                    return;
                }
                boolean z = false;
                if (this.c) {
                    CronetBidirectionalStream cronetBidirectionalStream = this.a;
                    cronetBidirectionalStream.f = 10;
                    if (cronetBidirectionalStream.e == 4) {
                        z = true;
                    }
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                cronetBidirectionalStream2.a.onWriteCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.g, byteBuffer, this.c);
                if (!z) {
                    return;
                }
                this.a.b();
            }
        } catch (Exception e) {
            this.a.c(e);
        }
    }
}
