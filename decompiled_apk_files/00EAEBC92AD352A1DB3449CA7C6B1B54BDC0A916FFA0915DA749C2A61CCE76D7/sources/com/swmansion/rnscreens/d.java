package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.s;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import com.facebook.react.y;
import com.swmansion.rnscreens.ScreenFragment;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public class d<T extends ScreenFragment> extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final ArrayList<T> f10053b;

    /* renamed from: c  reason: collision with root package name */
    protected l f10054c;

    /* renamed from: d  reason: collision with root package name */
    private s f10055d;

    /* renamed from: e  reason: collision with root package name */
    private s f10056e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10057f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10058g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10059h;
    private final a.AbstractC0125a i;
    private final a.AbstractC0125a j;

    /* loaded from: classes.dex */
    class a extends a.AbstractC0125a {
        a() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            d.this.i();
        }
    }

    /* loaded from: classes.dex */
    class b extends a.AbstractC0125a {
        b() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            d.this.f10059h = false;
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), 1073741824));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f10062b;

        c(s sVar) {
            this.f10062b = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f10056e == this.f10062b) {
                d.this.f10056e = null;
            }
        }
    }

    public d(Context context) {
        super(context);
        this.f10053b = new ArrayList<>();
        this.f10059h = false;
        this.i = new a();
        this.j = new b();
    }

    private void c(ScreenFragment screenFragment) {
        getOrCreateTransaction().a(getId(), screenFragment);
    }

    private void d(ScreenFragment screenFragment) {
        getOrCreateTransaction().a(screenFragment);
    }

    private void e(ScreenFragment screenFragment) {
        s orCreateTransaction = getOrCreateTransaction();
        orCreateTransaction.a(screenFragment);
        orCreateTransaction.a(getId(), screenFragment);
    }

    private final void f() {
        this.f10054c.n();
        c();
    }

    private void g() {
        s b2 = this.f10054c.b();
        boolean z = false;
        for (Fragment fragment : this.f10054c.q()) {
            if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).X.getContainer() == this) {
                b2.a(fragment);
                z = true;
            }
        }
        if (z) {
            b2.d();
        }
    }

    private void h() {
        boolean z;
        boolean z2;
        l h2;
        ViewParent viewParent = this;
        while (true) {
            z = viewParent instanceof y;
            if (z || (viewParent instanceof com.swmansion.rnscreens.b) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
        }
        if (viewParent instanceof com.swmansion.rnscreens.b) {
            h2 = ((com.swmansion.rnscreens.b) viewParent).getFragment().m();
        } else if (!z) {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        } else {
            Context context = ((y) viewParent).getContext();
            while (true) {
                z2 = context instanceof androidx.fragment.app.c;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (!z2) {
                throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactFragmentActivity or ReactCompatActivity");
            }
            h2 = ((androidx.fragment.app.c) context).h();
        }
        setFragmentManager(h2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.f10057f || !this.f10058g || this.f10054c == null) {
            return;
        }
        this.f10057f = false;
        f();
    }

    private void setFragmentManager(l lVar) {
        this.f10054c = lVar;
        i();
    }

    protected T a(com.swmansion.rnscreens.b bVar) {
        return (T) new ScreenFragment(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.swmansion.rnscreens.b a(int i) {
        return this.f10053b.get(i).m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (!this.f10057f) {
            this.f10057f = true;
            com.facebook.react.modules.core.g.a().a(g.c.NATIVE_ANIMATED_MODULE, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.swmansion.rnscreens.b bVar, int i) {
        T a2 = a(bVar);
        bVar.setFragment(a2);
        this.f10053b.add(i, a2);
        bVar.setContainer(this);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ScreenFragment screenFragment) {
        return this.f10053b.contains(screenFragment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i) {
        this.f10053b.get(i).m0().setContainer(null);
        this.f10053b.remove(i);
        a();
    }

    protected boolean b(ScreenFragment screenFragment) {
        return screenFragment.m0().a();
    }

    protected void c() {
        HashSet hashSet = new HashSet(this.f10054c.q());
        int size = this.f10053b.size();
        for (int i = 0; i < size; i++) {
            T t = this.f10053b.get(i);
            if (!b(t) && t.H()) {
                d(t);
            }
            hashSet.remove(t);
        }
        if (!hashSet.isEmpty()) {
            Object[] array = hashSet.toArray();
            for (int i2 = 0; i2 < array.length; i2++) {
                if ((array[i2] instanceof ScreenFragment) && ((ScreenFragment) array[i2]).m0().getContainer() == null) {
                    d((ScreenFragment) array[i2]);
                }
            }
        }
        int size2 = this.f10053b.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            if (b(this.f10053b.get(i4))) {
                i3++;
            }
        }
        boolean z = i3 > 1;
        int size3 = this.f10053b.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < size3; i5++) {
            T t2 = this.f10053b.get(i5);
            boolean b2 = b(t2);
            if (b2 && !t2.H()) {
                c(t2);
                z2 = true;
            } else if (b2 && z2) {
                e(t2);
            }
            t2.m0().setTransitioning(z);
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        int size = this.f10053b.size();
        for (int i = 0; i < size; i++) {
            this.f10053b.get(i).m0().setContainer(null);
        }
        this.f10053b.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        s sVar = this.f10055d;
        if (sVar != null) {
            this.f10056e = sVar;
            this.f10056e.a(new c(sVar));
            this.f10055d.b();
            this.f10055d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s getOrCreateTransaction() {
        if (this.f10055d == null) {
            this.f10055d = this.f10054c.b();
            this.f10055d.a(true);
        }
        return this.f10055d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getScreenCount() {
        return this.f10053b.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10058g = true;
        this.f10057f = true;
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        l lVar = this.f10054c;
        if (lVar != null && !lVar.w()) {
            g();
            this.f10054c.n();
        }
        super.onDetachedFromWindow();
        this.f10058g = false;
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f10059h || this.j == null) {
            return;
        }
        this.f10059h = true;
        com.facebook.react.modules.core.g.a().a(g.c.NATIVE_ANIMATED_MODULE, this.j);
    }
}
