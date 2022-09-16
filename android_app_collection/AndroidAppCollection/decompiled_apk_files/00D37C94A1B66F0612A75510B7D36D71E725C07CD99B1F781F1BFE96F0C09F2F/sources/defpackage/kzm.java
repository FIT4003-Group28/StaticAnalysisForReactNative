package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
/* compiled from: PG */
/* renamed from: kzm  reason: default package */
/* loaded from: classes3.dex */
final class kzm implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ awdu a;
    final /* synthetic */ kzo b;

    public kzm(kzo kzoVar, awdu awduVar) {
        this.b = kzoVar;
        this.a = awduVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        zag.m(this.b.c, ajgl.b((arag) this.a.e.get(i)));
        this.b.b.d(new kxc(i));
        Spinner spinner = this.b.d;
        arag aragVar = (arag) this.a.d.get(i);
        arah arahVar = aragVar.f;
        if (arahVar == null) {
            arahVar = arah.a;
        }
        if ((arahVar.b & 1) != 0) {
            arah arahVar2 = aragVar.f;
            if (arahVar2 == null) {
                arahVar2 = arah.a;
            }
            aovr aovrVar = arahVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        } else {
            str = null;
        }
        spinner.setContentDescription(str);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
