package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: xuv  reason: default package */
/* loaded from: classes4.dex */
final class xuv implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ xuz a;

    public xuv(xuz xuzVar) {
        this.a = xuzVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        xty xtyVar = this.a.am;
        xtyVar.a = xtyVar.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
