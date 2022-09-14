package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xy  reason: default package */
/* loaded from: classes7.dex */
public final class xy implements AdapterView.OnItemClickListener {
    final /* synthetic */ yb a;

    public xy(yb ybVar) {
        this.a = ybVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            yb ybVar = this.a;
            ybVar.d.performItemClick(view, i, ybVar.b.getItemId(i));
        }
        this.a.k();
    }
}
