package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwb  reason: default package */
/* loaded from: classes3.dex */
public final class cwb extends axix {
    public List a;

    public cwb() {
        super("elst");
        this.a = new LinkedList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        int size;
        if (s() == 1) {
            size = this.a.size() * 20;
        } else {
            size = this.a.size() * 12;
        }
        return size + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.a = new LinkedList();
        for (int i = 0; i < p; i++) {
            this.a.add(new cwa(this, byteBuffer));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.size());
        for (cwa cwaVar : this.a) {
            if (cwaVar.a.s() == 1) {
                byteBuffer.putLong(cwaVar.b);
                byteBuffer.putLong(cwaVar.c);
            } else {
                hy.y(byteBuffer, axds.p(cwaVar.b));
                byteBuffer.putInt(axds.p(cwaVar.c));
            }
            hy.u(byteBuffer, cwaVar.d);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("EditListBox{entries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
