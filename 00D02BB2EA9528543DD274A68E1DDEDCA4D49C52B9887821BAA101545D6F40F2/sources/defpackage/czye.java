package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: czye  reason: default package */
/* loaded from: classes5.dex */
final class czye implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ czyg b;

    public czye(czyg czygVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = czygVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        czyd adapter2 = this.a.getAdapter2();
        if (i < adapter2.c() || i > adapter2.d()) {
            return;
        }
        czxl czxlVar = this.b.e;
        if (!czxlVar.a.b.c.a(this.a.getAdapter2().getItem(i).longValue())) {
            return;
        }
        czxlVar.a.a.h();
        Iterator it = czxlVar.a.ae.iterator();
        while (it.hasNext()) {
            ((czyh) it.next()).a(czxlVar.a.a.a());
        }
        czxlVar.a.f.k.s();
        RecyclerView recyclerView = czxlVar.a.e;
        if (recyclerView == null) {
            return;
        }
        recyclerView.k.s();
    }
}
