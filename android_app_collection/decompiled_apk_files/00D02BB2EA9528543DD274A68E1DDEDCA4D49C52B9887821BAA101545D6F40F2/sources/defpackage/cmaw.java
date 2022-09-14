package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmaw  reason: default package */
/* loaded from: classes5.dex */
final class cmaw extends cltg {
    public final cltg f;
    public boolean g;
    public long h;
    public int i;
    private int j;

    public cmaw() {
        super(2);
        this.f = new cltg(2);
        clear();
    }

    @Override // defpackage.cltg, defpackage.clta
    public final void clear() {
        f();
        this.j = 32;
    }

    public final void e(int i) {
        cmmn.a(true);
        this.j = i;
    }

    public final void f() {
        j();
        this.f.clear();
        this.g = false;
    }

    public final boolean g() {
        return this.i == 0;
    }

    public final boolean h() {
        if (this.i < this.j) {
            ByteBuffer byteBuffer = this.b;
            return (byteBuffer != null && byteBuffer.position() >= 3072000) || this.g;
        }
        return true;
    }

    public final void i(cltg cltgVar) {
        ByteBuffer byteBuffer = cltgVar.b;
        if (byteBuffer != null) {
            cltgVar.d();
            a(byteBuffer.remaining());
            this.b.put(byteBuffer);
        }
        if (cltgVar.isEndOfStream()) {
            setFlags(4);
        }
        if (cltgVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        if (cltgVar.isKeyFrame()) {
            setFlags(1);
        }
        int i = this.i + 1;
        this.i = i;
        long j = cltgVar.d;
        this.d = j;
        if (i == 1) {
            this.h = j;
        }
        cltgVar.clear();
    }

    public final void j() {
        super.clear();
        this.i = 0;
        this.h = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }
}
