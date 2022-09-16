package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
/* loaded from: classes.dex */
public abstract class m extends androidx.appcompat.app.d implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.e {
    private final n t = o();

    @Override // com.facebook.react.modules.core.e
    public void a(String[] strArr, int i, com.facebook.react.modules.core.f fVar) {
        this.t.a(strArr, i, fVar);
    }

    @Override // com.facebook.react.modules.core.b
    public void e() {
        super.onBackPressed();
    }

    protected n o() {
        return new n(this, p());
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.t.a(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.t.g()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.t.h();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.t.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.t.b(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.t.c(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (!this.t.a(intent)) {
            super.onNewIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.t.i();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.t.a(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.t.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.t.a(z);
    }

    protected String p() {
        return null;
    }
}
