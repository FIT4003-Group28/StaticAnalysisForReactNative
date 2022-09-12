package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bzf  reason: default package */
/* loaded from: classes4.dex */
final class bzf implements bzh<ByteBuffer> {
    @Override // defpackage.bzh
    public final Class<ByteBuffer> a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.bzh
    public final /* bridge */ /* synthetic */ ByteBuffer b(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }
}
