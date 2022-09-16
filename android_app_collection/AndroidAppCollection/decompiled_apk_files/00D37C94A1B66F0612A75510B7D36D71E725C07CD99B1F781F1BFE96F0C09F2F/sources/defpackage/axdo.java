package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axdo  reason: default package */
/* loaded from: classes2.dex */
public final class axdo extends ots implements otg {
    private final axdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axdo(oui ouiVar, Handler handler, afdh afdhVar, axdi axdiVar) {
        super(ouiVar, otm.a, (owy) null, true, handler, (otr) afdhVar);
        pce.a(axdiVar);
        axdb axdbVar = new axdb(axdiVar);
        this.a = new axdn(handler, afdhVar, axdbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj
    public final void A(long j, long j2, boolean z) {
        super.A(j, j2, z);
        this.a.k();
        if (h()) {
            this.a.c();
        }
    }

    @Override // defpackage.otg
    public final long a() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouo
    public final boolean h() {
        return this.g && !this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouo
    public final boolean i() {
        return this.a.h();
    }

    @Override // defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        axdn axdnVar = this.a;
        if (i == 1) {
            axdnVar.g(((Float) obj).floatValue());
        } else if (i != 2) {
        } else {
            axdnVar.a.k((PlaybackParams) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final otg m() {
        return this;
    }

    @Override // defpackage.ots
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj, defpackage.ouo
    public final void q() {
        try {
            this.a.f();
        } finally {
            super.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj
    public final void r(long j) {
        super.r(j);
        this.a.b(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public final void s(oue oueVar) {
        super.s(oueVar);
        this.a.i(oueVar.a);
    }

    @Override // defpackage.ots
    protected final void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.j(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    @Override // defpackage.ots, defpackage.ouo
    protected final void v() {
        this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void w() {
        this.a.d();
    }

    @Override // defpackage.ots
    protected final boolean x(otm otmVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return pcu.e(str) && ("audio/x-unknown".equals(str) || otmVar.a(str, false) != null);
    }

    @Override // defpackage.ots
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            this.b.g++;
        }
        boolean l = this.a.l(byteBuffer, bufferInfo.offset, bufferInfo.size, z);
        if (l) {
            mediaCodec.releaseOutputBuffer(i, false);
            if (!z) {
                this.b.f++;
                return true;
            }
        }
        return l;
    }
}
