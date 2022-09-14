package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class b extends DatePickerDialog {
    public b(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        a(context, i2, i3, i4);
    }

    public b(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
        a(context, i, i2, i3);
    }

    private static Field a(Class cls, Class cls2, String str) {
        Field[] declaredFields;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
    }

    private void a(Context context, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$styleable");
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, (int[]) cls.getField("DatePicker").get(null), 16843612, 0);
                int i4 = obtainStyledAttributes.getInt(cls.getField("DatePicker_datePickerMode").getInt(null), 2);
                obtainStyledAttributes.recycle();
                if (i4 != 2) {
                    return;
                }
                DatePicker datePicker = (DatePicker) a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field a2 = a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                if (a2.get(datePicker).getClass() == Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    return;
                }
                a2.set(datePicker, null);
                datePicker.removeAllViews();
                Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                declaredMethod.setAccessible(true);
                a2.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                datePicker.setCalendarViewShown(false);
                datePicker.init(i, i2, i3, this);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // android.app.Dialog
    protected void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }
}
