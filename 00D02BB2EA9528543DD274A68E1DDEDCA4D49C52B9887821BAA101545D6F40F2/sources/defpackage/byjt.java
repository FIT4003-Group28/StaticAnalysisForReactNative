package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byjt  reason: default package */
/* loaded from: classes4.dex */
final class byjt extends BroadcastReceiver {
    final /* synthetic */ byju a;

    public byjt(byju byjuVar) {
        this.a = byjuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Toast.makeText(this.a.a, (int) R.string.TRAFFIC_HUB_ADD_SHORTCUT_PROMO_TOAST, 0).show();
        this.a.d();
        this.a.a.unregisterReceiver(this);
    }
}
