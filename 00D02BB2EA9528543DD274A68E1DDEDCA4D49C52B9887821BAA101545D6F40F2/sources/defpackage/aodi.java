package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: aodi  reason: default package */
/* loaded from: classes2.dex */
final class aodi implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ aodj a;

    public aodi(aodj aodjVar) {
        this.a = aodjVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        aodj aodjVar = this.a;
        eapg eapgVar = new eapg(0L, eaou.b);
        eapg o = eapgVar.o(eapgVar.b.N().p(eapgVar.a, i));
        aodjVar.e(dbsg.i(o.o(o.b.L().p(o.a, i2 + 1)).v(i3)));
    }
}
