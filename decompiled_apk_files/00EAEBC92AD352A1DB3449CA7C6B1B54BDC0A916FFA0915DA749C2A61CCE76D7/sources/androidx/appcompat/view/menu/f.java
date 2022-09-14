package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    g f1044b;

    /* renamed from: c  reason: collision with root package name */
    private int f1045c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1046d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1047e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f1048f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1049g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1047e = z;
        this.f1048f = layoutInflater;
        this.f1044b = gVar;
        this.f1049g = i;
        a();
    }

    void a() {
        j f2 = this.f1044b.f();
        if (f2 != null) {
            ArrayList<j> j = this.f1044b.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f2) {
                    this.f1045c = i;
                    return;
                }
            }
        }
        this.f1045c = -1;
    }

    public void a(boolean z) {
        this.f1046d = z;
    }

    public g b() {
        return this.f1044b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> j = this.f1047e ? this.f1044b.j() : this.f1044b.n();
        int i = this.f1045c;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public j mo37getItem(int i) {
        ArrayList<j> j = this.f1047e ? this.f1044b.j() : this.f1044b.n();
        int i2 = this.f1045c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1048f.inflate(this.f1049g, viewGroup, false);
        }
        int groupId = mo37getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1044b.o() && groupId != (i2 >= 0 ? mo37getItem(i2).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f1046d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(mo37getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
