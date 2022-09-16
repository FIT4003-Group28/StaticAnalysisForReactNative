package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.s;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.rnscreens.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class f extends com.swmansion.rnscreens.d<ScreenStackFragment> {
    private final ArrayList<ScreenStackFragment> k;
    private final Set<ScreenStackFragment> l;
    private ScreenStackFragment m;
    private boolean n;
    private final l.h o;
    private final l.g p;

    /* loaded from: classes.dex */
    class a implements l.h {
        a() {
        }

        @Override // androidx.fragment.app.l.h
        public void a() {
            if (f.this.f10054c.o() == 0) {
                f fVar = f.this;
                fVar.a(fVar.m);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends l.g {
        b() {
        }

        @Override // androidx.fragment.app.l.g
        public void d(l lVar, Fragment fragment) {
            if (f.this.m == fragment) {
                f fVar = f.this;
                fVar.setupBackHandlerIfNeeded(fVar.m);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenStackFragment f10066b;

        c(f fVar, ScreenStackFragment screenStackFragment) {
            this.f10066b = screenStackFragment;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10066b.m0().bringToFront();
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10067a = new int[b.c.values().length];

        static {
            try {
                f10067a[b.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10067a[b.c.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(Context context) {
        super(context);
        this.k = new ArrayList<>();
        this.l = new HashSet();
        this.m = null;
        this.n = false;
        this.o = new a();
        this.p = new b();
    }

    private void g() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new i(getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupBackHandlerIfNeeded(ScreenStackFragment screenStackFragment) {
        if (!this.m.N()) {
            return;
        }
        this.f10054c.b(this.o);
        this.f10054c.a("RN_SCREEN_LAST", 1);
        ScreenStackFragment screenStackFragment2 = null;
        int i = 0;
        int size = this.k.size();
        while (true) {
            if (i >= size) {
                break;
            }
            ScreenStackFragment screenStackFragment3 = this.k.get(i);
            if (!this.l.contains(screenStackFragment3)) {
                screenStackFragment2 = screenStackFragment3;
                break;
            }
            i++;
        }
        if (screenStackFragment == screenStackFragment2 || !screenStackFragment.q0()) {
            return;
        }
        s b2 = this.f10054c.b();
        b2.c(screenStackFragment);
        b2.a("RN_SCREEN_LAST");
        b2.b(screenStackFragment);
        b2.b();
        this.f10054c.a(this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d
    public ScreenStackFragment a(com.swmansion.rnscreens.b bVar) {
        return new ScreenStackFragment(bVar);
    }

    public void a(ScreenStackFragment screenStackFragment) {
        this.l.add(screenStackFragment);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d
    public boolean a(ScreenFragment screenFragment) {
        return super.a(screenFragment) && !this.l.contains(screenFragment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d
    public void b(int i) {
        this.l.remove(a(i).getFragment());
        super.b(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
        if (r6 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
        if (r6 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r0 = 4099;
     */
    @Override // com.swmansion.rnscreens.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.f.c():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d
    public void d() {
        this.l.clear();
        super.d();
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        if (this.n) {
            this.n = false;
            g();
        }
    }

    public void f() {
        if (!this.n) {
            g();
        }
    }

    public com.swmansion.rnscreens.b getRootScreen() {
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            com.swmansion.rnscreens.b a2 = a(i);
            if (!this.l.contains(a2.getFragment())) {
                return a2;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    public com.swmansion.rnscreens.b getTopScreen() {
        ScreenStackFragment screenStackFragment = this.m;
        if (screenStackFragment != null) {
            return screenStackFragment.m0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10054c.a(this.p, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.d, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        l lVar = this.f10054c;
        if (lVar != null) {
            lVar.b(this.o);
            this.f10054c.a(this.p);
            if (!this.f10054c.x()) {
                this.f10054c.a("RN_SCREEN_LAST", 1);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        super.startViewTransition(view);
        this.n = true;
    }
}
