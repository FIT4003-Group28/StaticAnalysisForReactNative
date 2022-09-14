package com.crashlytics.android.answers;

import b.a.a.a.a.g.b;
import com.crashlytics.android.answers.SessionEvent;
/* loaded from: classes.dex */
class DisabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    @Override // b.a.a.a.a.d.e
    public void cancelTimeBasedFileRollOver() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void deleteAllEvents() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void processEvent(SessionEvent.Builder builder) {
    }

    @Override // b.a.a.a.a.d.e
    public boolean rollFileOver() {
        return false;
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void sendEvents() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void setAnalyticsSettingsData(b bVar, String str) {
    }
}
