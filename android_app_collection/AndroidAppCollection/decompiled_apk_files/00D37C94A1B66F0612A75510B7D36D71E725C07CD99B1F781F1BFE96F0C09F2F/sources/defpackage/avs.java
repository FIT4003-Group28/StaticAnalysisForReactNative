package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avs  reason: default package */
/* loaded from: classes2.dex */
public final class avs extends pmv {
    public long a;
    public int b;
    private int h;

    public avs() {
        super(2);
        this.h = 32;
    }

    public final void a(int i) {
        ptx.c(true);
        this.h = i;
    }

    public final boolean b(pmv pmvVar) {
        ByteBuffer byteBuffer;
        ptx.c(!pmvVar.g());
        ptx.c(!pmvVar.hasSupplementalData());
        ptx.c(!pmvVar.isEndOfStream());
        if (c()) {
            if (this.b >= this.h || pmvVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = pmvVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.b;
        this.b = i + 1;
        if (i == 0) {
            this.f = pmvVar.f;
            if (pmvVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (pmvVar.isDecodeOnly()) {
            setFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        ByteBuffer byteBuffer3 = pmvVar.d;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.a = pmvVar.f;
        return true;
    }

    public final boolean c() {
        return this.b > 0;
    }

    @Override // defpackage.pmv, defpackage.pmo
    public final void clear() {
        super.clear();
        this.b = 0;
    }
}
