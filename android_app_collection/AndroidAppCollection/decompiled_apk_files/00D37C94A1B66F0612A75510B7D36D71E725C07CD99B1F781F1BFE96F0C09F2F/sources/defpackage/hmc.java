package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.RecordButtonView;
import com.google.android.apps.youtube.app.extensions.reel.util.ReelPresetTracker;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hmc  reason: default package */
/* loaded from: classes3.dex */
public final class hmc extends hlf implements View.OnClickListener, zlz, zmv, hoq, zlw, acth, zlo {
    private static final zwl aC;
    int a;
    public aacz aA;
    public vne aB;
    private boolean aD;
    private int aE;
    private aqcb aF;
    private CountDownTimer aG;
    private boolean aJ;
    private RecordButtonView aK;
    private View aL;
    private ImageView aM;
    private ViewGroup aN;
    private ChooseFilterView aO;
    private ChooseFilterView aP;
    private View aQ;
    private hlq aR;
    private hlq aS;
    private hlp aT;
    private ReelPresetTracker aU;
    private ImageView aV;
    private zmf aW;
    private ImageView aX;
    private zmu aY;
    private View aZ;
    public hrw ae;
    public hwq af;
    public zwj ag;
    public boolean ai;
    public hkl al;
    public File am;
    public CameraView an;
    public hor ao;
    public boolean ap;
    public ProgressBar aq;
    public ImageView ar;
    public int as;
    public ImageView at;
    public FrameLayout au;
    public FrameLayout av;
    public ConstraintLayout aw;
    public FrameLayout ax;
    public TextView ay;
    public zvx az;
    public hma b;
    private View ba;
    private ImageView bb;
    private CameraFocusOverlay bc;
    private zvh bd;
    private ImageView be;
    private ObjectAnimator bf;
    private ObjectAnimator bg;
    private ObjectAnimator bh;
    private int bi;
    private hmb bj;
    private apzg bk;
    public acti c;
    public aadd d;
    public axnm e;
    final aypf ah = new aypf();
    private final zrp aH = zsc.j();
    public float aj = 0.0f;
    public boolean ak = true;
    private boolean aI = false;
    private int bl = 0;
    private final Runnable bm = new hlw(this);

    static {
        zwk zwkVar = new zwk();
        zwkVar.a = 3;
        amuk u = amuk.u(zvs.GALLERY, zvs.IMAGE, zvs.VIDEO, zvs.FOLDER);
        if (u != null) {
            zwkVar.b = u;
            Integer num = zwkVar.a;
            if (num == null || zwkVar.b == null) {
                StringBuilder sb = new StringBuilder();
                if (zwkVar.a == null) {
                    sb.append(" fileType");
                }
                if (zwkVar.b == null) {
                    sb.append(" albumTypeList");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            aC = new zwl(num.intValue(), zwkVar.b);
            return;
        }
        throw new NullPointerException("Null albumTypeList");
    }

    static final ChooseFilterView aU(View view) {
        return (ChooseFilterView) view.findViewById(R.id.choose_filter_view);
    }

    static final ChooseFilterView aV(View view) {
        return (ChooseFilterView) view.findViewById(R.id.choose_preset_view);
    }

    public static hmc aW(int i, int i2, aqcb aqcbVar, zsn zsnVar, ztl ztlVar, boolean z, apzg apzgVar) {
        if (i != 0) {
            i = 1;
        }
        aqxo.q(true, "startCameraSelection must be one of @StartCameraSelection values");
        hmc hmcVar = new hmc();
        Bundle bundle = new Bundle();
        bundle.putInt("VIDEO_TIME_LIMIT_MSECS", i2);
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", i);
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        if (aqcbVar != null) {
            bundle.putByteArray("COMMENT_STICKER_RENDERER_KEY", aqcbVar.toByteArray());
        }
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z);
        hmcVar.aL(zsnVar);
        hmcVar.aO(ztlVar);
        hmcVar.ae(bundle);
        return hmcVar;
    }

    private final void aX() {
        hmb hmbVar = this.bj;
        if (hmbVar == null || hmbVar.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.bj.cancel(true);
        this.bj = null;
    }

    private final void aY(int i) {
        this.an.B(i);
    }

    private final void aZ() {
        if (this.an.I()) {
            this.aX.setVisibility(0);
        } else {
            this.aX.setVisibility(8);
        }
    }

    private final boolean ba(avxu avxuVar) {
        ReelPresetTracker reelPresetTracker;
        return avxu.EFFECT_SUBPACKAGE_ID_PRESET.equals(avxuVar) && (reelPresetTracker = this.aU) != null && !reelPresetTracker.e;
    }

    private final ViewPropertyAnimator bb(boolean z) {
        this.aZ.animate().cancel();
        return this.aZ.animate().translationY(z ? 0.0f : -rh().getDimension(R.dimen.reel_camera_time_limit_progress_bar_header_layout_height)).setDuration(250L);
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        if (!this.ah.b) {
            this.ah.qr();
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        if (this.an.H()) {
            aY(1);
            hma hmaVar = this.b;
            if (hmaVar != null) {
                ((hml) hmaVar).mJ().getWindow().clearFlags(128);
            }
            bb(true).start();
            this.aZ.setVisibility(0);
            this.bb.setEnabled(true);
            this.aV.setEnabled(true);
            if (!this.ai) {
                this.ar.setVisibility(0);
            }
            this.aV.setVisibility(0);
            this.aR.c();
            this.aS.c();
            this.ak = true;
            RecordButtonView recordButtonView = this.aK;
            recordButtonView.clearAnimation();
            recordButtonView.setContentDescription(recordButtonView.getResources().getString(R.string.reel_camera_start_record));
            zgd.t(recordButtonView.a, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_width_v2), (int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_height_v2)), ViewGroup.LayoutParams.class);
            zgd.t(recordButtonView.c, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height)), ViewGroup.LayoutParams.class);
            fcw.f(recordButtonView.a.getBackground(), 0);
            fcw.f(recordButtonView.c.getProgressDrawable(), 0);
            hlp hlpVar = this.aT;
            hlpVar.r = false;
            if (hlpVar.d()) {
                hlpVar.a(false);
            } else if (hlpVar.a) {
                hlpVar.e.setTranslationY(0.0f);
                hlpVar.g.setTranslationY(0.0f);
                View view = hlpVar.f;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            View view2 = hlpVar.k;
            if (view2 != null) {
                ChooseFilterView chooseFilterView = hlpVar.c;
                if (chooseFilterView != null) {
                    chooseFilterView.i(view2);
                }
                ChooseFilterView chooseFilterView2 = hlpVar.d;
                if (chooseFilterView2 != null) {
                    chooseFilterView2.i(hlpVar.k);
                }
            }
            this.bl = 0;
            aZ();
            mm();
            if (this.a > 0) {
                CountDownTimer countDownTimer = this.aG;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                ProgressBar progressBar = this.aq;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
            }
        }
        this.an.A();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        int i = this.aE;
        if (i == 0) {
            this.an.x();
        } else if (i == 1) {
            this.an.y(1);
        } else if (i == 2) {
            this.an.y(0);
        } else {
            throw new AssertionError(i);
        }
        this.aE = 0;
        Bundle bundle = this.m;
        if (bundle != null) {
            bundle.putInt("START_CAMERA_SELECTION", 0);
        }
    }

    @Override // defpackage.zlz
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final znh aE() {
        return hpp.a(mJ());
    }

    final zrk aF() {
        return this.aH.g();
    }

    public final void aG(boolean z) {
        ObjectAnimator objectAnimator = this.bf;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.bf.end();
        }
        ObjectAnimator objectAnimator2 = this.bg;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.bg.end();
        }
        FrameLayout frameLayout = this.au;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        float f = 0.0f;
        fArr[0] = true != z ? 0.0f : 1.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, property, fArr).setDuration(250L);
        this.bf = duration;
        duration.addListener(new hlx(this, z, 1));
        FrameLayout frameLayout2 = this.av;
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            f = this.bi;
        }
        fArr2[0] = f;
        this.bg = ObjectAnimator.ofFloat(frameLayout2, property2, fArr2).setDuration(250L);
        this.bf.start();
        this.bg.start();
    }

    public final void aH(RecordingInfo recordingInfo, boolean z) {
        if (recordingInfo == null || this.b == null) {
            return;
        }
        zna.l(this.aK);
        hml hmlVar = (hml) this.b;
        hmlVar.mJ().getWindow().clearFlags(128);
        hmlVar.d.a(recordingInfo, !z ? 1 : 0);
    }

    public final void aI(Bitmap bitmap, final boolean z) {
        if (mJ() == null) {
            zep.l("editPhoto called after Activity destroyed.");
            return;
        }
        Bitmap a = hqb.a(bitmap);
        File file = new File(aE().a, String.valueOf(zna.f(System.currentTimeMillis())).concat(".jpeg"));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.toString()));
            a.compress(Bitmap.CompressFormat.JPEG, 92, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (IOException e) {
            zep.d("error writing image file", e);
            hqs.j(rb(), R.string.reel_camera_error_creating_image);
        }
        zrk aF = aF();
        String file2 = file.toString();
        int width = a.getWidth();
        int height = a.getHeight();
        avxu avxuVar = null;
        String str = z ? null : aF.b;
        if (!z) {
            avxuVar = aF.c;
        }
        final RecordingInfo recordingInfo = new RecordingInfo(file2, true, width, height, 5000L, true, z, str, avxuVar, ba(aF.c));
        mJ().runOnUiThread(new Runnable() { // from class: hlv
            @Override // java.lang.Runnable
            public final void run() {
                hmc.this.aH(recordingInfo, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        boolean z = true;
        if (this.bl != 1) {
            return;
        }
        this.bl = 2;
        int max = Math.max(1000, ViewConfiguration.getLongPressTimeout());
        zlp zlpVar = this.an.g;
        long a = zlpVar != null ? zlpVar.a() : 0L;
        if (this.an.H() && a >= max) {
            if (this.am == null) {
                z = false;
            }
            aqxo.y(z);
            aY(0);
        } else {
            CameraView cameraView = this.an;
            if (cameraView.m == null) {
                cameraView.m = this;
            }
            if (cameraView.H()) {
                aY(1);
            }
        }
        aX();
        if (this.a > 0) {
            CountDownTimer countDownTimer = this.aG;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
                this.aG.cancel();
            }
            ProgressBar progressBar = this.aq;
            if (progressBar != null) {
                progressBar.setProgress(0);
            }
        }
        this.c.t();
    }

    public final void aK() {
        if (this.au.getVisibility() == 0) {
            aG(false);
        } else if (this.aT.d()) {
            this.aT.a(false);
        } else if (aR()) {
            aP(false);
            this.c.u(new acte(acuo.b(121663)), null);
        } else {
            hma hmaVar = this.b;
            if (hmaVar == null) {
                return;
            }
            ((hml) hmaVar).as.c();
            aX();
        }
    }

    public final void aL(zsn zsnVar) {
        this.aH.h(zsnVar);
    }

    @Override // defpackage.zlo
    public final void aM(znb znbVar, int i) {
        RecordingInfo recordingInfo;
        if (znbVar == null) {
            recordingInfo = null;
        } else {
            zrk aF = aF();
            String file = this.am.toString();
            int i2 = znbVar.a;
            int i3 = znbVar.b;
            long j = znbVar.c;
            String str = aF.b;
            avxu avxuVar = aF.c;
            recordingInfo = new RecordingInfo(file, true, i2, i3, j, false, false, str, avxuVar, ba(avxuVar));
        }
        if (i == 0) {
            aH(recordingInfo, false);
            return;
        }
        File file2 = this.am;
        if (file2 == null) {
            return;
        }
        file2.delete();
    }

    public final void aN(hma hmaVar) {
        this.b = hmaVar;
        zvh zvhVar = this.bd;
        if (zvhVar != null) {
            zvhVar.ae = hmaVar;
        }
    }

    public final void aO(ztl ztlVar) {
        this.aH.i(ztlVar);
    }

    public final void aP(boolean z) {
        if (aS()) {
            ObjectAnimator objectAnimator = this.bh;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.bh.end();
            }
            ConstraintLayout constraintLayout = this.aw;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : this.bi;
            ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, property, fArr).setDuration(250L);
            this.bh = duration;
            duration.addListener(new hlx(this, z));
            this.bh.start();
            return;
        }
        this.aw.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aQ() {
        if (!this.an.G() || this.bl != 0) {
            return;
        }
        this.c.H(3, new acte(acuo.b(18043)), null);
        this.c.u(new acte(acuo.b(18044)), null);
        if (!zna.j()) {
            zna.i(mJ(), R.string.reel_camera_no_external_storage);
        } else if (zna.d() >= 5242880) {
            if (this.an.L()) {
                this.an.postDelayed(this.bm, ((znf) this.e.get()).a());
            } else {
                this.bm.run();
            }
            this.bl = 1;
        } else {
            zna.i(mJ(), R.string.reel_camera_out_of_space);
        }
    }

    public final boolean aR() {
        return this.aw.getVisibility() == 0;
    }

    public final boolean aS() {
        return this.av.getVisibility() == 0 || aR();
    }

    @Override // defpackage.zlz
    public final void b() {
        zma i;
        if (this.an.i() != null) {
            float f = i.b / i.a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            mJ().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            float f2 = i2;
            float f3 = i3;
            if (f >= f2 / f3) {
                i2 = (int) (f3 * f);
            } else {
                i3 = (int) (f2 / f);
            }
            this.an.u(i2, i3);
            zgd.t(this.bc, zgd.s(i2, i3), ViewGroup.LayoutParams.class);
        }
        if (this.bj == null) {
            hmb hmbVar = new hmb(this);
            this.bj = hmbVar;
            hmbVar.execute(new Void[0]);
        }
    }

    @Override // defpackage.zmv
    public final void c() {
        if (!this.an.H()) {
            float f = this.aj;
            if (f > 0.0f && f < 1.0f) {
                return;
            }
            this.aT.b(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
        }
    }

    @Override // defpackage.zlz
    public final void d() {
    }

    @Override // defpackage.zmv
    public final void e(float f, float f2) {
        CameraView cameraView = this.an;
        CameraFocusOverlay cameraFocusOverlay = this.bc;
        cameraFocusOverlay.getClass();
        cameraView.l(f, f2, new zmi(cameraFocusOverlay, 1));
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return this.bk;
    }

    @Override // defpackage.actq
    protected final asjj kx() {
        return null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.a = bundle2.getInt("VIDEO_TIME_LIMIT_MSECS");
            this.aD = bundle2.getBoolean("MIRROR_FRONT_CAMERA");
            this.aE = bundle2.getInt("START_CAMERA_SELECTION");
            bundle2.getBoolean("SWIPE_TO_CAMERA_ENABLED");
            byte[] byteArray = bundle2.getByteArray("COMMENT_STICKER_RENDERER_KEY");
            if (byteArray != null) {
                try {
                    this.aF = (aqcb) aopi.parseFrom(aqcb.a, byteArray, aoos.b());
                } catch (aopx e) {
                    zep.d("Error parsing comment sticker renderer.", e);
                }
            }
            byte[] byteArray2 = bundle2.getByteArray("navigation_endpoint");
            if (byteArray2 != null) {
                try {
                    this.bk = (apzg) aopi.parseFrom(apzg.a, byteArray2, aoos.b());
                } catch (aopx unused) {
                }
            }
        }
        asxj asxjVar = this.aA.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        this.aI = asxjVar.bV;
    }

    @Override // defpackage.dp
    public final void mR() {
        this.aW.h();
        super.mR();
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CountDownTimer countDownTimer;
        ImageView imageView;
        boolean z;
        awzy awzyVar;
        awzy awzyVar2;
        super.mc(layoutInflater, viewGroup, bundle);
        this.aJ = this.al.j();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.reel_camera_fragment_v2, viewGroup, false);
        this.as = zna.c(mJ());
        this.bc = (CameraFocusOverlay) viewGroup2.findViewById(R.id.reel_camera_focus_overlay);
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.reel_camera_view);
        this.an = cameraView;
        cameraView.j(this);
        this.an.setOnTouchListener(new hpd(mJ(), this, this.an));
        CameraView cameraView2 = this.an;
        cameraView2.s = this.aD;
        cameraView2.v(5);
        this.an.r(this.as);
        this.aK = (RecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        hor horVar = new hor(this, this.aK, false, false);
        this.ao = horVar;
        this.aK.setOnTouchListener(horVar);
        this.aK.findViewById(R.id.reel_camera_record_button_touch_area).setContentDescription(N(R.string.reel_camera_take_photo_or_record_video_button));
        this.aL = viewGroup2.findViewById(R.id.reel_camera_effects_container);
        this.aM = (ImageView) viewGroup2.findViewById(R.id.reel_camera_presets_button);
        this.aO = aU(viewGroup2);
        if (this.af.c()) {
            aU(viewGroup2).g = true;
            aU(viewGroup2).d();
            aV(viewGroup2).d();
        }
        this.aP = aV(viewGroup2);
        this.aV = (ImageView) viewGroup2.findViewById(R.id.reel_camera_flashlight_on_off);
        this.aW = new hlr(mJ(), this.an, this.aV, this.c);
        this.aX = (ImageView) viewGroup2.findViewById(R.id.reel_switch_camera_button);
        this.aY = new zmu(mJ(), this.an, this.aX, this.c, null);
        aZ();
        ProgressBar progressBar = (ProgressBar) viewGroup2.findViewById(R.id.reel_camera_circle_time_limit_progress_bar);
        this.aq = progressBar;
        int i = 8;
        if (this.a <= 0) {
            progressBar.setVisibility(8);
        }
        int i2 = this.a;
        arhd arhdVar = null;
        if (i2 <= 0) {
            countDownTimer = null;
        } else {
            if (this.aG == null) {
                this.aG = new hly(this, i2);
            }
            countDownTimer = this.aG;
        }
        this.aG = countDownTimer;
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.reel_camera_gallery_button);
        this.ar = imageView2;
        imageView2.setOnClickListener(this);
        this.aZ = viewGroup2.findViewById(R.id.reel_camera_header);
        this.ba = viewGroup2.findViewById(R.id.reel_camera_bottom_bar);
        ImageView imageView3 = (ImageView) viewGroup2.findViewById(R.id.reel_camera_close);
        this.bb = imageView3;
        imageView3.setOnClickListener(this);
        this.c.n(new acte(acuo.b(18043)));
        this.c.w(new acte(acuo.b(18043)), null);
        if (this.aX.getVisibility() == 0) {
            this.c.n(new acte(acuo.b(18045)));
            this.c.w(new acte(acuo.b(18045)), null);
        }
        this.c.n(new acte(acuo.b(36852)));
        this.c.w(new acte(acuo.b(36852)), null);
        this.c.n(new acte(acuo.b(22156)));
        this.c.w(new acte(acuo.b(22156)), null);
        this.c.n(new acte(acuo.b(52926)));
        this.c.w(new acte(acuo.b(52926)), null);
        this.c.n(new acte(acuo.b(53010)));
        this.c.w(new acte(acuo.b(53010)), null);
        this.c.n(new acte(acuo.b(18044)));
        this.c.w(new acte(acuo.b(18044)), null);
        new hlz().execute(this);
        if (this.aI) {
            imageView = (ImageView) viewGroup2.findViewById(R.id.gallery_close_button);
        } else {
            imageView = (ImageView) viewGroup2.findViewById(R.id.reel_gallery_back);
        }
        this.at = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView4 = (ImageView) viewGroup2.findViewById(R.id.album_list_header_back_arrow);
        this.be = imageView4;
        imageView4.setOnClickListener(this);
        this.au = (FrameLayout) viewGroup2.findViewById(R.id.reel_gallery_header);
        this.av = (FrameLayout) viewGroup2.findViewById(R.id.reel_media_grid_fragment_container);
        this.aw = (ConstraintLayout) viewGroup2.findViewById(R.id.album_list_fragment_container);
        this.ax = (FrameLayout) viewGroup2.findViewById(R.id.reel_camera_view_container);
        Display defaultDisplay = ((WindowManager) rb().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i3 = point.y;
        this.bi = i3;
        this.av.setTranslationY(i3);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.comment_sticker_panel);
        this.aN = viewGroup3;
        aqcb aqcbVar = this.aF;
        if (aqcbVar != null) {
            final hrw hrwVar = this.ae;
            hrv hrvVar = new hrv() { // from class: hlt
                @Override // defpackage.hrv
                public final void a(axbm axbmVar) {
                    ((hml) hmc.this.b).ap = axbmVar;
                }
            };
            viewGroup3.getClass();
            hrwVar.e = viewGroup3;
            hrwVar.f = hrvVar;
            aopa createBuilder = awzy.a.createBuilder();
            arag aragVar = aqcbVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            String obj = ajgl.b(aragVar).toString();
            createBuilder.copyOnWrite();
            awzy awzyVar3 = (awzy) createBuilder.instance;
            obj.getClass();
            awzyVar3.b |= 2;
            awzyVar3.d = obj;
            arag aragVar2 = aqcbVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            if (!amps.e(ajgl.b(aragVar2).toString())) {
                arag aragVar3 = aqcbVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                String obj2 = ajgl.b(aragVar3).toString();
                createBuilder.copyOnWrite();
                awzy awzyVar4 = (awzy) createBuilder.instance;
                obj2.getClass();
                awzyVar4.b |= 4;
                awzyVar4.e = obj2;
            } else {
                avhn avhnVar = aqcbVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                String uri = akel.q(avhnVar).toString();
                createBuilder.copyOnWrite();
                awzy awzyVar5 = (awzy) createBuilder.instance;
                uri.getClass();
                awzyVar5.b |= 8;
                awzyVar5.f = uri;
                arag aragVar4 = aqcbVar.e;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                String obj3 = ajgl.b(aragVar4).toString();
                createBuilder.copyOnWrite();
                awzy awzyVar6 = (awzy) createBuilder.instance;
                obj3.getClass();
                awzyVar6.b |= 4;
                awzyVar6.e = obj3;
            }
            if ((aqcbVar.b & 8) != 0) {
                znz znzVar = hrw.l;
                avxt b = avxt.b(aqcbVar.f);
                if (b == null) {
                    b = avxt.COMMENT_STICKER_SOURCE_UNKNOWN;
                }
                createBuilder.copyOnWrite();
                awzy awzyVar7 = (awzy) createBuilder.instance;
                awzyVar7.h = ((awzz) znzVar.d(b)).e;
                awzyVar7.b |= 32;
            }
            ArrayList<axaa> arrayList = new ArrayList();
            arrayList.add(axaa.COMMENT_NORMAL);
            arrayList.add(axaa.COMMENT_LIGHT);
            aopa createBuilder2 = awzx.b.createBuilder();
            createBuilder2.copyOnWrite();
            awzx awzxVar = (awzx) createBuilder2.instance;
            aopq aopqVar = awzxVar.e;
            if (!aopqVar.c()) {
                awzxVar.e = aopi.mutableCopy(aopqVar);
            }
            for (axaa axaaVar : arrayList) {
                awzxVar.e.g(axaaVar.d);
            }
            axaa axaaVar2 = hrw.a;
            createBuilder2.copyOnWrite();
            awzx awzxVar2 = (awzx) createBuilder2.instance;
            awzxVar2.d = axaaVar2.d;
            awzxVar2.c |= 1;
            createBuilder.copyOnWrite();
            awzy awzyVar8 = (awzy) createBuilder.instance;
            awzx awzxVar3 = (awzx) createBuilder2.mo39build();
            awzxVar3.getClass();
            awzyVar8.g = awzxVar3;
            awzyVar8.b |= 16;
            axbl j = axbm.j();
            aopa createBuilder3 = axbk.a.createBuilder();
            createBuilder3.copyOnWrite();
            axbk axbkVar = (axbk) createBuilder3.instance;
            awzy awzyVar9 = (awzy) createBuilder.mo39build();
            awzyVar9.getClass();
            axbkVar.d = awzyVar9;
            axbkVar.c = 4;
            j.copyOnWrite();
            ((axbm) j.instance).F((axbk) createBuilder3.mo39build());
            hrwVar.g = (axbm) j.mo39build();
            hrwVar.d(hrw.a);
            hrwVar.i = viewGroup3.findViewById(R.id.comment_sticker_panel_warning_background);
            hrwVar.j = viewGroup3.findViewById(R.id.comment_sticker_panel_warning_text);
            ((ViewGroup) viewGroup3.findViewById(R.id.comment_sticker_container)).addView(hrwVar.h);
            hrwVar.h.setOnTouchListener(hrwVar);
            axbk i4 = hrwVar.g.i();
            if (i4.c == 4) {
                awzyVar = (awzy) i4.d;
            } else {
                awzyVar = awzy.a;
            }
            if ((awzyVar.b & 8) == 0) {
                ((ImageView) hrwVar.h.findViewById(R.id.author_avatar)).setVisibility(8);
                hrwVar.k = new View.OnLayoutChangeListener() { // from class: hrp
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                        hrw hrwVar2 = hrw.this;
                        if (i6 - i8 == 0 || i5 - i7 == 0) {
                            return;
                        }
                        hrwVar2.h.removeOnLayoutChangeListener(hrwVar2.k);
                        hrwVar2.e();
                    }
                };
                hrwVar.h.addOnLayoutChangeListener(hrwVar.k);
            } else {
                axbk i5 = hrwVar.g.i();
                if (i5.c == 4) {
                    awzyVar2 = (awzy) i5.d;
                } else {
                    awzyVar2 = awzy.a;
                }
                hrwVar.b.i((ImageView) hrwVar.h.findViewById(R.id.author_avatar), zgt.j(awzyVar2.f), hrwVar.c);
            }
        }
        this.aR = new hlq(this.aL, this.c, acuo.b(10719));
        if (this.af.c()) {
            this.aR.a = true;
        }
        this.aS = new hlq(this.aM, this.c, acuo.b(56205));
        this.aQ = viewGroup2.findViewById(R.id.effect_pending_indicator);
        this.aT = new hlp(this.aO, this.aP, this.aH, this.ba, this.aK, this.aN.findViewById(R.id.comment_sticker_container), this.aL, this.aM, this.aQ, this.c);
        aadd aaddVar = this.d;
        arhd a = aaddVar != null ? aaddVar.a() : null;
        if (a != null) {
            avvf avvfVar = a.h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            if (avvfVar.i && this.aL != null && this.aO != null) {
                this.an.R();
                this.an.t(this.aH);
                this.an.f = this.aJ;
                this.aL.setOnClickListener(this);
                this.aO.f(((zsc) this.aH).k(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE), this);
                this.aO.n(this.aR);
                ImageView imageView5 = this.aM;
                if (imageView5 != null && this.aP != null) {
                    imageView5.setOnClickListener(this);
                    zsj k = ((zsc) this.aH).k(avxu.EFFECT_SUBPACKAGE_ID_PRESET);
                    this.aP.f(k, this);
                    this.aP.n(this.aS);
                    final ReelPresetTracker reelPresetTracker = new ReelPresetTracker(this, k, this.aB);
                    this.X.c(reelPresetTracker);
                    k.b(new zsd() { // from class: hqo
                        @Override // defpackage.zdt
                        public final void a(Object obj4) {
                            ReelPresetTracker.this.l((zno) obj4);
                        }
                    });
                    k.a(new zrm() { // from class: hqn
                        @Override // defpackage.zdt
                        public final void a(Object obj4) {
                            ReelPresetTracker.this.j((FilterMapTable$FilterDescriptor) obj4);
                        }
                    });
                    aadd aaddVar2 = this.d;
                    if (aaddVar2 != null) {
                        arhdVar = aaddVar2.a();
                    }
                    if (arhdVar != null) {
                        avyk avykVar = arhdVar.s;
                        if (avykVar == null) {
                            avykVar = avyk.a;
                        }
                        if (avykVar.d) {
                            z = true;
                            reelPresetTracker.h = z;
                            this.aU = reelPresetTracker;
                        }
                    }
                    z = false;
                    reelPresetTracker.h = z;
                    this.aU = reelPresetTracker;
                }
            }
        }
        zna.g(this.ax);
        viewGroup2.findViewById(R.id.album_select_gallery_header).setVisibility(true != this.aI ? 8 : 0);
        View findViewById = viewGroup2.findViewById(R.id.reel_gallery_old_header);
        if (true != this.aI) {
            i = 0;
        }
        findViewById.setVisibility(i);
        if (this.aI) {
            TextView textView = (TextView) viewGroup2.findViewById(R.id.select_album_button);
            this.ay = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: hls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hmc hmcVar = hmc.this;
                    eo mL = hmcVar.mL();
                    zwf zwfVar = (zwf) mL.f("ALBUM_LIST_FRAGMENT_TAG");
                    if (zwfVar == null) {
                        zwfVar = new zwf();
                        ex l = mL.l();
                        l.q(R.id.album_list_fragment_container, zwfVar, "ALBUM_LIST_FRAGMENT_TAG");
                        l.a();
                        mL.ab();
                        hmcVar.c.n(new acte(acuo.b(121662)));
                        hmcVar.c.w(new acte(acuo.b(121662)), null);
                        hmcVar.c.n(new acte(acuo.b(121667)));
                        hmcVar.c.w(new acte(acuo.b(121667)), null);
                        hmcVar.c.n(new acte(acuo.b(121664)));
                        hmcVar.c.w(new acte(acuo.b(121664)), null);
                        hmcVar.c.n(new acte(acuo.b(121665)));
                        hmcVar.c.w(new acte(acuo.b(121665)), null);
                        hmcVar.c.n(new acte(acuo.b(121667)));
                        hmcVar.c.w(new acte(acuo.b(121667)), null);
                    }
                    hmcVar.az = (zvx) ((RecyclerView) zwfVar.O.findViewById(R.id.album_list_recycler_view)).m;
                    hmcVar.aP(true);
                    hmcVar.c.H(3, new acte(acuo.b(121662)), null);
                    hmcVar.c.u(new acte(acuo.b(121667)), null);
                    hmcVar.c.u(new acte(acuo.b(121664)), null);
                    if (hmcVar.az.f) {
                        hmcVar.c.u(new acte(acuo.b(121665)), null);
                    }
                    if (hmcVar.az.g) {
                        hmcVar.c.u(new acte(acuo.b(121666)), null);
                    }
                }
            });
            this.ah.d(this.ag.a().as(new ayqb() { // from class: hlu
                @Override // defpackage.ayqb
                public final void a(Object obj4) {
                    hmc hmcVar = hmc.this;
                    hmcVar.c.u(new acte(acuo.b(121663)), null);
                    hmcVar.ay.setText(((zvu) obj4).d);
                    hmcVar.aP(false);
                }
            }));
        }
        return viewGroup2;
    }

    @Override // defpackage.zmv
    public final void md() {
        this.aY.e();
    }

    @Override // defpackage.zmv
    public final void me(int i) {
        if (i == 4) {
            this.aT.a(this.an.H());
        }
    }

    @Override // defpackage.hoq
    public final void mf() {
        this.ak = false;
        RecordButtonView recordButtonView = this.aK;
        fcw.g(recordButtonView.a.getBackground());
        fcw.g(recordButtonView.c.getProgressDrawable());
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        zgd.t(recordButtonView.c, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_height)), ViewGroup.LayoutParams.class);
        this.an.n();
        aQ();
    }

    @Override // defpackage.hoq
    public final /* synthetic */ void mg() {
    }

    @Override // defpackage.hoq
    public final void mh() {
        RecordButtonView recordButtonView = this.aK;
        fcw.f(recordButtonView.a.getBackground(), 200);
        fcw.f(recordButtonView.c.getProgressDrawable(), 200);
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        zgd.t(recordButtonView.a, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height)), ViewGroup.LayoutParams.class);
        zgd.t(recordButtonView.c, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height)), ViewGroup.LayoutParams.class);
        aJ();
    }

    @Override // defpackage.zlz
    public final void mi() {
        CountDownTimer countDownTimer;
        if (this.a > 0 && (countDownTimer = this.aG) != null) {
            countDownTimer.start();
        }
        this.bb.setEnabled(false);
        this.aV.setEnabled(false);
        this.ar.setVisibility(4);
        this.aR.b();
        this.aS.b();
        this.aT.a(true);
        hlp hlpVar = this.aT;
        if (hlpVar.k != null) {
            ChooseFilterView chooseFilterView = hlpVar.c;
            if (chooseFilterView != null) {
                chooseFilterView.i(null);
            }
            ChooseFilterView chooseFilterView2 = hlpVar.d;
            if (chooseFilterView2 != null) {
                chooseFilterView2.i(null);
            }
            hlpVar.k.setVisibility(8);
        }
        this.aV.setVisibility(4);
        bb(false).start();
        RecordButtonView recordButtonView = this.aK;
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        zgd.t(recordButtonView.a, zgd.s((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height)), ViewGroup.LayoutParams.class);
        this.aK.setContentDescription(rh().getString(R.string.reel_camera_stop_record));
        aZ();
    }

    @Override // defpackage.zmv
    public final void mj(float f) {
        this.an.k(f);
    }

    @Override // defpackage.hoq
    public final /* synthetic */ void mk(float f, float f2) {
    }

    @Override // defpackage.hoq
    public final void ml(float f) {
        this.an.p(f);
    }

    @Override // defpackage.zlz
    public final void mm() {
        dt mJ = mJ();
        if (mJ == null) {
            return;
        }
        WindowManager.LayoutParams attributes = mJ.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        mJ.getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zlz
    public final void mn() {
        WindowManager.LayoutParams attributes = mJ().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        mJ().getWindow().setAttributes(attributes);
    }

    @Override // defpackage.actq
    public final acti oi() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.bb) {
            this.c.H(3, new acte(acuo.b(22156)), null);
            this.aT.a(false);
            aK();
        } else if (view == this.ar) {
            if (this.aI) {
                final zwj zwjVar = this.ag;
                final zwl zwlVar = aC;
                aypg aypgVar = zwjVar.h;
                if (aypgVar != null && !aypgVar.e()) {
                    ayqi.c((AtomicReference) zwjVar.h);
                }
                zwjVar.h = ayos.A(new Callable() { // from class: zwi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zwj.this.a.c(zwlVar.a);
                    }
                }).K(azpj.b(zwjVar.g)).G(azpj.b(zwjVar.f)).T(new ayqb() { // from class: zwh
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        zwj zwjVar2 = zwj.this;
                        amuk amukVar = zwlVar.b;
                        amuk o = amuk.o((List) obj);
                        zwc zwcVar = zwjVar2.b;
                        amuf f = amuk.f();
                        int i = ((amxx) amukVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            final zvs zvsVar = (zvs) amukVar.get(i2);
                            if (zvsVar == zvs.FOLDER) {
                                ayoi Q = ayoi.Q(o);
                                yps ypsVar = yps.o;
                                int i3 = aynx.a;
                                ayrd.c(i3, "bufferSize");
                                azgn azgnVar = new azgn(Q, ypsVar, i3);
                                azqc.i();
                                List list = (List) azgnVar.M(new yps(14)).aq().U();
                                Collections.sort(list, new utr(6));
                                f.j(list);
                            } else {
                                final String string = zwcVar.c.getResources().getString(((Integer) zwc.b.get(zvsVar)).intValue());
                                ampq ampqVar = (ampq) ayoi.Q(o).I((ayqf) zwc.a.get(zvsVar)).aq().E(new ayqe() { // from class: zvy
                                    @Override // defpackage.ayqe
                                    public final Object a(Object obj2) {
                                        zvs zvsVar2 = zvs.this;
                                        String str = string;
                                        List list2 = (List) obj2;
                                        Map map = zwc.a;
                                        if (list2.isEmpty()) {
                                            return amon.a;
                                        }
                                        zvt a = zvu.a();
                                        a.b(zvsVar2);
                                        a.a = ampq.j((DeviceLocalFile) list2.get(0));
                                        a.b = amon.a;
                                        a.d(str);
                                        a.c(list2.size());
                                        return ampq.j(a.a());
                                    }
                                }).U();
                                if (ampqVar.h()) {
                                    f.h((zvu) ampqVar.c());
                                }
                            }
                        }
                        amuk g = f.g();
                        zwjVar2.c.c(o);
                        zwjVar2.d.c(g);
                        if (!g.isEmpty()) {
                            zwjVar2.e.c((zvu) g.get(0));
                        }
                    }
                }, ab.s);
            }
            eo mL = mL();
            zvh zvhVar = (zvh) mL.f("MEDIA_GRID_FRAGMENT_TAG");
            this.bd = zvhVar;
            if (zvhVar == null) {
                this.bd = zvh.s(3, true, this.aI);
                ex l = mL.l();
                l.q(R.id.reel_media_grid_fragment_container, this.bd, "MEDIA_GRID_FRAGMENT_TAG");
                l.a();
                mL.ab();
                this.c.n(new acte(acuo.b(121663)));
                this.c.w(new acte(acuo.b(121663)), null);
            }
            this.bd.ae = this.b;
            this.c.u(new acte(acuo.b(121663)), null);
            aG(true);
        } else if (view == this.at) {
            this.c.H(3, new acte(acuo.b(121663)), null);
            aG(false);
        } else if (view == this.be) {
            this.c.H(3, new acte(acuo.b(121667)), null);
            this.c.u(new acte(acuo.b(121663)), null);
            aP(false);
        } else {
            View view2 = this.aL;
            if (view2 != null && view == view2) {
                ChooseFilterView chooseFilterView = this.aO;
                if (chooseFilterView == null || chooseFilterView.f) {
                    this.aT.a(false);
                    return;
                } else {
                    this.aT.b(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
                    return;
                }
            }
            ImageView imageView = this.aM;
            if (imageView == null || view != imageView) {
                return;
            }
            ChooseFilterView chooseFilterView2 = this.aP;
            if (chooseFilterView2 == null || chooseFilterView2.f) {
                this.aT.a(false);
            } else {
                this.aT.b(avxu.EFFECT_SUBPACKAGE_ID_PRESET);
            }
        }
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(36850);
    }
}
