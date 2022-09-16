package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
/* compiled from: PG */
/* renamed from: mtp  reason: default package */
/* loaded from: classes3.dex */
public final class mtp extends ArrayAdapter {
    private final int a;
    private int b;
    private final boolean c;

    public mtp(Context context, boolean z) {
        super(context, 17367048);
        this.b = 17367048;
        this.a = 17367048;
        this.c = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        aran aranVar = (aran) getItem(i);
        return nfj.i(view, viewGroup, aranVar.c, aranVar.b, i == 0, getContext(), this.b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aran aranVar = (aran) getItem(i);
        return nfj.j(view, viewGroup, aranVar.c, aranVar.b, i == 0, this.c, getContext(), this.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return nfj.h(((aran) getItem(i)).d);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
