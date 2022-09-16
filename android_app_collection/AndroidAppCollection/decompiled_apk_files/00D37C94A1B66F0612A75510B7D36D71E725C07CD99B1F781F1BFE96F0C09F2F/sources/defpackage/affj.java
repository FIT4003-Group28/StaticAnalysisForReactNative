package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: affj  reason: default package */
/* loaded from: classes.dex */
public final class affj {
    public volatile boolean a;
    public volatile boolean b;
    public afng c;
    private final snc d;
    private final Deque e = new ArrayDeque();
    private final Handler f = new Handler(Looper.getMainLooper());

    public affj(snc sncVar, afjz afjzVar) {
        this.a = afjzVar.O();
        this.d = sncVar;
    }

    public final void a(aetv aetvVar) {
        if (!this.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (!this.e.isEmpty()) {
            arrayList.add((affh) this.e.remove());
            if (arrayList.size() == 6 || this.e.isEmpty()) {
                aetvVar.i("dedi", new affg(arrayList));
                if (!this.e.isEmpty()) {
                    arrayList = new ArrayList();
                }
            }
        }
        this.b = false;
    }

    public final void b(afte afteVar) {
        o(affi.ATTACH_MEDIA_VIEW, afteVar);
    }

    public final void c(afte afteVar) {
        o(affi.BLOCKING_STOP_VIDEO, afteVar);
    }

    public final void d(afte afteVar) {
        o(affi.DETACH_MEDIA_VIEW, afteVar);
    }

    public final void e(afte afteVar) {
        o(affi.LOAD_VIDEO, afteVar);
    }

    public final void f(afng afngVar, afte afteVar) {
        if (!this.a) {
            return;
        }
        this.c = afngVar;
        if (afngVar == null) {
            o(affi.SET_NULL_LISTENER, afteVar);
        } else {
            o(affi.SET_LISTENER, afteVar);
        }
    }

    public final void g(afnk afnkVar, afte afteVar) {
        p(affi.SET_MEDIA_VIEW_TYPE, afteVar, 0, afnkVar, afmk.a(Thread.currentThread().getStackTrace()), null);
    }

    public final void h(final afte afteVar, final Surface surface, Exception exc) {
        final StringBuilder sb = new StringBuilder();
        if (surface instanceof DummySurface) {
            sb.append("-dummy");
        }
        if (exc != null) {
            sb.append("-failed");
        }
        this.f.post(new Runnable() { // from class: affe
            @Override // java.lang.Runnable
            public final void run() {
                affj affjVar = affj.this;
                affjVar.p(affi.SET_OUTPUT_SURFACE, afteVar, System.identityHashCode(surface), afnk.NONE, sb.toString(), null);
                affjVar.b = true;
            }
        });
    }

    public final void i(Surface surface, afte afteVar) {
        if (!this.a) {
            return;
        }
        if (surface == null) {
            p(affi.SET_NULL_SURFACE, afteVar, 0, afnk.NONE, afmk.a(Thread.currentThread().getStackTrace()), null);
        } else {
            p(affi.SET_SURFACE, afteVar, System.identityHashCode(surface), afnk.NONE, null, null);
        }
    }

    public final void j(afte afteVar) {
        o(affi.STOP_VIDEO, afteVar);
    }

    public final void k(afte afteVar) {
        o(affi.SURFACE_CREATED, afteVar);
    }

    public final void l(afte afteVar) {
        o(affi.SURFACE_DESTROYED, afteVar);
    }

    public final void m(afte afteVar) {
        o(affi.SURFACE_ERROR, afteVar);
    }

    public final void n(final Surface surface, final afte afteVar, final boolean z, final aetv aetvVar) {
        if (!this.a) {
            return;
        }
        final long d = this.d.d();
        this.f.post(new Runnable() { // from class: affd
            @Override // java.lang.Runnable
            public final void run() {
                affi affiVar;
                affj affjVar = affj.this;
                Surface surface2 = surface;
                afte afteVar2 = afteVar;
                boolean z2 = z;
                aetv aetvVar2 = aetvVar;
                long j = d;
                if (!affjVar.a) {
                    return;
                }
                if (z2) {
                    affiVar = affi.SURFACE_BECOMES_VALID;
                } else {
                    affiVar = affi.UNEXPECTED_INVALID_SURFACE;
                }
                affjVar.p(affiVar, afteVar2, System.identityHashCode(surface2), afnk.NONE, null, Long.valueOf(j));
                affjVar.a(aetvVar2);
            }
        });
    }

    public final void o(affi affiVar, afte afteVar) {
        p(affiVar, afteVar, 0, afnk.NONE, null, null);
    }

    public final void p(final affi affiVar, final afte afteVar, final int i, final afnk afnkVar, final Object obj, final Long l) {
        if (!this.a) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.e.add(affh.g(affiVar, l != null ? l.longValue() : this.d.d(), afteVar, i, afnkVar, obj));
            if (this.e.size() <= 512) {
                return;
            }
            this.e.remove();
            return;
        }
        this.f.post(new Runnable() { // from class: afff
            @Override // java.lang.Runnable
            public final void run() {
                affj affjVar = affj.this;
                afte afteVar2 = afteVar;
                affi affiVar2 = affiVar;
                int i2 = i;
                afnk afnkVar2 = afnkVar;
                Object obj2 = obj;
                Long l2 = l;
                affjVar.o(affi.NOT_ON_MAIN_THREAD, afteVar2);
                affjVar.p(affiVar2, afteVar2, i2, afnkVar2, obj2, l2);
            }
        });
    }
}
