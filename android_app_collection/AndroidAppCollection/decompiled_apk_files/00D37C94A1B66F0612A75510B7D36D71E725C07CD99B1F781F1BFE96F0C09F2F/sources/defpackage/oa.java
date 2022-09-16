package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: oa  reason: default package */
/* loaded from: classes3.dex */
public class oa extends dt implements ob, gc {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private oc mDelegate;
    private Resources mResources;

    public oa() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().b(DELEGATE_TAG, new ny(this));
        addOnContextAvailableListener(new nz(this));
    }

    private void initViewTreeOwners() {
        ao.d(getWindow().getDecorView(), this);
        ao.c(getWindow().getDecorView(), this);
        le.d(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.abp, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().b(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        nj supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar != null && supportActionBar.s()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.gb, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        nj supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.w(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return getDelegate().i(i);
    }

    public oc getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = oc.e(this, this);
        }
        return this.mDelegate;
    }

    public nk getDrawerToggleDelegate() {
        return getDelegate().d();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public nj getSupportActionBar() {
        return getDelegate().c();
    }

    @Override // defpackage.gc
    public Intent getSupportParentActivityIntent() {
        return iy.F(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().l();
    }

    @Override // defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().C();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(gd gdVar) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = iy.F(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(gdVar.b.getPackageManager());
            }
            gdVar.c(component);
            gdVar.b(supportParentActivityIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.dt, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        nj supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.a() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    @Override // defpackage.dt, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().n();
    }

    public void onPrepareSupportNavigateUpTaskStack(gd gdVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().p();
    }

    @Override // defpackage.ob
    public void onSupportActionModeFinished(re reVar) {
    }

    @Override // defpackage.ob
    public void onSupportActionModeStarted(re reVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                gd a = gd.a(this);
                onCreateSupportNavigateUpTaskStack(a);
                onPrepareSupportNavigateUpTaskStack(a);
                if (!a.a.isEmpty()) {
                    ArrayList arrayList = a.a;
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    akd.b(a.b, intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().x(charSequence);
    }

    @Override // defpackage.ob
    public re onWindowStartingSupportActionMode(rd rdVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        nj supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar != null && supportActionBar.x()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().r(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().v(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().w(i);
    }

    public re startSupportActionMode(rd rdVar) {
        return getDelegate().g(rdVar);
    }

    @Override // defpackage.dt
    public void supportInvalidateOptionsMenu() {
        getDelegate().l();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().y(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public oa(int i) {
        super(i);
        initDelegate();
    }

    @Override // defpackage.abp, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().s(view);
    }

    @Override // defpackage.abp, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().t(view, layoutParams);
    }
}
