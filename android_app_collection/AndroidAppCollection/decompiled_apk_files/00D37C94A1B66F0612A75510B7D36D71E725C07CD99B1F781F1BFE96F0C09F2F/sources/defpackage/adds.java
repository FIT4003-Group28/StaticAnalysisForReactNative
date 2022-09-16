package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: adds  reason: default package */
/* loaded from: classes.dex */
final class adds extends BroadcastReceiver {
    final /* synthetic */ addu a;

    public adds(addu adduVar) {
        this.a = adduVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.d();
        this.a.c();
    }
}
