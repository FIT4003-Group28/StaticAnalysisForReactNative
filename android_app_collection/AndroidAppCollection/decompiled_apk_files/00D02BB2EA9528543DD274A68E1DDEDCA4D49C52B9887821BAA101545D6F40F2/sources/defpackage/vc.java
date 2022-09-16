package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vc  reason: default package */
/* loaded from: classes7.dex */
public final class vc extends BaseAdapter {
    public final vf a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public vc(vf vfVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = vfVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final vi getItem(int i) {
        ArrayList<vi> w = this.d ? this.a.w() : this.a.u();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return w.get(i);
    }

    final void b() {
        vf vfVar = this.a;
        vi viVar = vfVar.h;
        if (viVar != null) {
            ArrayList<vi> w = vfVar.w();
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (w.get(i) == viVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<vi> w = this.d ? this.a.w() : this.a.u();
        if (this.c < 0) {
            return w.size();
        }
        return w.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.i() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        vu vuVar = (vu) view;
        if (this.b) {
            listMenuItemView.setForceShowIcon(true);
        }
        vuVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
