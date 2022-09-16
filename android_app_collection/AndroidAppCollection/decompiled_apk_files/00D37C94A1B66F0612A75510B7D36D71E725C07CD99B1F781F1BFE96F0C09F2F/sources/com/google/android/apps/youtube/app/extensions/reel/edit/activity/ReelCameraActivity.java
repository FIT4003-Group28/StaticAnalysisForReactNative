package com.google.android.apps.youtube.app.extensions.reel.edit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelCameraActivity extends hkn implements hmn, acth {
    public hml b;
    public acut c;
    private apzg d;

    public final apzg b() {
        Intent intent;
        byte[] byteArrayExtra;
        if (this.d == null && (intent = getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
            try {
                this.d = (apzg) aopi.parseFrom(apzg.a, byteArrayExtra, aoos.b());
            } catch (aopx unused) {
            }
        }
        return this.d;
    }

    @Override // defpackage.hmn
    public final void c() {
        finish();
    }

    @Override // defpackage.hmn
    public final void f() {
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.c;
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        if (!((hmh) this.b.ar).a.bd()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        emn.D(this);
        super.onCreate(bundle);
        this.c.K(bundle != null ? bundle.getBundle("BUNDLE_INTERACTION_BUNDLE") : null, b());
        setContentView(R.layout.reel_camera_activity);
        dp e = getSupportFragmentManager().e(R.id.reel_creation_container);
        if (e instanceof hml) {
            hml hmlVar = (hml) e;
            this.b = hmlVar;
            hmlVar.as = this;
            return;
        }
        hml p = hml.p(b(), false, false);
        this.b = p;
        p.as = this;
        ex l = getSupportFragmentManager().l();
        l.y(R.id.reel_creation_container, this.b);
        l.a();
    }

    @Override // defpackage.oa, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.b.ar.a(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (!this.b.ar.b(i)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.b.ar.c(i)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        if (isFinishing()) {
            setRequestedOrientation(-1);
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", this.c.J());
    }
}
