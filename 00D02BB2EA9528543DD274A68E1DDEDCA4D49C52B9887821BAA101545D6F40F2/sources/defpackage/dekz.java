package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dekz  reason: default package */
/* loaded from: classes6.dex */
public final class dekz extends BroadcastReceiver {
    public static final AtomicReference<dekz> a = new AtomicReference<>();
    private final Context b;

    public dekz(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (dela.a) {
            for (dela delaVar : dela.b.values()) {
                delaVar.h();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
