package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    protected Context f741a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f742b;

    /* renamed from: c  reason: collision with root package name */
    protected g f743c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f744d;
    protected LayoutInflater e;
    protected n f;
    private m.a g;
    private int h;
    private int i;

    public abstract void a(h hVar, n.a aVar);

    public boolean a(int i, h hVar) {
        return true;
    }

    @Override // android.support.v7.view.menu.m
    public boolean a(g gVar, h hVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.m
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.m
    public boolean b(g gVar, h hVar) {
        return false;
    }

    public b(Context context, int i, int i2) {
        this.f741a = context;
        this.f744d = LayoutInflater.from(context);
        this.h = i;
        this.i = i2;
    }

    @Override // android.support.v7.view.menu.m
    public void a(Context context, g gVar) {
        this.f742b = context;
        this.e = LayoutInflater.from(this.f742b);
        this.f743c = gVar;
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return;
        }
        int i = 0;
        if (this.f743c != null) {
            this.f743c.i();
            ArrayList<h> h = this.f743c.h();
            int size = h.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = h.get(i3);
                if (a(i2, hVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    h itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View a2 = a(hVar, childAt, viewGroup);
                    if (hVar != itemData) {
                        a2.setPressed(false);
                        a2.jumpDrawablesToCurrentState();
                    }
                    if (a2 != childAt) {
                        a(a2, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f).addView(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // android.support.v7.view.menu.m
    public void a(m.a aVar) {
        this.g = aVar;
    }

    public m.a a() {
        return this.g;
    }

    public n.a a(ViewGroup viewGroup) {
        return (n.a) this.f744d.inflate(this.i, viewGroup, false);
    }

    public View a(h hVar, View view, ViewGroup viewGroup) {
        n.a a2;
        if (view instanceof n.a) {
            a2 = (n.a) view;
        } else {
            a2 = a(viewGroup);
        }
        a(hVar, a2);
        return (View) a2;
    }

    @Override // android.support.v7.view.menu.m
    public void a(g gVar, boolean z) {
        if (this.g != null) {
            this.g.a(gVar, z);
        }
    }

    @Override // android.support.v7.view.menu.m
    public boolean a(s sVar) {
        if (this.g != null) {
            return this.g.a(sVar);
        }
        return false;
    }
}
