package androidx.appcompat.app;

import a.a.o.b;
import a.a.o.f;
import a.g.m.a0;
import a.g.m.b0;
import a.g.m.d0;
import a.g.m.e;
import a.g.m.r;
import a.g.m.v;
import a.g.m.z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.x0;
import androidx.lifecycle.f;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends androidx.appcompat.app.f implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> b0 = new a.e.a();
    private static final boolean c0;
    private static final int[] d0;
    private static boolean e0;
    private static final boolean f0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private o[] H;
    private o I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private l S;
    private l T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private AppCompatViewInflater a0;

    /* renamed from: e  reason: collision with root package name */
    final Object f900e;

    /* renamed from: f  reason: collision with root package name */
    final Context f901f;

    /* renamed from: g  reason: collision with root package name */
    Window f902g;

    /* renamed from: h  reason: collision with root package name */
    private j f903h;
    final androidx.appcompat.app.e i;
    androidx.appcompat.app.a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private h n;
    private p o;
    a.a.o.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    z t;
    private boolean u;
    private boolean v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    /* loaded from: classes.dex */
    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f904a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f904a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f904a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f904a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.V & 1) != 0) {
                gVar.f(0);
            }
            g gVar2 = g.this;
            if ((gVar2.V & 4096) != 0) {
                gVar2.f(108);
            }
            g gVar3 = g.this;
            gVar3.U = false;
            gVar3.V = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements r {
        c() {
        }

        @Override // a.g.m.r
        public d0 a(View view, d0 d0Var) {
            int g2 = d0Var.g();
            int j = g.this.j(g2);
            if (g2 != j) {
                d0Var = d0Var.a(d0Var.e(), j, d0Var.f(), d0Var.d());
            }
            return v.b(view, d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = g.this.j(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends b0 {
            a() {
            }

            @Override // a.g.m.a0
            public void b(View view) {
                g.this.q.setAlpha(1.0f);
                g.this.t.a((a0) null);
                g.this.t = null;
            }

            @Override // a.g.m.b0, a.g.m.a0
            public void c(View view) {
                g.this.q.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.r.showAtLocation(gVar.q, 55, 0, 0);
            g.this.m();
            if (!g.this.u()) {
                g.this.q.setAlpha(1.0f);
                g.this.q.setVisibility(0);
                return;
            }
            g.this.q.setAlpha(0.0f);
            g gVar2 = g.this;
            z a2 = v.a(gVar2.q);
            a2.a(1.0f);
            gVar2.t = a2;
            g.this.t.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0041g extends b0 {
        C0041g() {
        }

        @Override // a.g.m.a0
        public void b(View view) {
            g.this.q.setAlpha(1.0f);
            g.this.t.a((a0) null);
            g.this.t = null;
        }

        @Override // a.g.m.b0, a.g.m.a0
        public void c(View view) {
            g.this.q.setVisibility(0);
            g.this.q.sendAccessibilityEvent(32);
            if (g.this.q.getParent() instanceof View) {
                v.N((View) g.this.q.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class h implements n.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            g.this.b(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q = g.this.q();
            if (q != null) {
                q.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f913a;

        /* loaded from: classes.dex */
        class a extends b0 {
            a() {
            }

            @Override // a.g.m.a0
            public void b(View view) {
                g.this.q.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.q.getParent() instanceof View) {
                    v.N((View) g.this.q.getParent());
                }
                g.this.q.removeAllViews();
                g.this.t.a((a0) null);
                g.this.t = null;
            }
        }

        public i(b.a aVar) {
            this.f913a = aVar;
        }

        @Override // a.a.o.b.a
        public void a(a.a.o.b bVar) {
            this.f913a.a(bVar);
            g gVar = g.this;
            if (gVar.r != null) {
                gVar.f902g.getDecorView().removeCallbacks(g.this.s);
            }
            g gVar2 = g.this;
            if (gVar2.q != null) {
                gVar2.m();
                g gVar3 = g.this;
                z a2 = v.a(gVar3.q);
                a2.a(0.0f);
                gVar3.t = a2;
                g.this.t.a(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.e eVar = gVar4.i;
            if (eVar != null) {
                eVar.b(gVar4.p);
            }
            g.this.p = null;
        }

        @Override // a.a.o.b.a
        public boolean a(a.a.o.b bVar, Menu menu) {
            return this.f913a.a(bVar, menu);
        }

        @Override // a.a.o.b.a
        public boolean a(a.a.o.b bVar, MenuItem menuItem) {
            return this.f913a.a(bVar, menuItem);
        }

        @Override // a.a.o.b.a
        public boolean b(a.a.o.b bVar, Menu menu) {
            return this.f913a.b(bVar, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends a.a.o.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f901f, callback);
            a.a.o.b a2 = g.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g.this.h(i);
            return true;
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            g.this.i(i);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.c(false);
            }
            return onPreparePanel;
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            o a2 = g.this.a(0, true);
            if (a2 == null || (gVar = a2.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return g.this.r() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!g.this.r() || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f917c;

        k(Context context) {
            super();
            this.f917c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.l
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.g.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f917c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.g.l
        public void d() {
            g.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f919a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f919a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f901f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f919a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f919a == null) {
                this.f919a = new a();
            }
            g.this.f901f.registerReceiver(this.f919a, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final androidx.appcompat.app.l f922c;

        m(androidx.appcompat.app.l lVar) {
            super();
            this.f922c = lVar;
        }

        @Override // androidx.appcompat.app.g.l
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.l
        public int c() {
            return this.f922c.a() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.l
        public void d() {
            g.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.e(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.a.k.a.a.c(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        int f924a;

        /* renamed from: b  reason: collision with root package name */
        int f925b;

        /* renamed from: c  reason: collision with root package name */
        int f926c;

        /* renamed from: d  reason: collision with root package name */
        int f927d;

        /* renamed from: e  reason: collision with root package name */
        int f928e;

        /* renamed from: f  reason: collision with root package name */
        int f929f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f930g;

        /* renamed from: h  reason: collision with root package name */
        View f931h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        o(int i) {
            this.f924a = i;
        }

        androidx.appcompat.view.menu.o a(n.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new androidx.appcompat.view.menu.e(this.l, a.a.g.abc_list_menu_item_layout);
                this.k.a(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.f930g);
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(a.a.a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = a.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            a.a.o.d dVar = new a.a.o.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.a.j.AppCompatTheme);
            this.f925b = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_panelBackground, 0);
            this.f929f = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        void a(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.b(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.a(eVar);
        }

        public boolean a() {
            if (this.f931h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class p implements n.a {
        p() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g m = gVar.m();
            boolean z2 = m != gVar;
            g gVar2 = g.this;
            if (z2) {
                gVar = m;
            }
            o a2 = gVar2.a((Menu) gVar);
            if (a2 != null) {
                if (!z2) {
                    g.this.a(a2, z);
                    return;
                }
                g.this.a(a2.f924a, a2, m);
                g.this.a(a2, true);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q;
            if (gVar == null) {
                g gVar2 = g.this;
                if (!gVar2.B || (q = gVar2.q()) == null || g.this.N) {
                    return true;
                }
                q.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        c0 = Build.VERSION.SDK_INT < 21;
        d0 = new int[]{16842836};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        f0 = z;
        if (!c0 || e0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        e0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private g(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        Integer num;
        androidx.appcompat.app.d F;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f901f = context;
        this.i = eVar;
        this.f900e = obj;
        if (this.O == -100 && (this.f900e instanceof Dialog) && (F = F()) != null) {
            this.O = F.k().a();
        }
        if (this.O == -100 && (num = b0.get(this.f900e.getClass())) != null) {
            this.O = num.intValue();
            b0.remove(this.f900e.getClass());
        }
        if (window != null) {
            a(window);
        }
        androidx.appcompat.widget.j.c();
    }

    private void A() {
        if (this.f902g == null) {
            Object obj = this.f900e;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f902g != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private l B() {
        if (this.T == null) {
            this.T = new k(this.f901f);
        }
        return this.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C() {
        /*
            r3 = this;
            r3.z()
            boolean r0 = r3.B
            if (r0 == 0) goto L33
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.f900e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            androidx.appcompat.app.m r1 = new androidx.appcompat.app.m
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.C
            r1.<init>(r0, r2)
        L1b:
            r3.j = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            androidx.appcompat.app.m r1 = new androidx.appcompat.app.m
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L33
            boolean r1 = r3.X
            r0.c(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.C():void");
    }

    private boolean D() {
        if (!this.R && (this.f900e instanceof Activity)) {
            PackageManager packageManager = this.f901f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f901f, this.f900e.getClass()), 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private void E() {
        if (!this.v) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private androidx.appcompat.app.d F() {
        for (Context context = this.f901f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a(Window window) {
        if (this.f902g == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof j) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            this.f903h = new j(callback);
            window.setCallback(this.f903h);
            x0 a2 = x0.a(this.f901f, (AttributeSet) null, d0);
            Drawable c2 = a2.c(0);
            if (c2 != null) {
                window.setBackgroundDrawable(c2);
            }
            a2.a();
            this.f902g = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void a(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (oVar.o || this.N) {
            return;
        }
        if (oVar.f924a == 0) {
            if ((this.f901f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback q = q();
        if (q != null && !q.onMenuOpened(oVar.f924a, oVar.j)) {
            a(oVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f901f.getSystemService("window");
        if (windowManager == null || !b(oVar, keyEvent)) {
            return;
        }
        if (oVar.f930g == null || oVar.q) {
            ViewGroup viewGroup = oVar.f930g;
            if (viewGroup == null) {
                if (!b(oVar) || oVar.f930g == null) {
                    return;
                }
            } else if (oVar.q && viewGroup.getChildCount() > 0) {
                oVar.f930g.removeAllViews();
            }
            if (!a(oVar) || !oVar.a()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = oVar.f931h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            oVar.f930g.setBackgroundResource(oVar.f925b);
            ViewParent parent = oVar.f931h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(oVar.f931h);
            }
            oVar.f930g.addView(oVar.f931h, layoutParams2);
            if (!oVar.f931h.hasFocus()) {
                oVar.f931h.requestFocus();
            }
        } else {
            View view = oVar.i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
                oVar.n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, oVar.f927d, oVar.f928e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                layoutParams3.gravity = oVar.f926c;
                layoutParams3.windowAnimations = oVar.f929f;
                windowManager.addView(oVar.f930g, layoutParams3);
                oVar.o = true;
            }
        }
        i2 = -2;
        oVar.n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, oVar.f927d, oVar.f928e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
        layoutParams32.gravity = oVar.f926c;
        layoutParams32.windowAnimations = oVar.f929f;
        windowManager.addView(oVar.f930g, layoutParams32);
        oVar.o = true;
    }

    private void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.f() || (ViewConfiguration.get(this.f901f).hasPermanentMenuKey() && !this.m.c())) {
            o a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback q = q();
        if (this.m.a() && z) {
            this.m.d();
            if (this.N) {
                return;
            }
            q.onPanelClosed(108, a(0, true).j);
        } else if (q == null || this.N) {
        } else {
            if (this.U && (this.V & 1) != 0) {
                this.f902g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            o a3 = a(0, true);
            androidx.appcompat.view.menu.g gVar2 = a3.j;
            if (gVar2 == null || a3.r || !q.onPreparePanel(0, a3.i, gVar2)) {
                return;
            }
            q.onMenuOpened(108, a3.j);
            this.m.e();
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f902g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || v.H((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(o oVar) {
        View view = oVar.i;
        if (view != null) {
            oVar.f931h = view;
            return true;
        } else if (oVar.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new p();
            }
            oVar.f931h = (View) oVar.a(this.o);
            return oVar.f931h != null;
        }
    }

    private boolean a(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.m || b(oVar, keyEvent)) && (gVar = oVar.j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.m == null) {
            a(oVar, true);
        }
        return z;
    }

    private boolean a(boolean z) {
        if (this.N) {
            return false;
        }
        int w = w();
        boolean b2 = b(g(w), z);
        if (w == 0) {
            o().e();
        } else {
            l lVar = this.S;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (w == 3) {
            B().e();
        } else {
            l lVar2 = this.T;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return b2;
    }

    private boolean b(int i2, boolean z) {
        int i3 = this.f901f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean D = D();
        boolean z3 = false;
        if ((f0 || i4 != i3) && !D && Build.VERSION.SDK_INT >= 17 && !this.K && (this.f900e instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i4;
            try {
                ((ContextThemeWrapper) this.f900e).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f901f.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i5 != i4 && z && !D && this.K && (Build.VERSION.SDK_INT >= 17 || this.L)) {
            Object obj = this.f900e;
            if (obj instanceof Activity) {
                androidx.core.app.a.b((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i5 == i4) {
            z2 = z3;
        } else {
            c(i4, D);
        }
        if (z2) {
            Object obj2 = this.f900e;
            if (obj2 instanceof androidx.appcompat.app.d) {
                ((androidx.appcompat.app.d) obj2).c(i2);
            }
        }
        return z2;
    }

    private boolean b(o oVar) {
        oVar.a(n());
        oVar.f930g = new n(oVar.l);
        oVar.f926c = 81;
        return true;
    }

    private boolean b(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (oVar.m) {
            return true;
        }
        o oVar2 = this.I;
        if (oVar2 != null && oVar2 != oVar) {
            a(oVar2, false);
        }
        Window.Callback q = q();
        if (q != null) {
            oVar.i = q.onCreatePanelView(oVar.f924a);
        }
        int i2 = oVar.f924a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.m) != null) {
            c0Var3.b();
        }
        if (oVar.i == null && (!z || !(t() instanceof androidx.appcompat.app.j))) {
            if (oVar.j == null || oVar.r) {
                if (oVar.j == null && (!c(oVar) || oVar.j == null)) {
                    return false;
                }
                if (z && this.m != null) {
                    if (this.n == null) {
                        this.n = new h();
                    }
                    this.m.a(oVar.j, this.n);
                }
                oVar.j.s();
                if (!q.onCreatePanelMenu(oVar.f924a, oVar.j)) {
                    oVar.a((androidx.appcompat.view.menu.g) null);
                    if (z && (c0Var = this.m) != null) {
                        c0Var.a(null, this.n);
                    }
                    return false;
                }
                oVar.r = false;
            }
            oVar.j.s();
            Bundle bundle = oVar.s;
            if (bundle != null) {
                oVar.j.a(bundle);
                oVar.s = null;
            }
            if (!q.onPreparePanel(0, oVar.i, oVar.j)) {
                if (z && (c0Var2 = this.m) != null) {
                    c0Var2.a(null, this.n);
                }
                oVar.j.r();
                return false;
            }
            oVar.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.j.setQwertyMode(oVar.p);
            oVar.j.r();
        }
        oVar.m = true;
        oVar.n = false;
        this.I = oVar;
        return true;
    }

    private void c(int i2, boolean z) {
        Resources resources = this.f901f.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.i.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f901f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f901f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.f900e;
            if (!(obj instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) obj;
            if (activity instanceof androidx.lifecycle.i) {
                if (!((androidx.lifecycle.i) activity).a().a().a(f.b.STARTED)) {
                    return;
                }
            } else if (!this.M) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private boolean c(o oVar) {
        Context context = this.f901f;
        int i2 = oVar.f924a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                a.a.o.d dVar = new a.a.o.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.a(this);
        oVar.a(gVar);
        return true;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            o a2 = a(i2, true);
            if (a2.o) {
                return false;
            }
            return b(a2, keyEvent);
        }
        return false;
    }

    private boolean e(int i2, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        c0 c0Var;
        if (this.p != null) {
            return false;
        }
        o a2 = a(i2, true);
        if (i2 != 0 || (c0Var = this.m) == null || !c0Var.f() || ViewConfiguration.get(this.f901f).hasPermanentMenuKey()) {
            if (a2.o || a2.n) {
                z = a2.o;
                a(a2, true);
            } else {
                if (a2.m) {
                    if (a2.r) {
                        a2.m = false;
                        z2 = b(a2, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        a(a2, keyEvent);
                        z = true;
                    }
                }
                z = false;
            }
        } else if (!this.m.a()) {
            if (!this.N && b(a2, keyEvent)) {
                z = this.m.e();
            }
            z = false;
        } else {
            z = this.m.d();
        }
        if (z) {
            AudioManager audioManager = (AudioManager) this.f901f.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z;
    }

    private void k(int i2) {
        this.V = (1 << i2) | this.V;
        if (!this.U) {
            v.a(this.f902g.getDecorView(), this.W);
            this.U = true;
        }
    }

    private int l(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private void v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.f902g.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f901f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int w() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.f.j();
    }

    private void x() {
        l lVar = this.S;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.T;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f901f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowNoTitle, false)) {
            b(1);
        } else if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBar, false)) {
            b(108);
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            b(109);
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            b(10);
        }
        this.E = obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        A();
        this.f902g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f901f);
        if (this.F) {
            viewGroup = (ViewGroup) from.inflate(this.D ? a.a.g.abc_screen_simple_overlay_action_mode : a.a.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                v.a(viewGroup, new c());
            } else {
                ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
            }
        } else if (this.E) {
            viewGroup = (ViewGroup) from.inflate(a.a.g.abc_dialog_title_material, (ViewGroup) null);
            this.C = false;
            this.B = false;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f901f.getTheme().resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            viewGroup = (ViewGroup) LayoutInflater.from(i2 != 0 ? new a.a.o.d(this.f901f, i2) : this.f901f).inflate(a.a.g.abc_screen_toolbar, (ViewGroup) null);
            this.m = (c0) viewGroup.findViewById(a.a.f.decor_content_parent);
            this.m.setWindowCallback(q());
            if (this.C) {
                this.m.a(109);
            }
            if (this.z) {
                this.m.a(2);
            }
            if (this.A) {
                this.m.a(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (this.m == null) {
            this.x = (TextView) viewGroup.findViewById(a.a.f.title);
        }
        d1.b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.a.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f902g.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f902g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void z() {
        if (!this.v) {
            this.w = y();
            CharSequence p2 = p();
            if (!TextUtils.isEmpty(p2)) {
                c0 c0Var = this.m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(p2);
                } else if (t() != null) {
                    t().b(p2);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(p2);
                    }
                }
            }
            v();
            a(this.w);
            this.v = true;
            o a2 = a(0, false);
            if (this.N) {
                return;
            }
            if (a2 != null && a2.j != null) {
                return;
            }
            k(108);
        }
    }

    @Override // androidx.appcompat.app.f
    public int a() {
        return this.O;
    }

    public a.a.o.b a(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            a.a.o.b bVar = this.p;
            if (bVar != null) {
                bVar.a();
            }
            i iVar = new i(aVar);
            androidx.appcompat.app.a c2 = c();
            if (c2 != null) {
                this.p = c2.a(iVar);
                a.a.o.b bVar2 = this.p;
                if (bVar2 != null && (eVar = this.i) != null) {
                    eVar.a(bVar2);
                }
            }
            if (this.p == null) {
                this.p = b(iVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T a(int i2) {
        z();
        return (T) this.f902g.findViewById(i2);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.a0 == null) {
            String string = this.f901f.obtainStyledAttributes(a.a.j.AppCompatTheme).getString(a.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.a0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.a0 = appCompatViewInflater;
        }
        if (c0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.a0.createView(view, str, context, attributeSet, z, c0, true, c1.b());
    }

    protected o a(int i2, boolean z) {
        o[] oVarArr = this.H;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[i2 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.H = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar == null) {
            o oVar2 = new o(i2);
            oVarArr[i2] = oVar2;
            return oVar2;
        }
        return oVar;
    }

    o a(Menu menu) {
        o[] oVarArr = this.H;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.j == menu) {
                return oVar;
            }
        }
        return null;
    }

    void a(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.H;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.j;
            }
        }
        if ((oVar == null || oVar.o) && !this.N) {
            this.f903h.a().onPanelClosed(i2, menu);
        }
    }

    @Override // androidx.appcompat.app.f
    public void a(Context context) {
        a(false);
        this.K = true;
    }

    @Override // androidx.appcompat.app.f
    public void a(Configuration configuration) {
        androidx.appcompat.app.a c2;
        if (this.B && this.v && (c2 = c()) != null) {
            c2.a(configuration);
        }
        androidx.appcompat.widget.j.b().a(this.f901f);
        a(false);
    }

    @Override // androidx.appcompat.app.f
    public void a(Bundle bundle) {
        this.K = true;
        a(false);
        A();
        Object obj = this.f900e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.e.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a t = t();
                if (t == null) {
                    this.X = true;
                } else {
                    t.c(true);
                }
            }
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.f
    public void a(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f903h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.f903h.a().onContentChanged();
    }

    void a(ViewGroup viewGroup) {
    }

    void a(o oVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && oVar.f924a == 0 && (c0Var = this.m) != null && c0Var.a()) {
            b(oVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f901f.getSystemService("window");
        if (windowManager != null && oVar.o && (viewGroup = oVar.f930g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                a(oVar.f924a, oVar, null);
            }
        }
        oVar.m = false;
        oVar.n = false;
        oVar.o = false;
        oVar.f931h = null;
        oVar.q = true;
        if (this.I != oVar) {
            return;
        }
        this.I = null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        a(gVar, true);
    }

    @Override // androidx.appcompat.app.f
    public void a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (!(this.f900e instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a c2 = c();
        if (c2 instanceof androidx.appcompat.app.m) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.k = null;
        if (c2 != null) {
            c2.j();
        }
        if (toolbar != null) {
            androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(toolbar, p(), this.f903h);
            this.j = jVar;
            window = this.f902g;
            callback = jVar.l();
        } else {
            this.j = null;
            window = this.f902g;
            callback = this.f903h;
        }
        window.setCallback(callback);
        e();
    }

    @Override // androidx.appcompat.app.f
    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (t() != null) {
            t().b(charSequence);
        } else {
            TextView textView = this.x;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    boolean a(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.J = z;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f900e;
        boolean z = true;
        if (((obj instanceof e.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.f902g.getDecorView()) != null && a.g.m.e.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f903h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        o a2;
        Window.Callback q = q();
        if (q == null || this.N || (a2 = a((Menu) gVar.m())) == null) {
            return false;
        }
        return q.onMenuItemSelected(a2.f924a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    a.a.o.b b(a.a.o.b.a r8) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.b(a.a.o.b$a):a.a.o.b");
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater b() {
        if (this.k == null) {
            C();
            androidx.appcompat.app.a aVar = this.j;
            this.k = new a.a.o.g(aVar != null ? aVar.h() : this.f901f);
        }
        return this.k;
    }

    @Override // androidx.appcompat.app.f
    public void b(Bundle bundle) {
        z();
    }

    @Override // androidx.appcompat.app.f
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f903h.a().onContentChanged();
    }

    void b(androidx.appcompat.view.menu.g gVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.g();
        Window.Callback q = q();
        if (q != null && !this.N) {
            q.onPanelClosed(108, gVar);
        }
        this.G = false;
    }

    @Override // androidx.appcompat.app.f
    public boolean b(int i2) {
        int l2 = l(i2);
        if (!this.F || l2 != 108) {
            if (this.B && l2 == 1) {
                this.B = false;
            }
            if (l2 == 1) {
                E();
                this.F = true;
                return true;
            } else if (l2 == 2) {
                E();
                this.z = true;
                return true;
            } else if (l2 == 5) {
                E();
                this.A = true;
                return true;
            } else if (l2 == 10) {
                E();
                this.D = true;
                return true;
            } else if (l2 == 108) {
                E();
                this.B = true;
                return true;
            } else if (l2 != 109) {
                return this.f902g.requestFeature(l2);
            } else {
                E();
                this.C = true;
                return true;
            }
        }
        return false;
    }

    boolean b(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a c2 = c();
        if (c2 == null || !c2.a(i2, keyEvent)) {
            o oVar = this.I;
            if (oVar != null && a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                o oVar2 = this.I;
                if (oVar2 != null) {
                    oVar2.n = true;
                }
                return true;
            }
            if (this.I == null) {
                o a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a c() {
        C();
        return this.j;
    }

    @Override // androidx.appcompat.app.f
    public void c(int i2) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f901f).inflate(i2, viewGroup);
        this.f903h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void c(Bundle bundle) {
        if (this.O != -100) {
            b0.put(this.f900e.getClass(), Integer.valueOf(this.O));
        }
    }

    boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            o a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z) {
                    a(a2, true);
                }
                return true;
            } else if (s()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void d() {
        LayoutInflater from = LayoutInflater.from(this.f901f);
        if (from.getFactory() == null) {
            a.g.m.f.b(from, this);
        } else if (from.getFactory2() instanceof g) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.f
    public void d(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.f
    public void e() {
        androidx.appcompat.app.a c2 = c();
        if (c2 == null || !c2.i()) {
            k(0);
        }
    }

    void e(int i2) {
        a(a(i2, true), true);
    }

    @Override // androidx.appcompat.app.f
    public void f() {
        androidx.appcompat.app.f.b(this);
        if (this.U) {
            this.f902g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        androidx.appcompat.app.a aVar = this.j;
        if (aVar != null) {
            aVar.j();
        }
        x();
    }

    void f(int i2) {
        o a2;
        o a3 = a(i2, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.b(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.s();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (a2 = a(0, false)) == null) {
            return;
        }
        a2.m = false;
        b(a2, (KeyEvent) null);
    }

    int g(int i2) {
        l o2;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        o2 = B();
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f901f.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    o2 = o();
                }
                return o2.c();
            }
            return i2;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.f
    public void g() {
        androidx.appcompat.app.a c2 = c();
        if (c2 != null) {
            c2.e(true);
        }
    }

    @Override // androidx.appcompat.app.f
    public void h() {
        this.M = true;
        k();
        androidx.appcompat.app.f.a(this);
    }

    void h(int i2) {
        androidx.appcompat.app.a c2;
        if (i2 != 108 || (c2 = c()) == null) {
            return;
        }
        c2.b(true);
    }

    @Override // androidx.appcompat.app.f
    public void i() {
        this.M = false;
        androidx.appcompat.app.f.b(this);
        androidx.appcompat.app.a c2 = c();
        if (c2 != null) {
            c2.e(false);
        }
        if (this.f900e instanceof Dialog) {
            x();
        }
    }

    void i(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a c2 = c();
            if (c2 == null) {
                return;
            }
            c2.b(false);
        } else if (i2 != 0) {
        } else {
            o a2 = a(i2, true);
            if (!a2.o) {
                return;
            }
            a(a2, false);
        }
    }

    int j(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.q;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            z = true;
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect = this.Y;
                Rect rect2 = this.Z;
                rect.set(0, i2, 0, 0);
                d1.a(this.w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.y;
                    if (view == null) {
                        this.y = new View(this.f901f);
                        this.y.setBackgroundColor(this.f901f.getResources().getColor(a.a.c.abc_input_method_navigation_guard));
                        this.w.addView(this.y, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.y.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.y == null) {
                    z = false;
                }
                if (!this.D && z) {
                    i2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            if (!z) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        return i2;
    }

    public boolean k() {
        return a(true);
    }

    void l() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.g();
        }
        if (this.r != null) {
            this.f902g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        m();
        o a2 = a(0, false);
        if (a2 == null || (gVar = a2.j) == null) {
            return;
        }
        gVar.close();
    }

    void m() {
        z zVar = this.t;
        if (zVar != null) {
            zVar.a();
        }
    }

    final Context n() {
        androidx.appcompat.app.a c2 = c();
        Context h2 = c2 != null ? c2.h() : null;
        return h2 == null ? this.f901f : h2;
    }

    final l o() {
        if (this.S == null) {
            this.S = new m(androidx.appcompat.app.l.a(this.f901f));
        }
        return this.S;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    final CharSequence p() {
        Object obj = this.f900e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    final Window.Callback q() {
        return this.f902g.getCallback();
    }

    public boolean r() {
        return this.u;
    }

    boolean s() {
        a.a.o.b bVar = this.p;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        androidx.appcompat.app.a c2 = c();
        return c2 != null && c2.f();
    }

    final androidx.appcompat.app.a t() {
        return this.j;
    }

    final boolean u() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && v.I(viewGroup);
    }
}
