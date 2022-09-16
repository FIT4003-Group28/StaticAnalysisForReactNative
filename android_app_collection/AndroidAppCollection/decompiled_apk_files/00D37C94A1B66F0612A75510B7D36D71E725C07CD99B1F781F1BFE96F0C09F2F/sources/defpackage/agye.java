package defpackage;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: agye  reason: default package */
/* loaded from: classes.dex */
public final class agye implements agxu {
    public final PowerManager.WakeLock a;
    public final ahdf b;
    private Thread c;

    public agye(Context context, ahdf ahdfVar) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, getClass().getName());
        this.b = ahdfVar;
    }

    @Override // defpackage.agxu
    public final void a(agxp agxpVar) {
        agyd agydVar = new agyd(this, agxpVar);
        this.c = agydVar;
        agydVar.start();
    }
}
