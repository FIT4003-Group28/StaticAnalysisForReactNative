package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: chk  reason: default package */
/* loaded from: classes2.dex */
public final class chk implements cnr, chb {
    private final ajnp a;
    private final /* synthetic */ int b;

    public chk(ajnp ajnpVar) {
        this.a = ajnpVar;
    }

    public chk(ajnp ajnpVar, int i) {
        this.b = i;
        this.a = ajnpVar;
    }

    @Override // defpackage.chb
    public final Class a() {
        return this.b != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.chb
    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return this.b != 0 ? byteBuffer : cus.a(byteBuffer);
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        if (this.b == 0) {
            return new chl(this, this.a);
        }
        return new chl(this, this.a);
    }
}
