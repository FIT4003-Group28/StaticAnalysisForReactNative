package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: dahi  reason: default package */
/* loaded from: classes5.dex */
final class dahi implements AdapterView.OnItemClickListener {
    final /* synthetic */ dahj a;

    public dahi(dahj dahjVar) {
        this.a = dahjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        View view2 = null;
        if (i >= 0) {
            item = this.a.getAdapter().getItem(i);
        } else {
            aaq aaqVar = this.a.a;
            item = !aaqVar.m() ? null : aaqVar.e.getSelectedItem();
        }
        this.a.a(item);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                aaq aaqVar2 = this.a.a;
                if (aaqVar2.m()) {
                    view2 = aaqVar2.e.getSelectedView();
                }
                view = view2;
                i = this.a.a.v();
                aaq aaqVar3 = this.a.a;
                j = !aaqVar3.m() ? Long.MIN_VALUE : aaqVar3.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.a.a.e, view, i, j);
        }
        this.a.a.k();
    }
}
