package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraFeatureDescriptionView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsPresetTracker;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.youtube.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gxk  reason: default package */
/* loaded from: classes3.dex */
public final class gxk extends gwe implements View.OnClickListener, gxu, acth, zlo, zln, hev {
    public static final long a = TimeUnit.DAYS.toSeconds(7);
    public CameraView aA;
    public ShortsRecordButtonView aB;
    public MultiSegmentCameraProgressIndicator aC;
    public YouTubeTextView aD;
    public YouTubeTextView aE;
    public gvi aF;
    public gyg aG;
    public int aH;
    public ShortsZoomSlider aI;
    public View aJ;
    public gxz aK;
    public gyi aL;
    public View aM;
    public ImageView aN;
    View aO;
    View aP;
    public gyx aQ;
    public CameraFocusOverlay aR;
    public View aS;
    public ImageView aT;
    public boolean aW;
    public apzg aX;
    public boolean aY;
    public boolean aZ;
    public acti ae;
    public axnm af;
    public hkl ag;
    public gfu ah;
    public hhl ai;
    public hew aj;
    public hef ak;
    public hfn al;
    public hhc am;
    public hgi an;
    public hkg ao;
    public aafo ap;
    public hho aq;
    public hdq ar;
    public Executor as;
    public Executor at;
    public hfy au;
    public hfv av;
    public Context aw;
    public gyq ax;
    public hhn ay;
    public gwk az;
    int b;
    private ShortsCameraFeatureDescriptionView bA;
    private View bB;
    private View bC;
    private FrameLayout bD;
    private ImageView bE;
    private View bF;
    private View bG;
    private YouTubeTextView bH;
    private View bI;
    private View bJ;
    private int bK;
    private boolean bL;
    private gvt bM;
    private FrameLayout bN;
    private gxi bO;
    private boolean bP;
    private boolean bQ;
    private String bR;
    private boolean bS;
    private boolean bT;
    private boolean bU;
    private boolean bV;
    private boolean bW;
    private hdi bX;
    private gyh bY;
    public gxs ba;
    public gwm bb;
    public FrameLayout bc;
    public gwj bd;
    public boolean be;
    String bf;
    public hhm bg;
    public gyn bi;
    public vne bj;
    private boolean bk;
    private int bl;
    private View bn;
    private EditorButtonView bo;
    private EditorButtonView bp;
    private EditorButtonView bq;
    private SegmentedControl br;
    private gxx bs;
    private EditorButtonView bt;
    private EditorButtonView bu;
    private EditorButtonView bv;
    private EditorButtonView bw;
    private ChooseFilterView bx;
    private hlq by;
    private TextView bz;
    public int c;
    private hgh ca;
    private Button cb;
    private zmv cc;
    private hha cd;
    private zlz ce;
    private gwy cf;
    private gws cg;
    private gxd ch;
    private gxa ci;
    private gxe cj;
    private gxc ck;
    private gwt cl;
    private gwu cm;
    public int d;
    public gxh e;
    private final zrp bm = zsc.j();
    public boolean aU = false;
    public int aV = -1;
    private final aypf bZ = new aypf();
    public int bh = 0;

    public static gxk aW(boolean z, apzg apzgVar) {
        aqxo.q(true, "startCameraSelection must be one of @StartCameraSelection values");
        gxk gxkVar = new gxk();
        Bundle bundle = new Bundle();
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", 0);
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        bundle.putBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY", z);
        gxkVar.ae(bundle);
        return gxkVar;
    }

    private final zlz aX() {
        if (this.ce == null) {
            this.ce = new gxb(this);
        }
        return this.ce;
    }

    private final void aY(boolean z) {
        gyn gynVar = this.bi;
        gynVar.d = gynVar.a.b(asny.LATENCY_ACTION_SHORTS_EDIT);
        hhn hhnVar = this.ay;
        if (hhnVar == null) {
            zep.b("Null project state when transitioning to editor - cannot create composed video");
        } else if (this.e == null) {
            zep.b("Null listener can't receive composed video");
        } else {
            ampq d = hhnVar.d();
            if (!d.h()) {
                return;
            }
            gxh gxhVar = this.e;
            ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata) d.c();
            hes hesVar = (hes) gxhVar;
            hesVar.mJ().getWindow().clearFlags(128);
            int i = 1;
            if (true == z) {
                i = 2;
            }
            hesVar.aF(i);
            aJ();
        }
    }

    private final void aZ() {
        hew hewVar;
        File j;
        hhn hhnVar = this.ay;
        if (hhnVar != null && (j = hhnVar.j()) != null) {
            if (j.exists()) {
                j.delete();
            }
            hhnVar.g = null;
        }
        if (this.aY && (hewVar = this.aj) != null) {
            hewVar.b();
            if (hewVar.d) {
                hewVar.d();
            }
        }
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.aC;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.d(0);
            this.aC.c();
        }
    }

    private final void ba() {
        this.aM.setVisibility(4);
        this.bC.setVisibility(4);
        this.bB.setVisibility(4);
        this.aB.setVisibility(4);
        this.aB.setContentDescription(null);
        this.bD.setVisibility(4);
        if (this.aY) {
            this.bI.setVisibility(8);
        }
        this.bs.c();
        ShortsZoomSlider shortsZoomSlider = this.aI;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.c(false);
            this.aI.b();
        }
        this.bF.setVisibility(4);
    }

    private final void bb() {
        this.aB.setVisibility(0);
        this.aB.c();
        this.bD.setVisibility(0);
        this.az.b(true);
        if (this.aY) {
            this.bI.setVisibility(0);
        }
        ShortsZoomSlider shortsZoomSlider = this.aI;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.c(zdg.e(rb()));
        }
    }

    private final void bc(boolean z) {
        boolean I = this.aA.I();
        boolean e = gyq.e(this.bD, I);
        gyy.b(this.bD, I);
        if (!e || !z) {
            return;
        }
        gyo b = this.ax.b(acuo.b(96641));
        b.h(I);
        b.g();
    }

    private final gwu bd() {
        if (this.cm == null) {
            this.cm = new gwu(this);
        }
        return this.cm;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.aQ.b();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.aC;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.c();
        }
        if (this.aA.H()) {
            aS(1);
            gxh gxhVar = this.e;
            if (gxhVar != null) {
                ((hes) gxhVar).mJ().getWindow().clearFlags(128);
            }
            aT();
        }
        gyg gygVar = this.aG;
        if (gygVar != null) {
            gygVar.j(false);
        }
        ShortsZoomSlider shortsZoomSlider = this.aI;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.b();
        }
        this.aA.A();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (!aV()) {
            aP(true);
        } else {
            aP(false);
        }
        if (zwn.e(mJ(), 1)) {
            int i = this.bl;
            if (i == 0) {
                this.aA.x();
            } else if (i == 1) {
                this.aA.y(1);
            } else if (i == 2) {
                this.aA.y(0);
            } else {
                throw new AssertionError(i);
            }
            this.bl = 0;
            Bundle bundle = this.m;
            if (bundle != null) {
                bundle.putInt("START_CAMERA_SELECTION", 0);
            }
            aE();
            gxi gxiVar = new gxi(this);
            this.bO = gxiVar;
            gxiVar.execute(new Void[0]);
        }
        ShortsRecordButtonView shortsRecordButtonView = this.aB;
        Animator animator = shortsRecordButtonView.b;
        if (animator != null && animator.isRunning()) {
            shortsRecordButtonView.b.cancel();
        }
        shortsRecordButtonView.o = false;
        shortsRecordButtonView.m = false;
        shortsRecordButtonView.p = false;
        shortsRecordButtonView.j.setCornerRadius(shortsRecordButtonView.e);
        shortsRecordButtonView.g.setScaleX(1.0f);
        shortsRecordButtonView.g.setScaleY(1.0f);
        shortsRecordButtonView.g.setTranslationX(0.0f);
        shortsRecordButtonView.g.setTranslationY(0.0f);
        shortsRecordButtonView.h.setScaleX(1.0f);
        shortsRecordButtonView.h.setScaleY(1.0f);
        shortsRecordButtonView.h.setTranslationX(0.0f);
        shortsRecordButtonView.h.setTranslationY(0.0f);
        shortsRecordButtonView.d(shortsRecordButtonView.c, shortsRecordButtonView.k);
        if (this.ck == null) {
            this.ck = new gxc(this);
        }
        gxc gxcVar = this.ck;
        gyq gyqVar = this.ax;
        ShortsRecordButtonView shortsRecordButtonView2 = this.aB;
        auuw auuwVar = this.ag.a.a().z;
        if (auuwVar == null) {
            auuwVar = auuw.a;
        }
        gxz gxzVar = new gxz(gxcVar, gyqVar, shortsRecordButtonView2, auuwVar.d);
        this.aK = gxzVar;
        this.aB.setOnTouchListener(gxzVar.a);
        this.aK.d = true;
        ShortsZoomSlider shortsZoomSlider = this.aI;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.c(zdg.e(rb()));
        }
        gyn gynVar = this.bi;
        acvg acvgVar = gynVar.b;
        if (acvgVar != null) {
            acvgVar.c("aft");
            gynVar.b = null;
            gynVar.e = null;
        }
        this.aA.postDelayed(new gwq(this, 2), 1000L);
    }

    public final void aE() {
        gxi gxiVar = this.bO;
        if (gxiVar == null || gxiVar.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.bO.cancel(true);
        this.bO = null;
    }

    public final void aF() {
        if (!this.bb.I()) {
            hhn hhnVar = this.ay;
            if (hhnVar == null || !hhnVar.x()) {
                this.ai.e();
                bd().a(false);
                return;
            }
            this.bb.G();
        }
    }

    public final void aG() {
        ba();
        this.aO.setVisibility(4);
    }

    public final void aH() {
        this.aO.setEnabled(false);
        gyy.d(this.bn);
        this.az.b(false);
    }

    public final void aJ() {
        this.ax.c(acuo.a(96639)).a();
        this.aU = false;
        this.az.c = false;
    }

    public final void aK(String str) {
        hhn hhnVar = this.ay;
        if (hhnVar != null) {
            hhnVar.m();
            this.bf = str;
        }
    }

    public final void aL(int i) {
        hhn hhnVar = this.ay;
        if (hhnVar != null) {
            synchronized (hhnVar.b) {
                hhnVar.j = i;
                hhnVar.u();
                hhnVar.t();
            }
        }
    }

    @Override // defpackage.zlo
    public final void aM(znb znbVar, int i) {
        ShortsZoomSlider shortsZoomSlider = this.aI;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.d(false);
        }
        if (i == 0) {
            if (this.aY) {
                this.aj.b();
            }
            zna.h(this.aB, R.string.shorts_a11y_recording_ended);
            try {
            } catch (IllegalStateException e) {
                afus.c(2, 6, "[ShortsCreation][Android][Camera]Could not commit segment", e);
                aZ();
            }
            if (znbVar != null) {
                hhn hhnVar = this.ay;
                if (hhnVar != null) {
                    if (hhnVar.j() != null) {
                        hhn hhnVar2 = this.ay;
                        aopa createBuilder = avxf.a.createBuilder();
                        aopa createBuilder2 = avxi.a.createBuilder();
                        float f = znbVar.d;
                        createBuilder2.copyOnWrite();
                        avxi avxiVar = (avxi) createBuilder2.instance;
                        avxiVar.b |= 1;
                        avxiVar.c = f;
                        createBuilder.copyOnWrite();
                        avxf avxfVar = (avxf) createBuilder.instance;
                        avxi avxiVar2 = (avxi) createBuilder2.mo39build();
                        avxiVar2.getClass();
                        avxfVar.c = avxiVar2;
                        avxfVar.b |= 1;
                        if (this.aH != -1) {
                            aopa createBuilder3 = avxg.a.createBuilder();
                            aooo b = aost.b(this.aH);
                            createBuilder3.copyOnWrite();
                            avxg avxgVar = (avxg) createBuilder3.instance;
                            b.getClass();
                            avxgVar.c = b;
                            avxgVar.b |= 1;
                            createBuilder.copyOnWrite();
                            avxf avxfVar2 = (avxf) createBuilder.instance;
                            avxg avxgVar2 = (avxg) createBuilder3.mo39build();
                            avxgVar2.getClass();
                            avxfVar2.d = avxgVar2;
                            avxfVar2.b |= 2;
                        }
                        boolean z = this.bW;
                        createBuilder.copyOnWrite();
                        avxf avxfVar3 = (avxf) createBuilder.instance;
                        avxfVar3.b |= 4;
                        avxfVar3.e = z;
                        avxf avxfVar4 = (avxf) createBuilder.mo39build();
                        aqsv b2 = hhw.b(this.bm.g(), this.bX);
                        boolean z2 = this.aW;
                        hhnVar2.g.getClass();
                        synchronized (hhnVar2.b) {
                            hhnVar2.z();
                            aopa createBuilder4 = axda.a.createBuilder();
                            File file = hhnVar2.g;
                            if (file != null) {
                                String file2 = file.toString();
                                createBuilder4.copyOnWrite();
                                axda axdaVar = (axda) createBuilder4.instance;
                                file2.getClass();
                                axdaVar.b |= 1;
                                axdaVar.e = file2;
                            }
                            aopa createBuilder5 = axcz.a.createBuilder();
                            createBuilder5.copyOnWrite();
                            axcz axczVar = (axcz) createBuilder5.instance;
                            axczVar.b |= 1;
                            axczVar.c = 0;
                            int i2 = (int) znbVar.c;
                            createBuilder5.copyOnWrite();
                            axcz axczVar2 = (axcz) createBuilder5.instance;
                            axczVar2.b |= 2;
                            axczVar2.d = i2;
                            axcz axczVar3 = (axcz) createBuilder5.mo39build();
                            createBuilder4.copyOnWrite();
                            axda axdaVar2 = (axda) createBuilder4.instance;
                            axczVar3.getClass();
                            axdaVar2.f = axczVar3;
                            axdaVar2.b |= 2;
                            if (z2) {
                                int size = hhnVar2.d.size();
                                StringBuilder sb = new StringBuilder(30);
                                sb.append("align_overlay_image");
                                sb.append(size);
                                String sb2 = sb.toString();
                                createBuilder4.copyOnWrite();
                                axda axdaVar3 = (axda) createBuilder4.instance;
                                sb2.getClass();
                                axdaVar3.b |= 16;
                                axdaVar3.h = sb2;
                            }
                            if (avxfVar4 != null) {
                                createBuilder4.copyOnWrite();
                                axda axdaVar4 = (axda) createBuilder4.instance;
                                axdaVar4.d = avxfVar4;
                                axdaVar4.c = 3;
                            }
                            if (b2 != null) {
                                createBuilder4.copyOnWrite();
                                axda axdaVar5 = (axda) createBuilder4.instance;
                                axdaVar5.g = b2;
                                axdaVar5.b |= 8;
                            }
                            hhnVar2.d.add((axda) createBuilder4.mo39build());
                            hhnVar2.g = null;
                            hhnVar2.t();
                            hhnVar2.v();
                        }
                        this.aB.f();
                        this.aK.c = false;
                        if (this.aq.c()) {
                            aT();
                            return;
                        } else {
                            aY(true);
                            return;
                        }
                    }
                    throw new IllegalStateException("Capture completed with no pending segment");
                }
                throw new IllegalStateException("Capture completed with null Project State");
            }
            throw new IllegalStateException("Capture completed with null VideoMetadata");
        }
        aZ();
    }

    public final void aN() {
        bb();
        this.aO.setVisibility(0);
    }

    public final void aO(int i) {
        this.aC.e(i);
        this.aG.o.setMax(i);
        this.aq.c = i;
        EditorButtonView editorButtonView = this.bp;
        if (editorButtonView != null) {
            if (i == this.b) {
                editorButtonView.a(R.drawable.ic_15s);
                this.bp.setContentDescription(this.aw.getString(R.string.shorts_a11y_record_15s));
            } else if (i == this.d) {
                editorButtonView.a(R.drawable.ic_60s);
                this.bp.setContentDescription(this.aw.getString(R.string.shorts_a11y_record_60s));
            }
        }
        aU();
    }

    public final void aP(boolean z) {
        if (!ar()) {
            return;
        }
        if (z) {
            this.bc.setVisibility(0);
            gyo b = this.ax.b(acuo.b(107535));
            b.h(true);
            b.a();
            ba();
            return;
        }
        this.bc.setVisibility(8);
        bb();
    }

    public final void aQ(final int i, boolean z) {
        if (this.aA.G() && this.bh == 0 && this.aV == -1) {
            if (!this.aq.c()) {
                aY(true);
            } else if (!zna.j()) {
                zna.i(mJ(), R.string.reel_camera_no_external_storage);
            } else if (zna.d() < 5242880) {
                zna.i(mJ(), R.string.reel_camera_out_of_space);
            } else {
                ShortsRecordButtonView shortsRecordButtonView = this.aB;
                boolean z2 = false;
                shortsRecordButtonView.n = false;
                shortsRecordButtonView.o = false;
                shortsRecordButtonView.m = false;
                Animator animator = shortsRecordButtonView.b;
                if (animator != null && animator.isRunning()) {
                    shortsRecordButtonView.b.end();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shortsRecordButtonView.h, "scaleX", 1.0f, 1.1412036f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shortsRecordButtonView.h, "scaleY", 1.0f, 1.1412036f);
                ofFloat2.setDuration(100L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shortsRecordButtonView.g, "scaleX", 1.0f, 0.9f);
                ofFloat3.setDuration(100L);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(shortsRecordButtonView.g, "scaleY", 1.0f, 0.9f);
                ofFloat4.setDuration(100L);
                ofFloat4.setInterpolator(new LinearInterpolator());
                ofFloat2.addUpdateListener(new hpo(shortsRecordButtonView, shortsRecordButtonView.k, shortsRecordButtonView.l));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                shortsRecordButtonView.b = animatorSet;
                shortsRecordButtonView.b.addListener(new hpn(shortsRecordButtonView));
                shortsRecordButtonView.b.start();
                if (z) {
                    this.aK.c = true;
                    this.aB.e();
                } else {
                    this.aH = -1;
                }
                gvi gviVar = this.aF;
                if (gviVar != null && gviVar.b.getVisibility() == 0 && gviVar.b.getDrawable() != null) {
                    z2 = true;
                }
                this.bW = z2;
                if (this.aA.L()) {
                    this.aA.postDelayed(new Runnable() { // from class: gwr
                        @Override // java.lang.Runnable
                        public final void run() {
                            gxk.this.aR(i);
                        }
                    }, ((znf) this.af.get()).a());
                } else {
                    aR(i);
                }
                this.bh = 1;
            }
        }
    }

    public final void aR(int i) {
        gxw a2;
        if (!hqs.i(this)) {
            return;
        }
        hhn hhnVar = this.ay;
        File file = null;
        if (hhnVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            File k = hhnVar.k();
            if (!k.exists()) {
                k.mkdirs();
            }
            if (!k.isDirectory() || !k.canWrite()) {
                String valueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Output directory not accessible: ");
                sb.append(valueOf);
                zep.b(sb.toString());
            } else {
                try {
                    file = new File(String.valueOf(zna.f(currentTimeMillis)).concat(".mp4"));
                } catch (Exception unused) {
                }
            }
            hhnVar.g = file;
            file = hhnVar.j();
        }
        if (file == null) {
            zna.i(mJ(), R.string.reel_camera_no_external_storage);
            return;
        }
        gxh gxhVar = this.e;
        if (gxhVar != null) {
            ((hes) gxhVar).mJ().getWindow().addFlags(128);
        }
        gxx gxxVar = this.bs;
        if (gxxVar != null && (a2 = gxxVar.a()) != null) {
            CameraView cameraView = this.aA;
            float f = a2.a;
            synchronized (cameraView.h) {
                zlp zlpVar = cameraView.g;
                if (zlpVar == null) {
                    zep.b("Recorder not setup yet.");
                } else {
                    zlpVar.v = f;
                }
            }
            if (this.aY) {
                this.aj.e(1.0f / a2.a);
            }
        }
        this.aA.N(new zkz(file), (360 - this.bK) % 360, this.aq.b(), i, this);
    }

    public final void aS(int i) {
        if (this.aA.H()) {
            this.aA.B(i);
        } else {
            this.aV = i;
        }
    }

    public final void aT() {
        EditorButtonView editorButtonView;
        this.aO.setEnabled(true);
        gyy.c(this.bn);
        this.az.b(true);
        if (this.aZ && (editorButtonView = this.bo) != null) {
            editorButtonView.setVisibility(0);
        }
        if (this.aY) {
            this.bG.setVisibility(0);
        }
        this.bh = 0;
        bc(true);
        aX().mm();
    }

    public final void aU() {
        EditorButtonView editorButtonView;
        boolean c = this.aq.c();
        this.bD.setEnabled(c);
        this.bE.setEnabled(c);
        if (this.aZ && (editorButtonView = this.bo) != null) {
            editorButtonView.setEnabled(c);
        }
        this.bq.setEnabled(c);
        if (this.aY) {
            this.bG.setEnabled(c);
            this.bu.setEnabled(c);
        }
        this.bt.setEnabled(c);
        if (this.aY) {
            hho hhoVar = this.aq;
            if (hhoVar.d > 0) {
                this.bu.setEnabled(false);
                this.ca.e(false);
            } else {
                this.bu.setEnabled(hhoVar.c >= this.b);
                this.ca.e(true);
            }
        }
        gwj gwjVar = this.bd;
        boolean z = this.be;
        int i = this.aq.d;
        int i2 = this.c;
        EditorButtonView editorButtonView2 = gwjVar.c;
        if (editorButtonView2 == null) {
            return;
        }
        if (z || i > i2) {
            editorButtonView2.setVisibility(8);
        } else {
            editorButtonView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aV() {
        return zwn.e(mJ(), 1) && zwn.e(mJ(), 2);
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return this.aX;
    }

    @Override // defpackage.actq
    protected final asjj kx() {
        return null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.bV = this.ag.j();
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.bk = bundle2.getBoolean("MIRROR_FRONT_CAMERA");
            this.bl = bundle2.getInt("START_CAMERA_SELECTION");
            this.bL = bundle2.getBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY");
            byte[] byteArray = bundle2.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.aX = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
                } catch (aopx unused) {
                }
            }
        }
        hef hefVar = this.ak;
        zrp zrpVar = this.bm;
        zsc zscVar = (zsc) zrpVar;
        if (zscVar.a == null && zscVar.b == null) {
            zrpVar.i(hefVar.a);
            zscVar.y = hefVar.g;
        }
        int a2 = this.ag.a();
        this.b = a2;
        this.c = a2 + 500;
        auuw auuwVar = this.ag.a.a().z;
        if (auuwVar == null) {
            auuwVar = auuw.a;
        }
        int i = auuwVar.q;
        if (i <= 0) {
            i = 60000;
        }
        this.d = i;
        this.ax = new gyq(this.ae);
    }

    @Override // defpackage.dp
    public final void mR() {
        hgh hghVar = this.ca;
        if (hghVar != null) {
            hghVar.d();
        }
        hfn hfnVar = this.al;
        if (hfnVar != null) {
            hfnVar.h = null;
            hew hewVar = hfnVar.c;
            pjx pjxVar = hfnVar.e;
            pkl pklVar = hewVar.j;
            if (pklVar != null) {
                pklVar.B(pjxVar);
            }
        }
        if (this.aY) {
            this.am.r();
            hew hewVar2 = this.aj;
            hewVar2.j.B(hewVar2.b);
            pkl pklVar2 = hewVar2.j;
            pklVar2.f.G(hewVar2.c);
            hewVar2.j.w();
            hewVar2.e = false;
            hewVar2.d = false;
        }
        this.bZ.qr();
        super.mR();
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        EditorButtonView editorButtonView;
        super.mc(layoutInflater, viewGroup, bundle);
        auuw auuwVar = this.ag.a.a().z;
        if (auuwVar == null) {
            auuwVar = auuw.a;
        }
        this.aY = auuwVar.b;
        auuw auuwVar2 = this.ag.a.a().z;
        if (auuwVar2 == null) {
            auuwVar2 = auuw.a;
        }
        this.bP = auuwVar2.e;
        auuw auuwVar3 = this.ag.a.a().z;
        if (auuwVar3 == null) {
            auuwVar3 = auuw.a;
        }
        this.bT = auuwVar3.l;
        auuw auuwVar4 = this.ag.a.a().z;
        if (auuwVar4 == null) {
            auuwVar4 = auuw.a;
        }
        this.bS = auuwVar4.p;
        this.aZ = this.ag.n();
        this.bQ = ((Boolean) this.ag.b.a.a.V(axwv.c).B().aw()).booleanValue();
        this.bR = (String) this.ag.b.a.a.V(ajcg.t).B().aw();
        auuw auuwVar5 = this.ag.a.a().z;
        if (auuwVar5 == null) {
            auuwVar5 = auuw.a;
        }
        this.aW = auuwVar5.c;
        this.bU = ((Boolean) this.ag.b.a.a.V(ajcg.u).B().aw()).booleanValue();
        if (bundle != null) {
            this.bf = bundle.getString("CURRENT_MUSIC_ID_KEY");
        }
        ViewGroup viewGroup2 = this.bQ ? (ViewGroup) layoutInflater.inflate(R.layout.shorts_camera_fragment_v4, viewGroup, false) : (ViewGroup) layoutInflater.inflate(R.layout.shorts_camera_fragment_v2, viewGroup, false);
        this.aw = new ContextThemeWrapper(rb(), this.ah.a() == gfs.DARK ? 2132083446 : 2132083447);
        dt mJ = mJ();
        this.bK = zna.c(mJ);
        this.aR = (CameraFocusOverlay) viewGroup2.findViewById(R.id.reel_camera_focus_overlay);
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.reel_camera_view);
        this.aA = cameraView;
        cameraView.j(aX());
        CameraView cameraView2 = this.aA;
        if (this.cc == null) {
            this.cc = new gwx(this);
        }
        cameraView2.setOnTouchListener(new hpd(mJ, this.cc, this.aA));
        CameraView cameraView3 = this.aA;
        cameraView3.t = true;
        cameraView3.s = this.bk;
        cameraView3.v(5);
        this.aA.r(this.bK);
        CameraView cameraView4 = this.aA;
        cameraView4.v = true;
        if (this.cf == null) {
            this.cf = new gwy(this);
        }
        cameraView4.y = this.cf;
        CameraView cameraView5 = this.aA;
        cameraView5.n = this;
        if (this.cj == null) {
            this.cj = new gxe(this);
        }
        cameraView5.z = this.cj;
        this.aA.w = this.bU;
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.camera_permissions_container);
        this.bc = frameLayout;
        this.cb = (Button) frameLayout.findViewById(R.id.camera_allow_access_button);
        View findViewById = this.bc.findViewById(R.id.shorts_camera_permissions_close_button);
        this.aP = findViewById;
        findViewById.setOnClickListener(this);
        this.bz = (TextView) viewGroup2.findViewById(R.id.swipe_effect_text_view);
        this.bA = (ShortsCameraFeatureDescriptionView) viewGroup2.findViewById(R.id.shorts_camera_feature_description_view);
        this.bn = viewGroup2.findViewById(R.id.fadeable_view_container);
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = (MultiSegmentCameraProgressIndicator) viewGroup2.findViewById(R.id.progress_indicator);
        this.aC = multiSegmentCameraProgressIndicator;
        multiSegmentCameraProgressIndicator.e(this.aq.c);
        this.aB = (ShortsRecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        this.bG = viewGroup2.findViewById(R.id.shorts_camera_music_button);
        this.bH = (YouTubeTextView) viewGroup2.findViewById(R.id.camera_recording_tooltip);
        this.bI = viewGroup2.findViewById(R.id.shorts_camera_music_button_layout);
        this.aS = viewGroup2.findViewById(R.id.camera_scrim_overlay);
        this.aT = (ImageView) viewGroup2.findViewById(R.id.camera_align_overlay);
        this.bv = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_align_button);
        View findViewById2 = viewGroup2.findViewById(R.id.loading_spinner_container);
        this.bJ = findViewById2;
        findViewById2.setOnTouchListener(gia.a);
        this.aQ = new gyx(this.bJ);
        this.bF = viewGroup2.findViewById(R.id.shorts_camera_toolbar);
        this.bt = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_timer_button);
        View findViewById3 = viewGroup2.findViewById(R.id.shorts_countdown_timer_container);
        Context context = this.aw;
        EditorButtonView editorButtonView2 = this.bt;
        gyq gyqVar = this.ax;
        if (this.ci == null) {
            this.ci = new gxa(this);
        }
        this.aG = new gyg(context, mJ, editorButtonView2, findViewById3, gyqVar, this.ci, this.aq, this.aj, this.al, this.ag, this.aY);
        this.bq = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_speed_button);
        this.br = (SegmentedControl) viewGroup2.findViewById(R.id.reel_camera_speed_control);
        this.aE = (YouTubeTextView) viewGroup2.findViewById(R.id.shorts_camera_speed_text);
        gxx gxxVar = new gxx(mJ, this.bq, this.br, this.ax);
        this.bs = gxxVar;
        gxxVar.c = this;
        this.aq.e = gxxVar.b;
        if (this.aW) {
            gvi gviVar = new gvi(mJ, this.bv, this.aT, this.at, this.as, this.ax, !this.bQ);
            this.aF = gviVar;
            if (bundle != null) {
                gviVar.a(bundle.getBoolean("ALIGN_MODE_ACTIVED_KEY"));
            }
        }
        if (this.bP) {
            ShortsZoomSlider shortsZoomSlider = (ShortsZoomSlider) viewGroup2.findViewById(R.id.shorts_zoom_slider);
            this.aI = shortsZoomSlider;
            if (this.ch == null) {
                this.ch = new gxd(this);
            }
            shortsZoomSlider.g = this.ch;
            this.aI.f = this.ax;
        }
        if (this.bT) {
            gyh gyhVar = new gyh(this.aw, mJ.getSupportFragmentManager(), this.ax);
            this.bY = gyhVar;
            if (this.cg == null) {
                this.cg = new gws(this);
            }
            gyhVar.a = this.cg;
        }
        View findViewById4 = viewGroup2.findViewById(R.id.shorts_camera_undo_button_delegate);
        this.bB = findViewById4;
        findViewById4.setOnClickListener(this);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.shorts_flip_button);
        this.bD = frameLayout2;
        this.bE = ((EditorButtonView) frameLayout2).b;
        this.aL = new gyi(mJ, this.aA, frameLayout2, this.ae);
        this.aM = viewGroup2.findViewById(R.id.reel_camera_gallery_button_delegate);
        this.aN = (ImageView) viewGroup2.findViewById(R.id.reel_camera_gallery_button);
        this.bC = viewGroup2.findViewById(R.id.shorts_camera_next_button_delegate);
        this.aJ = viewGroup2.findViewById(R.id.shorts_camera_redo_button_delegate);
        bc(false);
        this.aM.setOnClickListener(this);
        this.bC.setOnClickListener(this);
        this.aJ.setOnClickListener(this);
        this.az = new gwk(this.ay, this.aq, this.bT, this.ax, this.bF, this.bB, this.bC, this.aM);
        View findViewById5 = viewGroup2.findViewById(R.id.shorts_camera_close_button);
        this.aO = findViewById5;
        findViewById5.setOnClickListener(this);
        new gxg().execute(this);
        this.bN = (FrameLayout) viewGroup2.findViewById(R.id.reel_camera_view_container);
        if (this.aZ || this.bS) {
            this.aA.R();
            this.aA.t(this.bm);
            this.aA.f = this.bV;
        }
        if (this.aZ) {
            this.bo = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_preset_filter_button);
            zsj k = ((zsc) this.bm).k(avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
            ChooseFilterView chooseFilterView = (ChooseFilterView) LayoutInflater.from(this.aw).inflate(R.layout.choose_preset_bottom_sheet_layout, (ViewGroup) null);
            this.bx = chooseFilterView;
            chooseFilterView.f(k, this);
            hlq hlqVar = new hlq(this.bo, this.ae, null);
            this.by = hlqVar;
            this.bx.n(hlqVar);
            ChooseFilterView chooseFilterView2 = this.bx;
            acti actiVar = this.ae;
            chooseFilterView2.m(actiVar, new zwm(actiVar));
            final ShortsPresetTracker shortsPresetTracker = new ShortsPresetTracker(this, k, this.bj);
            this.X.c(shortsPresetTracker);
            k.b(new zsd() { // from class: hdt
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    ShortsPresetTracker.this.l((zno) obj);
                }
            });
            k.a(new zrm() { // from class: hds
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    ShortsPresetTracker.this.j((FilterMapTable$FilterDescriptor) obj);
                }
            });
            hdq hdqVar = this.ar;
            EditorButtonView editorButtonView3 = this.bo;
            actj actjVar = actj.SHORTS_CREATION_FILTERS_BUTTON;
            CameraView cameraView6 = this.aA;
            ChooseFilterView chooseFilterView3 = this.bx;
            TextView textView = this.bz;
            gyq gyqVar2 = this.ax;
            ArrayList arrayList = new ArrayList(Arrays.asList(this.bn, this.aC, this.aB));
            Context context2 = this.aw;
            hdqVar.f = (ShortsIntensitySliderView) LayoutInflater.from(context2).inflate(R.layout.shorts_intensity_slider_view, (ViewGroup) null);
            hdqVar.a(cameraView6, chooseFilterView3, textView, gyqVar2, arrayList, context2);
            hdqVar.c = editorButtonView3;
            hdqVar.d = actjVar;
            EditorButtonView editorButtonView4 = hdqVar.c;
            if (editorButtonView4 != null) {
                editorButtonView4.setOnClickListener(hdqVar);
            }
            k.a(new hdm(hdqVar));
            hdqVar.k = k;
            hdqVar.i = actj.SHORTS_CREATION_CAMERA_FILTER_BUTTON;
            k.a(new hdm(hdqVar, 1));
            this.bw = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_green_screen_button);
            this.bX = new hdi();
            CamcorderProfile h = this.aA.h(true);
            if (h != null) {
                this.ba = new gxs(new ArrayList(Arrays.asList(this.bn, this.aC, this.aB)), this.bw, Math.min(h.videoFrameWidth, h.videoFrameHeight), Math.max(h.videoFrameWidth, h.videoFrameHeight), this.ax, !this.bQ, this.aw, mJ, this.bX, this.at, this.as);
                final hdi hdiVar = this.bX;
                vne vneVar = this.bj;
                hdiVar.b("");
                k.a(new zrm() { // from class: hde
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        hdi hdiVar2 = hdi.this;
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
                        if (filterMapTable$FilterDescriptor == null) {
                            return;
                        }
                        hdiVar2.f = filterMapTable$FilterDescriptor;
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = hdiVar2.f;
                        if (filterMapTable$FilterDescriptor2.b) {
                            synchronized (filterMapTable$FilterDescriptor2.f) {
                                filterMapTable$FilterDescriptor2.f.add(hdiVar2);
                            }
                            return;
                        }
                        hdiVar2.a();
                    }
                });
                hdiVar.j = vneVar;
                vne vneVar2 = hdiVar.j;
                if (vneVar2 != null) {
                    ylx.n(mJ, vneVar2.a(), etg.m, new zdt() { // from class: hdd
                        @Override // defpackage.zdt
                        public final void a(Object obj) {
                            hdi hdiVar2 = hdi.this;
                            hwp hwpVar = (hwp) obj;
                            if (hwpVar != null) {
                                hdiVar2.b = hwpVar.q;
                                hdiVar2.i = true;
                                hdiVar2.h();
                                hdiVar2.c();
                                hdg hdgVar = hdiVar2.h;
                                if (hdgVar == null) {
                                    return;
                                }
                                hdgVar.a(hdiVar2.b);
                            }
                        }
                    });
                }
                gxs gxsVar = this.ba;
                if (this.cl == null) {
                    this.cl = new gwt(this);
                }
                gxsVar.t = this.cl;
            }
            EditorButtonView editorButtonView5 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_retouch_button);
            EditorButtonView editorButtonView6 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_top_relight_button);
            EditorButtonView editorButtonView7 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_bottom_relight_button);
            if (editorButtonView6 != null && editorButtonView7 != null && editorButtonView5 != null) {
                hdl hdlVar = new hdl(editorButtonView5, editorButtonView6, editorButtonView7, this.bA, this.aA, this.aw, mJ, this.bX, this.ax);
                hdlVar.e.q(hdlVar);
                hdlVar.i = 1 == hdlVar.e.g();
                hdlVar.b();
            }
        }
        hkg hkgVar = this.ao;
        String str = hkgVar.e;
        if (str != null) {
            if (hkgVar.f) {
                hkgVar.d.y(str, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_CAMERA);
            } else {
                hkgVar.c.d(str, null, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_CAMERA);
            }
        }
        gyo b = this.ax.b(acuo.b(99211));
        b.h(true);
        b.a();
        gyo b2 = this.ax.b(acuo.b(96642));
        b2.j(this.bB);
        b2.a();
        gyo b3 = this.ax.b(acuo.b(96650));
        b3.j(this.aJ);
        b3.a();
        boolean z = this.bC.getVisibility() == 0;
        gyo b4 = this.ax.b(acuo.b(96644));
        b4.h(z && this.bC.isEnabled());
        b4.a();
        gyo b5 = this.ax.b(acuo.b(98531));
        b5.h(z && !this.bC.isEnabled());
        b5.a();
        gyo b6 = this.ax.b(acuo.b(96652));
        b6.h(!z);
        b6.a();
        gyo b7 = this.ax.b(acuo.b(96643));
        b7.h(true);
        b7.a();
        this.ax.b(acuo.b(96640)).a();
        gyo b8 = this.ax.b(acuo.b(96638));
        b8.h(true);
        b8.a();
        this.ax.b(acuo.b(22156)).a();
        this.ax.b(acuo.b(98571)).a();
        if (this.aY) {
            gyo b9 = this.ax.b(acuo.b(96651));
            b9.h(true);
            b9.a();
            this.ax.b(acuo.b(115550)).a();
            this.ax.b(acuo.b(115549)).a();
        }
        if (this.aZ) {
            gyo b10 = this.ax.b(acuo.b(96646));
            b10.h(true);
            b10.a();
        }
        this.ax.b(acuo.b(115552)).a();
        this.ax.b(acuo.b(115551)).a();
        if (this.bP) {
            gyq gyqVar3 = this.ax;
            int i2 = ShortsZoomSlider.h;
            gyqVar3.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).a();
        }
        this.ax.b(acuo.b(120988)).a();
        this.ax.b(acuo.b(115119)).a();
        if (this.bT) {
            gyo b11 = this.ax.b(acuo.b(121257));
            b11.h(true);
            b11.a();
        }
        if (!this.bQ) {
            gyo b12 = this.ax.b(acuo.b(96641));
            b12.h(this.aA.I());
            b12.a();
            gyo b13 = this.ax.b(acuo.b(96648));
            b13.h(true);
            b13.a();
            gyo b14 = this.ax.b(acuo.b(96647));
            b14.h(true);
            b14.a();
            if (this.aZ) {
                gyo b15 = this.ax.b(acuo.b(96645));
                b15.h(true);
                b15.a();
                gyo b16 = this.ax.b(acuo.b(127070));
                b16.j(this.bw);
                b16.a();
                this.ax.a(actj.SHORTS_CREATION_RELIGHT_BUTTON).a();
                this.ax.a(actj.SHORTS_CREATION_ENHANCE_BUTTON).a();
            }
            if (this.aY) {
                this.ax.b(acuo.b(107611)).a();
            }
            if (this.aW) {
                gyo b17 = this.ax.b(acuo.b(96649));
                b17.j(this.bv);
                b17.a();
            }
        }
        this.aU = true;
        this.az.c = true;
        this.bp = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_duration_button);
        this.bd = new gwj(this.aw, this.bH, this.bp, this.ax);
        hez hezVar = this.ag.f() ? this.av : this.aj;
        if (this.aY) {
            EditorButtonView editorButtonView8 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_trim_music_button);
            this.bu = editorButtonView8;
            hhc hhcVar = this.am;
            long j = this.b;
            if (this.cd == null) {
                this.cd = new gwz(this);
            }
            hhcVar.p(editorButtonView8, j, j, this.cd, this.ax, actj.SHORTS_CREATION_CAMERA_AUDIO_SCRUBBER_BUTTON, false, hezVar, this.ag.f() ? this.av : this.au, this.aX);
            this.al.f();
            this.al.h = new gxf(this);
            hgh a2 = this.an.a(this.bG, this.ae, actj.SHORTS_CREATION_MUSIC_BUTTON, true);
            this.ca = a2;
            a2.a();
            this.ca.e(true);
            this.bZ.d(this.al.b().as(new gwp(this)));
        }
        this.bp.setOnClickListener(this);
        this.aD = (YouTubeTextView) viewGroup2.findViewById(R.id.shorts_camera_duration_text);
        aO(this.aq.c);
        this.bZ.d(this.ai.c().I(efx.p).as(new gwp(this, 1)));
        zna.g(this.bN);
        if (!this.aZ || (editorButtonView = this.bo) == null) {
            i = 0;
        } else {
            i = 0;
            editorButtonView.setVisibility(0);
        }
        this.bq.setVisibility(i);
        if (this.aY) {
            this.bG.setVisibility(i);
        }
        this.bt.setVisibility(i);
        this.bb = new gwm(this.aw, mL(), bd());
        this.cb.setOnClickListener(new View.OnClickListener() { // from class: gwo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxh gxhVar = gxk.this.e;
                hes hesVar = (hes) gxhVar;
                gwq gwqVar = new gwq(hesVar.p(), 4);
                acti q = hesVar.q();
                zwn a3 = zwn.a((dp) gxhVar, hes.b);
                a3.a = q;
                a3.b = actj.SHORTS_CREATION_CAMERA_PERMISSIONS_BUTTON;
                a3.c = gwqVar;
                a3.d = new hen(hesVar, q, 1);
                a3.c();
                hesVar.ar = a3;
            }
        });
        this.aO.sendAccessibilityEvent(8);
        aI();
        gxj gxjVar = new gxj(this, viewGroup2);
        gxjVar.a.setAccessibilityDelegate(gxjVar);
        if (this.bQ) {
            this.bM = new gvt(this, this.ax, this.bj, this.bR, this.bF, new View[]{this.aO, this.aM, this.bC, this.bB, this.aJ, this.aB, this.bp, this.bI, this.br});
            if (this.bL) {
                s();
            }
        }
        return viewGroup2;
    }

    @Override // defpackage.actq
    public final acti oi() {
        return this.ae;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.aP || this.bc.getVisibility() != 0) {
            if (view == this.aO || view == this.aP) {
                this.ax.b(acuo.b(96638)).b();
                aF();
            } else if (view == this.aM) {
                gyh gyhVar = this.bY;
                if (gyhVar != null) {
                    gyhVar.G();
                    this.ax.b(acuo.b(121257)).b();
                    return;
                }
                gxh gxhVar = this.e;
                if (gxhVar == null) {
                    return;
                }
                hes hesVar = (hes) gxhVar;
                hesVar.aK(gyq.d(hesVar.q(), hesVar.ao, 96652));
            } else if (view == this.bB) {
                this.ax.b(acuo.b(96642)).b();
                final View view2 = this.bB;
                if (view2 != null) {
                    final Interpolator o = kt.o(0.2f, 0.0f, 0.6f, 1.0f);
                    view2.animate().cancel();
                    view2.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator(o).withEndAction(new Runnable() { // from class: zyj
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view3 = view2;
                            view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(o).start();
                        }
                    }).start();
                }
                hhn hhnVar = this.ay;
                if (hhnVar == null) {
                    return;
                }
                synchronized (hhnVar.b) {
                    if (!hhnVar.x()) {
                        return;
                    }
                    List list = hhnVar.d;
                    hhnVar.e.push((axda) list.remove(list.size() - 1));
                    hhnVar.t();
                    hhnVar.v();
                }
            } else if (view == this.aJ) {
                this.ax.b(acuo.b(96650)).b();
                hhn hhnVar2 = this.ay;
                if (hhnVar2 == null) {
                    return;
                }
                synchronized (hhnVar2.b) {
                    if (!hhnVar2.w()) {
                        return;
                    }
                    hhnVar2.d.add((axda) hhnVar2.e.pop());
                    hhnVar2.t();
                    hhnVar2.v();
                }
            } else if (view == this.bC) {
                aY(false);
            } else if (view != this.bp) {
            } else {
                this.ax.b(acuo.b(120988)).b();
                if (this.aq.c == this.b) {
                    gwj.a(this.aD, this.aw.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.d))), this.aw);
                    aL(this.d);
                    return;
                }
                gwj.a(this.aD, this.aw.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.b))), this.aw);
                aL(this.b);
            }
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("CURRENT_MUSIC_ID_KEY", this.bf);
        gvi gviVar = this.aF;
        if (gviVar != null) {
            bundle.putBoolean("ALIGN_MODE_ACTIVED_KEY", gviVar.c);
        }
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(96639);
    }

    public final void s() {
        ankt q;
        gvt gvtVar = this.bM;
        if (gvtVar != null) {
            apy apyVar = gvtVar.b;
            String str = gvtVar.n;
            vne vneVar = gvtVar.r;
            if (amps.e(str) || "COLLAPSED_MODE_DO_NOT_PERSIST_LABELS".equals(str)) {
                q = anlz.q(false);
            } else if ("COLLAPSED_MODE_PERSIST_LABELS_3X".equals(str)) {
                q = anii.h(anii.h(vneVar.a(), gvq.a, anjk.a), gvq.b, anjk.a);
            } else {
                q = anlz.q(false);
            }
            ylx.n(apyVar, q, etg.h, new gvp(gvtVar));
        }
    }

    public final void aI() {
        ShortsZoomSlider shortsZoomSlider = this.aI;
        int i = 0;
        View[] viewArr = shortsZoomSlider != null ? new View[]{this.bG, this.bF, shortsZoomSlider, this.bB, this.aB, this.aM, this.bC} : new View[]{this.bG, this.bF, this.bB, this.aB, this.aM, this.bC};
        if (Build.VERSION.SDK_INT < 22) {
            return;
        }
        int length = viewArr.length;
        View view = null;
        while (i < length) {
            View view2 = viewArr[i];
            if (view != null) {
                int id = view.getId();
                if (id != -1) {
                    view2.setAccessibilityTraversalAfter(id);
                } else {
                    throw new IllegalStateException("Cannot specify traversal order for views without ids");
                }
            }
            i++;
            view = view2;
        }
    }
}
