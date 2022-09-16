package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: yuo  reason: default package */
/* loaded from: classes4.dex */
public final class yuo extends ByteArrayOutputStream {
    public yuo() {
    }

    public final ByteBuffer a() {
        return ByteBuffer.wrap(this.buf, 0, this.count);
    }

    public yuo(int i) {
        super(i);
    }
}
