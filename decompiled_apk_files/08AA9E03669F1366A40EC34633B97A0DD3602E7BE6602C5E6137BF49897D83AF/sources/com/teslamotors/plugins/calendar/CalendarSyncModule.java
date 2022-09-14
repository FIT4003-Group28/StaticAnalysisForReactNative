package com.teslamotors.plugins.calendar;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
/* loaded from: classes.dex */
public class CalendarSyncModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "RNTMCalendarSync";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public CalendarSyncModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void performCalendarSync(Boolean bool, Boolean bool2, String str, af afVar) {
        com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(getReactApplicationContext());
        long m = a2.m();
        if (m == -1 || !"VEHICLE".equals(a2.n())) {
            return;
        }
        CalendarJobService.a(getReactApplicationContext());
        CalendarSyncService.a(m, 4, str, getReactApplicationContext(), bool2, bool, afVar);
    }
}
