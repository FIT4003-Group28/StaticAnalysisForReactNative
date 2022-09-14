package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
/* compiled from: PG */
/* renamed from: ada  reason: default package */
/* loaded from: classes2.dex */
final class ada extends BaseAdapter {
    final /* synthetic */ add a;

    public ada(add addVar) {
        this.a = addVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((adb) this.a.b.getChildAt(i)).a;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            add addVar = this.a;
            adb adbVar = new adb(addVar, addVar.getContext(), (qj) getItem(i));
            adbVar.setBackgroundDrawable(null);
            adbVar.setLayoutParams(new AbsListView.LayoutParams(-1, addVar.e));
            return adbVar;
        }
        adb adbVar2 = (adb) view;
        adbVar2.a = (qj) getItem(i);
        adbVar2.a();
        return view;
    }
}
