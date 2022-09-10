package defpackage;

import com.google.android.apps.gmm.notification.feedback.NotificationFeedbackActivity;
/* compiled from: PG */
/* renamed from: auly  reason: default package */
/* loaded from: classes2.dex */
public final class auly implements Runnable {
    final /* synthetic */ NotificationFeedbackActivity a;

    public auly(NotificationFeedbackActivity notificationFeedbackActivity) {
        this.a = notificationFeedbackActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o();
    }
}
