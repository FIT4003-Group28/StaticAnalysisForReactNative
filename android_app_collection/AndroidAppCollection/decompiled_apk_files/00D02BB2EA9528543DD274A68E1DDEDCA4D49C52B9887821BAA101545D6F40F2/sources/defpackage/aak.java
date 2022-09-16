package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aak  reason: default package */
/* loaded from: classes2.dex */
public final class aak implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ aaq a;

    public aak(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        zh zhVar;
        if (i == -1 || (zhVar = this.a.e) == null) {
            return;
        }
        zhVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
