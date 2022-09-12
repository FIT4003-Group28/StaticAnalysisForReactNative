package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dcyr  reason: default package */
/* loaded from: classes5.dex */
final class dcyr extends dcyq {
    final dcys a;
    final /* synthetic */ dcyt b;

    public dcyr(dcyt dcytVar, int i) {
        this.b = dcytVar;
        this.a = new dcys(i);
    }

    @Override // defpackage.dczb
    public final void d(byte b) {
        this.a.write(b);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void f(ByteBuffer byteBuffer) {
        this.a.a(byteBuffer);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void g(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
    }

    @Override // defpackage.dczb
    public final dcyz p() {
        return this.b.e(this.a.b(), this.a.c());
    }
}
