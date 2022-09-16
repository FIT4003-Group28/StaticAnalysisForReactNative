package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wr  reason: default package */
/* loaded from: classes4.dex */
public final class wr implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ww a;

    public wr(ww wwVar) {
        this.a = wwVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        vv vvVar;
        if (i == -1 || (vvVar = this.a.e) == null) {
            return;
        }
        vvVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
