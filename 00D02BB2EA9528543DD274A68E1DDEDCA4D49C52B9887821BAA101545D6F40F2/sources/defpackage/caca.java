package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: caca  reason: default package */
/* loaded from: classes4.dex */
final class caca implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ cacc a;

    public caca(cacc caccVar) {
        this.a = caccVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        cacc caccVar = this.a;
        caccVar.f = caccVar.c.get(caccVar.e.get(i));
        this.a.w();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
