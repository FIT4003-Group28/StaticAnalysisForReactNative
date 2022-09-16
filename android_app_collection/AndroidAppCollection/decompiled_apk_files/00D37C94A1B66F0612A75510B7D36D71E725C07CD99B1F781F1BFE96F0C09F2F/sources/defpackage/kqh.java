package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: kqh  reason: default package */
/* loaded from: classes3.dex */
final class kqh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ kqk a;

    public kqh(kqk kqkVar) {
        this.a = kqkVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (!(itemAtPosition instanceof aqrc) || (((aqrc) itemAtPosition).b & 4096) == 0) {
            return;
        }
        this.a.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
