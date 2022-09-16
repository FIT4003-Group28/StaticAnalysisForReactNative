package com.google.android.apps.youtube.app.extensions.lens;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.Surface;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenLensForFrameController implements f, ynl {
    public final azqb a;
    public final kjg b;
    public final Executor c;
    public final acrr d;
    public boolean f;
    abw g;
    private final Context j;
    private final afvn k;
    private final yni l;
    private final aafo m;
    private final boolean n;
    private aby o;
    private final jvo p;
    public ampq e = amon.a;
    public ampq h = amon.a;
    public int i = 1;

    public OpenLensForFrameController(aacz aaczVar, jvo jvoVar, Context context, afvn afvnVar, yni yniVar, azqb azqbVar, kjg kjgVar, aafo aafoVar, Executor executor, acrr acrrVar) {
        this.p = jvoVar;
        this.j = context;
        this.k = afvnVar;
        this.l = yniVar;
        this.a = azqbVar;
        this.b = kjgVar;
        this.m = aafoVar;
        this.c = executor;
        this.d = acrrVar;
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).cO;
        this.n = z;
        if (z) {
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, abx] */
    private final void k() {
        this.g = new abw() { // from class: gsd
            @Override // defpackage.abw
            public final void a(Object obj) {
                OpenLensForFrameController openLensForFrameController = OpenLensForFrameController.this;
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.a == -1) {
                    acrr acrrVar = openLensForFrameController.d;
                    arrf a = arrh.a();
                    asog a2 = asoh.a();
                    asoi asoiVar = asoi.LENS_LAUNCH_STATUS_SUCCESS;
                    a2.copyOnWrite();
                    ((asoh) a2.instance).f(asoiVar);
                    a.copyOnWrite();
                    ((arrh) a.instance).dq((asoh) a2.mo39build());
                    acrrVar.c((arrh) a.mo39build());
                    return;
                }
                String.valueOf(String.valueOf(activityResult)).length();
                openLensForFrameController.i(asoi.LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE);
            }
        };
        this.o = this.j.registerForActivityResult(new acj(), this.g);
    }

    public final void g() {
        ajah ajahVar = ((airr) this.a.get()).q.a;
        if (ajahVar == null || ajahVar.ah()) {
            zep.m("OpenLensForFrameCtrl", "Playback is stopped.");
            i(asoi.LENS_LAUNCH_STATUS_PLAYBACK_STOPPED);
            return;
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.p.get()).aT;
        if (youTubePlayerViewNotForReflection == null) {
            zep.m("OpenLensForFrameCtrl", "Unable to access player view.");
            i(asoi.LENS_LAUNCH_STATUS_NO_PLAYER_VIEW);
            return;
        }
        Surface A = youTubePlayerViewNotForReflection.c.A();
        if (A == null) {
            zep.m("OpenLensForFrameCtrl", "Unable to access media surface.");
            i(asoi.LENS_LAUNCH_STATUS_NO_PLAYER_SURFACE);
            return;
        }
        this.i = 3;
        int width = youTubePlayerViewNotForReflection.c.getWidth();
        int height = youTubePlayerViewNotForReflection.c.getHeight();
        if (Build.VERSION.SDK_INT < 24) {
            i(asoi.LENS_LAUNCH_STATUS_BAD_ANDROID_SDK_VERSION);
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        final HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        handlerThread.start();
        PixelCopy.request(A, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: gsc
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                final OpenLensForFrameController openLensForFrameController = OpenLensForFrameController.this;
                HandlerThread handlerThread2 = handlerThread;
                Bitmap bitmap = createBitmap;
                handlerThread2.quitSafely();
                if (i != 0) {
                    asog a = asoh.a();
                    asoi asoiVar = asoi.LENS_LAUNCH_STATUS_PIXELCOPY_FAILED;
                    a.copyOnWrite();
                    ((asoh) a.instance).f(asoiVar);
                    a.copyOnWrite();
                    ((asoh) a.instance).e(i);
                    openLensForFrameController.h((asoh) a.mo39build());
                    return;
                }
                final Bitmap copy = bitmap.copy(bitmap.getConfig(), false);
                bitmap.recycle();
                if (copy == null) {
                    zep.m("OpenLensForFrameCtrl", "Failed to convert Bitmap");
                    openLensForFrameController.i(asoi.LENS_LAUNCH_STATUS_BITMAP_COPY_FAILED);
                    return;
                }
                openLensForFrameController.e = ampq.j(new LensImage(copy));
                openLensForFrameController.c.execute(new Runnable() { // from class: gse
                    @Override // java.lang.Runnable
                    public final void run() {
                        OpenLensForFrameController openLensForFrameController2 = OpenLensForFrameController.this;
                        Bitmap bitmap2 = copy;
                        kjg kjgVar = openLensForFrameController2.b;
                        kjgVar.a = bitmap2;
                        kjgVar.X();
                    }
                });
                openLensForFrameController.j((LensImage) openLensForFrameController.e.c());
            }
        }, new Handler(handlerThread.getLooper()));
    }

    public final void h(asoh asohVar) {
        acrr acrrVar = this.d;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dq(asohVar);
        acrrVar.c((arrh) a.mo39build());
        if (!this.h.h() || (((atue) this.h.c()).c & 4) == 0) {
            return;
        }
        aafo aafoVar = this.m;
        apzg apzgVar = ((atue) this.h.c()).f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }

    public final void i(asoi asoiVar) {
        asog a = asoh.a();
        a.copyOnWrite();
        ((asoh) a.instance).f(asoiVar);
        h((asoh) a.mo39build());
    }

    public final void j(LensImage lensImage) {
        this.i = 4;
        ueq ueqVar = new ueq();
        ueqVar.a.putByteArray("lens_init_params", aogy.a.toByteArray());
        ueqVar.a.putLong("request_lens_time_nanos", SystemClock.elapsedRealtimeNanos());
        ueqVar.a.putLong("start_streaming_time_nanos", 0L);
        ueqVar.a.putInt("transition_type", 0);
        ueqVar.e(0);
        ueqVar.a.putInt("theme", 0);
        ueqVar.a.putLong("handover_session_id", 0L);
        ueqVar.f(false);
        ueqVar.a.putParcelable("postcapture_image", lensImage);
        if (this.h.h() && (((atue) this.h.c()).c & 2) != 0) {
            ueqVar.e(((atue) this.h.c()).e);
        }
        afvm c = this.k.c();
        if (c.g()) {
            ueqVar.f(true);
        } else if (c instanceof AccountIdentity) {
            ueqVar.a.putString("account_name", ((AccountIdentity) c).a());
        }
        aby abyVar = this.o;
        if (abyVar != null) {
            try {
                abyVar.b(tjw.d(ueqVar));
                return;
            } catch (ActivityNotFoundException unused) {
                zep.c("OpenLensForFrameCtrl", "Failed to resolve Lens Intent.");
                i(asoi.LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE);
                return;
            }
        }
        Context context = this.j;
        ueqVar.a.putBinder("lens_activity_binder", new tjo(context));
        Intent d = tjw.d(ueqVar);
        d.addFlags(268435456);
        d.addFlags(32768);
        context.startActivity(d);
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.l.g(this);
        if (this.f && this.h.h() && ((atue) this.h.c()).d) {
            this.f = false;
            ((airr) this.a.get()).b();
        }
        this.i = 1;
        this.h = amon.a;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahia ahiaVar = (ahia) obj;
                if (this.i != 2 || ahiaVar.a() != 3) {
                    if (!this.e.h()) {
                        return null;
                    }
                    if (ahiaVar.a() != 2 && ahiaVar.a() != 6) {
                        return null;
                    }
                    kjg kjgVar = this.b;
                    kjgVar.a = null;
                    kjgVar.X();
                    BinderBitmap binderBitmap = ((LensImage) this.e.c()).a;
                    (binderBitmap != null ? binderBitmap.a : null).recycle();
                    this.e = amon.a;
                    return null;
                }
                this.f = true;
                g();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahia.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (!this.n) {
            k();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.l.m(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
