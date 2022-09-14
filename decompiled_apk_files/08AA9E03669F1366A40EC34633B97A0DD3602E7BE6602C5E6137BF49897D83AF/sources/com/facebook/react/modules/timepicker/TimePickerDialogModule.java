package com.facebook.react.modules.timepicker;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.j;
import android.support.v4.app.n;
import android.widget.TimePicker;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
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

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    public TimePickerDialogModule(ah ahVar) {
        super(ahVar);
    }

    /* loaded from: classes.dex */
    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final af f3690b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3691c = false;

        public a(af afVar) {
            this.f3690b = afVar;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (this.f3691c || !TimePickerDialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_TIME_SET);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_HOUR, i);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_MINUTE, i2);
            this.f3690b.a(writableNativeMap);
            this.f3691c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f3691c || !TimePickerDialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_DISMISSED);
            this.f3690b.a(writableNativeMap);
            this.f3691c = true;
        }
    }

    @al
    public void open(an anVar, af afVar) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            afVar.a(ERROR_NO_ACTIVITY, "Tried to open a TimePicker dialog while not attached to an Activity");
        } else if (currentActivity instanceof j) {
            n e = ((j) currentActivity).e();
            h hVar = (h) e.a(FRAGMENT_TAG);
            if (hVar != null) {
                hVar.dismiss();
            }
            b bVar = new b();
            if (anVar != null) {
                bVar.setArguments(createFragmentArguments(anVar));
            }
            a aVar = new a(afVar);
            bVar.a((DialogInterface.OnDismissListener) aVar);
            bVar.a((TimePickerDialog.OnTimeSetListener) aVar);
            bVar.show(e, FRAGMENT_TAG);
        } else {
            FragmentManager fragmentManager = currentActivity.getFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            c cVar = new c();
            if (anVar != null) {
                cVar.setArguments(createFragmentArguments(anVar));
            }
            a aVar2 = new a(afVar);
            cVar.a((DialogInterface.OnDismissListener) aVar2);
            cVar.a((TimePickerDialog.OnTimeSetListener) aVar2);
            cVar.show(fragmentManager, FRAGMENT_TAG);
        }
    }

    private Bundle createFragmentArguments(an anVar) {
        Bundle bundle = new Bundle();
        if (anVar.hasKey(ARG_HOUR) && !anVar.isNull(ARG_HOUR)) {
            bundle.putInt(ARG_HOUR, anVar.getInt(ARG_HOUR));
        }
        if (anVar.hasKey(ARG_MINUTE) && !anVar.isNull(ARG_MINUTE)) {
            bundle.putInt(ARG_MINUTE, anVar.getInt(ARG_MINUTE));
        }
        if (anVar.hasKey(ARG_IS24HOUR) && !anVar.isNull(ARG_IS24HOUR)) {
            bundle.putBoolean(ARG_IS24HOUR, anVar.getBoolean(ARG_IS24HOUR));
        }
        if (anVar.hasKey(ARG_MODE) && !anVar.isNull(ARG_MODE)) {
            bundle.putString(ARG_MODE, anVar.getString(ARG_MODE));
        }
        return bundle;
    }
}
