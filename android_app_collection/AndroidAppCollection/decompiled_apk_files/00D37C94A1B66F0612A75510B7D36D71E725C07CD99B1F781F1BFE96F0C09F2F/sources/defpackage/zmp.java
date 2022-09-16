package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.RotateLayout;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.youtube.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
/* compiled from: PG */
/* renamed from: zmp  reason: default package */
/* loaded from: classes4.dex */
public final class zmp extends zmt implements View.OnClickListener, zlz, zmv, zlo {
    public static final int[] a = {0, 90, 270};
    private View aA;
    private ValueAnimator aB;
    private zng aC;
    private CameraFocusOverlay aD;
    CameraView ae;
    public FrameLayout af;
    public GalleryCameraRecordButtonView ag;
    public ImageView ah;
    public ImageView ai;
    public AnimatorSet aj;
    public long ak;
    public View al;
    public View am;
    public RotateLayout an;
    public TextView ao;
    public Handler ap;
    OrientationEventListener aq;
    public ImageView as;
    public int at;
    public zun au;
    private zmf aw;
    private zmu ax;
    private Timer ay;
    private ImageView az;
    public acut b;
    public axnm c;
    public yzb d;
    public asjj e;
    private int av = 6;
    public int ar = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float aF(boolean r5, boolean r6) {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.af
            android.content.res.Resources r0 = r0.getResources()
            boolean r1 = defpackage.zna.k(r0)
            r2 = 2131166459(0x7f0704fb, float:1.7947164E38)
            r3 = 0
            if (r5 != 0) goto L12
            if (r1 == 0) goto L16
        L12:
            if (r5 == 0) goto L2f
            if (r1 == 0) goto L2e
        L16:
            if (r6 == 0) goto L25
            android.view.View r5 = r4.am
            int r5 = r5.getHeight()
            int r5 = -r5
            int r6 = r0.getDimensionPixelSize(r2)
            int r3 = r5 - r6
        L25:
            android.widget.FrameLayout r5 = r4.af
            int r5 = r5.getWidth()
            int r5 = r5 + r3
        L2c:
            float r5 = (float) r5
            goto L3e
        L2e:
            r1 = 0
        L2f:
            if (r6 == 0) goto L36
            int r5 = r0.getDimensionPixelSize(r2)
            goto L2c
        L36:
            android.view.View r5 = r4.am
            int r5 = r5.getHeight()
            int r5 = -r5
            goto L2c
        L3e:
            if (r1 == 0) goto L41
            float r5 = -r5
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmp.aF(boolean, boolean):float");
    }

    private final int aG() {
        int identifier = rh().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return rh().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void aH(int i) {
        Timer timer = this.ay;
        if (timer != null) {
            timer.cancel();
            this.ay = null;
        }
        this.ap.removeCallbacksAndMessages(null);
        this.ae.B(i);
    }

    private final void aI() {
        aK(true);
        this.ao.setText(q(0L));
        this.az.setVisibility(4);
        this.as.setEnabled(true);
        this.ah.setEnabled(true);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.ag;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_X, galleryCameraRecordButtonView.e);
        ofFloat.setDuration(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_Y, galleryCameraRecordButtonView.e);
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_X, 1.0f);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_Y, 1.0f);
        ofFloat4.setDuration(300L);
        ofFloat.addListener(new zmr(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        galleryCameraRecordButtonView.f.start();
        this.ag.setContentDescription(rh().getString(R.string.upload_edit_camera_start_record));
        aJ();
    }

    private final void aJ() {
        if (this.ae.I()) {
            this.ai.setVisibility(0);
        } else {
            this.ai.setVisibility(8);
        }
    }

    public static Property p(int i) {
        return (i == 90 || i == 270) ? View.TRANSLATION_X : View.TRANSLATION_Y;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        if (this.ae.H()) {
            aH(1);
            aI();
        }
        this.ae.A();
        this.aq.disable();
        zng zngVar = this.aC;
        zngVar.a.setNavigationBarColor(zngVar.b);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.ae.x();
        if (this.aq == null) {
            this.aq = new zmn(this, mJ());
        }
        this.aq.enable();
    }

    @Override // defpackage.zlz
    public final void a() {
    }

    @Override // defpackage.zlo
    public final void aM(znb znbVar, int i) {
        boolean z = false;
        if (znbVar == null) {
            zun zunVar = this.au;
            if (zunVar != null) {
                zunVar.a();
                zunVar.c();
            }
            aI();
            Toast makeText = Toast.makeText(mJ(), (int) R.string.camera_recording_time_too_short_click_to_record, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (this.au == null || i != 0) {
        } else {
            zna.l(this.ag);
            zun zunVar2 = this.au;
            aqxo.y(zunVar2.b != null);
            aqxo.y(zunVar2.a > 0);
            aqxo.y(zunVar2.c != null);
            if (zunVar2.d != null) {
                z = true;
            }
            aqxo.y(z);
            aqxo.y(true);
            Uri uri = null;
            if (zunVar2.c.renameTo(zunVar2.d)) {
                int i2 = znbVar.a;
                int i3 = znbVar.b;
                long j = znbVar.c;
                ContentValues contentValues = new ContentValues(8);
                contentValues.put("title", zunVar2.b);
                contentValues.put("_display_name", zunVar2.d.getName());
                contentValues.put("datetaken", Long.valueOf(zunVar2.a));
                contentValues.put("date_modified", Long.valueOf(zunVar2.a / 1000));
                contentValues.put("mime_type", "video/mp4");
                contentValues.put("_data", zunVar2.d.toString());
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append("x");
                sb.append(i3);
                contentValues.put("resolution", sb.toString());
                contentValues.put("duration", Long.valueOf(j));
                try {
                    uri = zunVar2.e.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } catch (Exception e) {
                    zep.d("Failed to add video to media store.", e);
                }
            } else {
                zunVar2.a();
            }
            if (uri == null) {
                GalleryActivity galleryActivity = zunVar2.e;
                Toast.makeText(galleryActivity, galleryActivity.getResources().getString(R.string.gallery_camera_capture_error), 1).show();
            }
            if (uri != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 2);
                zunVar2.e.c(uri, 902, bundle);
            }
            zunVar2.c();
        }
    }

    @Override // defpackage.zlz
    public final void b() {
        zma i;
        if (this.ae.i() != null) {
            float f = i.b / i.a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            mJ().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int aG = displayMetrics.heightPixels + aG();
            float f2 = i2;
            float f3 = aG;
            float f4 = f2 / f3;
            if (f <= f4) {
                i2 = (int) (f3 * f);
            } else {
                aG = (int) (f2 / f);
            }
            this.ae.u(i2, aG);
            yzg c = this.d.c();
            if (c.d() > 0) {
                this.af.setBackgroundColor(rh().getColor(R.color.yt_black_pure));
                this.aA.setVisibility(0);
                zgd.t(this.aA, zgd.h(c.d()), ViewGroup.LayoutParams.class);
                this.aC.b(rh().getColor(R.color.yt_black_pure));
                r(c);
            } else if (f <= f4) {
                this.aA.setVisibility(8);
                this.aC.b(this.af.getResources().getColor(R.color.gallery_camera_navigation_bar_semi_transparent_background));
            } else {
                this.af.setBackgroundColor(rh().getColor(R.color.yt_black_pure));
                this.aA.setVisibility(0);
                this.aC.b(rh().getColor(R.color.yt_black_pure));
            }
            zgd.v(this.aD, i2, aG);
        }
    }

    @Override // defpackage.zmv
    public final void c() {
    }

    @Override // defpackage.zlz
    public final void d() {
    }

    @Override // defpackage.zmv
    public final void e(float f, float f2) {
        CameraView cameraView = this.ae;
        CameraFocusOverlay cameraFocusOverlay = this.aD;
        cameraFocusOverlay.getClass();
        cameraView.l(f, f2, new zmi(cameraFocusOverlay));
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.av = bundle2.getInt("TARGET_VIDEO_QUALITY");
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        this.aw.h();
        super.mR();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.b.d(acuo.a(50625), null, this.e);
        Resources rh = rh();
        int aG = aG();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.gallery_camera_fragment, viewGroup, false);
        this.af = (FrameLayout) viewGroup2.findViewById(R.id.camera_layout);
        this.at = zna.c(mJ());
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.camera_view);
        this.ae = cameraView;
        cameraView.j(this);
        this.ae.setOnTouchListener(new zmy(mJ(), this));
        CameraView cameraView2 = this.ae;
        cameraView2.s = false;
        cameraView2.v(this.av);
        CameraView cameraView3 = this.ae;
        int i2 = this.av;
        if (i2 == 4) {
            i = 2500000;
        } else if (i2 == 5) {
            i = 5000000;
        } else if (i2 != 6) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown video quality ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = 8000000;
        }
        cameraView3.l = i;
        cameraView3.r(this.at);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = (GalleryCameraRecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        this.ag = galleryCameraRecordButtonView;
        galleryCameraRecordButtonView.setOnClickListener(this);
        zgd.t(this.ag, zgd.e(rh.getDimensionPixelSize(R.dimen.gallery_camera_record_button_bottom_padding) + aG), ViewGroup.MarginLayoutParams.class);
        this.ah = (ImageView) viewGroup2.findViewById(R.id.flashlight_on_off);
        this.aw = new zmg(mJ(), this.ae, this.ah, this.b, this.e);
        this.ai = (ImageView) viewGroup2.findViewById(R.id.switch_camera_button);
        zgd.t(this.ai, zgd.e(rh.getDimensionPixelSize(R.dimen.camera_switch_camera_button_margin_bottom) + aG), ViewGroup.MarginLayoutParams.class);
        this.ax = new zmu(mJ(), this.ae, this.ai, this.b, this.e);
        aJ();
        TextView textView = (TextView) viewGroup2.findViewById(R.id.record_duration_text);
        this.ao = textView;
        textView.setText(q(0L));
        this.ap = new zmo(new WeakReference(this));
        this.al = viewGroup2.findViewById(R.id.camera_header);
        this.am = viewGroup2.findViewById(R.id.camera_header_container);
        this.an = (RotateLayout) viewGroup2.findViewById(R.id.camera_header_rotate);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.camera_close);
        this.as = imageView;
        imageView.setOnClickListener(this);
        this.aD = (CameraFocusOverlay) viewGroup2.findViewById(R.id.camera_focus_overlay);
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.record_blink_view);
        this.az = imageView2;
        ((AnimationDrawable) imageView2.getBackground()).start();
        this.aA = viewGroup2.findViewById(R.id.top_blocker);
        zng zngVar = new zng(mJ().getWindow(), viewGroup2);
        this.aC = zngVar;
        if (!zngVar.d || !zngVar.c) {
            zngVar.d = true;
            zngVar.c = true;
            zngVar.removeMessages(0);
            zngVar.a();
        }
        this.b.n(new acte(actj.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON));
        this.b.w(new acte(actj.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON), this.e);
        if (this.ai.getVisibility() == 0) {
            this.b.n(new acte(actj.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON));
            this.b.w(new acte(actj.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON), this.e);
        }
        this.b.n(new acte(actj.UPLOAD_VIDEO_FLASH_TOGGLE));
        this.b.w(new acte(actj.UPLOAD_VIDEO_FLASH_TOGGLE), this.e);
        this.b.n(new acte(actj.MOBILE_BACK_BUTTON));
        this.b.w(new acte(actj.MOBILE_BACK_BUTTON), this.e);
        this.b.n(new acte(actj.UPLOAD_VIDEO_CAMERA_STOP_BUTTON));
        this.b.w(new acte(actj.UPLOAD_VIDEO_CAMERA_STOP_BUTTON), this.e);
        this.d.h(this.af, 7);
        return viewGroup2;
    }

    @Override // defpackage.zmv
    public final void md() {
        this.ax.e();
    }

    @Override // defpackage.zmv
    public final void me(int i) {
    }

    @Override // defpackage.zlz
    public final void mi() {
        this.ay = new Timer();
        this.ak = System.currentTimeMillis();
        this.ao.setText(q(0L));
        this.az.setVisibility(0);
        this.ay.scheduleAtFixedRate(new zmk(this), 0L, 100L);
        this.as.setEnabled(false);
        this.ah.setEnabled(false);
        aK(false);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.ag;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_X, 1.0f);
        ofFloat.setDuration(400L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_Y, 1.0f);
        ofFloat2.setDuration(400L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_X, galleryCameraRecordButtonView.d);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_Y, galleryCameraRecordButtonView.d);
        ofFloat4.setDuration(300L);
        ofFloat.addListener(new zmq(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        galleryCameraRecordButtonView.f.start();
        this.ag.setContentDescription(rh().getString(R.string.upload_edit_camera_stop_record));
        aJ();
    }

    @Override // defpackage.zmv
    public final void mj(float f) {
        this.ae.k(f);
    }

    @Override // defpackage.zlz
    public final void mm() {
        if (mJ() == null || mJ().getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = mJ().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        mJ().getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zlz
    public final void mn() {
        if (mJ() == null || mJ().getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = mJ().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        mJ().getWindow().setAttributes(attributes);
    }

    public final float n(int i, boolean z) {
        int i2 = 0;
        if (i == 180) {
            int height = this.af.getHeight();
            if (z) {
                i2 = -this.am.getHeight();
            }
            return height + i2;
        } else if (i == 270) {
            return aF(false, z);
        } else {
            if (i == 90) {
                return aF(true, z);
            }
            if (!z) {
                return -this.am.getHeight();
            }
            return 0.0f;
        }
    }

    public final int o(Resources resources, int i) {
        int width;
        int width2 = this.ao.getWidth();
        if (i == 0) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_max_gap);
            width = dimensionPixelSize + dimensionPixelSize + this.as.getWidth() + this.ah.getWidth();
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_min_gap);
            width = dimensionPixelSize2 + dimensionPixelSize2;
        }
        return width2 + width;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File file;
        if (view != this.ag.c) {
            if (view != this.as) {
                return;
            }
            this.b.H(3, new acte(actj.MOBILE_BACK_BUTTON), this.e);
            zun zunVar = this.au;
            if (zunVar == null) {
                return;
            }
            zunVar.b();
        } else if (this.ae.H()) {
            if (!this.ae.H()) {
                return;
            }
            this.b.H(3, new acte(actj.UPLOAD_VIDEO_CAMERA_STOP_BUTTON), this.e);
            aH(0);
        } else if (!this.ae.G()) {
        } else {
            this.b.H(3, new acte(actj.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON), this.e);
            if (!zna.j()) {
                zna.i(mJ(), R.string.camera_no_external_storage);
            } else if (zna.d() < 5242880) {
                zna.i(mJ(), R.string.camera_out_of_space);
            } else {
                zun zunVar2 = this.au;
                if (zunVar2 == null) {
                    return;
                }
                zunVar2.e.getWindow().addFlags(128);
                zunVar2.e.d.f(new zxq());
                Context applicationContext = zunVar2.e.getApplicationContext();
                File file2 = GalleryActivity.a(applicationContext).a;
                Uri b = zna.b(applicationContext);
                zunVar2.a = System.currentTimeMillis();
                zunVar2.d = new File(b.getPath());
                aqxo.y(zunVar2.d.getName().endsWith(".mp4"));
                File file3 = zunVar2.d;
                file3.getClass();
                String name = file3.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                }
                zunVar2.b = name;
                if (file2 != null) {
                    String str = zunVar2.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                    sb.append(str);
                    sb.append(".mp4.tmp");
                    file = new File(file2, sb.toString());
                } else {
                    String valueOf = String.valueOf(zunVar2.d);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
                    sb2.append(valueOf);
                    sb2.append(".tmp");
                    file = new File(sb2.toString());
                }
                zunVar2.c = file;
                Runnable runnable = new Runnable() { // from class: zmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zmp zmpVar = zmp.this;
                        zmpVar.ag.setOnClickListener(zmpVar);
                        if (zmpVar.ar()) {
                            CameraView cameraView = zmpVar.ae;
                            zun zunVar3 = zmpVar.au;
                            aqxo.y(zunVar3.c != null);
                            cameraView.M(new zkz(zunVar3.c), ((zmpVar.ar - zmpVar.at) + 360) % 360, zmpVar);
                        }
                    }
                };
                if (this.ae.L()) {
                    this.ag.setOnClickListener(null);
                    this.ae.postDelayed(runnable, ((znf) this.c.get()).a());
                    return;
                }
                runnable.run();
            }
        }
    }

    public final String q(long j) {
        return vqw.g(mJ(), R.string.camera_timer_template, j);
    }

    public final void r(yzg yzgVar) {
        int i = this.ar;
        int i2 = 0;
        if ((i == 0 || i == 180) && yzgVar.d() > 0) {
            i2 = yzgVar.d();
        }
        zgd.t(this.an, zgd.p(i2), ViewGroup.MarginLayoutParams.class);
    }

    private final void aK(boolean z) {
        int i = this.an.a;
        int i2 = 0;
        if (i == 90 || i == 270) {
            ValueAnimator valueAnimator = this.aB;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.al.getWidth(), o(this.al.getResources(), !z ? 1 : 0));
            this.aB = ofInt;
            ofInt.addUpdateListener(new zmh(this));
            this.aB.addListener(new zmm(this, z));
            this.aB.setDuration(250L);
            this.aB.start();
            return;
        }
        ImageView imageView = this.as;
        if (true != z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.ah.setVisibility(i2);
    }
}
