package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.LocationServices;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ckvk  reason: default package */
/* loaded from: classes4.dex */
public final class ckvk extends affn {
    public static final dcqe k = dcqe.c("ckvk");
    public ckvo l;
    public bvjj m;
    public bttf n;
    public btrm o;
    public boolean p;
    public boolean q;
    public boolean r;
    private final int s = R.style.GmmQuantumTheme;
    private boolean t;
    private boolean u;
    private boolean v;
    private ckvd w;

    public static boolean l(Context context) {
        return ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps");
    }

    private final void p() {
        if (this.m.m(bvjk.bR, false)) {
            j();
            return;
        }
        this.o.b(new ckvi());
        this.r = true;
        askj.a(new ckvf(this), null).e(g(), askm.class.getSimpleName());
    }

    private final void q() {
        if (l(this)) {
            k();
            return;
        }
        this.o.b(new ckvi());
        ckvo ckvoVar = this.l;
        ckvg ckvgVar = new ckvg(this);
        boolean z = true;
        if (ckvoVar.c != 1) {
            z = false;
        }
        dbsk.l(z);
        ckvoVar.d = ckvgVar;
        btsm c = btsm.c(ckvoVar.a);
        ckvoVar.c = 2;
        ckvl ckvlVar = new ckvl(ckvoVar);
        ckvm ckvmVar = new ckvm(ckvoVar);
        c.g(LocationServices.API);
        c.h(ckvlVar);
        c.i(ckvmVar);
        ckvoVar.b = c.e();
        ckvoVar.d();
    }

    private static boolean r(bttf bttfVar) {
        return bttfVar.b();
    }

    private static boolean s(Context context) {
        return context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0;
    }

    public final void j() {
        if (s(this)) {
            q();
            return;
        }
        this.o.b(new ckvi());
        this.u = true;
        this.w.a.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 0);
    }

    public final void k() {
        this.v = true;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                this.l.c();
                return;
            } else {
                bvoo.h("Unrecognized activity request code: %d", Integer.valueOf(i));
                return;
            }
        }
        ckvo ckvoVar = this.l;
        if (i2 == -1) {
            z = true;
        }
        ckvoVar.b(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        dxiq.a(this);
        super.onCreate(null);
        setTheme(this.s);
        if (this.w == null) {
            this.w = new ckvd(this);
        }
        if (this.l == null) {
            this.l = new ckvo(this, LocationServices.SettingsApi);
        }
        if (bundle != null) {
            this.t = true;
            finish();
        } else if ((getIntent().getFlags() & ImageMetadata.SHADING_MODE) != 0) {
            this.t = true;
            finish();
            startActivity(afft.a(this));
        } else if (!getIntent().getBooleanExtra("close", false)) {
            if (r(this.n)) {
                p();
                return;
            }
            this.o.b(new ckvi());
            this.p = true;
            new Handler().post(new ckve(this));
            startActivity(afft.a(this).setAction("android.intent.action.VIEW").setData(Uri.fromParts("google.maps.oob", "", null)));
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onDestroy() {
        finish();
        this.p = false;
        this.q = false;
        this.r = false;
        this.u = false;
        this.l.a();
        if (!this.t) {
            if (this.v) {
                this.o.b(new ckvj());
            } else {
                this.o.b(new ckvh());
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("close", false)) {
            this.p = false;
            this.q = false;
            this.r = false;
            this.u = false;
            this.l.a();
            finish();
            return;
        }
        this.o.b(new ckvi());
    }

    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            bvoo.h("Unrecognized permissions request code: %d", Integer.valueOf(i));
        } else if (!this.u) {
        } else {
            this.u = false;
            if (s(this)) {
                q();
                return;
            }
            Toast.makeText(this, com.google.android.apps.gmm.wearable.R.string.TOAST_NEED_LOCATION_PERMISSION, 1).show();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.q) {
            return;
        }
        this.q = false;
        if (r(this.n)) {
            p();
        } else {
            finish();
        }
    }
}
