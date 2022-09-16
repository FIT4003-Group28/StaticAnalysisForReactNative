package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: alqb  reason: default package */
/* loaded from: classes.dex */
final class alqb implements AdapterView.OnItemClickListener {
    final /* synthetic */ alqc a;

    public alqb(alqc alqcVar) {
        this.a = alqcVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2 = null;
        if (i >= 0) {
            item = this.a.getAdapter().getItem(i);
        } else {
            ww wwVar = this.a.a;
            item = !wwVar.u() ? null : wwVar.e.getSelectedItem();
        }
        this.a.a(item);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                ww wwVar2 = this.a.a;
                if (wwVar2.u()) {
                    view2 = wwVar2.e.getSelectedView();
                }
                view = view2;
                i = this.a.a.o();
                ww wwVar3 = this.a.a;
                j = !wwVar3.u() ? Long.MIN_VALUE : wwVar3.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.a.a.e, view, i, j);
        }
        this.a.a.k();
    }
}
