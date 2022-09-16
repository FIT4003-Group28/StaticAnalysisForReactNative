package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
import com.google.android.youtube.R;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.framework.Compat;
import com.google.research.xeno.effect.AssetDownloader;
import com.google.research.xeno.effect.InputFrameSource;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: PG */
/* renamed from: sju  reason: default package */
/* loaded from: classes4.dex */
public final class sju implements skq, skx, sip {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager");
    public final SettableFuture b = SettableFuture.f();
    public final SettableFuture c = SettableFuture.f();
    public final SettableFuture d = SettableFuture.f();
    public final Context e;
    public final aoik f;
    final sjk g;
    public final siq h;
    public final Executor i;
    public final sld j;
    public skr k;
    public six l;

    public sju(Context context, ski skiVar, aoik aoikVar, Executor executor, Executor executor2) {
        this.e = context;
        this.f = aoikVar;
        siq siqVar = new siq(context, skiVar, executor, aoikVar, this);
        this.h = siqVar;
        sjk sjkVar = new sjk(context, aoikVar, siqVar);
        this.g = sjkVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.product_banner_height);
        sjkVar.b.setLayoutParams(layoutParams);
        this.i = anlz.g(executor2);
        this.j = new sld(executor);
    }

    public final View a() {
        return this.g.b;
    }

    @Override // defpackage.skq
    public final void b() {
        ankt a2;
        ankt a3;
        if (this.k != null) {
            ankt[] anktVarArr = new ankt[3];
            six sixVar = this.l;
            synchronized (sixVar.c) {
                Iterator it = sixVar.d.iterator();
                while (it.hasNext()) {
                    ((ankt) it.next()).cancel(true);
                }
                a2 = sixVar.c.a();
            }
            anktVarArr[0] = a2;
            siq siqVar = this.h;
            synchronized (siqVar.f) {
                siqVar.d();
                a3 = siqVar.f.a();
            }
            anktVarArr[1] = a3;
            anktVarArr[2] = this.j.a();
            anlz.k(anktVarArr).c(new Runnable() { // from class: sjs
                @Override // java.lang.Runnable
                public final void run() {
                    sju sjuVar = sju.this;
                    slf.a(sjuVar.c, sjuVar.i);
                    slf.a(sjuVar.b, sjuVar.k.c);
                    slf.a(sjuVar.d, sjuVar.k.b);
                }
            }, this.k.c);
        }
    }

    @Override // defpackage.skq
    public final void c(final skr skrVar) {
        this.k = skrVar;
        if (this.l == null) {
            this.l = new six(skrVar.d, skrVar.b, skrVar.c);
        }
        if (!this.b.isDone()) {
            this.b.lV(anii.i(((shx) skrVar.e.a()).c, new anir() { // from class: sjq
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    sju sjuVar = sju.this;
                    Boolean bool = (Boolean) obj;
                    File file = new File(sjuVar.e.getCacheDir(), "faceviewer");
                    file.mkdir();
                    final String absolutePath = file.getAbsolutePath();
                    final Locale d = akh.c(sjuVar.e.getResources().getConfiguration()).d();
                    final six sixVar = sjuVar.l;
                    aopa createBuilder = anve.a.createBuilder();
                    anvd anvdVar = anvd.a;
                    createBuilder.copyOnWrite();
                    anve anveVar = (anve) createBuilder.instance;
                    anvdVar.getClass();
                    anveVar.c = anvdVar;
                    anveVar.b = 1;
                    final anve anveVar2 = (anve) createBuilder.mo39build();
                    return aed.c(new agr() { // from class: sjd
                        @Override // defpackage.agr
                        public final Object a(agp agpVar) {
                            AssetDownloader assetDownloader = AssetDownloader.this;
                            String str = absolutePath;
                            anve anveVar3 = anveVar2;
                            Locale locale = d;
                            int i = sje.b;
                            String country = locale.getCountry();
                            String language = locale.getLanguage();
                            StringBuilder sb = new StringBuilder(String.valueOf(country).length() + 1 + String.valueOf(language).length());
                            sb.append(country);
                            sb.append(":");
                            sb.append(language);
                            RuntimeJni.a(assetDownloader, str, anveVar3, sb.toString(), siu.b(agpVar, sjc.c));
                            return "FaceViewerRuntime.create";
                        }
                    });
                }
            }, skrVar.b));
        }
        if (!this.d.isDone()) {
            this.d.lV(anii.h(((shx) skrVar.e.a()).c, new ampg() { // from class: sjo
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    EGLSurface eGLSurface;
                    sju sjuVar = sju.this;
                    Boolean bool = (Boolean) obj;
                    awwn a2 = awwo.a();
                    aoik aoikVar = sjuVar.f;
                    if (aoikVar.e == 0) {
                        EGLContext eglGetCurrentContext = aoikVar.a.eglGetCurrentContext();
                        EGLDisplay eglGetCurrentDisplay = aoikVar.a.eglGetCurrentDisplay();
                        EGLSurface eglGetCurrentSurface = aoikVar.a.eglGetCurrentSurface(12377);
                        EGLSurface eglGetCurrentSurface2 = aoikVar.a.eglGetCurrentSurface(12378);
                        if (eglGetCurrentContext != aoikVar.c) {
                            eGLSurface = aoikVar.d();
                            aoikVar.a(eGLSurface, eGLSurface);
                        } else {
                            eGLSurface = null;
                        }
                        aoikVar.e = Compat.getCurrentNativeEGLContext();
                        EGL14.eglGetCurrentContext();
                        if (eglGetCurrentContext != aoikVar.c) {
                            aoikVar.a.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                            aoikVar.c(eGLSurface);
                        }
                    }
                    a2.b(aoikVar.e);
                    final skj skjVar = new skj(a2.a());
                    skjVar.c(sjuVar.g.d);
                    skjVar.b(InputFrameSource.FRONT_CAMERA_NONMIRRORED, awxb.a);
                    final siq siqVar = sjuVar.h;
                    siqVar.f.b(new slc() { // from class: sih
                        @Override // defpackage.slc
                        public final ankt a() {
                            final siq siqVar2 = siq.this;
                            final aoic aoicVar = skjVar;
                            return anlz.t(new Runnable() { // from class: sin
                                @Override // java.lang.Runnable
                                public final void run() {
                                    siq siqVar3 = siq.this;
                                    aoic aoicVar2 = aoicVar;
                                    siqVar3.h = aoicVar2;
                                    aoia aoiaVar = siqVar3.i;
                                    if (aoiaVar != null) {
                                        aoiaVar.c(aoicVar2);
                                    }
                                }
                            }, siqVar2.g);
                        }
                    });
                    return skjVar;
                }
            }, skrVar.c));
        }
        skrVar.e.a.f(skt.PROTO_DOWNLOAD_AND_INIT);
        this.c.lV(anii.i(this.b, new anir() { // from class: sjr
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                skr skrVar2 = skr.this;
                final sje sjeVar = (sje) obj;
                amzy amzyVar = sju.a;
                final anvy anvyVar = skrVar2.a.a;
                return aed.c(new agr() { // from class: sjb
                    @Override // defpackage.agr
                    public final Object a(agp agpVar) {
                        sje sjeVar2 = sje.this;
                        anvy anvyVar2 = anvyVar;
                        RuntimeJni runtimeJni = sjeVar2.a;
                        runtimeJni.nativeMakeExperience(runtimeJni.a, anvyVar2.toByteArray(), NativeCallback.b(siu.b(agpVar, sjc.a), skp.a));
                        return "FaceViewerRuntime.makeExperience";
                    }
                });
            }
        }, this.i));
        this.c.qY(new Runnable() { // from class: sjl
            @Override // java.lang.Runnable
            public final void run() {
                skr skrVar2 = skr.this;
                amzy amzyVar = sju.a;
                skrVar2.e.a.e(skt.PROTO_DOWNLOAD_AND_INIT);
            }
        }, skrVar.c);
        sjk sjkVar = this.g;
        sjkVar.g = skrVar;
        anlz.A(skrVar.e.c().d(), new sjh(sjkVar.c), skrVar.c);
    }

    @Override // defpackage.skx
    public final ankt d() {
        return this.j.b(new sjm(this, 1));
    }

    @Override // defpackage.skx
    public final void e() {
        this.h.d();
    }
}
