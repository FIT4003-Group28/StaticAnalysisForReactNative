package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xwj  reason: default package */
/* loaded from: classes4.dex */
final class xwj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ xwk a;

    public xwj(xwk xwkVar) {
        this.a = xwkVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        xwk xwkVar = this.a;
        bahm bahmVar = xwkVar.aj;
        baht f = bahq.f(baht.j((int) TimeUnit.SECONDS.toMillis(((aqko) this.a.ak.get(i)).f)));
        baht f2 = bahq.f(bahmVar.k());
        if (f != f2) {
            long j2 = bahmVar.a;
            baht k = f == null ? baht.k() : f;
            if (k != f2) {
                j2 = k.n(f2.d(j2), j2);
            }
            bahmVar = new bahm(j2, bahmVar.b.b(f));
        }
        xwkVar.aj = bahmVar;
        this.a.aE();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
