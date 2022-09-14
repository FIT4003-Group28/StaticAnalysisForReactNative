package androidx.appcompat.app;

import a.a.o.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.core.app.n;
/* loaded from: classes.dex */
public class d extends androidx.fragment.app.c implements e, n.a, b {
    private f r;
    private Resources s;

    private boolean a(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.e
    public a.a.o.b a(b.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.e
    public void a(a.a.o.b bVar) {
    }

    public void a(Intent intent) {
        androidx.core.app.e.a(this, intent);
    }

    public void a(Toolbar toolbar) {
        k().a(toolbar);
    }

    public void a(n nVar) {
        nVar.a((Activity) this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        k().a(context);
    }

    @Override // androidx.appcompat.app.e
    public void b(a.a.o.b bVar) {
    }

    public void b(n nVar) {
    }

    public boolean b(Intent intent) {
        return androidx.core.app.e.b(this, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a l = l();
        if (getWindow().hasFeature(0)) {
            if (l != null && l.e()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a l = l();
        if (keyCode != 82 || l == null || !l.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.app.n.a
    public Intent f() {
        return androidx.core.app.e.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) k().a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return k().b();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.s == null && c1.b()) {
            this.s = new c1(this, super.getResources());
        }
        Resources resources = this.s;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        k().e();
    }

    @Override // androidx.fragment.app.c
    public void j() {
        k().e();
    }

    public f k() {
        if (this.r == null) {
            this.r = f.a(this, this);
        }
        return this.r;
    }

    public a l() {
        return k().c();
    }

    @Deprecated
    public void m() {
    }

    public boolean n() {
        Intent f2 = f();
        if (f2 != null) {
            if (!b(f2)) {
                a(f2);
                return true;
            }
            n a2 = n.a((Context) this);
            a(a2);
            b(a2);
            a2.a();
            try {
                androidx.core.app.a.a((Activity) this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            this.s.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        k().a(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        f k = k();
        k.d();
        k.a(bundle);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a l = l();
        if (menuItem.getItemId() == 16908332 && l != null && (l.g() & 4) != 0) {
            return n();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        k().b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        k().g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k().c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        k().h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        k().i();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a l = l();
        if (getWindow().hasFeature(0)) {
            if (l != null && l.k()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        k().c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        k().d(i);
    }
}
