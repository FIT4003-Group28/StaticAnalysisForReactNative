package defpackage;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
/* compiled from: PG */
/* renamed from: afpj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afpj implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ bahm a;
    public final /* synthetic */ azeh b;
    private final /* synthetic */ int c;

    public /* synthetic */ afpj(bahm bahmVar, azeh azehVar) {
        this.a = bahmVar;
        this.b = azehVar;
    }

    public /* synthetic */ afpj(bahm bahmVar, azeh azehVar, int i) {
        this.c = i;
        this.a = bahmVar;
        this.b = azehVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        if (this.c == 0) {
            bahm bahmVar = this.a;
            azeh azehVar = this.b;
            if (!timePicker.isShown()) {
                return;
            }
            azehVar.a(bahmVar.d(i).f(i2));
            azehVar.c();
            return;
        }
        bahm bahmVar2 = this.a;
        azeh azehVar2 = this.b;
        azehVar2.a(bahmVar2.d(i).f(i2));
        azehVar2.c();
    }
}
