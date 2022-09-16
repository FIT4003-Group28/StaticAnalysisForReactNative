package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.gallery.GalleryNestedScrollView;
import com.google.android.youtube.R;
import java.io.File;
/* compiled from: PG */
/* renamed from: zuu  reason: default package */
/* loaded from: classes4.dex */
public final class zuu extends zuz implements View.OnClickListener, zuv, zvg, nc {
    private static final int[] al = {R.attr.actionBarSize};
    private static final acup am = acuo.b(9700);
    private static final acup an = acuo.b(17177);
    private static final acup ao = acuo.b(18645);
    private static final acup ap = acuo.b(27599);
    private static final acup aq = acuo.b(18642);
    private static final acup ar = acuo.b(18639);
    private static final acup as = acuo.b(22855);
    private static final acup at = acuo.b(18643);
    private static final acup au = acuo.b(18640);
    private static final acup av = acuo.b(22856);
    public View a;
    private GalleryNestedScrollView aA;
    private Class aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private ValueAnimator aH;
    public yni ae;
    Uri ag;
    private FrameLayout aw;
    private FrameLayout ax;
    private FrameLayout ay;
    private zlk az;
    public ImageView b;
    public zus c;
    public akdr d;
    public acut e;
    public boolean af = true;
    private boolean aI = true;
    private boolean aJ = false;
    boolean ah = false;
    public boolean ai = false;
    public boolean aj = false;
    private boolean aK = false;
    public asjj ak = null;
    private final ValueAnimator.AnimatorUpdateListener aL = new zuq(this);
    private final Animator.AnimatorListener aM = new zur(this);

    private final zut aE(boolean z) {
        int i;
        dt mJ = mJ();
        zut zutVar = new zut();
        if (!z && !this.aj) {
            zutVar.b = new String[]{"android.permission.CAMERA"};
            i = R.string.gallery_permission_open_settings_for_camera;
        } else if (akdr.h(mJ, 1)) {
            zutVar.b = new String[]{"android.permission.RECORD_AUDIO"};
            i = R.string.gallery_permission_open_settings_for_microphone_secondary;
        } else {
            zutVar.b = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            i = R.string.shorts_permission_camera_open_settings_description;
        }
        zutVar.a = i;
        return zutVar;
    }

    private final void aF() {
        ValueAnimator valueAnimator = this.aH;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.aH.cancel();
    }

    private final void aG() {
        this.e.d(acuo.a(18046), null, this.ak);
        acut acutVar = this.e;
        acup acupVar = am;
        acutVar.n(new acte(acupVar));
        this.e.w(new acte(acupVar), this.ak);
        acut acutVar2 = this.e;
        acup acupVar2 = an;
        acutVar2.n(new acte(acupVar2));
        this.e.w(new acte(acupVar2), this.ak);
        acut acutVar3 = this.e;
        acup acupVar3 = ao;
        acutVar3.n(new acte(acupVar3));
        this.e.w(new acte(acupVar3), this.ak);
        if (this.ah) {
            acut acutVar4 = this.e;
            acup acupVar4 = ap;
            acutVar4.n(new acte(acupVar4));
            this.e.w(new acte(acupVar4), this.ak);
        }
    }

    private final void aH() {
        if (this.aJ) {
            this.aJ = false;
            dt mJ = mJ();
            if (mJ == null || !zdg.e(mJ)) {
                return;
            }
            Toast.makeText(mJ, rh().getString(true != aN() ? R.string.gallery_camera_launch_button_minimized_event : R.string.gallery_camera_launch_button_expanded_event), 0).show();
        }
    }

    private final void aI(boolean z) {
        dt mJ = mJ();
        int i = 1;
        if (akdr.h(mJ, 1)) {
            if (z || this.aj) {
                if (!akdr.h(mJ, 2)) {
                    i = 2;
                } else if (z) {
                    aM();
                    return;
                }
            }
            aL();
            return;
        }
        acup aO = aO(i);
        this.e.n(new acte(aO));
        this.e.w(new acte(aO), this.ak);
        acup aP = aP(i);
        this.e.n(new acte(aP));
        this.e.w(new acte(aP), this.ak);
        String[] l = akdr.l(i);
        this.d.d(l);
        if (z) {
            ab(l, i + 100);
        } else {
            ab(l, i);
        }
    }

    private final void aJ(boolean z) {
        if (this.ai) {
            aI(z);
            return;
        }
        dt mJ = mJ();
        zut aE = aE(z);
        if (this.d.k(mJ, aE.b)) {
            akdm.aE(aE.a).qv(this.z, "openSettingsDialog");
        } else {
            aI(z);
        }
    }

    private final void aL() {
        dt mJ = mJ();
        zlk zlkVar = this.az;
        if (zlkVar != null) {
            zlkVar.a();
        }
        if (this.aj) {
            zus zusVar = this.c;
            if (zusVar == null) {
                return;
            }
            zusVar.f();
            return;
        }
        this.e.d(acuo.a(18248), null, this.ak);
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (Build.VERSION.SDK_INT < 29 || !akzd.d()) {
            try {
                Uri b = zna.b(rb());
                this.ag = b;
                Uri a = zna.a(b, rb());
                if (akg.b()) {
                    intent.setClipData(ClipData.newUri(rb().getContentResolver(), "videos", a));
                    intent.setFlags(3);
                }
                intent.putExtra("output", a);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("Error occurred while generating the camera file Uri:\n");
                sb.append(valueOf);
                zep.b(sb.toString());
                Toast.makeText(mJ, rh().getString(R.string.gallery_camera_open_error), 1).show();
                return;
            }
        }
        intent.putExtra("android.intent.extra.videoQuality", 1);
        this.ae.f(new zxq());
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException e2) {
            this.ag = null;
            String valueOf2 = String.valueOf(e2.toString());
            zep.b(valueOf2.length() != 0 ? "Error occurred while trying to open an activity to handle the ACTION_VIDEO_CAPTURE intent:\n".concat(valueOf2) : new String("Error occurred while trying to open an activity to handle the ACTION_VIDEO_CAPTURE intent:\n"));
            Toast.makeText(mJ, rh().getString(R.string.camera_not_found), 1).show();
        }
    }

    private final void aM() {
        this.aB.getClass();
        zlk zlkVar = this.az;
        if (zlkVar != null) {
            zlkVar.a();
        }
        Intent intent = new Intent(rb(), this.aB);
        intent.addFlags(536870912);
        intent.putExtra("INTENT_EXTRA_REFERRER_NAME", "REFERRER_NAME_GALLERY_FRAGMENT");
        acut acutVar = this.e;
        acup acupVar = ap;
        Bundle bundle = acutVar.j.a;
        if (bundle != null && acupVar != null) {
            bundle.putInt("tracking_interaction_parent_ve", acupVar.a);
        }
        this.ae.f(new zxq());
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(mJ(), rh().getString(R.string.common_error_generic), 1).show();
        }
    }

    private final boolean aN() {
        return this.aA.getScrollY() <= this.aD / 2;
    }

    private static final acup aO(int i) {
        return i == 0 ? aq : i == 1 ? ar : as;
    }

    private static final acup aP(int i) {
        return i == 0 ? at : i == 1 ? au : av;
    }

    private final ValueAnimator s(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(125L);
        ofFloat.addUpdateListener(this.aL);
        ofFloat.addListener(this.aM);
        ofFloat.start();
        return ofFloat;
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        if (i == 1) {
            dt mJ = mJ();
            Uri uri = this.ag;
            File file = null;
            this.ag = null;
            this.ae.f(new aafx());
            if (i2 != -1) {
                if (i2 != 0) {
                    Toast.makeText(mJ, rh().getString(R.string.gallery_camera_capture_error), 1).show();
                    zep.l("Error while capturing video.");
                    return;
                } else if (this.aK) {
                    return;
                } else {
                    aG();
                    return;
                }
            }
            if (uri != null) {
                file = new File(uri.getPath());
            }
            if (file == null || !file.exists()) {
                zep.g("File does not exist at original Uri.");
                if (intent == null || intent.getData() == null) {
                    Toast.makeText(mJ, rh().getString(R.string.gallery_camera_capture_error), 1).show();
                    zep.l("File for original URI doesn't exist and intent didn't return a data Uri.");
                    return;
                }
                zep.g("Using Camera intent's Uri.");
                uri = intent.getData();
            }
            mJ.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            zus zusVar = this.c;
            if (zusVar == null) {
                return;
            }
            if (!akzd.d()) {
                uri = zna.a(uri, rb());
            }
            zusVar.h(uri, true);
            return;
        }
        if (i == 2) {
            if (i2 == 0) {
                if (!this.aK) {
                    aG();
                    return;
                }
                i2 = 0;
            }
            i = 2;
        }
        super.S(i, i2, intent);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.af = true;
        this.aK = false;
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i >= 100) {
            i -= 100;
            z = true;
        } else {
            z = false;
        }
        if (akdr.e(iArr)) {
            acup aO = aO(i);
            if (aO != null) {
                this.e.H(3, new acte(aO), this.ak);
            }
            aI(z);
            return;
        }
        acup aP = aP(i);
        if (aP != null) {
            this.e.H(3, new acte(aP), this.ak);
        }
        if (this.ai && !akdr.a(mJ(), strArr, iArr).isEmpty()) {
            akdm.aE(aE(z).a).qv(this.z, "openSettingsDialog");
        } else if (!z) {
            zag.q(mJ(), R.string.gallery_permissions_missing_camera_warning, 1);
        } else if (i == 1) {
            zag.q(mJ(), R.string.gallery_permissions_missing_camera_secondary_warning, 1);
        } else if (i != 2) {
        } else {
            zag.q(mJ(), R.string.gallery_permissions_missing_microphone_secondary_warning, 1);
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.af = false;
    }

    @Override // defpackage.nc
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        if (!aN()) {
            if (!this.aI) {
                return;
            }
            aF();
            this.aH = s(this.a.getAlpha(), 0.0f);
            this.ay.setContentDescription(rh().getString(R.string.gallery_camera_launch_button_minimized_description));
            this.aI = false;
            this.aJ = true;
        } else if (this.aI) {
        } else {
            aF();
            this.aH = s(this.a.getAlpha(), 1.0f);
            if (this.ah) {
                this.ay.setContentDescription(null);
            } else {
                this.ay.setContentDescription(rh().getString(R.string.gallery_camera_launch_button_description));
            }
            this.aI = true;
            this.aJ = true;
        }
    }

    @Override // defpackage.zvg
    public final void aK(DeviceLocalFile deviceLocalFile) {
        if (!this.af) {
            this.e.H(3, new acte(ao), this.ak);
            Uri f = deviceLocalFile.f();
            zus zusVar = this.c;
            if (zusVar == null || f == null) {
                return;
            }
            zusVar.h(f, false);
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            this.ag = (Uri) bundle.getParcelable("camera_file_uri");
            p(bundle.getString("secondary_action_class_name"));
        }
        this.aC = rh().getDimensionPixelSize(R.dimen.gallery_camera_minimized_height);
        this.aE = rh().getDimensionPixelSize(R.dimen.gallery_camera_chevron_icon_size);
        this.aG = rh().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        this.aF = rh().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3 == 0) goto L18;
     */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuu.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void n() {
        this.e.H(3, new acte(am), this.ak);
        zus zusVar = this.c;
        if (zusVar != null) {
            zusVar.g();
        }
    }

    @Override // defpackage.zuv
    public final void o() {
        if (aN()) {
            this.aA.w();
        } else {
            this.aA.v(false);
        }
        aH();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.af) {
            if (!aN()) {
                if (view != this.ay) {
                    return;
                }
                this.aA.w();
                aH();
            } else if (view == this.ay || view == this.aw) {
                this.e.H(3, new acte(an), this.ak);
                if (Build.VERSION.SDK_INT < 23) {
                    aL();
                } else {
                    aJ(false);
                }
            } else if (view != this.ax) {
            } else {
                if (Build.VERSION.SDK_INT < 23) {
                    aM();
                } else {
                    aJ(true);
                }
            }
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("camera_file_uri", this.ag);
        Class cls = this.aB;
        if (cls != null) {
            bundle.putString("secondary_action_class_name", cls.getCanonicalName());
        }
    }

    public final void p(String str) {
        this.aB = null;
        if (str != null) {
            try {
                this.aB = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
        }
    }
}
