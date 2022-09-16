package com.google.android.libraries.youtube.mdx.smartremote;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxSmartRemoteActivity extends adrw implements akdz {
    public acti c;
    public akdr d;
    public int e;
    public int f = 1;
    public akdy g;
    private eo j;
    private akea k;
    private static final String h = zep.a("MDX.MdxSmartRemoteActivity");
    private static final PermissionDescriptor[] i = new PermissionDescriptor[0];
    static final PermissionDescriptor[] b = {new PermissionDescriptor(2, acuo.b(65799), acuo.b(65800))};

    private final int j() {
        int i2 = 0;
        int intExtra = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", 0);
        int[] iArr = {1, 2, 3, 4, 5};
        if (intExtra < 0 || intExtra >= 5) {
            zep.b("Invalid UI mode.");
        } else {
            i2 = iArr[intExtra];
        }
        this.f = i2;
        if (i2 == 0) {
            zep.c(h, "Starting UI mode was invalid.");
            this.f = 1;
            return 1;
        }
        return i2;
    }

    @Override // defpackage.aczn
    protected final int a() {
        int j = j();
        this.f = j;
        return (j != 3 || Build.VERSION.SDK_INT < 23 || !akdr.f(this, b)) ? 0 : 1;
    }

    @Override // defpackage.akdz
    public final void aI() {
        if (this.f == 4) {
            aczo.a(this, MdxSmartRemoteActivity.class, 0);
        } else {
            finish();
        }
    }

    @Override // defpackage.akdz
    public final void aJ() {
        aczo.a(this, MdxSmartRemoteActivity.class, 0);
    }

    @Override // defpackage.aczn
    protected final void f(int i2, Activity activity) {
        if (i2 == 0) {
            activity.setTitle(R.string.mdx_smart_remote_title);
        } else if (i2 == 1) {
            activity.setTitle(R.string.mdx_smart_remote_permission_fragment_title);
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.aczn
    protected final boolean g(int i2, dp dpVar) {
        if (i2 != 0) {
            if (i2 == 1) {
                return dpVar instanceof akea;
            }
            return false;
        }
        return dpVar instanceof adsj;
    }

    @Override // defpackage.aczn
    protected final boolean h(int i2) {
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            aI();
            return true;
        }
        aczo.a(this, MdxSmartRemoteActivity.class, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aczn, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = j();
        this.e = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog_Alert);
        eo supportFragmentManager = getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null) {
            akea akeaVar = (akea) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.k = akeaVar;
            if (akeaVar == null || akdr.f(this, b)) {
                return;
            }
            ex l = this.j.l();
            l.l(this.k);
            l.a();
        }
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 != 1234) {
            if (i2 != 65538 || !(getSupportFragmentManager().e(16908290) instanceof akea)) {
                return;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (this.d.k(this, new String[]{"android.permission.RECORD_AUDIO"})) {
                    this.c.H(3, new acte(acuo.b(69588)), null);
                } else {
                    this.c.H(3, new acte(acuo.b(69586)), null);
                }
                finish();
                return;
            }
            this.c.H(3, new acte(acuo.b(69585)), null);
            aJ();
            return;
        }
        dp e = getSupportFragmentManager().e(16908290);
        if (!(e instanceof adsj)) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            adsg adsgVar = ((adsj) e).a;
            View view = adsgVar.m;
            if (view == null) {
                return;
            }
            aloh n = aloh.n(view, R.string.mdx_smart_remote_no_microphone_detected_error_message);
            n.o(n.d.getText(R.string.mdx_smart_remote_navigate_to_settings_action_button_text), new adsa(adsgVar, 5));
            n.g();
            adsgVar.h.n(new acte(acuo.b(63269)));
            return;
        }
        ((adsj) e).a.h();
    }

    @Override // defpackage.aczn
    protected final dp b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                this.c.n(new acte(acuo.b(69585)));
                this.c.n(new acte(acuo.b(69586)));
                this.c.n(new acte(acuo.b(69588)));
                akdy akdyVar = this.g;
                akdyVar.e(b);
                akdyVar.d(i);
                akdyVar.a = acuo.a(69692);
                akdyVar.b = acuo.b(73767);
                akdyVar.c = acuo.b(73768);
                akdyVar.d = acuo.b(69587);
                akdyVar.b(R.string.mdx_smart_remote_permission_allow_access_description);
                akdyVar.c(R.string.mdx_smart_remote_permission_open_settings_description);
                akdyVar.e = R.string.mdx_smart_remote_permission_fragment_title;
                akdx a = akdyVar.a();
                a.d = new ack(this, 2132083222);
                a.a = this;
                return a;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return new adsj();
    }
}
