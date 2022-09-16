package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aihr  reason: default package */
/* loaded from: classes.dex */
public final class aihr implements airt {
    public final Set a;
    public final LruCache b;
    public long c;
    public Bitmap d;
    public long e;
    public Bitmap f;
    public final Object i;
    public boolean j;
    public acvg l;
    public int m;
    private final ajmy o;
    private final Executor p;
    private final Executor q;
    private final yiw r;
    private aihs s;
    private int t;
    private final aijf u;
    private final airw v;
    private final aadd w;
    private boolean x;
    private final acvh y;
    private boolean z;
    public boolean g = false;
    public boolean h = false;
    public boolean k = false;
    public final aypf n = new aypf();

    public aihr(ajmy ajmyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, aijf aijfVar, airw airwVar, aadd aaddVar, acvh acvhVar) {
        ajmyVar.getClass();
        this.o = ajmyVar;
        this.p = executor;
        this.q = scheduledExecutorService;
        this.i = new Object();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.u = aijfVar;
        this.v = airwVar;
        this.w = aaddVar;
        this.m = 0;
        this.y = acvhVar;
        this.b = new LruCache(3);
        this.c = -1L;
        this.e = -1L;
        this.r = new aihp(this);
        f();
    }

    public static long a(aihu aihuVar, long j) {
        return (j << 32) | aihuVar.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Uri m(aihu aihuVar, int i) {
        int floor = (int) Math.floor(i / aihuVar.c());
        String str = null;
        if (floor < aihuVar.d()) {
            if (floor >= 0 && floor < aihuVar.d() && (str = (String) aihuVar.i.get(floor)) == null) {
                String replace = aihuVar.g.replace("$N", aihuVar.e);
                int i2 = aihuVar.h;
                StringBuilder sb = new StringBuilder(11);
                sb.append(i2);
                String replace2 = replace.replace("$L", sb.toString());
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(floor);
                zgp b = zgp.b(Uri.parse(replace2.replace("$M", sb2.toString())));
                b.h("sigh", aihuVar.f);
                str = b.a().toString();
                aihuVar.i.put(floor, str);
            }
            return Uri.parse(str);
        }
        return null;
    }

    public final synchronized void b(aihq aihqVar) {
        this.a.add(aihqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihr.c(com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):void");
    }

    public final synchronized void d(final int i, final int i2) {
        this.p.execute(new Runnable() { // from class: aihn
            @Override // java.lang.Runnable
            public final void run() {
                aihr aihrVar = aihr.this;
                int i3 = i;
                int i4 = i2;
                synchronized (aihrVar) {
                    for (aihq aihqVar : aihrVar.a) {
                        aihqVar.x(i3, i4);
                    }
                }
            }
        });
    }

    public final synchronized void e(Bitmap bitmap, final int i) {
        final aiht a;
        if (bitmap != null) {
            try {
                a = aiht.a(bitmap);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            a = null;
        }
        this.p.execute(new Runnable() { // from class: aiho
            @Override // java.lang.Runnable
            public final void run() {
                aihr aihrVar = aihr.this;
                aiht aihtVar = a;
                int i2 = i;
                synchronized (aihrVar) {
                    for (aihq aihqVar : aihrVar.a) {
                        aihqVar.y(aihtVar, i2);
                    }
                    acvg acvgVar = aihrVar.l;
                    if (acvgVar != null) {
                        acvgVar.c("thsb0_fr");
                        aihrVar.l = null;
                    }
                }
            }
        });
    }

    public final void f() {
        this.n.g(g(this.v));
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().d.h(aiwv.n(airwVar.aB(), 268435456L)).h(aiwv.l(1)).aa(new aihm(this), aiax.m), airwVar.G().i.h(aiwv.n(airwVar.aB(), 268435456L)).h(aiwv.l(1)).aa(new aihm(this, 2), aiax.m), airwVar.ab().aa(new aihm(this, 4), aiax.m), airwVar.ae(aihl.b, aihl.a).I().h(aiwv.l(1)).aa(new aihm(this, 1), aiax.m), airwVar.V().aa(new aihm(this, 3), aiax.m)};
    }

    public final synchronized void h(aihq aihqVar) {
        this.a.remove(aihqVar);
    }

    public final void i(aihu aihuVar, int i) {
        Uri m;
        if (((!this.g || this.h) && !this.u.m) || (m = m(aihuVar, i)) == null) {
            return;
        }
        auaf e = aiix.e(this.w);
        if (e != null && e.I && !this.z) {
            this.z = true;
            acvg c = this.y.c(asny.LATENCY_ACTION_STORYBOARD_THUMBNAILS);
            this.l = c;
            c.e();
        }
        acvg acvgVar = this.l;
        if (acvgVar != null) {
            acvgVar.c("thsb0_ns");
        }
        this.o.m(m, this.r);
    }

    public final void j() {
        if (this.c == -1 && this.e == -1) {
            return;
        }
        synchronized (this.i) {
            this.s = null;
            this.g = false;
            this.h = false;
            this.b.evictAll();
            this.d = null;
            this.f = null;
            this.c = -1L;
            this.e = -1L;
            this.j = false;
            this.k = false;
            this.x = false;
            this.l = null;
            this.z = false;
            e(null, -1);
        }
    }

    public final void k(long j, final int i) {
        if (!l() || this.j) {
            d(i, 0);
            return;
        }
        final aihu a = this.s.a(this.t);
        if (a == null) {
            d(i, 1);
            return;
        }
        final int a2 = a.a(j);
        if (a2 < 0) {
            d(i, 2);
        } else if (!this.k) {
            this.k = true;
            this.q.execute(new Runnable() { // from class: aihk
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    aihr aihrVar = aihr.this;
                    aihu aihuVar = a;
                    int i6 = a2;
                    int i7 = i;
                    long j2 = i6;
                    Long valueOf = Long.valueOf(aihr.a(aihuVar, j2));
                    synchronized (aihrVar.i) {
                        if (valueOf.longValue() == aihrVar.e || valueOf.longValue() == aihrVar.c) {
                            aihrVar.d(i7, 5);
                        } else {
                            Uri m = aihr.m(aihuVar, i6);
                            Bitmap bitmap = null;
                            if ((m != null ? (BitmapRegionDecoder) aihrVar.b.get(m) : null) == null) {
                                aihrVar.i(aihuVar, i6);
                                aihrVar.d(i7, 4);
                            } else {
                                long a3 = aihr.a(aihuVar, j2);
                                Bitmap bitmap2 = aihrVar.d;
                                if (bitmap2 != null) {
                                    aqxo.p(bitmap2 != aihrVar.f);
                                }
                                Bitmap bitmap3 = aihrVar.d;
                                BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder) aihrVar.b.get(aihr.m(aihuVar, i6));
                                if (bitmapRegionDecoder == null) {
                                    aihrVar.i(aihuVar, i6);
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inBitmap = bitmap3;
                                    options.inMutable = true;
                                    try {
                                        int i8 = aihuVar.d;
                                        int c = (i6 % aihuVar.c()) / i8;
                                        Rect rect = new Rect((i6 % i8) * aihuVar.a, c * aihuVar.b, (i2 + i3) - 1, (i4 + i5) - 1);
                                        int i9 = aihrVar.m;
                                        if (i9 == 1) {
                                            rect.set(rect.left, rect.top, rect.centerX(), rect.bottom);
                                        } else if (i9 == 3) {
                                            rect.set(rect.left, rect.top, rect.right, rect.centerY());
                                        }
                                        if (bitmapRegionDecoder.getWidth() >= rect.right && bitmapRegionDecoder.getHeight() >= rect.bottom && rect.width() > 0 && rect.height() > 0) {
                                            bitmap = bitmapRegionDecoder.decodeRegion(rect, options);
                                        }
                                    } catch (Exception e) {
                                        String valueOf2 = String.valueOf(e.getClass().getName());
                                        afus.b(2, 10, valueOf2.length() != 0 ? "Storyboard regionDecoder.decodeRegion exception - ".concat(valueOf2) : new String("Storyboard regionDecoder.decodeRegion exception - "));
                                        aihrVar.j = true;
                                    }
                                }
                                if (bitmap != null) {
                                    aihrVar.d = aihrVar.f;
                                    aihrVar.c = aihrVar.e;
                                    aihrVar.f = bitmap;
                                    aihrVar.e = a3;
                                    aihrVar.e(aihrVar.f, i7);
                                } else {
                                    aihrVar.d(i7, 6);
                                }
                            }
                        }
                        aihrVar.k = false;
                    }
                }
            });
        } else {
            d(i, 3);
        }
    }

    public final boolean l() {
        aihs aihsVar = this.s;
        if (aihsVar != null && this.x) {
            aihu a = aihsVar.a(0);
            if (!(a instanceof aihv) || a.b() > 0) {
                return true;
            }
        }
        return false;
    }
}
