package defpackage;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
/* compiled from: PG */
/* renamed from: aoeh  reason: default package */
/* loaded from: classes2.dex */
final class aoeh implements TimePickerDialog.OnTimeSetListener {
    final /* synthetic */ aoei a;

    public aoeh(aoei aoeiVar) {
        this.a = aoeiVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        aoei aoeiVar = this.a;
        eapi eapiVar = new eapi(0L, eaou.b);
        eapi b = eapiVar.b(eapiVar.c.v().p(eapiVar.b, i));
        eapi b2 = b.b(b.c.s().p(b.b, i2));
        eapi b3 = b2.b(b2.c.p().p(b2.b, 0));
        aoeiVar.e(dbsg.i(b3.b(b3.c.m().p(b3.b, 0))));
    }
}
