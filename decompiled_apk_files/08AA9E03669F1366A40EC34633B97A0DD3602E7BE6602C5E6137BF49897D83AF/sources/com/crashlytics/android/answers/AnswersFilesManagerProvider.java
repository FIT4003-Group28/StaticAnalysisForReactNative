package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import b.a.a.a.a.b.t;
import b.a.a.a.a.d.g;
import b.a.a.a.a.f.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AnswersFilesManagerProvider {
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final Context context;
    final a fileStore;

    public AnswersFilesManagerProvider(Context context, a aVar) {
        this.context = context;
        this.fileStore = aVar;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new t(), new g(this.context, this.fileStore.a(), SESSION_ANALYTICS_FILE_NAME, SESSION_ANALYTICS_TO_SEND_DIR));
    }
}
