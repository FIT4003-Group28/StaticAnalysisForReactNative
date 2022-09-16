package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: sc  reason: default package */
/* loaded from: classes4.dex */
public final class sc extends BaseAdapter {
    public final sf a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public sc(sf sfVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = sfVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final si getItem(int i) {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (si) e.get(i);
    }

    final void b() {
        sf sfVar = this.a;
        si siVar = sfVar.h;
        if (siVar != null) {
            ArrayList e = sfVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((si) e.get(i)) == siVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        if (this.c < 0) {
            return e.size();
        }
        return e.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.w() && i3 != (i4 >= 0 ? getItem(i4).b : i3);
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            if (listMenuItemView.d || !z) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        su suVar = (su) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        suVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
