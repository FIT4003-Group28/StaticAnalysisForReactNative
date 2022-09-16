package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import com.google.protos.youtube.api.innertube.ShortsCreationTitleRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hes  reason: default package */
/* loaded from: classes3.dex */
public final class hes extends hee implements gxh, hdy, hvn, gzu {
    public static final amuk a = amuk.r(new PermissionDescriptor(0, actj.REELS_APPROVE_STORAGE_BUTTON, actj.REELS_DENY_STORAGE_BUTTON));
    public static final amuk b = amuk.s(new PermissionDescriptor(1, actj.REELS_APPROVE_CAMERA_BUTTON, actj.REELS_DENY_CAMERA_BUTTON), new PermissionDescriptor(2, actj.REELS_APPROVE_MICROPHONE_BUTTON, actj.REELS_DENY_MICROPHONE_BUTTON));
    private aypg aA;
    private int aB;
    private int aC;
    public hkl ae;
    public aafo af;
    public hki ag;
    public acti ah;
    public hhl ai;
    public hfn aj;
    public hkg ak;
    public hho al;
    public her an;
    public apzg ao;
    public aqft ap;
    public hhp aq;
    public zwn ar;
    public Context at;
    public boolean au;
    public gyn av;
    public vne aw;
    public hhe ax;
    private apzg az;
    public Handler c;
    public hef d;
    public gfu e;
    public long as = 0;
    public final hmm am = new hep(this);

    private final zqv aS() {
        dp f = mL().f("editFragment");
        if (f instanceof zqw) {
            return ((zqw) f).q();
        }
        return null;
    }

    private final void aU(gxk gxkVar) {
        gxkVar.getClass();
        gxkVar.e = this;
    }

    private final void aV(hdz hdzVar) {
        hdzVar.getClass();
        hdzVar.d = this;
    }

    private final void aW(dp dpVar, String str) {
        ex l = mL().l();
        l.u(R.id.reel_container, dpVar, str);
        l.a();
    }

    private final void aX() {
        aK(gyq.d(this.ah, this.ao, 98539));
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        dt mJ = mJ();
        if (this.aq != null && mJ != null && mJ.isFinishing()) {
            this.aq.n();
        }
        ayqi.c((AtomicReference) this.aA);
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        zwn zwnVar = this.ar;
        if (zwnVar != null) {
            zwnVar.b(i, strArr, iArr);
        } else {
            zep.b("No active PermissionRequester to handle PermissionsResult");
        }
    }

    public final void aE() {
        gxk gxkVar = (gxk) mL().f("cameraFragment");
        if (gxkVar != null) {
            gxkVar.s();
        }
    }

    public final void aF(int i) {
        aT(null, i);
    }

    @Override // defpackage.hvn
    public final void aG(dp dpVar) {
        ex l = mL().l();
        l.m(dpVar);
        l.a();
    }

    @Override // defpackage.hvn
    public final void aH(axbl axblVar) {
        zqv aS = aS();
        if (aS != null) {
            aS.b(axblVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r7 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aI(com.google.android.libraries.youtube.edit.common.DeviceLocalFile r12, int r13) {
        /*
            r11 = this;
            android.net.Uri r0 = r12.f()
            dt r1 = r11.mJ()
            r2 = 0
            if (r1 == 0) goto L14
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = r1.getType(r0)
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 2132019113(0x7f1407a9, float:1.9676552E38)
            if (r0 == 0) goto Le5
            java.lang.String r3 = "video/"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto Le5
            dt r0 = r11.mJ()
            android.net.Uri r12 = r12.f()
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            if (r0 == 0) goto Lae
            android.content.res.AssetFileDescriptor r4 = defpackage.vfq.d(r0, r12)     // Catch: java.lang.Exception -> Lb6
            java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch: java.lang.Exception -> Lb6
            r3.setDataSource(r4)     // Catch: java.lang.Exception -> Lb6
            r3.setDataSource(r0, r12)     // Catch: java.lang.Exception -> Lb6
            r0 = 9
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch: java.lang.Exception -> Lb6
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> Lb6
            r0 = 18
            r6 = 0
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r0 == 0) goto L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            goto L58
        L57:
            r0 = 0
        L58:
            r7 = 19
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r7 == 0) goto L65
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            goto L66
        L65:
            r7 = 0
        L66:
            r8 = 24
            java.lang.String r8 = r3.extractMetadata(r8)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r8 == 0) goto L80
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            r9 = 90
            if (r8 == r9) goto L7a
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 != r9) goto L80
        L7a:
            r10 = r7
            r7 = r0
            r0 = r10
            goto L80
        L7e:
            r0 = 0
            r7 = 0
        L80:
            if (r0 == 0) goto L85
            if (r7 != 0) goto L96
            goto L86
        L85:
            r6 = r7
        L86:
            android.graphics.Bitmap r7 = r3.getFrameAtTime()     // Catch: java.lang.Exception -> Lb6
            if (r7 == 0) goto L95
            int r0 = r7.getWidth()     // Catch: java.lang.Exception -> Lb6
            int r7 = r7.getHeight()     // Catch: java.lang.Exception -> Lb6
            goto L96
        L95:
            r7 = r6
        L96:
            r3.release()     // Catch: java.lang.Exception -> Lb6
            gyr r3 = com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata.e()     // Catch: java.lang.Exception -> Lb6
            r3.c(r12)     // Catch: java.lang.Exception -> Lb6
            r3.e(r0)     // Catch: java.lang.Exception -> Lb6
            r3.b(r7)     // Catch: java.lang.Exception -> Lb6
            r3.d(r4)     // Catch: java.lang.Exception -> Lb6
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata r2 = r3.a()     // Catch: java.lang.Exception -> Lb6
            goto Lbb
        Lae:
            java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "Activity destroyed."
            r12.<init>(r0)     // Catch: java.lang.Exception -> Lb6
            throw r12     // Catch: java.lang.Exception -> Lb6
        Lb6:
            java.lang.String r12 = "Failed loading video from camera roll."
            defpackage.zep.b(r12)
        Lbb:
            if (r2 == 0) goto Ldd
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.$AutoValue_ShortsVideoMetadata r2 = (com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.C$AutoValue_ShortsVideoMetadata) r2
            int r12 = r2.c
            if (r12 == 0) goto Ldd
            long r0 = r2.d
            int r12 = r11.aC
            long r3 = (long) r12
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 >= 0) goto Ld7
            dt r12 = r11.mJ()
            r13 = 2132019114(0x7f1407aa, float:1.9676554E38)
            defpackage.hqs.j(r12, r13)
            return
        Ld7:
            android.net.Uri r12 = r2.a
            r11.aT(r12, r13)
            return
        Ldd:
            dt r12 = r11.mJ()
            defpackage.hqs.j(r12, r1)
            return
        Le5:
            dt r12 = r11.mJ()
            defpackage.hqs.j(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.aI(com.google.android.libraries.youtube.edit.common.DeviceLocalFile, int):void");
    }

    public final void aJ(boolean z) {
        aQ(z, gyq.d(this.ah, this.ao, 99212));
    }

    public final void aK(apzg apzgVar) {
        hdz hdzVar = (hdz) mL().f("galleryFragment");
        if (hdzVar == null) {
            hdzVar = hdz.aG(false, apzgVar);
        }
        aV(hdzVar);
        aW(hdzVar, "galleryFragment");
        if (this.ap != null) {
            this.c.post(new hei(this));
        }
    }

    public final void aL(final int i, final int i2, final acti actiVar) {
        final dt mJ = mJ();
        if (mJ == null) {
            return;
        }
        mJ.runOnUiThread(new Runnable() { // from class: hej
            @Override // java.lang.Runnable
            public final void run() {
                hes hesVar = hes.this;
                final acti actiVar2 = actiVar;
                int i3 = i;
                int i4 = i2;
                final Activity activity = mJ;
                if (actiVar2 != null) {
                    actiVar2.n(new acte(acuo.b(31639)));
                    actiVar2.n(new acte(acuo.b(31570)));
                }
                nw nwVar = new nw(hesVar.at);
                nwVar.n(i3);
                nwVar.f(i4);
                nwVar.l(activity.getString(R.string.shorts_permission_open_settings_dialog_confirm), new DialogInterface.OnClickListener() { // from class: hem
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        acti actiVar3 = acti.this;
                        Activity activity2 = activity;
                        amuk amukVar = hes.a;
                        if (actiVar3 != null) {
                            actiVar3.H(3, new acte(acuo.b(31639)), null);
                        }
                        akdr.c(activity2);
                    }
                });
                nwVar.i(activity.getString(R.string.shorts_permission_open_settings_dialog_dismiss), new DialogInterface.OnClickListener() { // from class: hel
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        acti actiVar3 = acti.this;
                        amuk amukVar = hes.a;
                        if (actiVar3 != null) {
                            actiVar3.H(3, new acte(acuo.b(31570)), null);
                        }
                    }
                });
                nwVar.q();
            }
        });
    }

    public final boolean aM(dp dpVar) {
        return (mJ().getSupportFragmentManager() == null || mJ().getSupportFragmentManager().a() <= 0) && dpVar != null && dpVar.at() && (dpVar instanceof gxk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aN() {
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

    @Override // defpackage.hvn
    public final void aO() {
    }

    @Override // defpackage.hvn
    public final void aP() {
    }

    public final void aQ(boolean z, apzg apzgVar) {
        gxk gxkVar = (gxk) mL().f("cameraFragment");
        if (gxkVar == null) {
            gxkVar = gxk.aW(z, apzgVar);
        }
        aU(gxkVar);
        this.ak.e(true);
        aW(gxkVar, "cameraFragment");
        if (this.ap != null) {
            this.c.post(new hei(this));
        }
    }

    @Override // defpackage.hvn
    public final void aR(aopa aopaVar) {
        zqv aS = aS();
        if (aS != null) {
            aS.k(aopaVar);
        }
    }

    @Override // defpackage.gzu
    public final void b() {
        dp f = mL().f("editFragment");
        if (f != null) {
            if (f instanceof acth) {
                acti oi = ((acth) f).oi();
                if (hhp.D(this.aq)) {
                    aQ(false, gyq.d(oi, this.ao, 96638));
                    return;
                } else {
                    aF(4);
                    return;
                }
            }
            throw new RuntimeException("Edit fragment doesn't supply interaction logger");
        }
        her herVar = this.an;
        if (herVar == null) {
            return;
        }
        herVar.b(false);
    }

    @Override // defpackage.hdy
    public final void e() {
        if (!this.au) {
            aQ(false, gyq.d(q(), this.ao, 96638));
            return;
        }
        her herVar = this.an;
        if (herVar == null) {
            return;
        }
        herVar.b(false);
    }

    @Override // defpackage.gxh, defpackage.hdy
    public final void lP() {
        hen henVar = new hen(this, q(), 2);
        ylx.o(this, this.aw.a(), new heo(henVar, 1), new heo(henVar));
    }

    @Override // defpackage.hdy
    public final void lQ(DeviceLocalFile deviceLocalFile) {
        aI(deviceLocalFile, 0);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        float f;
        byte[] byteArray;
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("navigation_endpoint")) != null) {
            try {
                this.ao = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
            } catch (aopx unused) {
            }
        }
        this.aB = this.ae.a();
        int b2 = this.ae.b();
        this.aC = b2;
        hho hhoVar = this.al;
        int i = this.aB;
        if (bundle != null) {
            hhoVar.b = bundle.getInt("MIN_SEGMENT_DURATION_KEY");
            hhoVar.b = bundle.getInt("MIN_PROJECT_DURATION_KEY");
            hhoVar.c = bundle.getInt("MAX_PROJECT_DURATION_KEY");
            hhoVar.d = bundle.getInt("CURRENT_PROJECT_DURATION_KEY");
            f = bundle.getFloat("SPEED_MULTIPLIER_KEY");
        } else {
            hhoVar.a = 160;
            hhoVar.b = b2;
            hhoVar.c = i;
            f = 1.0f;
        }
        hhoVar.e = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e5, code lost:
        if (r2 != 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ee, code lost:
        if (r5.x() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putBoolean("gallery_opened_on_create", this.au);
        hhp hhpVar = this.aq;
        if (hhpVar != null) {
            hhpVar.q(bundle);
        }
        hef hefVar = this.d;
        avef avefVar = hefVar.c;
        byte[] bArr = null;
        bundle.putByteArray("camera_swazzle_effects_settings_key", avefVar != null ? avefVar.toByteArray() : null);
        avyp avypVar = hefVar.d;
        if (avypVar != null) {
            bArr = avypVar.toByteArray();
        }
        bundle.putByteArray("edit_kazoo_effects_settings_key", bArr);
        ShortsCreationSelectedTrack a2 = this.aj.a();
        if (a2 != null) {
            bundle.putParcelable("shorts_selected_audio_track", a2);
        }
        hho hhoVar = this.al;
        bundle.putInt("MIN_SEGMENT_DURATION_KEY", hhoVar.a);
        bundle.putInt("MIN_PROJECT_DURATION_KEY", hhoVar.b);
        bundle.putInt("MAX_PROJECT_DURATION_KEY", hhoVar.c);
        bundle.putInt("CURRENT_PROJECT_DURATION_KEY", hhoVar.d);
        bundle.putFloat("SPEED_MULTIPLIER_KEY", hhoVar.e);
    }

    public final gxk p() {
        dp e;
        if (hqs.i(this) && (e = mL().e(R.id.reel_container)) != null && hqs.i(e) && (e instanceof gxk)) {
            return (gxk) e;
        }
        return null;
    }

    public final acti q() {
        if (!aN()) {
            return null;
        }
        dp e = mL().e(R.id.reel_container);
        if (e instanceof gxk) {
            return ((gxk) e).ae;
        }
        if (e instanceof hjm) {
            return ((hjm) e).at;
        }
        if (e instanceof gzt) {
            return ((gzt) e).a;
        }
        if (!(e instanceof hdz)) {
            return null;
        }
        return ((hdz) e).ag;
    }

    public final ampq r() {
        apzg apzgVar = this.ao;
        if (apzgVar == null || apzgVar.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            for (aunb aunbVar : ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) this.ao.qm(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c) {
                if (aunbVar.qn(auut.a)) {
                    return ampq.j((auus) aunbVar.qm(auut.a));
                }
            }
            return amon.a;
        }
        return amon.a;
    }

    public final ampq s() {
        apzg apzgVar = this.ao;
        if (apzgVar == null || apzgVar.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            for (aunb aunbVar : ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) this.ao.qm(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c) {
                if (aunbVar.qn(ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer)) {
                    return ampq.j((auux) aunbVar.qm(ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer));
                }
            }
            return amon.a;
        }
        return amon.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aT(android.net.Uri r25, int r26) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.aT(android.net.Uri, int):void");
    }
}
