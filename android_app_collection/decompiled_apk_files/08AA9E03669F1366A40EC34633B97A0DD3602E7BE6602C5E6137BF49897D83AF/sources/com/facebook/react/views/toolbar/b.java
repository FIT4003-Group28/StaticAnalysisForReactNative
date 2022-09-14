package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.f.c.d;
import com.facebook.f.e.o;
import com.facebook.f.i.e;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
/* compiled from: ReactToolbar.java */
/* loaded from: classes.dex */
public class b extends Toolbar {
    private final com.facebook.f.i.b e;
    private final com.facebook.f.i.b f;
    private final com.facebook.f.i.b g;
    private final e<com.facebook.f.f.a> h;
    private AbstractC0074b i;
    private AbstractC0074b j;
    private AbstractC0074b k;
    private final Runnable l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactToolbar.java */
    /* renamed from: com.facebook.react.views.toolbar.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public abstract class AbstractC0074b extends com.facebook.f.c.c<com.facebook.imagepipeline.i.e> {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.f.i.b f4170a;

        /* renamed from: c  reason: collision with root package name */
        private c f4172c;

        protected abstract void a(Drawable drawable);

        public AbstractC0074b(com.facebook.f.i.b bVar) {
            this.f4170a = bVar;
        }

        public void a(c cVar) {
            this.f4172c = cVar;
        }

        @Override // com.facebook.f.c.c, com.facebook.f.c.d
        public void a(String str, com.facebook.imagepipeline.i.e eVar, Animatable animatable) {
            super.a(str, (String) eVar, animatable);
            if (this.f4172c != null) {
                eVar = this.f4172c;
            }
            a(new com.facebook.react.views.toolbar.a(this.f4170a.f(), eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactToolbar.java */
    /* loaded from: classes.dex */
    public class a extends AbstractC0074b {

        /* renamed from: c  reason: collision with root package name */
        private final MenuItem f4169c;

        a(MenuItem menuItem, com.facebook.f.i.b bVar) {
            super(bVar);
            this.f4169c = menuItem;
        }

        @Override // com.facebook.react.views.toolbar.b.AbstractC0074b
        protected void a(Drawable drawable) {
            this.f4169c.setIcon(drawable);
            b.this.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactToolbar.java */
    /* loaded from: classes.dex */
    public static class c implements com.facebook.imagepipeline.i.e {

        /* renamed from: a  reason: collision with root package name */
        private int f4173a;

        /* renamed from: b  reason: collision with root package name */
        private int f4174b;

        public c(int i, int i2) {
            this.f4173a = i;
            this.f4174b = i2;
        }

        @Override // com.facebook.imagepipeline.i.e
        public int f() {
            return this.f4173a;
        }

        @Override // com.facebook.imagepipeline.i.e
        public int g() {
            return this.f4174b;
        }
    }

    public b(Context context) {
        super(context);
        this.h = new e<>();
        this.l = new Runnable() { // from class: com.facebook.react.views.toolbar.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.measure(View.MeasureSpec.makeMeasureSpec(b.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(b.this.getHeight(), 1073741824));
                b.this.layout(b.this.getLeft(), b.this.getTop(), b.this.getRight(), b.this.getBottom());
            }
        };
        this.e = com.facebook.f.i.b.a(j(), context);
        this.f = com.facebook.f.i.b.a(j(), context);
        this.g = com.facebook.f.i.b.a(j(), context);
        this.i = new AbstractC0074b(this.e) { // from class: com.facebook.react.views.toolbar.b.1
            @Override // com.facebook.react.views.toolbar.b.AbstractC0074b
            protected void a(Drawable drawable) {
                b.this.setLogo(drawable);
            }
        };
        this.j = new AbstractC0074b(this.f) { // from class: com.facebook.react.views.toolbar.b.2
            @Override // com.facebook.react.views.toolbar.b.AbstractC0074b
            protected void a(Drawable drawable) {
                b.this.setNavigationIcon(drawable);
            }
        };
        this.k = new AbstractC0074b(this.g) { // from class: com.facebook.react.views.toolbar.b.3
            @Override // com.facebook.react.views.toolbar.b.AbstractC0074b
            protected void a(Drawable drawable) {
                b.this.setOverflowIcon(drawable);
            }
        };
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.l);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        i();
    }

    private void h() {
        this.e.c();
        this.f.c();
        this.g.c();
        this.h.b();
    }

    private void i() {
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLogoSource(an anVar) {
        a(anVar, this.i, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNavIconSource(an anVar) {
        a(anVar, this.j, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOverflowIconSource(an anVar) {
        a(anVar, this.k, this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActions(am amVar) {
        Menu menu = getMenu();
        menu.clear();
        this.h.c();
        if (amVar != null) {
            for (int i = 0; i < amVar.size(); i++) {
                an c2 = amVar.c(i);
                MenuItem add = menu.add(0, 0, i, c2.getString("title"));
                if (c2.hasKey("icon")) {
                    a(add, c2.d("icon"));
                }
                int i2 = c2.hasKey("show") ? c2.getInt("show") : 0;
                if (c2.hasKey("showWithText") && c2.getBoolean("showWithText")) {
                    i2 |= 4;
                }
                add.setShowAsAction(i2);
            }
        }
    }

    private void a(MenuItem menuItem, an anVar) {
        com.facebook.f.i.b<com.facebook.f.f.a> a2 = com.facebook.f.i.b.a(j(), getContext());
        a aVar = new a(menuItem, a2);
        aVar.a(a(anVar));
        a(anVar, aVar, a2);
        this.h.a(a2);
    }

    private void a(an anVar, AbstractC0074b abstractC0074b, com.facebook.f.i.b bVar) {
        String string = anVar != null ? anVar.getString("uri") : null;
        if (string == null) {
            abstractC0074b.a((c) null);
            abstractC0074b.a((Drawable) null);
        } else if (string.startsWith("http://") || string.startsWith("https://") || string.startsWith("file://")) {
            abstractC0074b.a(a(anVar));
            bVar.a(com.facebook.f.a.a.c.a().b(Uri.parse(string)).a((d) abstractC0074b).b(bVar.d()).q());
            bVar.f().setVisible(true, true);
        } else {
            abstractC0074b.a(b(string));
        }
    }

    private com.facebook.f.f.a j() {
        return new com.facebook.f.f.b(getResources()).a(o.b.f2453c).a(0).s();
    }

    private int a(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private Drawable b(String str) {
        if (a(str) != 0) {
            return getResources().getDrawable(a(str));
        }
        return null;
    }

    private c a(an anVar) {
        if (!anVar.hasKey("width") || !anVar.hasKey("height")) {
            return null;
        }
        return new c(Math.round(com.facebook.react.uimanager.o.a(anVar.getInt("width"))), Math.round(com.facebook.react.uimanager.o.a(anVar.getInt("height"))));
    }
}
