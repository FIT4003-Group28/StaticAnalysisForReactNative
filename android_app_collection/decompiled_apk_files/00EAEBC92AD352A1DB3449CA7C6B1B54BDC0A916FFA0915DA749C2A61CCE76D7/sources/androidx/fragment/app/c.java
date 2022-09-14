package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class c extends ComponentActivity implements a.b, a.d {
    boolean j;
    boolean k;
    boolean m;
    boolean n;
    boolean o;
    int p;
    a.e.h<String> q;

    /* renamed from: h  reason: collision with root package name */
    final g f1666h = g.a(new a());
    final androidx.lifecycle.j i = new androidx.lifecycle.j(this);
    boolean l = true;

    /* loaded from: classes.dex */
    class a extends i<c> implements androidx.lifecycle.v, androidx.activity.c {
        public a() {
            super(c.this);
        }

        @Override // androidx.fragment.app.i, androidx.fragment.app.e
        public View a(int i) {
            return c.this.findViewById(i);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.f a() {
            return c.this.i;
        }

        @Override // androidx.fragment.app.i
        public void a(Fragment fragment) {
            c.this.a(fragment);
        }

        @Override // androidx.fragment.app.i
        public void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            c.this.a(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.i
        public void a(Fragment fragment, String[] strArr, int i) {
            c.this.a(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.i
        public boolean a(String str) {
            return androidx.core.app.a.a((Activity) c.this, str);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return c.this.b();
        }

        @Override // androidx.fragment.app.i
        public boolean b(Fragment fragment) {
            return !c.this.isFinishing();
        }

        @Override // androidx.fragment.app.i, androidx.fragment.app.e
        public boolean c() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.v
        public androidx.lifecycle.u d() {
            return c.this.d();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.i
        /* renamed from: h */
        public c mo70h() {
            return c.this;
        }

        @Override // androidx.fragment.app.i
        public LayoutInflater i() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        @Override // androidx.fragment.app.i
        public void j() {
            c.this.j();
        }
    }

    private static boolean a(l lVar, f.b bVar) {
        boolean z = false;
        for (Fragment fragment : lVar.q()) {
            if (fragment != null) {
                if (fragment.s() != null) {
                    z |= a(fragment.m(), bVar);
                }
                if (fragment.a().a().a(f.b.STARTED)) {
                    fragment.R.b(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    private int b(Fragment fragment) {
        if (this.q.b() < 65534) {
            while (this.q.b(this.p) >= 0) {
                this.p = (this.p + 1) % 65534;
            }
            int i = this.p;
            this.q.c(i, fragment.f1642f);
            this.p = (this.p + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void b(int i) {
        if ((i & (-65536)) == 0) {
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    private void k() {
        do {
        } while (a(h(), f.b.CREATED));
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1666h.a(view, str, context, attributeSet);
    }

    @Override // androidx.core.app.a.d
    public final void a(int i) {
        if (this.m || i == -1) {
            return;
        }
        b(i);
    }

    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.o = true;
        try {
            if (i == -1) {
                androidx.core.app.a.a(this, intent, -1, bundle);
                return;
            }
            b(i);
            androidx.core.app.a.a(this, intent, ((b(fragment) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.o = false;
        }
    }

    void a(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.a(this, strArr, i);
            return;
        }
        b(i);
        try {
            this.m = true;
            androidx.core.app.a.a(this, strArr, ((b(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.m = false;
        }
    }

    @Deprecated
    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
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
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            a.n.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1666h.j().a(str, fileDescriptor, printWriter, strArr);
    }

    public l h() {
        return this.f1666h.j();
    }

    protected void i() {
        this.i.a(f.a.ON_RESUME);
        this.f1666h.f();
    }

    @Deprecated
    public void j() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f1666h.k();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.c a2 = androidx.core.app.a.a();
            if (a2 != null && a2.onActivityResult(this, i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String a3 = this.q.a(i4);
        this.q.d(i4);
        if (a3 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment a4 = this.f1666h.a(a3);
        if (a4 != null) {
            a4.a(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1666h.k();
        this.f1666h.a(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1666h.a((Fragment) null);
        if (bundle != null) {
            this.f1666h.a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.p = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.q = new a.e.h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.q.c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.q == null) {
            this.q = new a.e.h<>();
            this.p = 0;
        }
        super.onCreate(bundle);
        this.i.a(f.a.ON_CREATE);
        this.f1666h.b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1666h.a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a((View) null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1666h.c();
        this.i.a(f.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1666h.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1666h.b(menuItem);
        }
        if (i == 6) {
            return this.f1666h.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f1666h.a(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1666h.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1666h.a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.k = false;
        this.f1666h.e();
        this.i.a(f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1666h.b(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? a(view, menu) | this.f1666h.b(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1666h.k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a2 = this.q.a(i3);
            this.q.d(i3);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.f1666h.a(a2);
            if (a3 != null) {
                a3.a(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.k = true;
        this.f1666h.k();
        this.f1666h.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k();
        this.i.a(f.a.ON_STOP);
        Parcelable l = this.f1666h.l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.q.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.p);
            int[] iArr = new int[this.q.b()];
            String[] strArr = new String[this.q.b()];
            for (int i = 0; i < this.q.b(); i++) {
                iArr[i] = this.q.c(i);
                strArr[i] = this.q.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            this.f1666h.a();
        }
        this.f1666h.k();
        this.f1666h.i();
        this.i.a(f.a.ON_START);
        this.f1666h.g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1666h.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.l = true;
        k();
        this.f1666h.h();
        this.i.a(f.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.o && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.o && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.n && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.n && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
