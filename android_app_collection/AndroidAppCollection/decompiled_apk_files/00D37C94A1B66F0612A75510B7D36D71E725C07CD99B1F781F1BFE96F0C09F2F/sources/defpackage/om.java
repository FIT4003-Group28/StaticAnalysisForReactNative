package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: om  reason: default package */
/* loaded from: classes3.dex */
public final class om extends oo {
    public final PowerManager a;
    final /* synthetic */ ot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(ot otVar, Context context) {
        super(otVar);
        this.b = otVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.oo
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.oo
    public final void b() {
        this.b.T();
    }
}
