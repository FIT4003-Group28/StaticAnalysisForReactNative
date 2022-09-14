package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import b.a.a.a.a;
import com.crashlytics.android.answers.SessionEvent;
/* loaded from: classes.dex */
class AnswersLifecycleCallbacks extends a.b {
    private final SessionAnalyticsManager analyticsManager;
    private final BackgroundManager backgroundManager;

    @Override // b.a.a.a.a.b
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // b.a.a.a.a.b
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // b.a.a.a.a.b
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public AnswersLifecycleCallbacks(SessionAnalyticsManager sessionAnalyticsManager, BackgroundManager backgroundManager) {
        this.analyticsManager = sessionAnalyticsManager;
        this.backgroundManager = backgroundManager;
    }

    @Override // b.a.a.a.a.b
    public void onActivityStarted(Activity activity) {
        this.analyticsManager.onLifecycle(activity, SessionEvent.Type.START);
    }

    @Override // b.a.a.a.a.b
    public void onActivityResumed(Activity activity) {
        this.analyticsManager.onLifecycle(activity, SessionEvent.Type.RESUME);
        this.backgroundManager.onActivityResumed();
    }

    @Override // b.a.a.a.a.b
    public void onActivityPaused(Activity activity) {
        this.analyticsManager.onLifecycle(activity, SessionEvent.Type.PAUSE);
        this.backgroundManager.onActivityPaused();
    }

    @Override // b.a.a.a.a.b
    public void onActivityStopped(Activity activity) {
        this.analyticsManager.onLifecycle(activity, SessionEvent.Type.STOP);
    }
}
