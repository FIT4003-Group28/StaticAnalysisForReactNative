package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwt  reason: default package */
/* loaded from: classes3.dex */
public final class cwt extends axix {
    public List a;

    public cwt() {
        super("stsc");
        this.a = Collections.emptyList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.a.size() * 12) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.a = new ArrayList(p);
        for (int i = 0; i < p; i++) {
            this.a.add(new cws(hy.I(byteBuffer), hy.I(byteBuffer), hy.I(byteBuffer)));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.size());
        for (cws cwsVar : this.a) {
            hy.y(byteBuffer, cwsVar.a);
            hy.y(byteBuffer, cwsVar.b);
            hy.y(byteBuffer, cwsVar.c);
        }
    }

    public final String toString() {
        int size = this.a.size();
        StringBuilder sb = new StringBuilder(40);
        sb.append("SampleToChunkBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}
