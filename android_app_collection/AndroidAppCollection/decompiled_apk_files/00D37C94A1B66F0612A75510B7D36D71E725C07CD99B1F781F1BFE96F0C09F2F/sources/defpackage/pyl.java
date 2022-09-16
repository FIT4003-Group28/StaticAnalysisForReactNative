package defpackage;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pyl  reason: default package */
/* loaded from: classes4.dex */
public final class pyl extends phj {
    private final pmv a;
    private final pwu b;
    private long c;
    private pkk d;

    public pyl() {
        super(6);
        this.a = new pmv(1);
        this.b = new pwu();
    }

    @Override // defpackage.pkd
    public final boolean H() {
        return ao();
    }

    @Override // defpackage.pkd
    public final boolean I() {
        return true;
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        return "application/x-camera-motion".equals(format.l) ? 4 : 0;
    }

    @Override // defpackage.phj, defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 8) {
            this.d = (pkk) obj;
        }
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.phj
    protected final void p() {
    }

    @Override // defpackage.phj
    protected final void s(long j, boolean z) {
        this.c = Long.MIN_VALUE;
    }

    @Override // defpackage.phj
    protected final void x(Format[] formatArr, long j, long j2) {
    }

    @Override // defpackage.pkd
    public final void z(long j, long j2) {
        while (!ao() && this.c < 100000 + j) {
            this.a.clear();
            if (S(X(), this.a, 0) != -4 || this.a.isEndOfStream()) {
                return;
            }
            pmv pmvVar = this.a;
            this.c = pmvVar.f;
            if (this.d != null && !pmvVar.isDecodeOnly()) {
                this.a.f();
                ByteBuffer byteBuffer = this.a.d;
                int i = pxi.a;
                if (byteBuffer.remaining() == 16) {
                    this.b.E(byteBuffer.array(), byteBuffer.limit());
                    this.b.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr[i2] = Float.intBitsToFloat(this.b.e());
                    }
                }
            }
        }
    }
}
