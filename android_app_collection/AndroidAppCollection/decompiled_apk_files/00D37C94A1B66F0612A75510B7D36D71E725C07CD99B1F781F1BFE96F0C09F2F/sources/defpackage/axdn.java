package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axdn  reason: default package */
/* loaded from: classes2.dex */
public final class axdn implements ous {
    public boolean b;
    public final afdh c;
    private final Handler d;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private axdc l;
    private boolean m;
    private ByteBuffer n;
    private ByteBuffer o;
    private boolean q;
    private boolean r;
    private long s;
    private boolean t;
    private boolean u;
    private final axdb v;
    private int e = 0;
    public final ouz a = new ouz(null);
    private boolean p = false;

    public axdn(Handler handler, afdh afdhVar, axdb axdbVar) {
        this.c = afdhVar;
        this.d = handler;
        this.v = axdbVar;
    }

    private final boolean m() {
        return this.u && !h();
    }

    @Override // defpackage.ous
    public final long a() {
        long d = this.a.d(m());
        if (d != Long.MIN_VALUE) {
            if (!this.h) {
                d = Math.max(this.f, d);
            }
            this.f = d;
            this.h = false;
        }
        return this.f;
    }

    @Override // defpackage.ous
    public final void b(long j) {
        axdc axdcVar = this.l;
        if (axdcVar != null) {
            this.n = null;
            axdcVar.a();
            this.p = false;
        }
        this.a.j();
        this.h = true;
        this.g = j;
        this.f = j;
        this.i = 0L;
        this.q = false;
        this.u = false;
    }

    @Override // defpackage.ous
    public final void c() {
        this.u = true;
    }

    @Override // defpackage.ous
    public final void d() {
        this.t = false;
        this.a.h();
    }

    @Override // defpackage.ous
    public final void e() {
        this.t = true;
        this.a.i();
    }

    @Override // defpackage.ous
    public final void f() {
        axdc axdcVar = this.l;
        if (axdcVar != null) {
            axdcVar.a();
            this.n = null;
            this.p = false;
        }
        this.e = 0;
        this.a.j();
    }

    @Override // defpackage.ous
    public final void g(float f) {
        this.a.l(f);
    }

    @Override // defpackage.ous
    public final boolean h() {
        return this.a.m();
    }

    public final void i(MediaFormat mediaFormat) {
        this.j = mediaFormat.q;
        this.m = "audio/raw".equals(mediaFormat.b);
        this.k = mediaFormat.r;
        this.b = true;
    }

    public final void j(int i, int i2) {
        int i3;
        axdc axdfVar;
        this.b = false;
        boolean z = true;
        pce.b(this.j > 0);
        if (i2 <= 0) {
            z = false;
        }
        pce.b(z);
        if (!this.m) {
            this.k = i;
        }
        try {
            axdb axdbVar = this.v;
            int i4 = this.k;
            int i5 = this.j;
            if (i5 == 4) {
                i3 = 4;
            } else if (i5 != 6) {
                Log.e("AmbisonicAudioRendererFactory", "Unsupported number of input channels");
                i3 = 0;
            } else {
                i3 = 7;
            }
            if (i3 != 0) {
                try {
                    axdfVar = new axdf(i4, i5, axdbVar.a, i3);
                } catch (Exception e) {
                    Log.e("AmbisonicAudioRendererFactory", "Error creating native spatializing audio processor; creating no-op processor instead", e);
                }
                this.l = axdfVar;
                axdfVar.d();
                axds.d();
                AudioTrack.getMinBufferSize(this.k, 4, 2);
                this.l.d();
                axds.d();
                this.o = ByteBuffer.allocateDirect(4096).order(ByteOrder.LITTLE_ENDIAN);
                this.p = false;
                ouz ouzVar = this.a;
                this.l.d();
                ouzVar.e("audio/raw", 2, this.k, 2, 4096);
            }
            axdfVar = new axdh();
            this.l = axdfVar;
            axdfVar.d();
            axds.d();
            AudioTrack.getMinBufferSize(this.k, 4, 2);
            this.l.d();
            axds.d();
            this.o = ByteBuffer.allocateDirect(4096).order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            ouz ouzVar2 = this.a;
            this.l.d();
            ouzVar2.e("audio/raw", 2, this.k, 2, 4096);
        } catch (Exception e2) {
            axdd axddVar = new axdd(e2);
            if (this.c != null) {
                this.d.post(new axdj(this, axddVar));
            }
            throw new osx(axddVar);
        }
    }

    public final void k() {
        if (this.l == null || this.q) {
            return;
        }
        boolean z = false;
        do {
            if (!this.p || z) {
                boolean c = this.l.c(this.o);
                this.p = c;
                if (!c) {
                    if (!m() || this.q) {
                        return;
                    }
                    this.a.g();
                    this.q = true;
                    return;
                }
            }
            int limit = this.o.limit();
            this.l.d();
            axds.c(limit >= 0);
            axds.c(true);
            axds.c(limit % 4 == 0);
            long j = this.g;
            long j2 = (limit / 2) / 2;
            long j3 = this.i + j2;
            int i = this.k;
            axds.c(i > 0);
            long j4 = j + ((j3 * 1000000) / i);
            try {
                ouz ouzVar = this.a;
                ByteBuffer byteBuffer = this.o;
                int a = ouzVar.a(byteBuffer, byteBuffer.position(), this.o.limit(), j4);
                this.s = SystemClock.elapsedRealtime();
                if ((a & 1) != 0) {
                    this.h = true;
                }
                if ((a & 2) != 0) {
                    this.o.clear();
                    this.i += j2;
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } catch (ouy e) {
                if (this.c != null) {
                    this.d.post(new axdl(this, e));
                }
                throw new osx(e);
            }
        } while (z);
    }

    public final boolean l(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (z) {
            this.a.f();
            return true;
        }
        if (!this.a.n()) {
            try {
                int i3 = this.e;
                if (i3 != 0) {
                    this.a.c(i3);
                } else {
                    this.e = this.a.b();
                }
                this.r = false;
                if (this.t) {
                    this.a.i();
                }
            } catch (oux e) {
                if (this.c != null) {
                    this.d.post(new axdk(this, e));
                }
                throw new osx(e);
            }
        } else {
            boolean z2 = this.r;
            boolean m = this.a.m();
            this.r = m;
            if (z2 && !m && this.t) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.s;
                long j = this.a.d;
                long j2 = j == -1 ? -1L : j / 1000;
                if (this.c != null) {
                    this.d.post(new axdm(this, j2, elapsedRealtime));
                }
            }
        }
        ByteBuffer byteBuffer2 = this.n;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            this.n = duplicate;
            duplicate.position(i);
            this.n.limit(i + i2);
        }
        boolean b = this.l.b(this.n);
        k();
        return b;
    }
}
