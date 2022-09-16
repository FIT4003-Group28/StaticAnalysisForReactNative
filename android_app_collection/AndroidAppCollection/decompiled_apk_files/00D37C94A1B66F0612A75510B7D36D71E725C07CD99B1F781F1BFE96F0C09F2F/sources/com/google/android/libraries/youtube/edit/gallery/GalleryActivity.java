package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CameraEndpointOuterClass;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryActivity extends zuy implements zus, akdz {
    private zun A;
    private String C;
    private int D;
    public aadd b;
    public acut c;
    public yni d;
    public akyh e;
    public akzg f;
    public Handler g;
    public ankw h;
    public zuu i;
    public akea j;
    public aacz m;
    public akdy n;
    public aqxo o;
    private zmp r;
    private apzg t;
    private PermissionDescriptor[] u;
    private PermissionDescriptor[] v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;
    private static final long q = TimeUnit.DAYS.toSeconds(7);
    public static final zdt a = zbx.c;
    public boolean k = true;
    public boolean l = false;
    private boolean s = false;
    private boolean B = false;

    public static znh a(Context context) {
        return new znh(context, 2, "gallery", q, new zgi());
    }

    public static boolean k() {
        return Camera.getNumberOfCameras() > 0;
    }

    private final asjj m() {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = aske.a.createBuilder();
        String str = this.C;
        createBuilder2.copyOnWrite();
        aske askeVar = (aske) createBuilder2.instance;
        str.getClass();
        askeVar.b |= 1;
        askeVar.c = str;
        createBuilder.aq(createBuilder2);
        return (asjj) createBuilder.mo39build();
    }

    private final void n() {
        zmp zmpVar = this.r;
        if (zmpVar != null) {
            zmpVar.au = null;
            this.r = null;
        }
    }

    private final void o() {
        zuu zuuVar = this.i;
        if (zuuVar != null) {
            zuuVar.c = null;
            this.i = null;
        }
    }

    private final void p() {
        akea akeaVar = this.j;
        if (akeaVar != null) {
            akeaVar.aF(null);
            this.j = null;
        }
    }

    private final void q(dp dpVar) {
        ex l = getSupportFragmentManager().l();
        l.y(R.id.gallery_container, dpVar);
        l.a();
    }

    private final void r() {
        if (this.r == null) {
            int i = this.D;
            zmp zmpVar = new zmp();
            Bundle bundle = new Bundle();
            bundle.putInt("TARGET_VIDEO_QUALITY", i);
            zmpVar.ae(bundle);
            this.r = zmpVar;
        }
        zun zunVar = new zun(this);
        this.A = zunVar;
        zmp zmpVar2 = this.r;
        zmpVar2.au = zunVar;
        zmpVar2.e = m();
        setRequestedOrientation(1);
    }

    private final void s() {
        if (this.i == null) {
            this.i = new zuu();
        }
        zuu zuuVar = this.i;
        zuuVar.c = this;
        zuuVar.ak = m();
        zuu zuuVar2 = this.i;
        zuuVar2.aj = this.z;
        zuuVar2.ai = this.y;
    }

    private final void t() {
        if (this.j == null) {
            akdy akdyVar = this.n;
            akdyVar.e(this.u);
            akdyVar.a = acuo.a(18635);
            akdyVar.b = acuo.b(18638);
            akdyVar.c = acuo.b(18636);
            akdyVar.d = acuo.b(18637);
            akdyVar.b(this.w);
            akdyVar.c(this.x);
            PermissionDescriptor[] permissionDescriptorArr = this.v;
            if (permissionDescriptorArr != null) {
                this.n.d(permissionDescriptorArr);
            }
            this.j = this.n.a();
        }
        this.j.aF(this);
        this.j.aE(m());
    }

    @Override // defpackage.akdz
    public final void aI() {
        finish();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.g.post(new Runnable() { // from class: zum
            @Override // java.lang.Runnable
            public final void run() {
                GalleryActivity galleryActivity = GalleryActivity.this;
                if (galleryActivity.j == null || galleryActivity.i != null) {
                    return;
                }
                if (!galleryActivity.k) {
                    galleryActivity.j();
                } else {
                    galleryActivity.l = true;
                }
            }
        });
    }

    public final apzg b() {
        Intent intent;
        byte[] byteArrayExtra;
        if (this.t == null && (intent = getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
            try {
                this.t = (apzg) aopi.parseFrom(apzg.a, byteArrayExtra, aoos.b());
            } catch (aopx unused) {
            }
        }
        return this.t;
    }

    public final void c(Uri uri, int i, Bundle bundle) {
        Intent intent = new Intent("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.setDataAndType(uri, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", this.C);
        avvf avvfVar = this.b.a().h;
        if (avvfVar == null) {
            avvfVar = avvf.a;
        }
        intent.putExtra("navigate_to_my_uploads", !avvfVar.w);
        intent.putExtras(bundle);
        startActivityForResult(intent, i);
    }

    @Override // defpackage.zus
    public final void f() {
        i();
    }

    @Override // defpackage.zus
    public final void g() {
        finish();
    }

    @Override // defpackage.zus
    public final void h(Uri uri, boolean z) {
        avuk avukVar;
        if (uri != null) {
            Bundle bundle = new Bundle();
            apzg b = b();
            int i = 902;
            if (b != null && b.qn(CameraEndpointOuterClass.cameraEndpoint) && (((appi) b.qm(CameraEndpointOuterClass.cameraEndpoint)).b & 4) != 0) {
                bundle.putBoolean("video_show_metadata", false);
                bundle.putBoolean("navigate_to_my_uploads", false);
                apzg b2 = b();
                int i2 = -1;
                if (b2 != null && b2.qn(CameraEndpointOuterClass.cameraEndpoint)) {
                    appi appiVar = (appi) b2.qm(CameraEndpointOuterClass.cameraEndpoint);
                    if ((appiVar.b & 4) != 0) {
                        avxa avxaVar = appiVar.d;
                        if (avxaVar == null) {
                            avxaVar = avxa.a;
                        }
                        i2 = avxaVar.b;
                    }
                }
                bundle.putInt("video_time_limit_seconds", i2);
                i = 1800;
            }
            if (z) {
                avukVar = avuk.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
            } else {
                avukVar = avuk.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
            }
            bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", avukVar.k);
            c(uri, i, bundle);
        }
    }

    final void i() {
        aqxo.y(this.z);
        r();
        q(this.r);
        p();
        o();
    }

    public final void j() {
        aqxo.y(this.i == null);
        s();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.i.p(extras.getString("extra_gallery_secondary_action_class"));
        }
        setRequestedOrientation(-1);
        q(this.i);
        p();
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || !intent.getBooleanExtra("close_gallery_on_successful_upload", false) || i2 != -1) {
            if (i == 902) {
                if (i2 == 0 && this.k) {
                    if (!this.B) {
                        if (this.i != null) {
                            o();
                            this.l = true;
                        } else if (this.r != null) {
                            n();
                            this.s = true;
                        }
                    }
                    String str = this.C;
                    if (str == null || akzg.f(str)) {
                        return;
                    }
                    this.C = this.f.b();
                    zmp zmpVar = this.r;
                    if (zmpVar != null) {
                        zmpVar.e = m();
                    }
                    zuu zuuVar = this.i;
                    if (zuuVar != null) {
                        zuuVar.ak = m();
                    }
                    akea akeaVar = this.j;
                    if (akeaVar == null) {
                        return;
                    }
                    akeaVar.aE(m());
                    return;
                }
                i = 902;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        akea akeaVar = this.j;
        if (akeaVar != null) {
            akeaVar.s();
            return;
        }
        zuu zuuVar = this.i;
        if (zuuVar != null) {
            if (zuuVar.af) {
                return;
            }
            zuuVar.n();
            return;
        }
        zmp zmpVar = this.r;
        if (zmpVar == null) {
            super.onBackPressed();
            return;
        }
        zun zunVar = zmpVar.au;
        if (zunVar == null) {
            return;
        }
        zunVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196  */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.gallery.GalleryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (!isFinishing() || (str = this.C) == null || !akzg.f(str)) {
            return;
        }
        this.e.c(this.C, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.k = true;
        this.B = false;
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.k = false;
        if (this.l) {
            if (this.i == null) {
                j();
            }
            this.l = false;
        } else if (!this.s) {
        } else {
            if (this.r == null) {
                i();
            }
            this.s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.c.J());
        bundle.putString("frontend_upload_id", this.C);
    }
}
