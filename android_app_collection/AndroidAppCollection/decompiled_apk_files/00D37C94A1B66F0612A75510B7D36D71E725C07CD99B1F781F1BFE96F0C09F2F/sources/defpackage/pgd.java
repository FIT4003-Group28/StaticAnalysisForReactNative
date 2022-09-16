package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;
/* compiled from: PG */
/* renamed from: pgd  reason: default package */
/* loaded from: classes4.dex */
public final class pgd extends ouj {
    public final ost a;
    public final pgc b;
    private final int c;
    private final int d;
    private final boolean e;
    private final Handler f;
    private final oue g;
    private final int i;
    private MediaFormat j;
    private VpxDecoder k;
    private pgf l;
    private VpxOutputBuffer m;
    private VpxOutputBuffer n;
    private Bitmap o;
    private boolean p;
    private boolean q;
    private Surface r;
    private pgg s;
    private final int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgd(oui ouiVar, Handler handler, pgc pgcVar, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        super(ouiVar);
        int i4 = 0;
        this.a = new ost();
        this.f = handler;
        this.b = pgcVar;
        this.e = z;
        if (z2) {
            this.t = true == z3 ? 3 : i4;
        } else {
            this.t = 2;
        }
        this.i = i;
        this.c = i2;
        this.d = i3;
        this.x = -1;
        this.y = -1;
        this.g = new oue();
    }

    public static String l() {
        if (VpxDecoder.a) {
            return VpxDecoder.getLibvpxVersion();
        }
        return null;
    }

    private final void n() {
        this.l = null;
        VpxOutputBuffer vpxOutputBuffer = this.m;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.m = null;
        }
        VpxOutputBuffer vpxOutputBuffer2 = this.n;
        if (vpxOutputBuffer2 != null) {
            vpxOutputBuffer2.release();
            this.n = null;
        }
        this.k.h();
    }

    private final void o(Surface surface) {
        if (this.p || this.b == null) {
            return;
        }
        this.f.post(new pfy(this, surface));
        this.p = true;
    }

    private final void s() {
        if (this.b == null || this.z <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        this.z = 0;
        this.f.post(new pfx(this));
    }

    private final void t(MediaFormat mediaFormat) {
        if (this.b != null) {
            this.f.post(new pgb(this, mediaFormat));
        }
    }

    private final void u() {
        pgg pggVar;
        Surface surface;
        int i;
        int i2 = 1;
        this.a.f++;
        VpxOutputBuffer vpxOutputBuffer = this.m;
        int i3 = vpxOutputBuffer.width;
        int i4 = vpxOutputBuffer.height;
        int i5 = this.x;
        if (i5 == -1 || (i = this.y) == -1 || i5 != i3 || i != i4) {
            this.x = i3;
            this.y = i4;
            if (this.b != null) {
                this.f.post(new pfw(this, i3, i4));
            }
        }
        VpxOutputBuffer vpxOutputBuffer2 = this.m;
        int i6 = vpxOutputBuffer2.mode;
        if (i6 != 1) {
            i2 = i6;
        } else if (this.r != null) {
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.getWidth() != vpxOutputBuffer2.width || this.o.getHeight() != vpxOutputBuffer2.height) {
                this.o = Bitmap.createBitmap(vpxOutputBuffer2.width, vpxOutputBuffer2.height, Bitmap.Config.RGB_565);
            }
            this.o.copyPixelsFromBuffer(vpxOutputBuffer2.data);
            Canvas lockCanvas = this.r.lockCanvas(null);
            lockCanvas.scale(lockCanvas.getWidth() / vpxOutputBuffer2.width, lockCanvas.getHeight() / vpxOutputBuffer2.height);
            lockCanvas.drawBitmap(this.o, 0.0f, 0.0f, (Paint) null);
            this.r.unlockCanvasAndPost(lockCanvas);
            o(this.r);
            this.m.release();
            this.m = null;
        }
        if ((i2 == 0 || i2 == 3) && (pggVar = this.s) != null) {
            pggVar.rR(vpxOutputBuffer2);
            o(this.r);
        } else if (i2 != 2 || (surface = this.r) == null) {
            vpxOutputBuffer2.release();
        } else {
            VpxDecoder vpxDecoder = this.k;
            if (vpxDecoder.vpxRenderFrame(vpxDecoder.b, surface, vpxOutputBuffer2) != -1) {
                o(this.r);
                this.m.release();
            } else {
                throw new pge("Buffer render failed.");
            }
        }
        this.m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc A[Catch: pge -> 0x017c, TryCatch #0 {pge -> 0x017c, blocks: (B:11:0x0026, B:18:0x0062, B:56:0x00f4, B:78:0x0168, B:80:0x016b, B:59:0x00fc, B:61:0x0100, B:64:0x010d, B:69:0x011c, B:73:0x012b, B:74:0x013f, B:76:0x0157, B:77:0x015d, B:21:0x006a, B:23:0x006e, B:25:0x0072, B:27:0x0081, B:26:0x0077, B:30:0x0086, B:32:0x008a, B:33:0x0094, B:35:0x009c, B:36:0x00a6, B:38:0x00ac, B:40:0x00b0, B:44:0x00bc, B:46:0x00cc, B:47:0x00cf, B:48:0x00d9, B:50:0x00dd, B:51:0x00e3, B:53:0x00e8, B:55:0x00ef, B:14:0x0030, B:16:0x004d, B:17:0x005b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b A[Catch: pge -> 0x017c, TRY_LEAVE, TryCatch #0 {pge -> 0x017c, blocks: (B:11:0x0026, B:18:0x0062, B:56:0x00f4, B:78:0x0168, B:80:0x016b, B:59:0x00fc, B:61:0x0100, B:64:0x010d, B:69:0x011c, B:73:0x012b, B:74:0x013f, B:76:0x0157, B:77:0x015d, B:21:0x006a, B:23:0x006e, B:25:0x0072, B:27:0x0081, B:26:0x0077, B:30:0x0086, B:32:0x008a, B:33:0x0094, B:35:0x009c, B:36:0x00a6, B:38:0x00ac, B:40:0x00b0, B:44:0x00bc, B:46:0x00cc, B:47:0x00cf, B:48:0x00d9, B:50:0x00dd, B:51:0x00e3, B:53:0x00e8, B:55:0x00ef, B:14:0x0030, B:16:0x004d, B:17:0x005b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // defpackage.ouj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void A(long r17, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgd.A(long, long, boolean):void");
    }

    @Override // defpackage.ouj
    protected final boolean E(MediaFormat mediaFormat) {
        return "video/x-vnd.on2.vp9".equalsIgnoreCase(mediaFormat.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean h() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean i() {
        if (this.j != null) {
            return (this.w || this.m != null) && this.q;
        }
        return false;
    }

    @Override // defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        pgg pggVar;
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.t != 2 || this.r == surface) {
                return;
            }
            this.r = surface;
            this.p = false;
        } else if (i != 2 || this.s == (pggVar = (pgg) obj)) {
        } else {
            int i2 = this.t;
            if (i2 != 0 && i2 != 3) {
                return;
            }
            this.s = pggVar;
            this.p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final void q() {
        this.l = null;
        this.m = null;
        this.j = null;
        try {
            if (this.k != null) {
                n();
                this.k.d();
                this.k = null;
                this.a.b++;
            }
        } finally {
            super.q();
        }
    }

    @Override // defpackage.ouj
    protected final void r(long j) {
        this.w = false;
        this.u = false;
        this.v = false;
        this.q = false;
        if (this.k != null) {
            n();
        }
    }

    @Override // defpackage.ouo
    protected final void v() {
        this.z = 0;
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void w() {
        s();
    }
}
