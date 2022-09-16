package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class TimePickerDialogFragment extends DialogFragment {
    private TimePickerDialog.OnTimeSetListener k0;
    private DialogInterface.OnDismissListener l0;

    static Dialog a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        b bVar = b.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            bVar = b.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt("hour", calendar.get(11));
            i2 = bundle.getInt("minute", calendar.get(12));
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (bVar == b.CLOCK) {
                return new a(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
            if (bVar == b.SPINNER) {
                return new a(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new a(context, onTimeSetListener, i, i2, is24HourFormat);
    }

    public void a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.k0 = onTimeSetListener;
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.l0 = onDismissListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog n(Bundle bundle) {
        return a(l(), g(), this.k0);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
