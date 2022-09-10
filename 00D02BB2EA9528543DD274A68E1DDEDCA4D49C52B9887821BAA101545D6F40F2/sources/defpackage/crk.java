package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: crk  reason: default package */
/* loaded from: classes5.dex */
final class crk implements AdapterView.OnItemClickListener {
    final /* synthetic */ crl a;

    public crk(crl crlVar) {
        this.a = crlVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.a.a.aD) {
            return;
        }
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (!(itemAtPosition instanceof cto)) {
            return;
        }
        ((cto) itemAtPosition).d();
    }
}
