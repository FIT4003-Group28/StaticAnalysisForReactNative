package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hml  reason: default package */
/* loaded from: classes3.dex */
public final class hml extends hlg implements akdz, hma, hpk, hnw, hoz, hrv, hum {
    public static final /* synthetic */ int ax = 0;
    private boolean aB;
    private apzg aC;
    private hnu aD;
    private Dialog aE;
    private avef aF;
    private avyp aG;
    private avyp aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    public zsn ae;
    public zsn af;
    public zqr ag;
    public hra ah;
    public hun ai;
    public gfu aj;
    public hlj ak;
    public hkl al;
    public akea am;
    public hmc an;
    public hpl ao;
    public axbm ap;
    public aqft aq;
    public hmn as;
    public aacz at;
    public akdy au;
    public vne aw;
    public Handler b;
    public aafo c;
    public hpc d;
    public ztl e;
    private static final long az = TimeUnit.MINUTES.toMillis(1);
    static final PermissionDescriptor[] a = {new PermissionDescriptor(0, acuo.b(31566), acuo.b(31569)), new PermissionDescriptor(1, acuo.b(31564), acuo.b(31567)), new PermissionDescriptor(2, acuo.b(31565), acuo.b(31568))};
    private static final PermissionDescriptor[] aA = new PermissionDescriptor[0];
    public final hmm ar = new hmh(this);
    public final hmi av = new hmi(this);

    public static boolean bb(apzg apzgVar) {
        return apzgVar != null && ((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apzgVar.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c > 0;
    }

    private final zqv be() {
        zwx zwxVar = (zwx) mL().f("reelEditFragment2");
        if (zwxVar == null) {
            return null;
        }
        return zwxVar.ay.q();
    }

    private final void bf(String str) {
        if (this.aB) {
            zep.c("PresetFilterDebug", str);
        }
    }

    public static hml p(apzg apzgVar, boolean z, boolean z2) {
        hml hmlVar = new hml();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        bundle.putBoolean("modify_window_fullscreen_mode", z);
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z2);
        hmlVar.ae(bundle);
        return hmlVar;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.hrv
    public final void a(axbm axbmVar) {
        zqv be = be();
        if (be != null) {
            be.a(axbmVar);
        }
    }

    @Override // defpackage.hnw
    public final void aE(final RecordingInfo recordingInfo) {
        new AlertDialog.Builder(mJ()).setTitle(N(R.string.reel_discard_editor_changes_title)).setMessage(N(R.string.reel_discard_editor_changes_description)).setPositiveButton(R.string.reel_discard_editor_changes_dialog_discard_button_text, new DialogInterface.OnClickListener() { // from class: hmd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                hml hmlVar = hml.this;
                RecordingInfo recordingInfo2 = recordingInfo;
                hmlVar.aN(false);
                if (recordingInfo2 != null && recordingInfo2.e) {
                    File file = new File(recordingInfo2.c);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                if (hmlVar.mL().f("reelEditFragment2") != null) {
                    hmlVar.aS();
                    return;
                }
                hmn hmnVar = hmlVar.as;
                if (hmnVar == null) {
                    return;
                }
                hmnVar.c();
            }
        }).setNegativeButton(R.string.reel_discard_editor_changes_dialog_cancel_button_text, (DialogInterface.OnClickListener) null).show();
    }

    @Override // defpackage.hoz
    public final void aF(avef avefVar, avyp avypVar, avyp avypVar2) {
        boolean z = true;
        if (avefVar != null && avypVar != null) {
            z = false;
        }
        aqxo.y(z);
        this.aF = avefVar;
        this.aG = avypVar;
        this.aH = avypVar2;
        if (avefVar != null) {
            this.e.c(avefVar);
            bf("ReelCreationFragment::onEffectsSettingsReceived->setSwazzleEffectsSettings");
        } else if (avypVar != null) {
            this.ae.f(avypVar, false);
        }
        if (avypVar2 != null) {
            this.af.e(avypVar2);
        }
    }

    @Override // defpackage.hvn
    public final void aG(dp dpVar) {
        ex l = mL().l();
        l.m(dpVar);
        l.a();
    }

    @Override // defpackage.hvn
    public final void aH(axbl axblVar) {
        zqv be = be();
        if (be != null) {
            be.b(axblVar);
        }
    }

    @Override // defpackage.akdz
    public final void aI() {
        hmn hmnVar = this.as;
        if (hmnVar != null) {
            hmnVar.c();
        }
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.b.post(new hmj(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    @Override // defpackage.zvg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aK(com.google.android.libraries.youtube.edit.common.DeviceLocalFile r21) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hml.aK(com.google.android.libraries.youtube.edit.common.DeviceLocalFile):void");
    }

    @Override // defpackage.hpk
    public final void aL() {
        hmn hmnVar = this.as;
        if (hmnVar != null) {
            hmnVar.c();
        }
    }

    public final void aM(dp dpVar, String str) {
        ex l = mL().l();
        l.u(R.id.reel_container, dpVar, str);
        l.a();
    }

    public final void aN(boolean z) {
        if (!this.aI || this.as == null) {
            return;
        }
        Window window = mJ().getWindow();
        if (z) {
            window.addFlags(1024);
            window.setSoftInputMode(2);
            return;
        }
        window.clearFlags(1024);
        window.setSoftInputMode(16);
        this.as.f();
    }

    @Override // defpackage.hvn
    public final void aO() {
        hnt hntVar;
        hnu hnuVar = (hnu) mL().f("reelEditFragment2");
        this.aD = hnuVar;
        if (hnuVar == null || (hntVar = hnuVar.aw) == null) {
            return;
        }
        hntVar.a.be();
    }

    @Override // defpackage.hvn
    public final void aP() {
        hnt hntVar;
        hnu hnuVar = (hnu) mL().f("reelEditFragment2");
        this.aD = hnuVar;
        if (hnuVar == null || (hntVar = hnuVar.aw) == null) {
            return;
        }
        hntVar.a.aY();
    }

    @Override // defpackage.hoz
    public final void aQ(boolean z) {
        this.aK = z;
    }

    @Override // defpackage.hvn
    public final void aR(aopa aopaVar) {
        zqv be = be();
        if (be != null) {
            be.k(aopaVar);
        }
    }

    public final void aS() {
        aqcb aqcbVar;
        int i;
        hmc hmcVar = (hmc) mL().f("cameraFragment");
        this.an = hmcVar;
        if (hmcVar == null) {
            apzg apzgVar = this.aC;
            int i2 = 0;
            if (apzgVar == null || !apzgVar.qn(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                aqcbVar = null;
            } else {
                LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) this.aC.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                int i3 = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.c;
                aqcb aqcbVar2 = (lightweightCameraEndpointOuterClass$LightweightCameraEndpoint == null || lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.size() == 0) ? null : (aqcb) ((aunb) lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.get(0)).qm(CommentStickerRendererOuterClass.commentStickerRenderer);
                if (aqcbVar2 != null) {
                    aqcbVar = aqcbVar2;
                    i2 = i3;
                    i = 1;
                    this.an = hmc.aW(i, i2 * 1000, aqcbVar, this.ae, this.e, this.aJ, this.aC);
                } else {
                    aqcbVar = aqcbVar2;
                    i2 = i3;
                }
            }
            i = 0;
            this.an = hmc.aW(i, i2 * 1000, aqcbVar, this.ae, this.e, this.aJ, this.aC);
        }
        this.an.aN(this);
        aM(this.an, "cameraFragment");
        this.d.sendEmptyMessage(3);
        if (this.aq != null) {
            this.b.post(new hmj(this, 1));
        }
        akea akeaVar = this.am;
        if (akeaVar != null) {
            akeaVar.aF(null);
            this.am = null;
        }
    }

    @Override // defpackage.hoz
    public final void aT(RecordingInfo recordingInfo, apzg apzgVar, int i) {
        aN(true);
        HashMap hashMap = new HashMap();
        hashMap.put("fragment_tag", "reelEditFragment2");
        hashMap.put("recording_info", recordingInfo);
        hashMap.put("kazoo_effects_loader", this.af);
        hashMap.put("destination_endpoint", this.aC);
        hashMap.put("comment_sticker", this.ap);
        akea akeaVar = this.am;
        if (akeaVar != null) {
            akeaVar.aF(null);
            this.am = null;
        }
        acti r = r();
        int i2 = 1 != i ? 39304 : 18044;
        if (r != null) {
            acsx acsxVar = (acsx) r;
            if (acsxVar.i != null) {
                aopa createBuilder = atnp.a.createBuilder();
                String str = acsxVar.i.a;
                createBuilder.copyOnWrite();
                atnp atnpVar = (atnp) createBuilder.instance;
                str.getClass();
                atnpVar.b = 1 | atnpVar.b;
                atnpVar.c = str;
                createBuilder.copyOnWrite();
                atnp atnpVar2 = (atnp) createBuilder.instance;
                atnpVar2.b |= 2;
                atnpVar2.d = i2;
                aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
                aopcVar.copyOnWrite();
                apzg apzgVar2 = (apzg) aopcVar.instance;
                apzgVar2.b &= -2;
                apzgVar2.c = apzg.a.c;
                apzgVar = (apzg) aopcVar.mo39build();
            }
        }
        Dialog dialog = this.aE;
        if (dialog != null) {
            dialog.dismiss();
            this.aE = null;
        }
        this.c.c(apzgVar, hashMap);
    }

    @Override // defpackage.hoz
    public final void aU() {
        Dialog dialog = new Dialog(mJ(), R.style.ReelEditToolsLoadingDialog);
        this.aE = dialog;
        dialog.setCanceledOnTouchOutside(false);
        this.aE.setContentView(R.layout.reel_loading_dialog);
        this.aE.setOnKeyListener(hme.a);
        if (this.an != null) {
            ex l = mL().l();
            l.m(this.an);
            l.a();
        }
        this.aE.show();
    }

    public final void aV() {
        if (this.am == null) {
            akdy akdyVar = this.au;
            akdyVar.e(a);
            akdyVar.d(aA);
            akdyVar.a = acuo.a(31571);
            akdyVar.b = acuo.b(31563);
            akdyVar.c = acuo.b(31570);
            akdyVar.d = acuo.b(31639);
            akdyVar.b(R.string.reel_permission_allow_access_description);
            akdyVar.c(R.string.reel_permission_open_settings_description);
            this.am = akdyVar.a();
        }
        this.am.aF(this);
        this.am.aG(new ContextThemeWrapper(mJ(), 2132083359));
        aM(this.am, "permissionRequestFragment");
    }

    public final void aW() {
        dp e;
        if (!bc() || (e = mL().e(R.id.reel_container)) == null || (e instanceof akea)) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(rb(), this.aj.a() == gfs.DARK ? 2132084065 : 2132084070);
        acti oi = e instanceof acth ? ((acth) e).oi() : null;
        if (oi != null) {
            oi.n(new acte(this.aq.n));
            apok apokVar = this.aq.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            oi.n(new acte(apojVar.t));
            apok apokVar2 = this.aq.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            oi.n(new acte(apojVar2.t));
        }
        ajgx.o(contextThemeWrapper, this.aq, this.c, oi, false, new hmk(this), null, null);
    }

    @Override // defpackage.hoz
    public final void aX(aqft aqftVar) {
        this.aq = aqftVar;
        aW();
    }

    @Override // defpackage.hnw
    public final void aY() {
        aN(false);
        hmn hmnVar = this.as;
        if (hmnVar != null) {
            hmnVar.c();
        }
    }

    public final boolean aZ() {
        return Build.VERSION.SDK_INT >= 23 && akdr.f(mJ(), a);
    }

    @Override // defpackage.hnw
    public final boolean ba() {
        return this.aK;
    }

    final boolean bc() {
        View view;
        if (!at() || this.s || this.H || !ap() || !ar() || mJ() == null || (view = this.O) == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = rect.width();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mJ().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = width;
        double d2 = displayMetrics.widthPixels;
        Double.isNaN(d2);
        return d > d2 * 0.1d;
    }

    public final boolean bd() {
        dp e = mL().e(R.id.reel_container);
        if (e instanceof hmc) {
            ((hmc) e).aK();
            return true;
        } else if (e instanceof hnu) {
            hnu hnuVar = (hnu) e;
            if (hnuVar.am.d) {
                hnuVar.aX();
            } else if (hnuVar.ak.j) {
                hnuVar.e();
            } else if (hnuVar.an.d) {
                hnuVar.h();
            } else {
                hoy hoyVar = hnuVar.aj;
                if (hoyVar.i) {
                    hoyVar.d();
                } else {
                    hmq hmqVar = hnuVar.al;
                    if (hmqVar.c) {
                        hmqVar.d();
                    } else {
                        hnuVar.af.aE(hnuVar.d.g());
                    }
                }
                hnuVar.be();
            }
            return true;
        } else if (e instanceof hpl) {
            ((hpl) e).a.aL();
            return true;
        } else if (!(e instanceof akea)) {
            return false;
        } else {
            ((akea) e).s();
            return true;
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (Build.VERSION.SDK_INT < 23) {
            hqs.j(mJ(), R.string.reel_not_supported);
            hmn hmnVar = this.as;
            if (hmnVar != null) {
                hmnVar.c();
            }
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            byte[] byteArray = bundle2.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.aC = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
                } catch (aopx unused) {
                }
            }
            this.aI = bundle2.getBoolean("modify_window_fullscreen_mode");
            this.aJ = bundle2.getBoolean("SWIPE_TO_CAMERA_ENABLED");
        }
        if (!bb(this.aC)) {
            hqs.j(mJ(), R.string.reel_camera_server_error);
            hmn hmnVar2 = this.as;
            if (hmnVar2 == null) {
                return;
            }
            hmnVar2.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hml.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final ContentResolver o() {
        return mJ().getContentResolver();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mJ().setRequestedOrientation(1);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        avef avefVar = this.aF;
        byte[] bArr = null;
        bundle.putByteArray("camera_swazzle_effects_settings_key", avefVar != null ? avefVar.toByteArray() : null);
        avyp avypVar = this.aG;
        bundle.putByteArray("camera_kazoo_effects_settings_key", avypVar != null ? avypVar.toByteArray() : null);
        avyp avypVar2 = this.aH;
        bundle.putByteArray("edit_kazoo_effects_settings_key", avypVar2 != null ? avypVar2.toByteArray() : null);
        aqft aqftVar = this.aq;
        if (aqftVar != null) {
            bundle.putByteArray("block reel_creation_key", aqftVar.toByteArray());
        }
        apzg apzgVar = this.d.e;
        if (apzgVar != null) {
            bArr = apzgVar.toByteArray();
        }
        bundle.putByteArray("reel_handler_edit_video_endpoint", bArr);
    }

    @Override // defpackage.hum
    public final hun q() {
        return this.ai;
    }

    public final acti r() {
        if (!bc()) {
            return null;
        }
        dp e = mL().e(R.id.reel_container);
        if (!(e instanceof hmc)) {
            return null;
        }
        return ((hmc) e).c;
    }

    @Override // defpackage.hnw
    public final void s() {
        aS();
    }
}
