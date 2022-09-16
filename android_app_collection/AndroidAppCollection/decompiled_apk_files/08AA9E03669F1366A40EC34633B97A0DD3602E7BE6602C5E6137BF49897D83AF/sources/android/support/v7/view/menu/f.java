package android.support.v7.view.menu;

import android.support.v7.a.a;
import android.support.v7.view.menu.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    static final int f763a = a.g.abc_popup_menu_item_layout;

    /* renamed from: b  reason: collision with root package name */
    g f764b;

    /* renamed from: c  reason: collision with root package name */
    private int f765c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f766d;
    private final boolean e;
    private final LayoutInflater f;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public f(g gVar, LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.f764b = gVar;
        b();
    }

    public void a(boolean z) {
        this.f766d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<h> k = this.e ? this.f764b.k() : this.f764b.h();
        if (this.f765c < 0) {
            return k.size();
        }
        return k.size() - 1;
    }

    public g a() {
        return this.f764b;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public h getItem(int i) {
        ArrayList<h> k = this.e ? this.f764b.k() : this.f764b.h();
        if (this.f765c >= 0 && i >= this.f765c) {
            i++;
        }
        return k.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(f763a, viewGroup, false);
        }
        n.a aVar = (n.a) view;
        if (this.f766d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    void b() {
        h o = this.f764b.o();
        if (o != null) {
            ArrayList<h> k = this.f764b.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (k.get(i) == o) {
                    this.f765c = i;
                    return;
                }
            }
        }
        this.f765c = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
