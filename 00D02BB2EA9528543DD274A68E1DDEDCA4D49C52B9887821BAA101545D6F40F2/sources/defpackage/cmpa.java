package defpackage;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmpa  reason: default package */
/* loaded from: classes5.dex */
public final class cmpa extends clls {
    private final cltg d;
    private final cmnk e;
    private cmoz f;
    private long g;

    public cmpa() {
        super(6);
        this.d = new cltg(1);
        this.e = new cmnk();
    }

    private final void O() {
        cmoz cmozVar = this.f;
        if (cmozVar != null) {
            cmozVar.a();
        }
    }

    @Override // defpackage.clol, defpackage.clon
    public final String J() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.clol
    public final void K(long j, long j2) {
        float[] fArr;
        while (!j() && this.g < 100000 + j) {
            this.d.clear();
            if (G(B(), this.d, false) != -4 || this.d.isEndOfStream()) {
                return;
            }
            cltg cltgVar = this.d;
            this.g = cltgVar.d;
            if (this.f != null && !cltgVar.isDecodeOnly()) {
                this.d.d();
                ByteBuffer byteBuffer = this.d.b;
                int i = cmny.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.e.c(byteBuffer.array(), byteBuffer.limit());
                    this.e.f(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(this.e.s());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f.b();
                }
            }
        }
    }

    @Override // defpackage.clol
    public final boolean L() {
        return true;
    }

    @Override // defpackage.clol
    public final boolean M() {
        return j();
    }

    @Override // defpackage.clon
    public final int N(Format format) {
        return "application/x-camera-motion".equals(format.l) ? 4 : 0;
    }

    @Override // defpackage.clls, defpackage.cloi
    public final void t(int i, Object obj) {
        if (i == 7) {
            this.f = (cmoz) obj;
        }
    }

    @Override // defpackage.clls
    protected final void v(Format[] formatArr, long j, long j2) {
    }

    @Override // defpackage.clls
    protected final void w(long j, boolean z) {
        this.g = Long.MIN_VALUE;
        O();
    }

    @Override // defpackage.clls
    protected final void z() {
        O();
    }
}
