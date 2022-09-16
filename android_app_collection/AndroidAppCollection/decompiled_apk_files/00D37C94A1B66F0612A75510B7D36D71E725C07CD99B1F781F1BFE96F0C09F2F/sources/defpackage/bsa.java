package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsa  reason: default package */
/* loaded from: classes2.dex */
public class bsa extends BroadcastReceiver {
    static {
        bqf.b("ConstraintProxy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            bpu bpuVar = ((bum) it.next()).k;
            z4 |= bpuVar.d;
            z |= bpuVar.b;
            z2 |= bpuVar.e;
            boolean z5 = true;
            if (bpuVar.i == 1) {
                z5 = false;
            }
            z3 |= z5;
            if (z4 && z && z2 && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z4, z, z2, z3));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bqf a = bqf.a();
        String.format("onReceive : %s", intent);
        a.d(new Throwable[0]);
        context.startService(brz.b(context));
    }
}
