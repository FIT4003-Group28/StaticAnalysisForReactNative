package androidx.core.app;

import a.g.m.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.q;
/* loaded from: classes.dex */
public class d extends Activity implements androidx.lifecycle.i, e.a {

    /* renamed from: b  reason: collision with root package name */
    private androidx.lifecycle.j f1505b;

    public d() {
        new a.e.g();
        this.f1505b = new androidx.lifecycle.j(this);
    }

    @Override // a.g.m.e.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.m.e.a(decorView, keyEvent)) {
            return a.g.m.e.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.m.e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f1505b.a(f.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
