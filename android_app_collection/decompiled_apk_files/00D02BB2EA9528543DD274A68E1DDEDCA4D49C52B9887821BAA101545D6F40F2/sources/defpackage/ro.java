package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ro  reason: default package */
/* loaded from: classes.dex */
public final class ro extends rq {
    public final PowerManager a;
    final /* synthetic */ rv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(rv rvVar, Context context) {
        super(rvVar);
        this.b = rvVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.rq
    public final void a() {
        this.b.p();
    }

    @Override // defpackage.rq
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
