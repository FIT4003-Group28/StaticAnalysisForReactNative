package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.images.WebImage;
/* compiled from: PG */
/* renamed from: qor  reason: default package */
/* loaded from: classes4.dex */
public final class qor implements qoa {
    public final Context a;
    public final CastOptions b;
    public final qoj c;
    public final qoj d;
    public qoh e;
    public CastDevice f;
    public iz g;
    public is h;
    public boolean i;
    public final qmg j;
    private final ComponentName k;
    private final Handler l;
    private final Runnable m;

    static {
        new qpu("MediaSessionManager");
    }

    public qor(Context context, CastOptions castOptions, qmg qmgVar) {
        this.a = context;
        this.b = castOptions;
        this.j = qmgVar;
        CastMediaOptions castMediaOptions = castOptions.e;
        if (castMediaOptions != null && !TextUtils.isEmpty(castMediaOptions.b)) {
            this.k = new ComponentName(context, castOptions.e.b);
        } else {
            this.k = null;
        }
        qoj qojVar = new qoj(context);
        this.c = qojVar;
        qojVar.d = new qop(this, 1);
        qoj qojVar2 = new qoj(context);
        this.d = qojVar2;
        qojVar2.d = new qop(this);
        this.l = new rfm(Looper.getMainLooper());
        this.m = new Runnable() { // from class: qoo
            @Override // java.lang.Runnable
            public final void run() {
                qor.this.i(false);
            }
        };
    }

    public static Bitmap g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = (i - height) / 2;
        RectF rectF = new RectF(0.0f, f2, f, height + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    private final Uri n(MediaMetadata mediaMetadata) {
        WebImage webImage;
        if (this.b.e.a() != null) {
            this.b.e.a();
            webImage = tnk.k(mediaMetadata);
        } else {
            webImage = mediaMetadata.c() ? (WebImage) mediaMetadata.a.get(0) : null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.b;
    }

    @Override // defpackage.qoa
    public final void a() {
        m();
    }

    @Override // defpackage.qoa
    public final void b() {
        m();
    }

    @Override // defpackage.qoa
    public final void c() {
        m();
    }

    @Override // defpackage.qoa
    public final void d() {
        m();
    }

    @Override // defpackage.qoa
    public final void e() {
    }

    @Override // defpackage.qoa
    public final void f() {
        m();
    }

    public final void h(Bitmap bitmap, int i) {
        iz izVar = this.g;
        if (izVar == null) {
            return;
        }
        if (i != 0) {
            if (i != 3) {
                return;
            }
            aoce o = o();
            o.k("android.media.metadata.ALBUM_ART", bitmap);
            izVar.h(o.j());
        } else if (bitmap != null) {
            aoce o2 = o();
            o2.k("android.media.metadata.DISPLAY_ICON", bitmap);
            izVar.h(o2.j());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            iz izVar2 = this.g;
            aoce o3 = o();
            o3.k("android.media.metadata.DISPLAY_ICON", createBitmap);
            izVar2.h(o3.j());
        }
    }

    public final void i(boolean z) {
        if (!this.b.f) {
            return;
        }
        this.l.removeCallbacks(this.m);
        Intent intent = new Intent(this.a, qlq.class);
        intent.setPackage(this.a.getPackageName());
        try {
            this.a.startService(intent);
        } catch (IllegalStateException unused) {
            if (!z) {
                return;
            }
            this.l.postDelayed(this.m, 1000L);
        }
    }

    public final void j() {
        if (this.b.e.c != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (qng.b == null) {
                    return;
                }
                qng.b.run();
                return;
            }
            Intent intent = new Intent(this.a, qng.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    public final void k() {
        if (!this.b.f) {
            return;
        }
        this.l.removeCallbacks(this.m);
        Intent intent = new Intent(this.a, qlq.class);
        intent.setPackage(this.a.getPackageName());
        this.a.stopService(intent);
    }

    public final void l(int i, MediaInfo mediaInfo) {
        PendingIntent a;
        iz izVar = this.g;
        if (izVar == null) {
            return;
        }
        long j = 0;
        if (i == 0) {
            jc jcVar = new jc();
            jcVar.c(0, 0L, 1.0f);
            izVar.i(jcVar.a());
            this.g.h(new aoce().j());
            return;
        }
        long j2 = true != this.e.o() ? 768L : 512L;
        long c = this.e.o() ? 0L : this.e.c();
        iz izVar2 = this.g;
        jc jcVar2 = new jc();
        jcVar2.c(i, c, 1.0f);
        jcVar2.b = j2;
        izVar2.i(jcVar2.a());
        iz izVar3 = this.g;
        if (this.k == null) {
            a = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.k);
            a = rfi.a(this.a, 0, intent, rfi.a | 134217728);
        }
        izVar3.j(a);
        if (this.g == null) {
            return;
        }
        MediaMetadata mediaMetadata = mediaInfo.d;
        if (!this.e.o()) {
            j = mediaInfo.e;
        }
        aoce o = o();
        o.m("android.media.metadata.TITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.TITLE"));
        o.m("android.media.metadata.DISPLAY_TITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.TITLE"));
        o.m("android.media.metadata.DISPLAY_SUBTITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.SUBTITLE"));
        o.l("android.media.metadata.DURATION", j);
        this.g.h(o.j());
        Uri n = n(mediaMetadata);
        if (n != null) {
            this.c.b(n);
        } else {
            h(null, 0);
        }
        Uri n2 = n(mediaMetadata);
        if (n2 != null) {
            this.d.b(n2);
        } else {
            h(null, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r2.intValue() < (r4.q.size() - 1)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qor.m():void");
    }

    private final aoce o() {
        iz izVar = this.g;
        MediaMetadataCompat a = izVar == null ? null : izVar.c.a();
        if (a == null) {
            return new aoce();
        }
        return new aoce(a);
    }
}
