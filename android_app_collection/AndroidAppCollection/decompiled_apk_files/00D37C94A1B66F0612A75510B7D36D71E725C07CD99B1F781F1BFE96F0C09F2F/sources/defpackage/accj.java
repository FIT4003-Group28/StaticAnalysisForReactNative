package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: accj  reason: default package */
/* loaded from: classes.dex */
public final class accj extends acbe {
    public final acbq f;
    public final Handler g;
    public final Bundle h;
    public final Runnable i;
    public Surface j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public final LinkedList o;
    public long p;
    public final boolean q;
    public int r;
    public final int s;
    public long t;
    private acca u;
    private boolean v;
    private int w;

    static {
        TimeUnit.SECONDS.toMicros(1L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accj(Context context, MediaFormat mediaFormat, acbw acbwVar, boolean z) {
        super(mediaFormat, acbwVar);
        context.getClass();
        accb accbVar = new accb();
        Handler handler = new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.h = new Bundle();
        this.i = new acch(this);
        this.o = new LinkedList();
        this.s = 64;
        this.q = z;
        this.f = accbVar;
        this.g = handler;
        Surface createInputSurface = this.b.createInputSurface();
        this.j = createInputSurface;
        if (createInputSurface == null) {
            throw new RuntimeException("Could not create input surface");
        }
        f(mediaFormat.getInteger("frame-rate"));
        this.m = mediaFormat.getInteger("width");
        this.n = mediaFormat.getInteger("height");
        this.r = true != z ? 66 : 2000;
    }

    @Override // defpackage.acbt
    public final void a(int i) {
        throw null;
    }

    @Override // defpackage.acbe
    protected final void b() {
        try {
            this.b.signalEndOfInputStream();
        } catch (IllegalStateException e) {
            Log.e("ScreencastVideoEncoder", "Error ending stream for video encoder", e);
        }
    }

    @Override // defpackage.acbe, defpackage.acbt
    public final boolean c() {
        this.k = true;
        boolean c = super.c();
        Surface surface = this.j;
        if (surface != null) {
            surface.release();
            this.j = null;
        }
        abxa.b().f(astk.class, acci.class, null);
        return c;
    }

    @Override // defpackage.acbe, defpackage.acbt
    public final boolean d() {
        this.l = 0L;
        this.w = 1;
        this.u.c();
        abxa.b().f(astk.class, acci.class, new acci(this));
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        aqxo.p(i > 0);
        this.u = new acca(i * 3);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (!this.v) {
            Log.e("ScreencastVideoEncoder", "Video codec unexpectedly provided an input buffer");
            this.v = true;
        }
    }

    @Override // defpackage.acbe, android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        long j;
        super.onOutputBufferAvailable(mediaCodec, i, bufferInfo);
        if (bufferInfo.size == 0) {
            return;
        }
        long j2 = bufferInfo.presentationTimeUs;
        if (this.l > 0) {
            this.t++;
            this.u.b(j2 - j);
            double d = this.u.a;
            if (d > 215000.0d) {
                if (this.w != 3) {
                    StringBuilder sb = new StringBuilder(74);
                    sb.append("Video lag is too high (");
                    sb.append(d);
                    sb.append(" us). Entering error state.");
                    Log.e("ScreencastVideoEncoder", sb.toString());
                    this.w = 3;
                    i(14);
                }
            } else if (d > 85000.0d) {
                int i2 = this.w;
                if (i2 == 1 || (i2 == 3 && d < 195000.0d)) {
                    StringBuilder sb2 = new StringBuilder(71);
                    sb2.append("Video lag is high (");
                    sb2.append(d);
                    sb2.append(" us). Entering warning state");
                    Log.w("ScreencastVideoEncoder", sb2.toString());
                    this.w = 2;
                    i(13);
                }
            } else if (d < 65000.0d && this.w != 1) {
                StringBuilder sb3 = new StringBuilder(61);
                sb3.append("Video lag re-entered good state (");
                sb3.append(d);
                sb3.append(" us)");
                this.w = 1;
                i(15);
            }
        }
        this.l = j2;
    }

    @Override // defpackage.acbe, android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        super.onOutputFormatChanged(mediaCodec, mediaFormat);
        this.m = mediaFormat.getInteger("width");
        this.n = mediaFormat.getInteger("height");
    }
}
