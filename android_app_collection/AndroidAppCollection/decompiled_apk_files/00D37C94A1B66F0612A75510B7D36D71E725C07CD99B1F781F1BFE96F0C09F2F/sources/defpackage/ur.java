package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ur  reason: default package */
/* loaded from: classes4.dex */
public final class ur implements AdapterView.OnItemClickListener {
    final /* synthetic */ uu a;

    public ur(uu uuVar) {
        this.a = uuVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            uu uuVar = this.a;
            uuVar.d.performItemClick(view, i, uuVar.b.getItemId(i));
        }
        this.a.k();
    }
}
