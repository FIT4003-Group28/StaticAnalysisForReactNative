package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
/* compiled from: PG */
/* renamed from: mvg  reason: default package */
/* loaded from: classes3.dex */
public final class mvg extends ArrayAdapter {
    private final int a;
    private int b;

    public mvg(Context context) {
        super(context, 17367048);
        this.b = 17367048;
        this.a = 17367048;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        arar ararVar = (arar) getItem(i);
        return nfj.i(view, viewGroup, ararVar.c, ararVar.b, ararVar.e, getContext(), this.b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        arar ararVar = (arar) getItem(i);
        return nfj.j(view, viewGroup, ararVar.c, ararVar.b, ararVar.e, false, getContext(), this.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return nfj.h(((arar) getItem(i)).e);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
