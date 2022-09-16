package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: ajvb  reason: default package */
/* loaded from: classes.dex */
final class ajvb implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ajva a;
    final /* synthetic */ ajvc b;

    public ajvb(ajvc ajvcVar, ajva ajvaVar) {
        this.b = ajvcVar;
        this.a = ajvaVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ajvd ajvdVar = this.b.e;
        ajva ajvaVar = this.a;
        if (ajvaVar.a != i) {
            ajvaVar.a = i;
            ajvdVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
