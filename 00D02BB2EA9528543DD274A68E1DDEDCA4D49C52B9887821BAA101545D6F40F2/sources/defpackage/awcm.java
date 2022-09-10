package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awcm  reason: default package */
/* loaded from: classes3.dex */
public final class awcm extends BroadcastReceiver {
    final /* synthetic */ awcn a;

    public awcm(awcn awcnVar) {
        this.a = awcnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        awcn awcnVar = this.a;
        ckco ckcoVar = (ckco) awcnVar.b.a(ckia.p);
        if (awcnVar.c) {
            ckcoVar.a(ckhy.a(2));
            awcnVar.b.h();
            awcnVar.a.halt(100);
            return;
        }
        ckcoVar.a(ckhy.a(1));
    }
}
