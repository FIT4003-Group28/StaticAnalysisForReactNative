package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
/* compiled from: PG */
/* renamed from: afzv  reason: default package */
/* loaded from: classes.dex */
public class afzv extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((agab) awwc.q(context)).it((NotificationInteractionBroadcastReceiver) this);
                    this.a = true;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
