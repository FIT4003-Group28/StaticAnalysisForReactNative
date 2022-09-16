package com.google.android.exoplayer.youtube.libvpx;

import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VpxDecoder extends pdb {
    public static final boolean a;
    public final long b;
    private volatile int c;

    static {
        boolean z;
        try {
            System.loadLibrary("vpx");
            System.loadLibrary("vpxYTJNI");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }

    public VpxDecoder(int i, int i2, boolean z, int i3, int i4) {
        super(new pgf[i], new VpxOutputBuffer[i2]);
        this.c = i3;
        boolean z2 = true;
        if (i3 != 2 && i3 != 3) {
            z2 = false;
        }
        long vpxInit = vpxInit(z, z2, false, i4);
        this.b = vpxInit;
        if (vpxInit == 0) {
            throw new pge("Failed to initialize decoder");
        }
        k(786432);
    }

    public static native String getLibvpxConfig();

    public static native String getLibvpxVersion();

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, boolean z3, int i);

    private native int vpxReleaseFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    @Override // defpackage.pdb
    protected final /* bridge */ /* synthetic */ pcz a() {
        return new pgf();
    }

    @Override // defpackage.pdb
    protected final /* bridge */ /* synthetic */ pda b() {
        return new VpxOutputBuffer(this);
    }

    @Override // defpackage.pdb
    protected final /* bridge */ /* synthetic */ Exception c(pcz pczVar, pda pdaVar, boolean z) {
        pgf pgfVar = (pgf) pczVar;
        VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) pdaVar;
        oug ougVar = pgfVar.a;
        vpxOutputBuffer.timestampUs = ougVar.e;
        ByteBuffer byteBuffer = ougVar.b;
        byteBuffer.position(byteBuffer.position() - ougVar.c);
        if (vpxDecode(this.b, ougVar.b, ougVar.c) != 0) {
            String valueOf = String.valueOf(vpxGetErrorMessage(this.b));
            return new pge(valueOf.length() != 0 ? "Decode error: ".concat(valueOf) : new String("Decode error: "));
        } else if (pgfVar.getFlag(2)) {
            return null;
        } else {
            vpxOutputBuffer.mode = this.c;
            int vpxGetFrame = vpxGetFrame(this.b, vpxOutputBuffer);
            if (vpxGetFrame == 1) {
                vpxOutputBuffer.setFlag(2);
            } else if (vpxGetFrame == -1) {
                return new pge("Buffer initialization failed.");
            }
            vpxOutputBuffer.colorInfo = pgfVar.d;
            return null;
        }
    }

    @Override // defpackage.pdb
    public final void d() {
        super.d();
        vpxClose(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(VpxOutputBuffer vpxOutputBuffer) {
        if ((this.c == 2 || this.c == 3) && !vpxOutputBuffer.getFlag(2)) {
            vpxReleaseFrame(this.b, vpxOutputBuffer);
        }
        super.j(vpxOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VpxOutputBuffer vpxOutputBuffer);
}
