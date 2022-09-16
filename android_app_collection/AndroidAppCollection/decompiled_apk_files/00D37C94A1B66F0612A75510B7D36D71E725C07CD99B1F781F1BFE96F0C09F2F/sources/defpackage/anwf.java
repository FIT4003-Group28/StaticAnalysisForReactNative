package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anwf  reason: default package */
/* loaded from: classes.dex */
public final class anwf extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public anwf(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (anwg.a) {
            for (anwg anwgVar : anwg.b.values()) {
                anwgVar.i();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
