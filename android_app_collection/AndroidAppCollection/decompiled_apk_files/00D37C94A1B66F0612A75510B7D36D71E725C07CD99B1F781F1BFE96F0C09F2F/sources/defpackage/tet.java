package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: tet  reason: default package */
/* loaded from: classes4.dex */
public final class tet {
    public static final ByteBuffer a;
    public static final tet b;
    public final boolean c;
    private final ByteBuffer d;
    private volatile ByteBuffer e;

    static {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
        a = wrap;
        b = new tet(wrap);
    }

    private tet(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public static tet a(ByteBuffer byteBuffer) {
        return byteBuffer == null ? b : new tet(byteBuffer);
    }

    public static tet b(byte[] bArr) {
        return bArr == null ? b : new tet(ByteBuffer.wrap(bArr));
    }

    public static tet c(awne awneVar) {
        if (awneVar == null) {
            return b;
        }
        aopc aopcVar = (aopc) awnc.a.createBuilder();
        aopcVar.e(awne.b, awneVar);
        return new tet(ByteBuffer.wrap(((awnc) aopcVar.mo39build()).toByteArray()), true);
    }

    public static tet d(awnc awncVar) {
        return b(awncVar.toByteArray());
    }

    public final ByteBuffer e() {
        return this.d.duplicate();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tet)) {
            return false;
        }
        tet tetVar = (tet) obj;
        return tetVar.c == this.c && this.d.equals(tetVar.d);
    }

    public final ByteBuffer f() {
        ByteBuffer duplicate;
        ByteBuffer slice;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                ByteBuffer e = e();
                try {
                    aoog N = aoog.N(e);
                    if (N.E()) {
                        slice = a;
                    } else {
                        N.n();
                        N.k();
                        e.position(e.position() + N.e());
                        slice = e.slice();
                    }
                    this.e = slice;
                } catch (IOException e2) {
                    throw new ted("Error reading extension from model", e2);
                }
            }
            duplicate = this.e.duplicate();
        }
        return duplicate;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.d);
    }

    private tet(ByteBuffer byteBuffer, boolean z) {
        this.e = null;
        this.d = byteBuffer.duplicate();
        this.c = z;
    }
}
