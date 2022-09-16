package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adgz  reason: default package */
/* loaded from: classes.dex */
public final class adgz implements AdapterView.OnItemClickListener {
    final /* synthetic */ adha a;

    public adgz(adha adhaVar) {
        this.a = adhaVar;
    }

    public final void a(AdapterView adapterView, View view, int i, long j) {
        bhc bhcVar = (bhc) adapterView.getItemAtPosition(i);
        if (!adgj.d(bhcVar) || ((Boolean) this.a.o.get()).booleanValue()) {
            adha adhaVar = this.a;
            if (adhaVar.m == null) {
                return;
            }
            if (adhaVar.r.containsKey(bhcVar.c)) {
                adha adhaVar2 = this.a;
                adhaVar2.q.H(3, (acum) adhaVar2.r.get(bhcVar.c), this.a.p(bhcVar));
            }
            this.a.m.onItemClick(adapterView, view, i, j);
            return;
        }
        this.a.n.d(new aded(bhcVar));
        this.a.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(final AdapterView adapterView, final View view, final int i, final long j) {
        bhc bhcVar = (bhc) adapterView.getItemAtPosition(i);
        if (!this.a.p.a(adgj.d(bhcVar), new adez() { // from class: adgy
            @Override // defpackage.adez
            public final void a() {
                adgz.this.a(adapterView, view, i, j);
            }
        }, bhcVar.d)) {
            a(adapterView, view, i, j);
        } else {
            this.a.dismiss();
        }
    }
}
