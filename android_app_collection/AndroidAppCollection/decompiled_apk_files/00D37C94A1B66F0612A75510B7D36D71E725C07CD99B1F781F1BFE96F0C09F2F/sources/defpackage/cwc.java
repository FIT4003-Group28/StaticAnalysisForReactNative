package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwc  reason: default package */
/* loaded from: classes3.dex */
public final class cwc extends axiv {
    public String a;
    public List b;
    private long c;

    public cwc() {
        super("ftyp");
        this.b = Collections.emptyList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.b.size() * 4) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        this.a = hy.K(byteBuffer);
        this.c = hy.I(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.b = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.b.add(hy.K(byteBuffer));
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.put(cvq.b(this.a));
        hy.y(byteBuffer, this.c);
        for (String str : this.b) {
            byteBuffer.put(cvq.b(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FileTypeBox[majorBrand=");
        sb.append(this.a);
        sb.append(";minorVersion=");
        sb.append(this.c);
        for (String str : this.b) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }

    public cwc(String str, long j, List list) {
        super("ftyp");
        Collections.emptyList();
        this.a = str;
        this.c = j;
        this.b = list;
    }
}
