package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cljn  reason: default package */
/* loaded from: classes5.dex */
final class cljn implements clli {
    public final clji a;
    final /* synthetic */ cljo b;

    public cljn(cljo cljoVar, clji cljiVar) {
        this.b = cljoVar;
        this.a = cljiVar;
    }

    @Override // defpackage.clli
    public final int a() {
        return 200;
    }

    @Override // defpackage.clli
    public final Map<String, List<String>> b() {
        return dcdn.k("Content-Type", dcdc.f(this.a.b));
    }

    @Override // defpackage.clli
    public final dehn<Long> c(final WritableByteChannel writableByteChannel) {
        clkw.a(writableByteChannel);
        return this.b.a.c(new Callable(this, writableByteChannel) { // from class: cljm
            private final cljn a;
            private final WritableByteChannel b;

            {
                this.a = this;
                this.b = writableByteChannel;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cljn cljnVar = this.a;
                try {
                    return Long.valueOf(clkw.b(ByteBuffer.wrap(cljnVar.a.a), this.b));
                } catch (IOException e) {
                    throw new clle(e);
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
