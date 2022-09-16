package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
/* compiled from: PG */
/* renamed from: lir  reason: default package */
/* loaded from: classes3.dex */
final class lir implements DialogInterface.OnClickListener {
    final /* synthetic */ lis a;

    public lir(lis lisVar) {
        this.a = lisVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.a.a.a;
        ((AlarmManager) activity.getSystemService("alarm")).setExact(3, 1500L, PendingIntent.getActivity(activity, 0, new Intent().setClassName(activity, "com.google.android.youtube.HomeActivity"), zgd.M() | 134217728));
        Process.killProcess(Process.myPid());
    }
}
