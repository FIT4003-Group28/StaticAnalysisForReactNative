package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.d;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.q;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
public class ComponentActivity extends d implements i, v, e, androidx.savedstate.b, c {

    /* renamed from: e  reason: collision with root package name */
    private u f825e;

    /* renamed from: g  reason: collision with root package name */
    private int f827g;

    /* renamed from: c  reason: collision with root package name */
    private final j f823c = new j(this);

    /* renamed from: d  reason: collision with root package name */
    private final androidx.savedstate.a f824d = androidx.savedstate.a.a(this);

    /* renamed from: f  reason: collision with root package name */
    private final OnBackPressedDispatcher f826f = new OnBackPressedDispatcher(new a());

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        u f831a;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new g() { // from class: androidx.activity.ComponentActivity.2
                    @Override // androidx.lifecycle.g
                    public void a(i iVar, f.a aVar) {
                        if (aVar == f.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView == null) {
                                return;
                            }
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                });
            }
            a().a(new g() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.g
                public void a(i iVar, f.a aVar) {
                    if (aVar != f.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.d().a();
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 > i || i > 23) {
                return;
            }
            a().a(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // androidx.lifecycle.i
    public f a() {
        return this.f823c;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.f826f;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.f824d.a();
    }

    @Override // androidx.lifecycle.v
    public u d() {
        if (getApplication() != null) {
            if (this.f825e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f825e = bVar.f831a;
                }
                if (this.f825e == null) {
                    this.f825e = new u();
                }
            }
            return this.f825e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object g() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f826f.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f824d.a(bundle);
        q.a(this);
        int i = this.f827g;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object g2 = g();
        u uVar = this.f825e;
        if (uVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            uVar = bVar.f831a;
        }
        if (uVar == null && g2 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f831a = uVar;
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        f a2 = a();
        if (a2 instanceof j) {
            ((j) a2).b(f.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f824d.b(bundle);
    }
}
