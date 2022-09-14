package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class j extends f implements a.InterfaceC0005a, a.c {
    w e;
    boolean f;
    boolean g;
    boolean j;
    boolean k;
    int l;
    android.support.v4.i.m<String> m;
    private android.arch.lifecycle.p n;

    /* renamed from: c  reason: collision with root package name */
    final Handler f233c = new Handler() { // from class: android.support.v4.app.j.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (!j.this.h) {
                        return;
                    }
                    j.this.a(false);
                    return;
                case 2:
                    j.this.a();
                    j.this.f234d.n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    final l f234d = l.a(new a());
    boolean h = true;
    boolean i = true;

    public void a(i iVar) {
    }

    public Object b() {
        return null;
    }

    @Override // android.support.v4.app.e, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.e, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.support.v4.app.e, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f237a;

        /* renamed from: b  reason: collision with root package name */
        android.arch.lifecycle.p f238b;

        /* renamed from: c  reason: collision with root package name */
        p f239c;

        b() {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f234d.b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.m.a(i4);
            this.m.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            i a3 = this.f234d.a(a2);
            if (a3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            a3.onActivityResult(i & 65535, i2, intent);
            return;
        }
        a.b a4 = android.support.v4.app.a.a();
        if (a4 != null && a4.a(this, i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n a2 = this.f234d.a();
        boolean d2 = a2.d();
        if (!d2 || Build.VERSION.SDK_INT > 25) {
            if (!d2 && a2.b()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f234d.a(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f234d.b(z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f234d.b();
        this.f234d.a(configuration);
    }

    @Override // android.support.v4.app.ah, android.arch.lifecycle.e
    public android.arch.lifecycle.c getLifecycle() {
        return super.getLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ah, android.app.Activity
    public void onCreate(Bundle bundle) {
        p pVar = null;
        this.f234d.a((i) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.n = bVar.f238b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            l lVar = this.f234d;
            if (bVar != null) {
                pVar = bVar.f239c;
            }
            lVar.a(parcelable, pVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.m = new android.support.v4.i.m<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.m.b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.m == null) {
            this.m = new android.support.v4.i.m<>();
            this.l = 0;
        }
        this.f234d.e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f234d.a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.support.v4.app.e
    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f234d.a(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a(false);
        if (this.n != null && !this.j) {
            this.n.a();
        }
        this.f234d.l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f234d.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f234d.a(menuItem);
        }
        if (i == 6) {
            return this.f234d.b(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f234d.b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.g = false;
        if (this.f233c.hasMessages(2)) {
            this.f233c.removeMessages(2);
            a();
        }
        this.f234d.i();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f234d.b();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f234d.b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f233c.sendEmptyMessage(2);
        this.g = true;
        this.f234d.n();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f233c.removeMessages(2);
        a();
        this.f234d.n();
    }

    protected void a() {
        this.f234d.h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0 && menu != null) {
            return a(view, menu) | this.f234d.a(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.h) {
            a(true);
        }
        Object b2 = b();
        p d2 = this.f234d.d();
        if (d2 == null && this.n == null && b2 == null) {
            return null;
        }
        b bVar = new b();
        bVar.f237a = b2;
        bVar.f238b = this.n;
        bVar.f239c = d2;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ah, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f();
        Parcelable c2 = this.f234d.c();
        if (c2 != null) {
            bundle.putParcelable("android:support:fragments", c2);
        }
        if (this.m.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.b()];
            String[] strArr = new String[this.m.b()];
            for (int i = 0; i < this.m.b(); i++) {
                iArr[i] = this.m.d(i);
                strArr[i] = this.m.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.h = false;
        this.i = false;
        this.f233c.removeMessages(1);
        if (!this.f) {
            this.f = true;
            this.f234d.f();
        }
        this.f234d.b();
        this.f234d.n();
        this.f234d.g();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.h = true;
        f();
        this.f233c.sendEmptyMessage(1);
        this.f234d.j();
    }

    @Deprecated
    public void c() {
        invalidateOptionsMenu();
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
        printWriter.print(this.f);
        printWriter.print("mResumed=");
        printWriter.print(this.g);
        printWriter.print(" mStopped=");
        printWriter.print(this.h);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.i);
        if (this.e != null) {
            this.e.a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f234d.a().a(str, fileDescriptor, printWriter, strArr);
    }

    void a(boolean z) {
        if (!this.i) {
            this.i = true;
            this.j = z;
            this.f233c.removeMessages(1);
            d();
        }
    }

    void d() {
        this.f234d.k();
    }

    public n e() {
        return this.f234d.a();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f223b && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.v4.app.a.c
    public final void a(int i) {
        if (this.k || i == -1) {
            return;
        }
        b(i);
    }

    @Override // android.app.Activity, android.support.v4.app.a.InterfaceC0005a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f234d.b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a2 = this.m.a(i3);
            this.m.c(i3);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            i a3 = this.f234d.a(a2);
            if (a3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            a3.onRequestPermissionsResult(i & 65535, strArr, iArr);
        }
    }

    public void a(i iVar, Intent intent, int i, Bundle bundle) {
        this.f223b = true;
        try {
            if (i == -1) {
                android.support.v4.app.a.a(this, intent, -1, bundle);
                return;
            }
            b(i);
            android.support.v4.app.a.a(this, intent, ((b(iVar) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.f223b = false;
        }
    }

    public void a(i iVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f222a = true;
        try {
            if (i == -1) {
                android.support.v4.app.a.a(this, intentSender, i, intent, i2, i3, i4, bundle);
                this.f222a = false;
                return;
            }
            b(i);
            android.support.v4.app.a.a(this, intentSender, ((b(iVar) + 1) << 16) + (65535 & i), intent, i2, i3, i4, bundle);
            this.f222a = false;
        } catch (Throwable th) {
            this.f222a = false;
            throw th;
        }
    }

    private int b(i iVar) {
        if (this.m.b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.m.f(this.l) >= 0) {
            this.l = (this.l + 1) % 65534;
        }
        int i = this.l;
        this.m.b(i, iVar.mWho);
        this.l = (this.l + 1) % 65534;
        return i;
    }

    void a(i iVar, String[] strArr, int i) {
        if (i == -1) {
            android.support.v4.app.a.a(this, strArr, i);
            return;
        }
        b(i);
        try {
            this.k = true;
            android.support.v4.app.a.a(this, strArr, ((b(iVar) + 1) << 16) + (i & 65535));
        } finally {
            this.k = false;
        }
    }

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    class a extends m<j> {
        public a() {
            super(j.this);
        }

        @Override // android.support.v4.app.m
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.m
        public boolean a(i iVar) {
            return !j.this.isFinishing();
        }

        @Override // android.support.v4.app.m
        public LayoutInflater b() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }

        @Override // android.support.v4.app.m
        /* renamed from: c */
        public j g() {
            return j.this;
        }

        @Override // android.support.v4.app.m
        public void d() {
            j.this.c();
        }

        @Override // android.support.v4.app.m
        public void a(i iVar, Intent intent, int i, Bundle bundle) {
            j.this.a(iVar, intent, i, bundle);
        }

        @Override // android.support.v4.app.m
        public void a(i iVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            j.this.a(iVar, intentSender, i, intent, i2, i3, i4, bundle);
        }

        @Override // android.support.v4.app.m
        public void a(i iVar, String[] strArr, int i) {
            j.this.a(iVar, strArr, i);
        }

        @Override // android.support.v4.app.m
        public boolean a(String str) {
            return android.support.v4.app.a.a((Activity) j.this, str);
        }

        @Override // android.support.v4.app.m
        public boolean e() {
            return j.this.getWindow() != null;
        }

        @Override // android.support.v4.app.m
        public int f() {
            Window window = j.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.m
        public void b(i iVar) {
            j.this.a(iVar);
        }

        @Override // android.support.v4.app.m, android.support.v4.app.k
        public View a(int i) {
            return j.this.findViewById(i);
        }

        @Override // android.support.v4.app.m, android.support.v4.app.k
        public boolean a() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    private void f() {
        do {
        } while (a(e(), c.b.CREATED));
    }

    private static boolean a(n nVar, c.b bVar) {
        boolean z = false;
        for (i iVar : nVar.c()) {
            if (iVar != null) {
                if (iVar.getLifecycle().a().a(c.b.STARTED)) {
                    iVar.mLifecycleRegistry.a(bVar);
                    z = true;
                }
                n peekChildFragmentManager = iVar.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= a(peekChildFragmentManager, bVar);
                }
            }
        }
        return z;
    }
}
