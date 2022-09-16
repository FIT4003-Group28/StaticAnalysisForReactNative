package defpackage;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdu  reason: default package */
/* loaded from: classes.dex */
public final class afdu implements aevf, pgc {
    final /* synthetic */ afdv b;
    private final aflp c = new aflp();
    private final long d = SystemClock.elapsedRealtime();
    public volatile aflm a = aflm.a;

    public afdu(afdv afdvVar) {
        this.b = afdvVar;
    }

    @Override // defpackage.otr
    public final void a(MediaCodec.CryptoException cryptoException) {
        zep.d("Video CryptoError with ExoPlayer.", cryptoException);
    }

    @Override // defpackage.otr
    public final void b(otq otqVar) {
        zep.d("Error with ExoPlayer video decoder initialization.", otqVar);
    }

    @Override // defpackage.otr
    public final void c(String str, long j, long j2) {
        this.a.as(j, j2);
        if (!this.b.x.ab() || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.f.i("dec", new aest(str));
    }

    @Override // defpackage.ouc, defpackage.pgc
    public final void d(Surface surface) {
        afnh afnhVar = this.b.p;
        if (afnhVar != null) {
            afnhVar.n(0);
            this.b.p.m(surface);
        }
    }

    @Override // defpackage.ouc, defpackage.pgc
    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int b = this.b.b();
        this.b.g.c(b, false);
        aegu aeguVar = this.b.G;
        if (aeguVar != null) {
            for (FormatStreamModel formatStreamModel : aeguVar.a) {
                if (formatStreamModel.H()) {
                    if (this.b.x.i() <= 0 || this.b.t.D()) {
                        return;
                    }
                    afdv afdvVar = this.b;
                    if (afdvVar.o.a || elapsedRealtime - this.d <= 3000) {
                        return;
                    }
                    int i = afdvVar.x.i();
                    this.c.c(SystemClock.elapsedRealtime(), b);
                    if (!this.c.e(i)) {
                        return;
                    }
                    double a = this.c.a();
                    String b2 = this.c.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 23);
                    sb.append("droprate.");
                    sb.append((int) a);
                    sb.append(".d.");
                    sb.append(b2);
                    String sb2 = sb.toString();
                    afkk afkkVar = new afkk("android.hfrdroppedframes", this.b.g());
                    afkkVar.a = afkl.DEFAULT;
                    afkkVar.b = sb2;
                    afkkVar.d = this.b.H;
                    afkn a2 = afkkVar.a();
                    this.c.d();
                    this.b.M();
                    this.b.V(a2);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ouc
    public final void f(int i, int i2) {
        h(i, i2);
    }

    @Override // defpackage.aevf, defpackage.pgc
    public final void g(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            afdv afdvVar = this.b;
            if (afdvVar.p == null) {
                return;
            }
            afnn a = afdvVar.n.a(mediaFormat.o);
            if (a != null) {
                a.d = mediaFormat.n;
            }
            this.b.p.u(a);
        }
    }

    @Override // defpackage.pgc
    public final void h(int i, int i2) {
        afdv afdvVar = this.b;
        afdvVar.v = i;
        afdvVar.w = i2;
        afnh afnhVar = afdvVar.p;
        if (afnhVar == null || !afnhVar.E()) {
            return;
        }
        afdv afdvVar2 = this.b;
        afdvVar2.p.v(afdvVar2.v, afdvVar2.w);
    }
}
