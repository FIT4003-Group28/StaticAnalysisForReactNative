package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: DatePickerDialogFragment.java */
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public class a extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f3536a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnDismissListener f3537b;

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return a(getArguments(), getActivity(), this.f3536a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Dialog a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        c cVar;
        c cVar2;
        Calendar calendar = Calendar.getInstance();
        if (bundle != null && bundle.containsKey("date")) {
            calendar.setTimeInMillis(bundle.getLong("date"));
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        b bVar = b.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            bVar = b.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 21) {
            switch (bVar2) {
                case CALENDAR:
                    cVar2 = new c(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
                    break;
                case SPINNER:
                    cVar2 = new c(context, context.getResources().getIdentifier("SpinnerDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
                    break;
                case DEFAULT:
                    cVar2 = new c(context, onDateSetListener, i, i2, i3);
                    break;
                default:
                    cVar2 = null;
                    break;
            }
            cVar = cVar2;
        } else {
            cVar = new c(context, onDateSetListener, i, i2, i3);
            switch (bVar2) {
                case CALENDAR:
                    cVar.getDatePicker().setCalendarViewShown(true);
                    cVar.getDatePicker().setSpinnersShown(false);
                    break;
                case SPINNER:
                    cVar.getDatePicker().setCalendarViewShown(false);
                    break;
            }
        }
        DatePicker datePicker = cVar.getDatePicker();
        if (bundle != null && bundle.containsKey("minDate")) {
            calendar.setTimeInMillis(bundle.getLong("minDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            datePicker.setMinDate(calendar.getTimeInMillis());
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle != null && bundle.containsKey("maxDate")) {
            calendar.setTimeInMillis(bundle.getLong("maxDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3537b != null) {
            this.f3537b.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f3536a = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f3537b = onDismissListener;
    }
}
