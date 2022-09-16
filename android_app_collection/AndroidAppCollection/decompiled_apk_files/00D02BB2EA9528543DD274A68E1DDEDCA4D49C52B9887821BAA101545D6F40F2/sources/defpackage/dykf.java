package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dykf  reason: default package */
/* loaded from: classes6.dex */
final class dykf implements dyvs {
    public final ByteBuffer a;

    public dykf(ByteBuffer byteBuffer) {
        dbsk.t(byteBuffer, "buffer");
        this.a = byteBuffer;
    }

    @Override // defpackage.dyvs
    public final void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    @Override // defpackage.dyvs
    public final void b(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.dyvs
    public final int c() {
        return this.a.remaining();
    }

    @Override // defpackage.dyvs
    public final int d() {
        return this.a.position();
    }
}
