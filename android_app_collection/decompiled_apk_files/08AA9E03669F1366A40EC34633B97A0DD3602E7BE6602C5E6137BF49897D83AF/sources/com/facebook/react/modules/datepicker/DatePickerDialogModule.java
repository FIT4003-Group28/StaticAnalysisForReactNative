package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.j;
import android.support.v4.app.n;
import android.widget.DatePicker;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
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

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    public DatePickerDialogModule(ah ahVar) {
        super(ahVar);
    }

    /* loaded from: classes.dex */
    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final af f3534b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3535c = false;

        public a(af afVar) {
            this.f3534b = afVar;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.f3535c || !DatePickerDialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            writableNativeMap.putInt("year", i);
            writableNativeMap.putInt("month", i2);
            writableNativeMap.putInt("day", i3);
            this.f3534b.a(writableNativeMap);
            this.f3535c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f3535c || !DatePickerDialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.f3534b.a(writableNativeMap);
            this.f3535c = true;
        }
    }

    @al
    public void open(an anVar, af afVar) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            afVar.a(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to an Activity");
        } else if (currentActivity instanceof j) {
            n e = ((j) currentActivity).e();
            h hVar = (h) e.a(FRAGMENT_TAG);
            if (hVar != null) {
                hVar.dismiss();
            }
            d dVar = new d();
            if (anVar != null) {
                dVar.setArguments(createFragmentArguments(anVar));
            }
            a aVar = new a(afVar);
            dVar.a((DialogInterface.OnDismissListener) aVar);
            dVar.a((DatePickerDialog.OnDateSetListener) aVar);
            dVar.show(e, FRAGMENT_TAG);
        } else {
            FragmentManager fragmentManager = currentActivity.getFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            com.facebook.react.modules.datepicker.a aVar2 = new com.facebook.react.modules.datepicker.a();
            if (anVar != null) {
                aVar2.setArguments(createFragmentArguments(anVar));
            }
            a aVar3 = new a(afVar);
            aVar2.a((DialogInterface.OnDismissListener) aVar3);
            aVar2.a((DatePickerDialog.OnDateSetListener) aVar3);
            aVar2.show(fragmentManager, FRAGMENT_TAG);
        }
    }

    private Bundle createFragmentArguments(an anVar) {
        Bundle bundle = new Bundle();
        if (anVar.hasKey(ARG_DATE) && !anVar.isNull(ARG_DATE)) {
            bundle.putLong(ARG_DATE, (long) anVar.getDouble(ARG_DATE));
        }
        if (anVar.hasKey(ARG_MINDATE) && !anVar.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) anVar.getDouble(ARG_MINDATE));
        }
        if (anVar.hasKey(ARG_MAXDATE) && !anVar.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) anVar.getDouble(ARG_MAXDATE));
        }
        if (anVar.hasKey(ARG_MODE) && !anVar.isNull(ARG_MODE)) {
            bundle.putString(ARG_MODE, anVar.getString(ARG_MODE));
        }
        return bundle;
    }
}
