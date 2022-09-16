package defpackage;

import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: bubq  reason: default package */
/* loaded from: classes4.dex */
final class bubq extends ByteArrayOutputStream {
    public bubq() {
        super(8192);
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized byte[] toByteArray() {
        return this.buf;
    }
}
