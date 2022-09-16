package androidx.appcompat.app;

import a.g.m.v;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends androidx.appcompat.app.a {

    /* renamed from: a  reason: collision with root package name */
    d0 f944a;

    /* renamed from: b  reason: collision with root package name */
    boolean f945b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f946c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f947d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f948e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f949f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f950g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f951h = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.m();
        }
    }

    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return j.this.f946c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements n.a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f954b;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f954b) {
                return;
            }
            this.f954b = true;
            j.this.f944a.g();
            Window.Callback callback = j.this.f946c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f954b = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = j.this.f946c;
            if (callback != null) {
                callback.onMenuOpened(108, gVar);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(androidx.appcompat.view.menu.g gVar) {
            j jVar = j.this;
            if (jVar.f946c != null) {
                if (jVar.f944a.a()) {
                    j.this.f946c.onPanelClosed(108, gVar);
                } else if (!j.this.f946c.onPreparePanel(0, null, gVar)) {
                } else {
                    j.this.f946c.onMenuOpened(108, gVar);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class e extends a.a.o.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(j.this.f944a.i()) : super.onCreatePanelView(i);
        }

        @Override // a.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                j jVar = j.this;
                if (!jVar.f945b) {
                    jVar.f944a.b();
                    j.this.f945b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f944a = new y0(toolbar, false);
        this.f946c = new e(callback);
        this.f944a.setWindowCallback(this.f946c);
        toolbar.setOnMenuItemClickListener(this.f951h);
        this.f944a.setWindowTitle(charSequence);
    }

    private Menu n() {
        if (!this.f947d) {
            this.f944a.a(new c(), new d());
            this.f947d = true;
        }
        return this.f944a.l();
    }

    public void a(int i, int i2) {
        this.f944a.a((i & i2) | ((~i2) & this.f944a.k()));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.f944a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.f944a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu n = n();
        if (n != null) {
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            n.setQwertyMode(z);
            return n.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void b(CharSequence charSequence) {
        this.f944a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z == this.f948e) {
            return;
        }
        this.f948e = z;
        int size = this.f949f.size();
        for (int i = 0; i < size; i++) {
            this.f949f.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void e(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public boolean e() {
        return this.f944a.d();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        if (this.f944a.j()) {
            this.f944a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.f944a.k();
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        return this.f944a.i();
    }

    @Override // androidx.appcompat.app.a
    public boolean i() {
        this.f944a.h().removeCallbacks(this.f950g);
        v.a(this.f944a.h(), this.f950g);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void j() {
        this.f944a.h().removeCallbacks(this.f950g);
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        return this.f944a.e();
    }

    public Window.Callback l() {
        return this.f946c;
    }

    void m() {
        Menu n = n();
        androidx.appcompat.view.menu.g gVar = n instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) n : null;
        if (gVar != null) {
            gVar.s();
        }
        try {
            n.clear();
            if (!this.f946c.onCreatePanelMenu(0, n) || !this.f946c.onPreparePanel(0, null, n)) {
                n.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.r();
            }
        }
    }
}
