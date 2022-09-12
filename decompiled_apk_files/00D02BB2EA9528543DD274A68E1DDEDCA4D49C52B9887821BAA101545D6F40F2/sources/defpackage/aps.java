package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: aps  reason: default package */
/* loaded from: classes2.dex */
final class aps {
    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;
    boolean d;

    public aps(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
