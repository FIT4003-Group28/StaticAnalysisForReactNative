package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;
import java.util.Locale;
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public class DatePickerDialogFragment extends DialogFragment {
    private DatePickerDialog.OnDateSetListener k0;
    private DialogInterface.OnDismissListener l0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5637a = new int[com.facebook.react.modules.datepicker.a.values().length];

        static {
            try {
                f5637a[com.facebook.react.modules.datepicker.a.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5637a[com.facebook.react.modules.datepicker.a.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5637a[com.facebook.react.modules.datepicker.a.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static Dialog a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        b bVar;
        long j;
        Calendar calendar = Calendar.getInstance();
        if (bundle != null && bundle.containsKey("date")) {
            calendar.setTimeInMillis(bundle.getLong("date"));
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        com.facebook.react.modules.datepicker.a aVar = com.facebook.react.modules.datepicker.a.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            aVar = com.facebook.react.modules.datepicker.a.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        com.facebook.react.modules.datepicker.a aVar2 = aVar;
        if (Build.VERSION.SDK_INT >= 21) {
            int i4 = a.f5637a[aVar2.ordinal()];
            if (i4 == 1) {
                bVar = new b(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
            } else if (i4 != 2) {
                bVar = i4 != 3 ? null : new b(context, onDateSetListener, i, i2, i3);
            } else {
                bVar = new b(context, 16973939, onDateSetListener, i, i2, i3);
                bVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
        } else {
            b bVar2 = new b(context, onDateSetListener, i, i2, i3);
            int i5 = a.f5637a[aVar2.ordinal()];
            if (i5 == 1) {
                bVar2.getDatePicker().setCalendarViewShown(true);
                bVar2.getDatePicker().setSpinnersShown(false);
            } else if (i5 == 2) {
                bVar2.getDatePicker().setCalendarViewShown(false);
            }
            bVar = bVar2;
        }
        DatePicker datePicker = bVar.getDatePicker();
        if (bundle == null || !bundle.containsKey("minDate")) {
            j = -2208988800001L;
        } else {
            calendar.setTimeInMillis(bundle.getLong("minDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            j = calendar.getTimeInMillis();
        }
        datePicker.setMinDate(j);
        if (bundle != null && bundle.containsKey("maxDate")) {
            calendar.setTimeInMillis(bundle.getLong("maxDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.k0 = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
