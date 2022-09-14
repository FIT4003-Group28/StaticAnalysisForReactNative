package com.facebook.react.modules.timepicker;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
@com.facebook.react.d0.a.a(name = TimePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes.dex */
public class TimePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ACTION_TIME_SET = "timeSetAction";
    static final String ARG_HOUR = "hour";
    static final String ARG_IS24HOUR = "is24Hour";
    static final String ARG_MINUTE = "minute";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "TimePickerAndroid";

    /* loaded from: classes.dex */
    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final Promise f5779b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5780c = false;

        public a(Promise promise) {
            this.f5779b = promise;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f5780c || !TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_DISMISSED);
            this.f5779b.resolve(writableNativeMap);
            this.f5780c = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (this.f5780c || !TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_TIME_SET);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_HOUR, i);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_MINUTE, i2);
            this.f5779b.resolve(writableNativeMap);
            this.f5780c = true;
        }
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_HOUR) && !readableMap.isNull(ARG_HOUR)) {
            bundle.putInt(ARG_HOUR, readableMap.getInt(ARG_HOUR));
        }
        if (readableMap.hasKey(ARG_MINUTE) && !readableMap.isNull(ARG_MINUTE)) {
            bundle.putInt(ARG_MINUTE, readableMap.getInt(ARG_MINUTE));
        }
        if (readableMap.hasKey(ARG_IS24HOUR) && !readableMap.isNull(ARG_IS24HOUR)) {
            bundle.putBoolean(ARG_IS24HOUR, readableMap.getBoolean(ARG_IS24HOUR));
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
        TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
        if (readableMap != null) {
            timePickerDialogFragment.m(createFragmentArguments(readableMap));
        }
        a aVar = new a(promise);
        timePickerDialogFragment.a((DialogInterface.OnDismissListener) aVar);
        timePickerDialogFragment.a((TimePickerDialog.OnTimeSetListener) aVar);
        timePickerDialogFragment.a(h2, FRAGMENT_TAG);
    }
}
