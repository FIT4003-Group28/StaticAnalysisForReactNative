package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cllc  reason: default package */
/* loaded from: classes5.dex */
final class cllc implements clli {
    final /* synthetic */ clld a;
    @dzsi
    private URLConnection b;
    private final int c;
    private final Map<String, List<String>> d;

    public cllc(clld clldVar, URLConnection uRLConnection, int i) {
        this.a = clldVar;
        this.b = uRLConnection;
        this.c = i;
        this.d = uRLConnection.getHeaderFields();
    }

    @Override // defpackage.clli
    public final int a() {
        return this.c;
    }

    @Override // defpackage.clli
    public final Map<String, List<String>> b() {
        return this.d;
    }

    @Override // defpackage.clli
    public final dehn<Long> c(final WritableByteChannel writableByteChannel) {
        clkw.a(writableByteChannel);
        return this.a.a.c(new Callable(this, writableByteChannel) { // from class: cllb
            private final cllc a;
            private final WritableByteChannel b;

            {
                this.a = this;
                this.b = writableByteChannel;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cllc cllcVar = this.a;
                WritableByteChannel writableByteChannel2 = this.b;
                URLConnection d = cllcVar.d();
                try {
                    if (d == null) {
                        throw new clle("URLConnection already closed");
                    }
                    try {
                        ReadableByteChannel newChannel = Channels.newChannel(d.getInputStream());
                        try {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ImageMetadata.LENS_APERTURE);
                            long j = 0;
                            while (newChannel.read(allocateDirect) != -1) {
                                clld.c();
                                allocateDirect.flip();
                                j += clkw.b(allocateDirect, writableByteChannel2);
                                allocateDirect.clear();
                                clld.c();
                            }
                            Long valueOf = Long.valueOf(j);
                            if (newChannel != null) {
                                newChannel.close();
                            }
                            return valueOf;
                        } catch (Throwable th) {
                            if (newChannel != null) {
                                try {
                                    newChannel.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new clle(e);
                    }
                } finally {
                    clld.d(d);
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        URLConnection d = d();
        if (d != null) {
            d.getInputStream().close();
            clld.d(d);
        }
    }

    @dzsi
    public final synchronized URLConnection d() {
        URLConnection uRLConnection;
        uRLConnection = this.b;
        this.b = null;
        return uRLConnection;
    }
}
