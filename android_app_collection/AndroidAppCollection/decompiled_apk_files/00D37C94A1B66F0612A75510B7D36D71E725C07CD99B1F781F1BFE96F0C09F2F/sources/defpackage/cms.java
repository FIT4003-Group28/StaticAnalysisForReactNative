package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cms  reason: default package */
/* loaded from: classes2.dex */
final class cms implements cmq {
    private final /* synthetic */ int a;

    public cms() {
    }

    public cms(int i) {
        this.a = i;
    }

    @Override // defpackage.cmq
    public final Class a() {
        return this.a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.cmq
    public final /* bridge */ /* synthetic */ Object b(byte[] bArr) {
        if (this.a == 0) {
            return new ByteArrayInputStream(bArr);
        }
        return ByteBuffer.wrap(bArr);
    }
}
