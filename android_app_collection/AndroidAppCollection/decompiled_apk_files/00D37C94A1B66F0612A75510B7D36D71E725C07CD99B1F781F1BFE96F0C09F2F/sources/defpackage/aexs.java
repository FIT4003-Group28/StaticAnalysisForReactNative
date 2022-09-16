package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexs  reason: default package */
/* loaded from: classes.dex */
public final class aexs extends atx {
    public final affx b;
    private aevn c;
    private final Handler d;
    private boolean e;
    private final long f;
    private long g;

    public aexs(Handler handler, pyk pykVar, int i, int i2, int i3, affx affxVar, long j) {
        super(5000L, handler, pykVar, 10, i, i2, i3);
        this.c = aevn.a;
        this.b = affxVar;
        this.d = handler;
        this.f = j;
    }

    @Override // defpackage.pxj, defpackage.pkd
    public final boolean I() {
        if (!super.I()) {
            return false;
        }
        this.c.e();
        return true;
    }

    @Override // defpackage.pxj, defpackage.phj, defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 10001) {
            aevn aevnVar = (aevn) obj;
            if (aevnVar == null) {
                aevnVar = aevn.a;
            }
            this.c = aevnVar;
            return;
        }
        super.ad(i, obj);
    }

    @Override // defpackage.pxj, defpackage.phj
    public final void af() {
        super.af();
        this.c.f();
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pxj
    public final void k(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, Format format) {
        if (!this.e && videoDecoderOutputBuffer.hasSupplementalData()) {
            this.e = true;
            this.d.post(new Runnable() { // from class: aexr
                @Override // java.lang.Runnable
                public final void run() {
                    aexs.this.b.b();
                }
            });
        }
        super.k(videoDecoderOutputBuffer, j, format);
    }

    @Override // defpackage.pxj
    protected final boolean n(long j, long j2) {
        long j3 = this.f;
        if ((j3 <= 0 || j2 - this.g <= j3) && pxj.m(j)) {
            return true;
        }
        this.g = j2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pxj, defpackage.phj
    public final void s(long j, boolean z) {
        super.s(j, z);
        this.g = 0L;
    }
}
