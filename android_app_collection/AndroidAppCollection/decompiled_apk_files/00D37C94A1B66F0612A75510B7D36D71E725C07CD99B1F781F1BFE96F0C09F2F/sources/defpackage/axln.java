package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axln  reason: default package */
/* loaded from: classes2.dex */
public final class axln extends axix {
    public short a;
    public short[] b;
    public int c;
    public String d;
    private String e;

    public axln() {
        super("saiz");
        this.b = new short[0];
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (1 != (r() & 1) ? 4 : 12) + 5 + (this.a == 0 ? this.b.length : 0);
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) == 1) {
            this.d = hy.K(byteBuffer);
            this.e = hy.K(byteBuffer);
        }
        this.a = (short) hy.H(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.c = p;
        if (this.a == 0) {
            this.b = new short[p];
            for (int i = 0; i < this.c; i++) {
                this.b[i] = (short) hy.H(byteBuffer);
            }
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((r() & 1) == 1) {
            byteBuffer.put(cvq.b(this.d));
            byteBuffer.put(cvq.b(this.e));
        }
        hy.z(byteBuffer, this.a);
        if (this.a == 0) {
            hy.y(byteBuffer, this.b.length);
            for (short s : this.b) {
                hy.z(byteBuffer, s);
            }
            return;
        }
        hy.y(byteBuffer, this.c);
    }

    public final String toString() {
        short s = this.a;
        int i = this.c;
        String str = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 130 + String.valueOf(str2).length());
        sb.append("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        sb.append((int) s);
        sb.append(", sampleCount=");
        sb.append(i);
        sb.append(", auxInfoType='");
        sb.append(str);
        sb.append("', auxInfoTypeParameter='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
