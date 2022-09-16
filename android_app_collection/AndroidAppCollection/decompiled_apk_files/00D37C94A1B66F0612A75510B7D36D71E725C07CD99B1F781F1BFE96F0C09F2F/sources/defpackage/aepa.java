package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aepa  reason: default package */
/* loaded from: classes.dex */
public final class aepa extends HandlerThread implements Handler.Callback {
    public static final /* synthetic */ int r = 0;
    public final aepc a;
    public final Context b;
    final aeoz c;
    public Handler d;
    public volatile float e;
    public volatile float f;
    public volatile long g;
    public volatile boolean h;
    public aetv i;
    public afnh j;
    public aeow k;
    public volatile boolean l;
    public volatile boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public final afjz q;
    private final PlaybackParams s;
    private final affj t;
    private final aeoc u;
    private volatile aeof v;
    private PlayerConfigModel w;

    public aepa(aepc aepcVar, Context context, affj affjVar, aeoc aeocVar, afjz afjzVar) {
        super("Medialib.AndroidFrameworkPlayer");
        this.e = 1.0f;
        this.f = 1.0f;
        this.a = aepcVar;
        this.b = context;
        this.t = affjVar;
        afms.a(aeocVar);
        this.u = aeocVar;
        this.q = afjzVar;
        this.c = new aeoz(this);
        this.s = Build.VERSION.SDK_INT >= 23 ? new PlaybackParams() : null;
    }

    private final void j() {
        this.h = true;
        if (this.v == null) {
            return;
        }
        try {
            if (i()) {
                this.v.r();
                afnh afnhVar = this.j;
                if (afnhVar != null) {
                    afnhVar.n(500);
                }
                this.n = true;
                this.d.sendEmptyMessage(11);
                if (!this.p) {
                    this.i.q();
                    this.i.s(-1L);
                }
            }
            this.p = false;
        } catch (IllegalStateException e) {
            zep.d("AndroidFwPlayer: ISE calling start", e);
        }
    }

    private final void k(aeow aeowVar) {
        this.k = aeowVar;
        this.f = aeowVar.g;
        c(this.i);
        Boolean bool = aeowVar.h;
        if (bool != null) {
            this.h = bool.booleanValue();
        }
        try {
            this.v = this.u.a(aeowVar.b);
            aeof aeofVar = this.v;
            aepc aepcVar = this.a;
            int i = aepc.n;
            aeofVar.k(1 != (aepcVar.l & 1) ? 3 : 4);
            this.v.n(this.c);
            aalz n = aeowVar.b.n();
            n.c(aeowVar.a);
            n.e(afmg.d(aeowVar.b, aeowVar.e));
            Uri a = n.a();
            this.i = aeowVar.c;
            this.w = aeowVar.e;
            try {
                if (!this.p) {
                    this.i.r();
                }
                l(aeowVar.d);
                aeof aeofVar2 = this.v;
                Context context = this.b;
                aepc aepcVar2 = this.a;
                HashMap hashMap = new HashMap();
                hashMap.put("x-disconnect-at-highwatermark", "1");
                hashMap.put("User-Agent", aepcVar2.b);
                aeofVar2.l(context, a, hashMap, this.w);
                this.v.h();
                this.i.c(this.v.a());
                d(true);
            } catch (IOException e) {
                zep.d("AndroidFwPlayer: IOE preparing video", e);
                this.i.g(new afkn("android.fw.prepare", 0L, e));
            } catch (IllegalArgumentException e2) {
                zep.d("AndroidFwPlayer: IAE preparing video", e2);
                this.i.g(new afkn("android.fw.ise", 0L, e2));
            } catch (IllegalStateException e3) {
                zep.d("AndroidFwPlayer: ISE preparing video", e3);
            }
        } catch (InstantiationException e4) {
            zep.b("AndroidFwPlayer: Factory failed to create a MediaPlayer for the stream");
            this.i.g(new afkn("android.fw.create", 0L, e4));
        }
    }

    private final void l(afnh afnhVar) {
        if (afnhVar == null) {
            this.j = null;
        } else if (this.v == null || this.j == afnhVar || !afnhVar.E()) {
        } else {
            SurfaceHolder B = afnhVar.B();
            if (B != null) {
                try {
                    this.t.o(affi.SET_SURFACE_HOLDER, afte.NATIVE_MEDIA_PLAYER);
                    this.v.m(B);
                } catch (IllegalArgumentException e) {
                    zep.d("AndroidFwPlayer: IAE attaching Surface.", e);
                    this.i.g(new afkn("player.fatalexception", this.v.b(), e));
                    return;
                }
            } else if (afnhVar.E()) {
                Surface A = afnhVar.A();
                this.t.i(A, afte.NATIVE_MEDIA_PLAYER);
                this.v.p(A);
            }
            this.j = afnhVar;
        }
    }

    private final void m(afly aflyVar) {
        this.k = null;
        this.m = false;
        this.n = false;
        this.o = false;
        c(this.i);
        this.i = aetv.c;
        this.j = null;
        this.w = null;
        if (aflyVar != null) {
            aflyVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        afly aflyVar = new afly();
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(13, aflyVar));
        try {
            aflyVar.get(this.q.k(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            aetv aetvVar = this.i;
            if (aetvVar != null) {
                aetvVar.g(new afkn("player.timeout", this.g, e));
            }
            aepc aepcVar = this.a;
            int i = aepc.n;
            aepcVar.A();
        } catch (Exception e2) {
            afkj.c(afki.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.d.sendEmptyMessage(2);
    }

    final void c(aetv aetvVar) {
        if (this.v != null) {
            if (aetvVar != null) {
                aetvVar.b(this.v.a());
            }
            this.v.i();
            this.v = null;
        }
    }

    public final void d(boolean z) {
        if (this.o != z) {
            this.o = z;
            if (z) {
                if (this.h) {
                    this.i.d();
                } else {
                    this.i.n();
                }
            } else if (this.h) {
                this.i.q();
                this.i.s(-1L);
            } else {
                this.i.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(afnh afnhVar) {
        Handler handler = this.d;
        handler.sendMessage(Message.obtain(handler, 9, afnhVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(float f) {
        Handler handler = this.d;
        handler.sendMessage(Message.obtain(handler, 12, Float.valueOf(f)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.d.removeMessages(1);
        this.d.sendEmptyMessage(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.d.removeMessages(1);
        afly aflyVar = new afly();
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(5, aflyVar));
        try {
            aflyVar.get(this.q.j(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            aetv aetvVar = this.i;
            if (aetvVar != null) {
                aetvVar.g(new afkn("player.timeout", this.g, e));
            }
            aepc aepcVar = this.a;
            int i = aepc.n;
            aepcVar.A();
        } catch (Exception e2) {
            afkj.c(afki.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        PlaybackParams playbackParams;
        switch (message.what) {
            case 1:
                k((aeow) message.obj);
                return true;
            case 2:
                j();
                return true;
            case 3:
                if (this.v != null) {
                    if (i()) {
                        try {
                            this.v.f();
                            this.n = false;
                            this.h = false;
                            this.i.m();
                            d(false);
                        } catch (IllegalStateException e) {
                            zep.d("AndroidFwPlayer: ISE calling pause", e);
                        }
                    } else if (this.h) {
                        this.h = false;
                        this.i.m();
                    }
                }
                return true;
            case 4:
                long longValue = ((Long) message.obj).longValue();
                if (this.h) {
                    this.i.t(longValue);
                } else {
                    this.i.o(longValue);
                }
                if (this.v != null && i()) {
                    try {
                        this.v.j(longValue);
                        if (!this.n && this.h) {
                            j();
                            aepc aepcVar = this.a;
                            int i = aepc.n;
                            aepcVar.E(true);
                        }
                    } catch (IllegalStateException e2) {
                        zep.d("AndroidFwPlayer: ISE calling seek", e2);
                    }
                } else {
                    aeow aeowVar = this.k;
                    if (aeowVar != null) {
                        this.a.V(aeowVar.b, longValue, null, null);
                    }
                }
                return true;
            case 5:
                m((afly) message.obj);
                return true;
            case 6:
                m(null);
                getLooper().quit();
                this.d.removeCallbacksAndMessages(null);
                return true;
            case 7:
            case 8:
            default:
                return false;
            case 9:
                l((afnh) message.obj);
                return true;
            case 10:
                float floatValue = ((Float) message.obj).floatValue();
                if (this.m && this.v != null && (playbackParams = this.s) != null) {
                    playbackParams.setSpeed(floatValue);
                    try {
                        this.v.o(this.s);
                        this.e = floatValue;
                        this.i.p(floatValue);
                    } catch (Exception unused) {
                        afkl afklVar = afkl.PROGRESSIVE;
                        StringBuilder sb = new StringBuilder(30);
                        sb.append("info.varispeed.");
                        sb.append(floatValue);
                        this.i.g(new afkn(afklVar, "player.exception", 0L, sb.toString()));
                    }
                }
                return true;
            case 11:
                if (this.v != null && this.m) {
                    long b = this.v.b();
                    if (b > this.g) {
                        aepc aepcVar2 = this.a;
                        int i2 = aepc.n;
                        aepcVar2.m.set(0);
                    }
                    this.g = b;
                }
                if (this.n) {
                    this.d.sendEmptyMessageDelayed(11, 250L);
                }
                return true;
            case 12:
                float floatValue2 = ((Float) message.obj).floatValue();
                this.f = floatValue2;
                if (this.m && this.v != null) {
                    this.v.q(floatValue2, floatValue2);
                }
                return true;
            case 13:
                afly aflyVar = (afly) message.obj;
                if (this.j != null) {
                    if (this.v != null) {
                        this.t.i(null, afte.NATIVE_MEDIA_PLAYER);
                        this.v.p(null);
                        this.v.m(null);
                    }
                    this.t.f(null, afte.NATIVE_MEDIA_PLAYER);
                    this.j = null;
                }
                aflyVar.run();
                return true;
        }
    }

    public final boolean i() {
        return this.m && this.l;
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        if (getLooper() != null) {
            this.d.sendEmptyMessage(6);
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        this.d = new Handler(getLooper(), this);
    }
}
