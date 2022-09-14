package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: b  reason: collision with root package name */
    protected Context f1009b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f1010c;

    /* renamed from: d  reason: collision with root package name */
    protected g f1011d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f1012e;

    /* renamed from: f  reason: collision with root package name */
    private n.a f1013f;

    /* renamed from: g  reason: collision with root package name */
    private int f1014g;

    /* renamed from: h  reason: collision with root package name */
    private int f1015h;
    protected o i;

    public b(Context context, int i, int i2) {
        this.f1009b = context;
        this.f1012e = LayoutInflater.from(context);
        this.f1014g = i;
        this.f1015h = i2;
    }

    public View a(j jVar, View view, ViewGroup viewGroup) {
        o.a a2 = view instanceof o.a ? (o.a) view : a(viewGroup);
        a(jVar, a2);
        return (View) a2;
    }

    public o.a a(ViewGroup viewGroup) {
        return (o.a) this.f1012e.inflate(this.f1015h, viewGroup, false);
    }

    public void a(int i) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Context context, g gVar) {
        this.f1010c = context;
        LayoutInflater.from(this.f1010c);
        this.f1011d = gVar;
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.f1013f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public abstract void a(j jVar, o.a aVar);

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.f1013f = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f1011d;
        int i = 0;
        if (gVar != null) {
            gVar.b();
            ArrayList<j> n = this.f1011d.n();
            int size = n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = n.get(i3);
                if (a(i2, jVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View a2 = a(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
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

    public abstract boolean a(int i, j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        n.a aVar = this.f1013f;
        if (aVar != null) {
            return aVar.a(sVar);
        }
        return false;
    }

    public n.a b() {
        return this.f1013f;
    }

    public o b(ViewGroup viewGroup) {
        if (this.i == null) {
            this.i = (o) this.f1012e.inflate(this.f1014g, viewGroup, false);
            this.i.a(this.f1011d);
            a(true);
        }
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean b(g gVar, j jVar) {
        return false;
    }
}
