package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gwp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gwp implements ayqb {
    public final /* synthetic */ gxk a;
    private final /* synthetic */ int b;

    public /* synthetic */ gwp(gxk gxkVar) {
        this.a = gxkVar;
    }

    public /* synthetic */ gwp(gxk gxkVar, int i) {
        this.b = i;
        this.a = gxkVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        gvi gviVar;
        if (this.b == 0) {
            gxk gxkVar = this.a;
            ampq ampqVar = (ampq) obj;
            if (ampqVar.h()) {
                String k = ((ShortsCreationSelectedTrack) ampqVar.c()).k();
                if (!k.equals(gxkVar.bf)) {
                    gxkVar.aK(k);
                }
                gxkVar.be = true;
                gxkVar.ai.b().o((ShortsCreationSelectedTrack) ampqVar.c());
                if (!((ShortsCreationSelectedTrack) ampqVar.c()).d().h()) {
                    return;
                }
                int min = Math.min(((Long) ((ShortsCreationSelectedTrack) ampqVar.c()).d().c()).intValue(), gxkVar.b);
                final gwj gwjVar = gxkVar.bd;
                if (min < gxkVar.aq.c) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(min);
                    gwjVar.d.a(actj.SHORTS_CREATION_CAMERA_RECORDING_DURATION_TOOLTIP).e();
                    gwjVar.b.animate().cancel();
                    final float dimension = gwjVar.a.getResources().getDimension(R.dimen.shorts_camera_recording_tooltip_margin_top);
                    gwjVar.b.setText(gwjVar.a.getResources().getString(R.string.shorts_recording_tooltip_time_x, Integer.valueOf((int) seconds)));
                    gwjVar.b.setTranslationY(-dimension);
                    gwjVar.b.setAlpha(0.0f);
                    gwjVar.b.setVisibility(0);
                    gwjVar.b.animate().translationY(0.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: gwg
                        @Override // java.lang.Runnable
                        public final void run() {
                            gwj.this.b.animate().translationY(-dimension).setStartDelay(5000L).setDuration(500L).start();
                        }
                    }).start();
                    gwjVar.b.animate().alpha(1.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: gwf
                        @Override // java.lang.Runnable
                        public final void run() {
                            gwj.this.b.animate().alpha(0.0f).setStartDelay(5000L).setDuration(500L).start();
                        }
                    }).start();
                }
                gxkVar.aL(min);
                return;
            }
            gxkVar.aK(null);
            gxkVar.be = false;
            gxkVar.ai.b().s();
            gxkVar.aL(gxkVar.b);
            return;
        }
        gxk gxkVar2 = this.a;
        hhn hhnVar = (hhn) ((hhp) obj);
        hhnVar.getClass();
        if (akzj.f(hhnVar, gxkVar2.ay)) {
            return;
        }
        if (gxkVar2.aW && (gviVar = gxkVar2.aF) != null) {
            gviVar.a.setOnClickListener(gviVar);
            gviVar.d = hhnVar;
            gviVar.d(true);
        }
        gxkVar2.ay = hhnVar;
        if (gxkVar2.aC != null) {
            if (gxkVar2.bg == null) {
                gxkVar2.bg = new gwv(gxkVar2);
            }
            hhnVar.h = new WeakReference(gxkVar2.bg);
            hhnVar.v();
            hhnVar.u();
        }
        gwk gwkVar = gxkVar2.az;
        if (gwkVar != null) {
            gwkVar.b = hhnVar;
        }
        gxs gxsVar = gxkVar2.ba;
        if (gxsVar != null) {
            gxsVar.q = hhnVar;
        }
        hhp b = gxkVar2.ai.b();
        if (!gxkVar2.aY || b == null || !b.c().h()) {
            return;
        }
        gxkVar2.al.m((axcw) b.c().c());
    }
}
