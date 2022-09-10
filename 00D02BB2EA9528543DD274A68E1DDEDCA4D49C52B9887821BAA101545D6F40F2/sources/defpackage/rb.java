package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: rb  reason: default package */
/* loaded from: classes.dex */
public class rb extends ff implements rc, ix {
    private rd Ja;

    public rb() {
        Qg().b("androidx:appcompat", new qz(this));
        ra raVar = new ra(this);
        agn agnVar = this.f;
        if (agnVar.b != null) {
            Context context = agnVar.b;
            raVar.a();
        }
        agnVar.a.add(raVar);
    }

    private final void o() {
        ay.a(getWindow().getDecorView(), this);
        az.a(getWindow().getDecorView(), this);
        avs.a(getWindow().getDecorView(), this);
    }

    public final qk NI() {
        return k().c();
    }

    @Override // defpackage.ix
    public final Intent SB() {
        return hv.a(this);
    }

    @Override // defpackage.agi, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        k().i(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        rv rvVar = (rv) k();
        rvVar.A = true;
        int J = rvVar.J(context, rvVar.K());
        Configuration configuration = null;
        if (rv.e && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(rv.L(context, J, null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof uf) {
            try {
                ((uf) context).a(rv.L(context, J, null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (rv.d) {
            try {
                Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
                Configuration configuration3 = context.getResources().getConfiguration();
                if (!configuration2.equals(configuration3)) {
                    configuration = new Configuration();
                    configuration.fontScale = 0.0f;
                    if (configuration3 != null && configuration2.diff(configuration3) != 0) {
                        if (configuration2.fontScale != configuration3.fontScale) {
                            configuration.fontScale = configuration3.fontScale;
                        }
                        if (configuration2.mcc != configuration3.mcc) {
                            configuration.mcc = configuration3.mcc;
                        }
                        if (configuration2.mnc != configuration3.mnc) {
                            configuration.mnc = configuration3.mnc;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            LocaleList locales = configuration2.getLocales();
                            LocaleList locales2 = configuration3.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration.setLocales(locales2);
                                configuration.locale = configuration3.locale;
                            }
                        } else if (!Objects.equals(configuration2.locale, configuration3.locale)) {
                            configuration.locale = configuration3.locale;
                        }
                        if (configuration2.touchscreen != configuration3.touchscreen) {
                            configuration.touchscreen = configuration3.touchscreen;
                        }
                        if (configuration2.keyboard != configuration3.keyboard) {
                            configuration.keyboard = configuration3.keyboard;
                        }
                        if (configuration2.keyboardHidden != configuration3.keyboardHidden) {
                            configuration.keyboardHidden = configuration3.keyboardHidden;
                        }
                        if (configuration2.navigation != configuration3.navigation) {
                            configuration.navigation = configuration3.navigation;
                        }
                        if (configuration2.navigationHidden != configuration3.navigationHidden) {
                            configuration.navigationHidden = configuration3.navigationHidden;
                        }
                        if (configuration2.orientation != configuration3.orientation) {
                            configuration.orientation = configuration3.orientation;
                        }
                        if ((configuration2.screenLayout & 15) != (configuration3.screenLayout & 15)) {
                            configuration.screenLayout |= configuration3.screenLayout & 15;
                        }
                        if ((configuration2.screenLayout & 192) != (configuration3.screenLayout & 192)) {
                            configuration.screenLayout |= configuration3.screenLayout & 192;
                        }
                        if ((configuration2.screenLayout & 48) != (configuration3.screenLayout & 48)) {
                            configuration.screenLayout |= configuration3.screenLayout & 48;
                        }
                        if ((configuration2.screenLayout & 768) != (configuration3.screenLayout & 768)) {
                            configuration.screenLayout |= configuration3.screenLayout & 768;
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            if ((configuration2.colorMode & 3) != (configuration3.colorMode & 3)) {
                                configuration.colorMode |= configuration3.colorMode & 3;
                            }
                            if ((configuration2.colorMode & 12) != (configuration3.colorMode & 12)) {
                                configuration.colorMode |= configuration3.colorMode & 12;
                            }
                        }
                        if ((configuration2.uiMode & 15) != (configuration3.uiMode & 15)) {
                            configuration.uiMode |= configuration3.uiMode & 15;
                        }
                        if ((configuration2.uiMode & 48) != (configuration3.uiMode & 48)) {
                            configuration.uiMode |= configuration3.uiMode & 48;
                        }
                        if (configuration2.screenWidthDp != configuration3.screenWidthDp) {
                            configuration.screenWidthDp = configuration3.screenWidthDp;
                        }
                        if (configuration2.screenHeightDp != configuration3.screenHeightDp) {
                            configuration.screenHeightDp = configuration3.screenHeightDp;
                        }
                        if (configuration2.smallestScreenWidthDp != configuration3.smallestScreenWidthDp) {
                            configuration.smallestScreenWidthDp = configuration3.smallestScreenWidthDp;
                        }
                        if (configuration2.densityDpi != configuration3.densityDpi) {
                            configuration.densityDpi = configuration3.densityDpi;
                        }
                    }
                }
                Configuration L = rv.L(context, J, configuration);
                uf ufVar = new uf(context, (int) R.style.Theme_AppCompat_Empty);
                ufVar.a(L);
                try {
                    if (context.getTheme() != null) {
                        Resources.Theme theme = ufVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            jz.a(theme);
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            jy.a(theme);
                        }
                    }
                } catch (NullPointerException unused3) {
                }
                context = ufVar;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Application failed to obtain resources from itself", e);
            }
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        NI();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.iw, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        NI();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.ff
    public final void f() {
        k().k();
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        return (T) k().e(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        rv rvVar = (rv) k();
        if (rvVar.k == null) {
            rvVar.u();
            qk qkVar = rvVar.j;
            rvVar.k = new ul(qkVar != null ? qkVar.d() : rvVar.g);
        }
        return rvVar.k;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().k();
    }

    public final rd k() {
        if (this.Ja == null) {
            this.Ja = rd.a(this, this);
        }
        return this.Ja;
    }

    @Override // defpackage.rc
    public final ud l() {
        return null;
    }

    @Override // defpackage.ff, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k().r();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().l();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ff, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        qk NI = NI();
        if (menuItem.getItemId() != 16908332 || NI == null || (NI.c() & 4) == 0 || (a = hv.a(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(a)) {
            navigateUpTo(a);
            return true;
        }
        iy iyVar = new iy(this);
        Intent SB = SB();
        if (SB == null) {
            SB = hv.a(this);
        }
        if (SB != null) {
            ComponentName component = SB.getComponent();
            if (component == null) {
                component = SB.resolveActivity(iyVar.b.getPackageManager());
            }
            int size = iyVar.a.size();
            try {
                for (Intent b = hv.b(iyVar.b, component); b != null; b = hv.b(iyVar.b, b.getComponent())) {
                    iyVar.a.add(size, b);
                }
                iyVar.a.add(SB);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
        if (!iyVar.a.isEmpty()) {
            ArrayList<Intent> arrayList = iyVar.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            iyVar.b.startActivities(intentArr, null);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((rv) k()).w();
    }

    @Override // defpackage.ff, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        qk c = ((rv) k()).c();
        if (c != null) {
            c.f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public void onStart() {
        super.onStart();
        rv rvVar = (rv) k();
        rvVar.B = true;
        rvVar.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public void onStop() {
        super.onStop();
        k().d();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        NI();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.agi, android.app.Activity
    public final void setContentView(int i) {
        o();
        k().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((rv) k()).D = i;
    }

    @Override // defpackage.agi, android.app.Activity
    public final void setContentView(View view) {
        o();
        k().f(view);
    }

    @Override // defpackage.agi, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        k().h(view, layoutParams);
    }
}
