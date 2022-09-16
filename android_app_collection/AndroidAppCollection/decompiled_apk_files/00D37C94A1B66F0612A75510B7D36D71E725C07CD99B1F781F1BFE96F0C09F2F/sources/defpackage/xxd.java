package defpackage;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
/* compiled from: PG */
/* renamed from: xxd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxd implements ayoj {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bahm b;
    private final /* synthetic */ int c;

    public /* synthetic */ xxd(Context context, bahm bahmVar) {
        this.a = context;
        this.b = bahmVar;
    }

    public /* synthetic */ xxd(Context context, bahm bahmVar, int i) {
        this.c = i;
        this.a = context;
        this.b = bahmVar;
    }

    public /* synthetic */ xxd(bahm bahmVar, Context context, int i) {
        this.c = i;
        this.b = bahmVar;
        this.a = context;
    }

    @Override // defpackage.ayoj
    public final void a(azeh azehVar) {
        int i = this.c;
        if (i == 0) {
            Context context = this.a;
            bahm bahmVar = this.b;
            TimePickerDialog timePickerDialog = new TimePickerDialog(context, new afpj(bahmVar, azehVar, 1), bahmVar.m(), bahmVar.n(), DateFormat.is24HourFormat(context));
            timePickerDialog.setOnCancelListener(new xxc(azehVar));
            timePickerDialog.show();
        } else if (i == 1) {
            bahm bahmVar2 = this.b;
            Context context2 = this.a;
            int p = bahmVar2.p();
            int o = bahmVar2.o();
            DatePickerDialog datePickerDialog = new DatePickerDialog(context2, new afog(bahmVar2, azehVar, 1), p, o - 1, bahmVar2.l());
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.setOnCancelListener(new xxc(azehVar, 1));
            datePickerDialog.show();
        } else if (i == 2) {
            bahm bahmVar3 = this.b;
            Context context3 = this.a;
            int p2 = bahmVar3.p();
            int o2 = bahmVar3.o();
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(context3, new afog(bahmVar3, azehVar), p2, o2 - 1, bahmVar3.l());
            datePickerDialog2.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog2.setOnCancelListener(new xxc(azehVar, 2));
            datePickerDialog2.show();
        } else {
            Context context4 = this.a;
            bahm bahmVar4 = this.b;
            TimePickerDialog timePickerDialog2 = new TimePickerDialog(context4, new afpj(bahmVar4, azehVar), bahmVar4.m(), bahmVar4.n(), DateFormat.is24HourFormat(context4));
            timePickerDialog2.setOnCancelListener(new xxc(azehVar, 3));
            timePickerDialog2.show();
        }
    }
}
