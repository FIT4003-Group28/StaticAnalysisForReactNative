package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: TimePickerDialogFragment.java */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f3694a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnDismissListener f3695b;

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return a(getArguments(), getActivity(), this.f3694a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Dialog a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        d dVar = d.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            dVar = d.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt("hour", calendar.get(11));
            i2 = bundle.getInt("minute", calendar.get(12));
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (dVar == d.CLOCK) {
                return new a(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
            if (dVar == d.SPINNER) {
                return new a(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new a(context, onTimeSetListener, i, i2, is24HourFormat);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3695b != null) {
            this.f3695b.onDismiss(dialogInterface);
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f3695b = onDismissListener;
    }

    public void a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f3694a = onTimeSetListener;
    }
}
