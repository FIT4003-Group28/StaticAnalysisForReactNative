package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: afog  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afog implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ bahm a;
    public final /* synthetic */ azeh b;
    private final /* synthetic */ int c;

    public /* synthetic */ afog(bahm bahmVar, azeh azehVar) {
        this.a = bahmVar;
        this.b = azehVar;
    }

    public /* synthetic */ afog(bahm bahmVar, azeh azehVar, int i) {
        this.c = i;
        this.a = bahmVar;
        this.b = azehVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.c == 0) {
            bahm bahmVar = this.a;
            azeh azehVar = this.b;
            if (!datePicker.isShown()) {
                return;
            }
            azehVar.a(bahmVar.h(i).g(i2 + 1).c(i3));
            azehVar.c();
            return;
        }
        bahm bahmVar2 = this.a;
        azeh azehVar2 = this.b;
        azehVar2.a(bahmVar2.h(i).g(i2 + 1).c(i3));
        azehVar2.c();
    }
}
