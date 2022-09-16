package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: cpmi  reason: default package */
/* loaded from: classes5.dex */
public final class cpmi implements AdapterView.OnItemClickListener {
    final /* synthetic */ cpmk a;

    public cpmi(cpmk cpmkVar) {
        this.a = cpmkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.c.setAddressInputState(cpnd.AUTOCOMPLETE);
        if (this.a.g != null) {
            this.a.g.a().a(((cpmu) adapterView.getAdapter()).getItem(i));
        }
    }
}
