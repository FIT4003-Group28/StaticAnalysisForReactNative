package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yzf  reason: default package */
/* loaded from: classes7.dex */
final class yzf extends BroadcastReceiver {
    final /* synthetic */ int a;

    public yzf(int i) {
        this.a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Context applicationContext = context.getApplicationContext();
        dqvj dqvjVar = dqvj.DRIVE;
        int i2 = i - 1;
        Toast.makeText(applicationContext, i2 != 0 ? i2 != 1 ? R.string.CREATE_COMMUTE_HUB_SHORTCUT_TOAST : R.string.CREATE_DIRECTIONS_SHORTCUT_TOAST : R.string.CREATE_DIRECTIONS_SHORTCUT_LABEL_TOAST, 0).show();
        context.unregisterReceiver(this);
    }
}
