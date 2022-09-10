package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: bpta  reason: default package */
/* loaded from: classes4.dex */
final class bpta implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ eaol a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boxe c;
    final /* synthetic */ bpvw d;

    public bpta(eaol eaolVar, boolean z, boxe boxeVar, bpvw bpvwVar) {
        this.a = eaolVar;
        this.b = z;
        this.c = boxeVar;
        this.d = bpvwVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        eaol eaolVar = new eaol(i, i2 + 1, i3, this.a.C(), this.a.D());
        if (this.b) {
            this.c.c = eaolVar;
        } else {
            this.c.d = eaolVar;
        }
        cqkx.p(this.d);
    }
}
