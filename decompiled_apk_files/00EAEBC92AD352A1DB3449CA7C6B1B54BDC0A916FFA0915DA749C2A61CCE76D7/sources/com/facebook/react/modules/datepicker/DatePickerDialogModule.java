package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
@com.facebook.react.d0.a.a(name = DatePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes.dex */
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DATE_SET = "dateSetAction";
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ARG_DATE = "date";
    static final String ARG_MAXDATE = "maxDate";
    static final String ARG_MINDATE = "minDate";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    /* loaded from: classes.dex */
    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final Promise f5638b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5639c = false;

        public a(Promise promise) {
            this.f5638b = promise;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.f5639c || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            writableNativeMap.putInt("year", i);
            writableNativeMap.putInt("month", i2);
            writableNativeMap.putInt("day", i3);
            this.f5638b.resolve(writableNativeMap);
            this.f5639c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f5639c || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.f5638b.resolve(writableNativeMap);
            this.f5639c = true;
        }
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_DATE) && !readableMap.isNull(ARG_DATE)) {
            bundle.putLong(ARG_DATE, (long) readableMap.getDouble(ARG_DATE));
        }
        if (readableMap.hasKey(ARG_MINDATE) && !readableMap.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) readableMap.getDouble(ARG_MINDATE));
        }
        if (readableMap.hasKey(ARG_MAXDATE) && !readableMap.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) readableMap.getDouble(ARG_MAXDATE));
        }
        if (readableMap.hasKey(ARG_MODE) && !readableMap.isNull(ARG_MODE)) {
            bundle.putString(ARG_MODE, readableMap.getString(ARG_MODE));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof c)) {
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
            return;
        }
        l h2 = ((c) currentActivity).h();
        DialogFragment dialogFragment = (DialogFragment) h2.b(FRAGMENT_TAG);
        if (dialogFragment != null) {
            dialogFragment.m0();
        }
        DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
        if (readableMap != null) {
            datePickerDialogFragment.m(createFragmentArguments(readableMap));
        }
        a aVar = new a(promise);
        datePickerDialogFragment.a((DialogInterface.OnDismissListener) aVar);
        datePickerDialogFragment.a((DatePickerDialog.OnDateSetListener) aVar);
        datePickerDialogFragment.a(h2, FRAGMENT_TAG);
    }
}
