package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwo  reason: default package */
/* loaded from: classes3.dex */
public final class cwo extends axix {
    public List a;

    public cwo() {
        super("sdtp");
        this.a = new ArrayList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        return this.a.size() + 4;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.a.add(new cwn(hy.H(byteBuffer)));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        for (cwn cwnVar : this.a) {
            hy.z(byteBuffer, cwnVar.a);
        }
    }

    public final String toString() {
        return "SampleDependencyTypeBox{entries=" + this.a + '}';
    }
}
