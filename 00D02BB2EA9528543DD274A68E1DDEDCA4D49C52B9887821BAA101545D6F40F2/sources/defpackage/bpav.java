package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpav  reason: default package */
/* loaded from: classes3.dex */
final class bpav implements bnyn<dwhf, dwhj> {
    final /* synthetic */ bpax a;

    public bpav(bpax bpaxVar) {
        this.a = bpaxVar;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        int a;
        dwhf dwhfVar = (dwhf) dssjVar;
        dwhj dwhjVar = (dwhj) dssjVar2;
        bpax bpaxVar = this.a;
        bpaxVar.ax = null;
        bpaxVar.ay = null;
        if (!bpaxVar.aD) {
            return;
        }
        if (dwhjVar == null || (a = dwhi.a(dwhjVar.b)) == 0 || a != 2) {
            bpax bpaxVar2 = this.a;
            if (!bpaxVar2.aD) {
                return;
            }
            bpaxVar2.ax = null;
            Toast.makeText(bpaxVar2.J(), bpaxVar2.Rp(R.string.LOCATION_DATA_ERROR), 0).show();
            return;
        }
        bpax bpaxVar3 = this.a;
        bvrj.UI_THREAD.c();
        bpaxVar3.ax = null;
        if (!bpaxVar3.aD) {
            return;
        }
        if ((dwhjVar.a & 4) == 0) {
            Toast.makeText(bpaxVar3.J(), (int) R.string.LOCATION_DATA_ERROR, 0).show();
            return;
        }
        ily ilyVar = new ily();
        dvyw dvywVar = dwhjVar.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.E(dvywVar);
        bpaxVar3.ag = ilyVar.d();
        bpaxVar3.bI();
        bpaxVar3.bs();
        if (bpaxVar3.ag.aY()) {
            return;
        }
        new bnyw().aJ(bpaxVar3.J());
    }
}
