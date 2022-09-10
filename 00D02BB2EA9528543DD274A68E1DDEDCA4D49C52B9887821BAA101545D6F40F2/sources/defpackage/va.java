package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: va  reason: default package */
/* loaded from: classes.dex */
public final class va extends BaseAdapter {
    final /* synthetic */ vb a;
    private int b = -1;

    public va(vb vbVar) {
        this.a = vbVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final vi getItem(int i) {
        ArrayList<vi> w = this.a.c.w();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return w.get(i);
    }

    final void b() {
        vf vfVar = this.a.c;
        vi viVar = vfVar.h;
        if (viVar != null) {
            ArrayList<vi> w = vfVar.w();
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (w.get(i) == viVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.w().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((vu) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
