package a.a.o;

import a.a.o.b;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: d  reason: collision with root package name */
    private Context f39d;

    /* renamed from: e  reason: collision with root package name */
    private ActionBarContextView f40e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f41f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f42g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f43h;
    private androidx.appcompat.view.menu.g i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f39d = context;
        this.f40e = actionBarContextView;
        this.f41f = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.c(1);
        this.i = gVar;
        this.i.a(this);
    }

    @Override // a.a.o.b
    public void a() {
        if (this.f43h) {
            return;
        }
        this.f43h = true;
        this.f40e.sendAccessibilityEvent(32);
        this.f41f.a(this);
    }

    @Override // a.a.o.b
    public void a(int i) {
        a((CharSequence) this.f39d.getString(i));
    }

    @Override // a.a.o.b
    public void a(View view) {
        this.f40e.setCustomView(view);
        this.f42g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        i();
        this.f40e.d();
    }

    @Override // a.a.o.b
    public void a(CharSequence charSequence) {
        this.f40e.setSubtitle(charSequence);
    }

    @Override // a.a.o.b
    public void a(boolean z) {
        super.a(z);
        this.f40e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f41f.a(this, menuItem);
    }

    @Override // a.a.o.b
    public View b() {
        WeakReference<View> weakReference = this.f42g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.a.o.b
    public void b(int i) {
        b(this.f39d.getString(i));
    }

    @Override // a.a.o.b
    public void b(CharSequence charSequence) {
        this.f40e.setTitle(charSequence);
    }

    @Override // a.a.o.b
    public Menu c() {
        return this.i;
    }

    @Override // a.a.o.b
    public MenuInflater d() {
        return new g(this.f40e.getContext());
    }

    @Override // a.a.o.b
    public CharSequence e() {
        return this.f40e.getSubtitle();
    }

    @Override // a.a.o.b
    public CharSequence g() {
        return this.f40e.getTitle();
    }

    @Override // a.a.o.b
    public void i() {
        this.f41f.a(this, this.i);
    }

    @Override // a.a.o.b
    public boolean j() {
        return this.f40e.b();
    }
}
