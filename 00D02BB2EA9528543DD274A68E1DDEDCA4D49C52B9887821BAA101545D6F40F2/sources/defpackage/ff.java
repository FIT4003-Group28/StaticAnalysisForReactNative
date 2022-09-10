package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public class ff extends agi implements ajt, aju {
    boolean c;
    boolean d;
    final fp a = fp.a(new fe(this));
    final o b = new o(this);
    boolean e = true;

    private final void j() {
        do {
        } while (k(g(), j.CREATED));
    }

    private static boolean k(gn gnVar, j jVar) {
        boolean z = false;
        for (fd fdVar : gnVar.q()) {
            if (fdVar != null) {
                if (fdVar.Rm() != null) {
                    z |= k(fdVar.R(), jVar);
                }
                hs hsVar = fdVar.aa;
                if (hsVar != null && ((o) hsVar.Nh()).a.a(j.STARTED)) {
                    fdVar.aa.a.d(jVar);
                    z = true;
                }
                if (fdVar.Z.a.a(j.STARTED)) {
                    fdVar.Z.d(jVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.c);
        printWriter.print(" mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        if (getApplication() != null) {
            apd.a(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.a.b().s(str, fileDescriptor, printWriter, strArr);
    }

    final View e(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.c(view, str, context, attributeSet);
    }

    @Deprecated
    public void f() {
        invalidateOptionsMenu();
    }

    public final gn g() {
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agi, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.d();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.d();
        this.a.n(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agi, defpackage.iw, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.a.p();
        if (bundle != null) {
            this.a.f(bundle.getParcelable("android:support:fragments"));
        }
        super.onCreate(bundle);
        this.b.e(i.ON_CREATE);
        this.a.g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
            fp fpVar = this.a;
            return onCreatePanelMenu | fpVar.a.e.ad(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View e = e(view, str, context, attributeSet);
        return e == null ? super.onCreateView(view, str, context, attributeSet) : e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.a.m();
        this.b.e(i.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.a.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.a.a.e.af(menuItem);
        }
        if (i == 6) {
            return this.a.a.e.ag(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.a.a.e.Z(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.a.a.e.ah(menu);
            i = 0;
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.d = false;
        this.a.k();
        this.b.e(i.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.a.a.e.aa(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.b.e(i.ON_RESUME);
        this.a.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.a.a.e.ae(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // defpackage.agi, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.d();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.d = true;
        this.a.d();
        this.a.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agi, defpackage.iw, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j();
        this.b.e(i.ON_STOP);
        Parcelable e = this.a.e();
        if (e != null) {
            bundle.putParcelable("android:support:fragments", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            this.a.h();
        }
        this.a.d();
        this.a.q();
        this.b.e(i.ON_START);
        this.a.i();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.e = true;
        j();
        this.a.l();
        this.b.e(i.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View e = e(null, str, context, attributeSet);
        return e == null ? super.onCreateView(str, context, attributeSet) : e;
    }
}
