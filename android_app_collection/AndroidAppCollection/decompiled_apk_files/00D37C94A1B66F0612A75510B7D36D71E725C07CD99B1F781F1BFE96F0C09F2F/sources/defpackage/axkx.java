package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axkx  reason: default package */
/* loaded from: classes2.dex */
public final class axkx extends axix {
    public String a;
    public final List b;
    private String c;

    public axkx() {
        super("sbgp");
        this.b = new LinkedList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        return s() == 1 ? (this.b.size() * 8) + 16 : (this.b.size() * 8) + 12;
    }

    @Override // defpackage.axiv
    protected final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.K(byteBuffer);
        if (s() == 1) {
            this.c = hy.K(byteBuffer);
        }
        long I = hy.I(byteBuffer);
        while (true) {
            long j = (-1) + I;
            if (I > 0) {
                this.b.add(new axkw(axds.p(hy.I(byteBuffer)), axds.p(hy.I(byteBuffer))));
                I = j;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byteBuffer.put(this.a.getBytes());
        if (s() == 1) {
            byteBuffer.put(this.c.getBytes());
        }
        hy.y(byteBuffer, this.b.size());
        for (axkw axkwVar : this.b) {
            hy.y(byteBuffer, axkwVar.a);
            hy.y(byteBuffer, axkwVar.b);
        }
    }
}
