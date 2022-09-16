package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vlb  reason: default package */
/* loaded from: classes4.dex */
final class vlb extends BroadcastReceiver {
    public final SettableFuture a = SettableFuture.f();
    public final Set b;
    public final Object c;

    public vlb(Set set) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new Object();
        hashSet.addAll(set);
        a();
    }

    private final void a() {
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                this.a.o(null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String d = amps.d(intent.getPackage());
        synchronized (this.c) {
            this.b.remove(d);
        }
        a();
    }
}
