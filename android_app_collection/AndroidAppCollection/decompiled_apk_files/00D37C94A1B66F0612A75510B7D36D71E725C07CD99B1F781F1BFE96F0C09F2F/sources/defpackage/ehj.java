package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ehj  reason: default package */
/* loaded from: classes3.dex */
final class ehj extends BroadcastReceiver {
    public final Context a;
    public boolean b = false;
    private final eil c;

    public ehj(Context context, eil eilVar) {
        this.c = eilVar;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.c.b();
    }
}
