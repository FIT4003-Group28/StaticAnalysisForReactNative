package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yzg  reason: default package */
/* loaded from: classes7.dex */
public final class yzg implements degu<Boolean> {
    final /* synthetic */ Context a;
    final /* synthetic */ BroadcastReceiver b;
    final /* synthetic */ yzi c;
    final /* synthetic */ int d;

    public yzg(yzi yziVar, int i, Context context, BroadcastReceiver broadcastReceiver) {
        this.c = yziVar;
        this.d = i;
        this.a = context;
        this.b = broadcastReceiver;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.k(this.d);
        this.a.unregisterReceiver(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (!bool.booleanValue()) {
            this.c.k(this.d);
            this.a.unregisterReceiver(this.b);
        }
    }
}
