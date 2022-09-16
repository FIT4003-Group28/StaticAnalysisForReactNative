package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: zg  reason: default package */
/* loaded from: classes4.dex */
public final class zg implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ SearchView a;

    public zg(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.onItemSelected(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
