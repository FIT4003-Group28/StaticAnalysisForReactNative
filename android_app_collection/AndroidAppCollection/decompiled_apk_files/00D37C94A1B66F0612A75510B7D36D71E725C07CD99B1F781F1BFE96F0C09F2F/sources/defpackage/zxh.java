package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zxh  reason: default package */
/* loaded from: classes4.dex */
public final class zxh implements TextureView.SurfaceTextureListener, vtv, vqs, ota {
    public final vrt a;
    public final zpr b;
    public Uri c;
    public vqr d;
    public int e;
    public vtr f;
    public zxg g;
    public Track h;
    private volatile boolean i;
    private final VideoWithPreviewView j;
    private final vtq k;
    private final Object l;
    private final vtz m;
    private ouo n;
    private ouo o;
    private vsd p;
    private long q;
    private final int r;
    private final boolean s;
    private final int t;
    private vvl u;
    private final zpr v;

    public zxh(VideoWithPreviewView videoWithPreviewView, vtq vtqVar, Track track, long j, int i, boolean z, int i2) {
        vrt vrtVar = new vrt();
        this.a = vrtVar;
        this.l = new Object();
        vtz vtzVar = new vtz(vrtVar);
        this.m = vtzVar;
        this.q = -1L;
        zpr zxfVar = new zxf();
        this.v = zxfVar;
        videoWithPreviewView.getClass();
        this.j = videoWithPreviewView;
        vtqVar.getClass();
        this.k = vtqVar;
        this.h = track;
        this.q = j;
        this.t = i;
        this.s = z;
        videoWithPreviewView.o = this;
        i2 = i2 == 1 ? !zqq.D() ? 0 : 1 : i2;
        this.r = i2;
        zxfVar = i2 == 1 ? new zqq(videoWithPreviewView.getContext().getApplicationContext(), new zxd(this), null) : zxfVar;
        this.b = zxfVar;
        zxfVar.m();
        videoWithPreviewView.p = zxfVar.k();
        vtzVar.a.add(this);
    }

    private final void q(osx osxVar) {
        int i = this.a.a;
        int i2 = i > 1 ? 3 : 5;
        int i3 = this.e;
        if (i3 < i2) {
            StringBuilder sb = new StringBuilder(86);
            sb.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - retry: ");
            sb.append(i3 + 1);
            sb.append(" of ");
            sb.append(i2);
            zep.b(sb.toString());
            f();
            this.j.postDelayed(new zxc(this), this.e * 100);
        } else if (i > 1) {
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - try reduce decoders to: ");
            sb2.append(i - 1);
            zep.b(sb2.toString());
            f();
            this.a.c(new zxe(this), Integer.MAX_VALUE);
        } else {
            zep.b("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - unable to play");
            r(osxVar);
        }
        this.e++;
    }

    private final void r(osx osxVar) {
        this.j.j.setVisibility(0);
        this.k.setVisibility(4);
        zxg zxgVar = this.g;
        if (zxgVar != null) {
            zxgVar.aH(osxVar);
        }
    }

    private final void s() {
        vtr vtrVar = this.f;
        if (this.p == null || vtrVar == null) {
            return;
        }
        vtrVar.p(false);
        vtrVar.k(this.p, 1001, Long.valueOf(this.d.g() + this.d.n()));
        vtrVar.p(true);
    }

    private final void t() {
        this.b.h();
        vug a = this.b.a();
        if (a != null) {
            this.k.j(a);
        }
    }

    private final void u() {
        try {
            ouo ouoVar = this.o;
            float f = 0.0f;
            if (ouoVar != null) {
                ouoVar.k(1, Float.valueOf(this.d.F() ? 0.0f : 1.0f - this.d.e()));
            }
            vsd vsdVar = this.p;
            if (vsdVar == null) {
                return;
            }
            if (!this.d.F()) {
                f = this.d.e();
            }
            vsdVar.k(1, Float.valueOf(f));
        } catch (osx e) {
            zep.d("Couldn't update audio volume.", e);
        }
    }

    @Override // defpackage.vqs
    public final void a(vqr vqrVar, Set set) {
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        if (i == 0 || i == 3) {
            s();
        } else if (i != 4 && i != 5) {
        } else {
            u();
        }
    }

    @Override // defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
    }

    @Override // defpackage.vtv
    public final void d() {
        this.j.post(new zxc(this, 1));
    }

    public final long e() {
        vtr vtrVar = this.f;
        return (vtrVar == null || vtrVar.a() == 1) ? this.q : this.f.c();
    }

    public final void f() {
        synchronized (this.l) {
            this.m.c();
            if (this.f != null) {
                this.q = e();
                this.f.a.h();
                this.f = null;
                this.i = false;
            }
            this.n = null;
            this.o = null;
            this.b.h();
        }
    }

    public final void g() {
        synchronized (this.l) {
            this.f = new vtr();
            this.i = false;
            this.f.e(this);
            this.k.n(this.f);
            i();
            long j = this.q;
            if (j != -1) {
                this.f.j(j);
                this.q = -1L;
            }
            h();
            VideoWithPreviewView videoWithPreviewView = this.j;
            vtr vtrVar = this.f;
            otb otbVar = videoWithPreviewView.n;
            if (otbVar != vtrVar) {
                if (otbVar != null) {
                    otbVar.i(videoWithPreviewView);
                }
                videoWithPreviewView.n = vtrVar;
                otb otbVar2 = videoWithPreviewView.n;
                if (otbVar2 != null) {
                    videoWithPreviewView.s(otbVar2.a());
                    videoWithPreviewView.n.e(videoWithPreviewView);
                } else {
                    videoWithPreviewView.s(5);
                }
            }
        }
    }

    public final void h() {
        vug a;
        oui otfVar;
        ylr.c();
        if (this.c == null || this.f == null || !this.m.g() || this.i) {
            return;
        }
        boolean z = true;
        this.i = true;
        Context applicationContext = this.j.getContext().getApplicationContext();
        if (!this.d.b.b) {
            if (this.s) {
                otfVar = new oxx(this.c, new pbq(applicationContext, pcx.l(applicationContext, "VideoMPEG")), new pbo(65536), 16777216, new oxq[0]);
            } else {
                otfVar = new otf(applicationContext, this.c);
            }
            vtz vtzVar = this.m;
            this.n = new vtx(vtzVar, applicationContext, otfVar, new Handler(Looper.getMainLooper()), new vtw(vtzVar.h));
            this.o = new otk(otfVar, otm.a);
        } else {
            try {
                this.b.n(MediaStore.Images.Media.getBitmap(applicationContext.getContentResolver(), this.c));
            } catch (IOException e) {
                zep.d("error retrieving image from uri", e);
            }
            this.n = new osw();
            this.o = new osw();
        }
        ouo[] ouoVarArr = {this.n, this.o, new vto(this.k), new vts(applicationContext, this.j, this.u), new osw()};
        if (this.h != null) {
            oui ouiVar = null;
            if (this.s) {
                ouiVar = new oxx(this.h.d, new pbq(applicationContext, pcx.l(applicationContext, "AudioMPEG")), new pbo(65536), 1310720, new oxq[0]);
            } else {
                pbq pbqVar = new pbq(applicationContext, pcx.l(applicationContext, "AudioMPEG"));
                int d = new vrk(applicationContext).d(this.h.d);
                if (d == 1) {
                    ouiVar = new oxx(this.h.d, pbqVar, new pbo(65536), 1310720, new oyp());
                } else if (d == 2) {
                    ouiVar = new oxx(this.h.d, pbqVar, new pbo(65536), 1310720, new ozf());
                } else if (d == 3 || d == 4) {
                    ouiVar = new otf(applicationContext, this.h.d);
                } else {
                    zxg zxgVar = this.g;
                    if (zxgVar != null) {
                        zxgVar.s();
                    }
                }
            }
            if (ouiVar != null) {
                vsd vsdVar = new vsd(ouiVar);
                this.p = vsdVar;
                ouoVarArr[4] = vsdVar;
                s();
            }
        }
        aqxo.y(true);
        vtr vtrVar = this.f;
        vtrVar.c = 5;
        vtrVar.a.g(ouoVarArr);
        if (p()) {
            if (this.f == null || this.n == null) {
                z = false;
            }
            aqxo.y(z);
            if (this.b.j() && (a = this.b.a()) != null) {
                this.k.e(a);
            }
        } else {
            SurfaceTexture surfaceTexture = this.j.h.getSurfaceTexture();
            if (surfaceTexture != null) {
                j(surfaceTexture, false);
            }
        }
        vqr vqrVar = this.d;
        if (vqrVar == null) {
            return;
        }
        VideoMetaData videoMetaData = vqrVar.b;
        this.b.d(Math.min((!videoMetaData.b ? videoMetaData.h() / (((float) this.d.b.g) / 1000000.0f) : 30.0f) * 0.85f, 24.0f));
        u();
    }

    final void i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(4);
        this.m.e(this.f, arrayList);
    }

    public final void j(SurfaceTexture surfaceTexture, boolean z) {
        if (this.f == null || this.n == null) {
            return;
        }
        Surface surface = surfaceTexture != null ? new Surface(surfaceTexture) : null;
        if (z) {
            this.f.a.f(this.n, 1, surface);
            return;
        }
        this.f.k(this.n, 1, surface);
    }

    public final void n(vqr vqrVar, Uri uri, vvl vvlVar) {
        ylr.c();
        vqr vqrVar2 = this.d;
        if (vqrVar2 != null) {
            vqrVar2.u(this);
        }
        vtr vtrVar = this.f;
        if (vtrVar != null) {
            vtrVar.a.n();
            this.n = null;
        }
        boolean z = false;
        if (this.i) {
            this.i = false;
            this.m.c();
            i();
            this.f.j(vqrVar.m());
            if (p()) {
                t();
            }
        }
        this.d = vqrVar;
        this.c = uri;
        this.u = vvlVar;
        if (vqrVar != null) {
            VideoMetaData videoMetaData = vqrVar.b;
            if (videoMetaData.d <= 1920 && videoMetaData.e <= 1080 && this.a.a < this.t) {
                zep.l(String.format(Locale.getDefault(), "Increase media codec permits to %d (make:%s, model:%s, osVersion:%s)", Integer.valueOf(this.t), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE));
                this.a.b(this.t);
            }
            vqrVar.q(this);
            double b = vqrVar.b();
            double c = vqrVar.c();
            double d = vqrVar.d();
            double a = vqrVar.a();
            double k = videoMetaData.k();
            Double.isNaN(k);
            double d2 = k * ((1.0d - b) - c);
            double j = videoMetaData.j();
            Double.isNaN(j);
            double d3 = j * ((1.0d - d) - a);
            double d4 = d2 / d3;
            if (this.r == 1) {
                this.j.r((float) d4);
            } else {
                this.j.r(videoMetaData.a());
            }
            double d5 = 360.0d;
            if (d2 < 360.0d) {
                d3 = 360.0d / d4;
                d2 = 360.0d;
            }
            if (d3 < 360.0d) {
                d2 = d4 * 360.0d;
            } else {
                d5 = d3;
            }
            this.b.c((int) Math.round(Math.max(d2, d5)));
            if (this.r != 0) {
                double b2 = (vqrVar.b() + (1.0d - vqrVar.c())) / 2.0d;
                double d6 = (vqrVar.d() + (1.0d - vqrVar.a())) / 2.0d;
                boolean z2 = Math.abs(vqrVar.d()) < 0.01d && Math.abs(vqrVar.a()) < 0.01d;
                boolean z3 = Math.abs(vqrVar.b()) < 0.01d && Math.abs(vqrVar.c()) < 0.01d;
                aqxo.p(Math.abs(b2 + (-0.5d)) < 0.01d);
                aqxo.p(Math.abs(d6 + (-0.5d)) < 0.01d);
                aqxo.p(z2 || z3);
                aqxo.p(vqrVar.b() >= 0.0d);
                aqxo.p(vqrVar.c() >= 0.0d);
                aqxo.p(vqrVar.d() >= 0.0d);
                if (vqrVar.a() >= 0.0d) {
                    z = true;
                }
                aqxo.p(z);
                this.b.g(vqrVar.b.a());
            }
        }
        h();
    }

    public final void o() {
        this.m.a.remove(this);
        if (this.b != null) {
            t();
            this.b.i();
        }
        vqr vqrVar = this.d;
        if (vqrVar != null) {
            vqrVar.u(this);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (p()) {
            this.b.e(surfaceTexture, i, i2);
        } else {
            j(surfaceTexture, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (p()) {
            this.b.o();
            return false;
        }
        j(surfaceTexture, true);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.r != 1 || i <= 0 || i2 <= 0) {
            return;
        }
        this.b.f(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean p() {
        return this.r == 1;
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    @Override // defpackage.ota
    public final void rM(osx osxVar) {
        if (osxVar.getCause() instanceof otq) {
            zep.b("ExoPlayer: onPlayerError: DecoderInitializationException - attempt retry");
            q(osxVar);
            return;
        }
        Throwable cause = osxVar.getCause();
        if (cause instanceof IllegalStateException) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if ((cause instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"))) {
                zep.n("ExoPlayer: onPlayerError: MediaCodec exception - attempt retry", osxVar);
                q(osxVar);
                return;
            }
        }
        r(osxVar);
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
        if (i == 4) {
            this.e = 0;
        }
    }
}
