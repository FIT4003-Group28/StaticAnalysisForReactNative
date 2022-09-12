package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdx  reason: default package */
/* loaded from: classes3.dex */
public class bdx extends BroadcastReceiver {
    static {
        bbz.f("ConstraintProxy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List<bgh> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (bgh bghVar : list) {
            bbl bblVar = bghVar.i;
            z5 |= bblVar.d;
            z2 |= bblVar.b;
            z3 |= bblVar.e;
            z4 |= bblVar.i != 1;
            if (z5 && z2 && z3 && z4) {
                break;
            }
        }
        boolean z6 = true == z5;
        boolean z7 = true == z2;
        if (true == z3) {
            z = true;
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z6, z7, z, z4));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bbz.e().a(new Throwable[0]);
        context.startService(bdw.e(context));
    }
}
