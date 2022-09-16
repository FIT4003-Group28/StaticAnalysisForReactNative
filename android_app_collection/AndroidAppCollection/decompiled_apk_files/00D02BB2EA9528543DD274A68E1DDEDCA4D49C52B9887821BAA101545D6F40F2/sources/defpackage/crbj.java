package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crbj  reason: default package */
/* loaded from: classes5.dex */
public final class crbj extends BroadcastReceiver {
    final /* synthetic */ crbk a;

    public crbj(crbk crbkVar) {
        this.a = crbkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.k.a().f(Locale.getDefault());
        this.a.j.a().f(Locale.getDefault());
    }
}
