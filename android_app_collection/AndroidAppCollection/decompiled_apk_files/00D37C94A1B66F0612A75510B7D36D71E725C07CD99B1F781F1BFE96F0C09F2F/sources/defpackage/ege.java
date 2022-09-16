package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.application.system.LocaleUpdatedReceiver;
/* compiled from: PG */
/* renamed from: ege  reason: default package */
/* loaded from: classes3.dex */
public class ege extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((egh) awwc.q(context)).ip((LocaleUpdatedReceiver) this);
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
