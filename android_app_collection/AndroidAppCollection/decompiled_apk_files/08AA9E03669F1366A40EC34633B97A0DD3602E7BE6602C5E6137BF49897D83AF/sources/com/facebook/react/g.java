package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
/* compiled from: ReactActivity.java */
/* loaded from: classes.dex */
public abstract class g extends Activity implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.c {

    /* renamed from: a  reason: collision with root package name */
    private final h f3437a = b();

    protected String a() {
        return null;
    }

    protected h b() {
        return new h(this, a());
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3437a.a(bundle);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3437a.e();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f3437a.f();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f3437a.g();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3437a.a(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f3437a.a(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f3437a.h()) {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.react.modules.core.b
    public void c() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        if (!this.f3437a.a(intent)) {
            super.onNewIntent(intent);
        }
    }

    @Override // com.facebook.react.modules.core.c
    public void a(String[] strArr, int i, com.facebook.react.modules.core.d dVar) {
        this.f3437a.a(strArr, i, dVar);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3437a.a(i, strArr, iArr);
    }
}
