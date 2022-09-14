package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: akb  reason: default package */
/* loaded from: classes2.dex */
final class akb extends akg {
    boolean a;
    private final PowerManager.WakeLock b;
    private final PowerManager.WakeLock c;

    public akb(Context context, ComponentName componentName) {
        context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.c = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // defpackage.akg
    public final void a() {
        synchronized (this) {
        }
    }

    @Override // defpackage.akg
    public final void b() {
        synchronized (this) {
            if (!this.a) {
                this.a = true;
                this.c.acquire(600000L);
                this.b.release();
            }
        }
    }

    @Override // defpackage.akg
    public final void c() {
        synchronized (this) {
            if (this.a) {
                this.a = false;
                this.c.release();
            }
        }
    }
}
