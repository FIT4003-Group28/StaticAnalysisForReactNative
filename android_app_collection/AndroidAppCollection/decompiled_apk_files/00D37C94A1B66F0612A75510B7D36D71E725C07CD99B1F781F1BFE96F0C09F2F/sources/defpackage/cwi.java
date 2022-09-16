package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
/* compiled from: PG */
/* renamed from: cwi  reason: default package */
/* loaded from: classes3.dex */
public final class cwi extends axix {
    public Date a;
    public Date b;
    public long c;
    public long d;
    public String e;

    public cwi() {
        super("mdhd");
        this.a = new Date();
        this.b = new Date();
        this.e = "eng";
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (s() == 1 ? 32L : 20L) + 4;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = axds.o(hy.J(byteBuffer));
            this.b = axds.o(hy.J(byteBuffer));
            this.c = hy.I(byteBuffer);
            this.d = hy.J(byteBuffer);
        } else {
            this.a = axds.o(hy.I(byteBuffer));
            this.b = axds.o(hy.I(byteBuffer));
            this.c = hy.I(byteBuffer);
            this.d = hy.I(byteBuffer);
        }
        int F = hy.F(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((F >> ((2 - i) * 5)) & 31) + 96));
        }
        this.e = sb.toString();
        hy.F(byteBuffer);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(axds.n(this.a));
            byteBuffer.putLong(axds.n(this.b));
            hy.y(byteBuffer, this.c);
            byteBuffer.putLong(this.d);
        } else {
            hy.y(byteBuffer, axds.n(this.a));
            hy.y(byteBuffer, axds.n(this.b));
            hy.y(byteBuffer, this.c);
            hy.y(byteBuffer, this.d);
        }
        String str = this.e;
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            hy.w(byteBuffer, i);
            hy.w(byteBuffer, 0);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("\"");
        sb.append(str);
        sb.append("\" language string isn't exactly 3 characters long!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return "MediaHeaderBox[creationTime=" + this.a + ";modificationTime=" + this.b + ";timescale=" + this.c + ";duration=" + this.d + ";language=" + this.e + "]";
    }
}
