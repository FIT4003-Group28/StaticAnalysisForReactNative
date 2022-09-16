package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvw  reason: default package */
/* loaded from: classes3.dex */
public final class cvw extends axix {
    public List a;

    public cvw() {
        super("ctts");
        this.a = Collections.emptyList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.a.size() * 8) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.a = new ArrayList(p);
        for (int i = 0; i < p; i++) {
            this.a.add(new cvv(axds.p(hy.I(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.size());
        for (cvv cvvVar : this.a) {
            hy.y(byteBuffer, cvvVar.a);
            byteBuffer.putInt(cvvVar.b);
        }
    }
}
