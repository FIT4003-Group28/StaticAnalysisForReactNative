package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: siq  reason: default package */
/* loaded from: classes4.dex */
public final class siq implements aoid, sjj {
    private static final Size p = new Size(1280, 720);
    public final Context a;
    public final ski b;
    public final sir c;
    public final aoik d;
    public final sip e;
    public final sld f;
    public final Executor g;
    public aoic h;
    public aoia i;
    public Size j;
    public Size k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    public siq(Context context, ski skiVar, Executor executor, aoik aoikVar, sip sipVar) {
        Size size = p;
        this.l = -1;
        this.m = -1;
        this.a = context;
        this.g = anlz.g(executor);
        this.b = skiVar;
        skiVar.c();
        this.c = new sir((amuk) sis.a(context, 0).map(omr.g).orElse(amuk.q()), size);
        this.d = aoikVar;
        this.e = sipVar;
        this.f = new sld(executor);
    }

    public final void a() {
        this.o = false;
        this.j = null;
        this.l = -1;
        this.b.b();
        final aoia aoiaVar = this.i;
        if (aoiaVar != null) {
            aoiaVar.a.k.post(new Runnable() { // from class: aoht
                @Override // java.lang.Runnable
                public final void run() {
                    aoia.this.a.e(null, 0, 0);
                }
            });
            aoia aoiaVar2 = this.i;
            aohz aohzVar = aoiaVar2.a;
            if (aohzVar != null) {
                aohzVar.i();
                try {
                    aoiaVar2.a.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("ExternalTextureConv", valueOf.length() != 0 ? "thread was unexpectedly interrupted: ".concat(valueOf) : new String("thread was unexpectedly interrupted: "));
                    throw new RuntimeException(e);
                }
            }
            this.i = null;
        }
    }

    public final void b(final Runnable runnable) {
        this.f.b(new slc() { // from class: sii
            @Override // defpackage.slc
            public final ankt a() {
                final siq siqVar = siq.this;
                final Runnable runnable2 = runnable;
                return anii.h(anlz.v(new aniq() { // from class: sik
                    @Override // defpackage.aniq
                    public final ankt a() {
                        Size size;
                        siq siqVar2 = siq.this;
                        Runnable runnable3 = runnable2;
                        if (siqVar2.f.c()) {
                            return anlz.q(null);
                        }
                        runnable3.run();
                        if (!siqVar2.n || (size = siqVar2.k) == null || siqVar2.m == -1) {
                            return anlz.q(null);
                        }
                        if (siqVar2.o) {
                            if (size.equals(siqVar2.j)) {
                                int i = siqVar2.m;
                                if (i != siqVar2.l) {
                                    siqVar2.i.a(i);
                                    siqVar2.l = siqVar2.m;
                                }
                                return anlz.q(null);
                            }
                            siqVar2.a();
                        }
                        siqVar2.i = new aoia(siqVar2.d.c);
                        siqVar2.i.a(siqVar2.m);
                        siqVar2.l = siqVar2.m;
                        aoic aoicVar = siqVar2.h;
                        if (aoicVar != null) {
                            siqVar2.i.c(aoicVar);
                        }
                        skr skrVar = ((sju) siqVar2.e).k;
                        if (skrVar != null) {
                            skrVar.e.a.f(skt.CAMERA_INIT);
                        }
                        siqVar2.j = siqVar2.k;
                        siqVar2.o = true;
                        ski skiVar = siqVar2.b;
                        final Size size2 = siqVar2.j;
                        final skh skhVar = (skh) skiVar;
                        if (skhVar.b == null) {
                            return anlz.p(new IllegalStateException("Camera not initialized or no valid camera was found."));
                        }
                        skhVar.b();
                        if (size2.getWidth() <= size2.getHeight()) {
                            size2 = new Size(size2.getHeight(), size2.getWidth());
                        }
                        final SettableFuture f = SettableFuture.f();
                        final SettableFuture f2 = SettableFuture.f();
                        skhVar.c = f;
                        skhVar.d = f2;
                        return aed.c(new agr() { // from class: skd
                            @Override // defpackage.agr
                            public final Object a(agp agpVar) {
                                return skh.this.a(f, f2, size2, agpVar);
                            }
                        });
                    }
                }, siqVar.g), new ampg() { // from class: sij
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        siq siqVar2 = siq.this;
                        final SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                        if (surfaceTexture == null) {
                            return null;
                        }
                        final aoia aoiaVar = siqVar2.i;
                        if (aoiaVar != null) {
                            final int width = siqVar2.j.getWidth();
                            final int height = siqVar2.j.getHeight();
                            if (width == 0 || height == 0) {
                                throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
                            }
                            aoiaVar.a.k.post(new Runnable() { // from class: aohu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aoia aoiaVar2 = aoia.this;
                                    SurfaceTexture surfaceTexture2 = surfaceTexture;
                                    int i = width;
                                    int i2 = height;
                                    aohz aohzVar = aoiaVar2.a;
                                    aohzVar.e(surfaceTexture2, i, i2);
                                    int[] iArr = new int[1];
                                    GLES20.glGenTextures(1, iArr, 0);
                                    aohzVar.a.attachToGLContext(iArr[0]);
                                }
                            });
                            skr skrVar = ((sju) siqVar2.e).k;
                            if (skrVar == null) {
                                return null;
                            }
                            skrVar.e.a.e(skt.CAMERA_INIT);
                            return null;
                        }
                        surfaceTexture.release();
                        return null;
                    }
                }, siqVar.g);
            }
        });
    }

    @Override // defpackage.aoid
    public final void c(aoic aoicVar) {
        throw null;
    }

    public final void d() {
        this.f.b(new slc() { // from class: sig
            @Override // defpackage.slc
            public final ankt a() {
                final siq siqVar = siq.this;
                return anlz.u(new Callable() { // from class: sio
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        siq siqVar2 = siq.this;
                        siqVar2.n = false;
                        siqVar2.a();
                        return null;
                    }
                }, siqVar.g);
            }
        });
    }
}
