package io.invertase.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.s;
/* loaded from: classes.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends com.facebook.react.c {
    @Override // com.facebook.react.c
    protected com.facebook.react.c0.a a(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new com.facebook.react.c0.a("ReactNativeFirebaseMessagingHeadlessTask", n.a((s) intent.getParcelableExtra("message")), io.invertase.firebase.common.i.c().a("messaging_android_headless_task_timeout", 60000L), true);
    }
}
