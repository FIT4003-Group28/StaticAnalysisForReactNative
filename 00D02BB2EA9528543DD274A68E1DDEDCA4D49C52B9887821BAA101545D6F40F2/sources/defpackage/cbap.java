package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: cbap  reason: default package */
/* loaded from: classes4.dex */
final class cbap implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ cbar a;

    public cbap(cbar cbarVar) {
        this.a = cbarVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        cbar cbarVar = this.a;
        if (i != cbarVar.c) {
            cbarVar.c = i;
            dpyf dpyfVar = cbarVar.d.d.get(0);
            dsqp dsqpVar = (dsqp) dpyfVar.cu(5);
            dsqpVar.bC(dpyfVar);
            dpye dpyeVar = (dpye) dsqpVar;
            if (dpyeVar.c) {
                dpyeVar.bF();
                dpyeVar.c = false;
            }
            dsrg<Integer, dpol> dsrgVar = dpyf.c;
            ((dpyf) dpyeVar.b).b = dpyf.cf();
            dpyeVar.a(cbpy.f().get(i));
            dpyf bK = dpyeVar.bK();
            cbar cbarVar2 = this.a;
            dpsd dpsdVar = cbarVar2.d;
            dsqp dsqpVar2 = (dsqp) dpsdVar.cu(5);
            dsqpVar2.bC(dpsdVar);
            dpsc dpscVar = (dpsc) dsqpVar2;
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = false;
            }
            ((dpsd) dpscVar.b).d = dpsd.ck();
            dpscVar.b(bK);
            cbarVar2.d = dpscVar.bK();
            cbar cbarVar3 = this.a;
            cbarVar3.a.d(cbarVar3.d);
            cqkx.p(this.a);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
