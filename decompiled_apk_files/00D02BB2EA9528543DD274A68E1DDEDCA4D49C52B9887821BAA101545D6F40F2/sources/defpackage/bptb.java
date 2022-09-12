package defpackage;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
/* compiled from: PG */
/* renamed from: bptb  reason: default package */
/* loaded from: classes4.dex */
final class bptb implements TimePickerDialog.OnTimeSetListener {
    final /* synthetic */ eaol a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boxe c;
    final /* synthetic */ bpvw d;

    public bptb(eaol eaolVar, boolean z, boxe boxeVar, bpvw bpvwVar) {
        this.a = eaolVar;
        this.b = z;
        this.c = boxeVar;
        this.d = bpvwVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        eaol eaolVar = new eaol(this.a.y(), this.a.z(), this.a.A(), i, i2);
        if (this.b) {
            this.c.c = eaolVar;
        } else {
            this.c.d = eaolVar;
        }
        cqkx.p(this.d);
    }
}
